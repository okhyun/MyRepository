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
	List<Client> connections = new Vector<>(); //관리를 위해 list안에 담아둔다.
	
	
	void startServer() {
		//스레드풀 생성(최대 스레드 50개만 사용)
		executorService = Executors.newFixedThreadPool(50);
		
		//ServerSocket 생성(5001번 Port사용)
		try{
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.0.26", 5001));
		} catch(Exception e) {
			if(! serverSocket.isClosed()) { stopServer(); } //서버가 닫혀 있지 않다면 닫아라.
			return; //끝내라.
		}
		
		//클라이언트 연결 수락 작업 생성과 작업큐에 넣기
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				Platform.runLater(new Runnable() {
					@Override
					public void run() {
						displayText ( "[서버시작]" );//노란창안에 글을 바꿀려면 여기에 작성한다.
						btnStartStop.setText("stop");
					}
				});
				
				while(true){
					try{
						//클라이언트의 연결을 기다리고 수락하기
						Socket socket = serverSocket.accept();
						String message = "[연결 수락 : " +  socket.getInetAddress().getHostAddress() +  ":" + Thread.currentThread().getName() + " ] "; 
						Platform.runLater(new Runnable() {
							public void run() {
								displayText(message);
							}
						});
						
						//통신 객체 Client 생성
						Client client = new Client(socket);
						
						//Client 관리
						connections.add(client); //List에 추가
						Platform.runLater(new Runnable() {
							public void run() {
								displayText("[연결 개수 : " + connections.size() + "]");
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
			Iterator <Client> iterator = connections.iterator(); //for문은 사용하면 안되는 이유는 돌기전에 돌횟수를 정하고 돌기때문에
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
					displayText ( "[서버 멈춤]" );//노란창안에 글을 바꿀려면 여기에 작성한다.
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
			//클라이언트의 데이터를 받는 작업 생성 및 작업큐에 넣기
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						while(true) { //클라이언트가 -1값을 가지는것은 정상종료 될때
							InputStream is = socket.getInputStream();
							byte[] values = new byte[300];
							int byteNum = is.read(values);
							if(byteNum == -1) { throw new IOException();}
							String data = new String(values, 0, byteNum, "UTF-8");
							for(Client client : connections) {
								client.send(data); //연결된 모든 클라이언트에게 에코 출력
							}
							//send(data); 자기자신에게 에코 출력
						}
						
					} catch(Exception e) { //비정상 코드가 입력되거나 int byteNum = is.read(values);에  -1값이 입력될때
						try {
							connections.remove(Client.this); //중첩 클래스 에서는 각각의 클래스를 언급해야한다.
							String message = "[클라이언트 통신 안됨 : " +  socket.getInetAddress().getHostAddress() +  ":" + Thread.currentThread().getName() + " ] "; 
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
			executorService.submit(runnable);//작업큐에 넣기
		}
		
		void send(String data) {
			//클라이언트로 데이터를 보내는 작업 생성
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						
						OutputStream os = socket.getOutputStream(); 
						byte[] values = data.getBytes("UTF-8");
						os.write(values); //예외발생할 수있다.
						os.flush();
					} catch(Exception e) {
						try {
							connections.remove(Client.this); //중첩 클래스 에서는 각각의 클래스를 언급해야한다.
							String message = "[클라이언트 통신 안됨 : " +  socket.getInetAddress().getHostAddress() +  ":" + Thread.currentThread().getName() + " ] "; 
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
			executorService.submit(runnable); //작업큐에 넣기
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
