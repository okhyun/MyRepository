package ch18.exam23.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ServerExample extends Application {
	ExecutorService executorService;
	ServerSocket serverSocket;
	List<Client> connections = new Vector<>(); //������ ���� list�ȿ� ��Ƶд�.
	
	
	void startServer() {
		//������Ǯ ����(�ִ� ������ 50���� ���)
		executorService = Executors.newFixedThreadPool(50);
		
		//ServerSocket ����(5001�� Port���)
		try{
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.0.26", 5001));
		} catch(Exception e) {
			if(! serverSocket.isClosed()) { stopServer(); } //������ ���� ���� �ʴٸ� �ݾƶ�.
			return; //������.
		}
		
		//Ŭ���̾�Ʈ ���� ���� �۾� ������ �۾�ť�� �ֱ�
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				Platform.runLater(new Runnable() {
					@Override
					public void run() {
						displayText ( "[��������]" );//���â�ȿ� ���� �ٲܷ��� ���⿡ �ۼ��Ѵ�.
						btnStartStop.setText("stop");
					}
				});
				
				while(true){
					try{
						//Ŭ���̾�Ʈ�� ������ ��ٸ��� �����ϱ�
						Socket socket = serverSocket.accept();
						String message = "[���� ���� : " +  socket.getInetAddress().getHostAddress() +  ":" + Thread.currentThread().getName() + " ] "; 
						Platform.runLater(new Runnable() {
							public void run() {
								displayText(message);
							}
						});
						
						//��� ��ü Client ����
						Client client = new Client(socket);
						
						//Client ����
						connections.add(client); //List�� �߰�
						Platform.runLater(new Runnable() {
							public void run() {
								displayText("[���� ���� : " + connections.size() + "]");
							}
						});
						
					} catch(Exception e){
						if(!serverSocket.isClosed()) { stopServer();}
						break;
					}
				}
			}
		};
		 executorService.submit(runnable);
	}
	
	void stopServer() {
		try{
			Iterator <Client> iterator = connections.iterator(); //for���� ����ϸ� �ȵǴ� ������ �������� ��Ƚ���� ���ϰ� ���⶧����
			while(iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close();
				iterator.remove();
			}
			
			if(serverSocket != null && !serverSocket.isClosed()) {
				serverSocket.close();
			}
			if(executorService != null && !executorService.isShutdown()) {
				executorService.isShutdown();
			}
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					displayText ( "[���� ����]" );//���â�ȿ� ���� �ٲܷ��� ���⿡ �ۼ��Ѵ�.
					btnStartStop.setText("start");
				}
			});
		} catch(Exception e) {
			
		}
	}	
	
	class Client {
		Socket socket;
		
		Client(Socket socket) {
			this.socket = socket;
			receive();
		}
		
		void receive() {
			//Ŭ���̾�Ʈ�� �����͸� �޴� �۾� ���� �� �۾�ť�� �ֱ�
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						while(true) { //Ŭ���̾�Ʈ�� -1���� �����°��� �������� �ɶ�
							InputStream is = socket.getInputStream();
							byte[] values = new byte[300];
							int byteNum = is.read(values);
							if(byteNum == -1) { throw new IOException();}
							String data = new String(values, 0, byteNum, "UTF-8");
							for(Client client : connections) {
								client.send(data); //����� ��� Ŭ���̾�Ʈ���� ���� ���
							}
							//send(data); �ڱ��ڽſ��� ���� ���
						}
						
					} catch(Exception e) { //������ �ڵ尡 �Էµǰų� int byteNum = is.read(values);��  -1���� �Էµɶ�
						try {
							connections.remove(Client.this); //��ø Ŭ���� ������ ������ Ŭ������ ����ؾ��Ѵ�.
							String message = "[Ŭ���̾�Ʈ ��� �ȵ� : " +  socket.getInetAddress().getHostAddress() +  ":" + Thread.currentThread().getName() + " ] "; 
							Platform.runLater(new Runnable() {
								public void run() {
									displayText(message);
								}
							});
							socket.close();
						} catch (IOException e1) {
							
						}
					}
				}
			};
			executorService.submit(runnable);//�۾�ť�� �ֱ�
		}
		
		void send(String data) {
			//Ŭ���̾�Ʈ�� �����͸� ������ �۾� ����
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						
						OutputStream os = socket.getOutputStream(); 
						byte[] values = data.getBytes("UTF-8");
						os.write(values); //���ܹ߻��� ���ִ�.
						os.flush();
					} catch(Exception e) {
						try {
							connections.remove(Client.this); //��ø Ŭ���� ������ ������ Ŭ������ ����ؾ��Ѵ�.
							String message = "[Ŭ���̾�Ʈ ��� �ȵ� : " +  socket.getInetAddress().getHostAddress() +  ":" + Thread.currentThread().getName() + " ] "; 
							Platform.runLater(new Runnable() {
								public void run() {
									displayText(message);
								}
							});
							socket.close();
						} catch (IOException e1) {
							
						}
					}
				}
			};
			executorService.submit(runnable); //�۾�ť�� �ֱ�
		}
	}
	
	//////////////////////////////////////////////////////
	TextArea txtDisplay;
	Button btnStartStop;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);
		
		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0,0,2,0));
		root.setCenter(txtDisplay);
		
		btnStartStop = new Button("start");
		btnStartStop.setPrefHeight(30);
		btnStartStop.setMaxWidth(Double.MAX_VALUE);
		btnStartStop.setOnAction(e->{
			if(btnStartStop.getText().equals("start")) {
				startServer();
			} else if(btnStartStop.getText().equals("stop")){
				stopServer();
			}
		});
		root.setBottom(btnStartStop);
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Server");
		primaryStage.setOnCloseRequest(event->stopServer());
		primaryStage.show();
	}
	
	void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}	
	
	public static void main(String[] args) {
		launch(args);
	}
}