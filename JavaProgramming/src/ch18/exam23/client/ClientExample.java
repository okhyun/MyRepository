package ch18.exam23.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClientExample extends Application {
	Socket socket;
		
	void startClient() {//start ��ư
		Thread thread = new Thread() {
			@Override
			public void run() {
				try{
					socket = new Socket();
					socket.connect(new InetSocketAddress("192.168.0.26", 5001));
					Platform.runLater(new Runnable(){
						public void run(){
						displayText("[���� �Ϸ� : " + socket.getRemoteSocketAddress() + "]");
						btnConn.setText("stop");
						btnSend.setDisable(false);
						};
					});
				} catch(Exception e) {
					Platform.runLater(new Runnable(){
						public void run(){
						displayText("[���� ��� �ȵ� :]");
						if(socket !=null && !socket.isClosed()) {
							stopClient();
						}
						};
					});
					return;
				}
				
				receive();
			}
		};
		thread.start();
		
	}
	
	void stopClient() {//stop ��ư
		if(socket != null && !socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
			}
			Platform.runLater(new Runnable(){
				public void run(){
				displayText("[���� ���� : ]");
				btnConn.setText("start");
				btnSend.setDisable(true);
				};
			});
		}
	}	
	
	void receive() { //send�� ������ ȭ�鿡 ǥ��, �۾������尡 ȣ���ϰ� �ִ�.
		while(true) {
			try {
				InputStream is = socket.getInputStream();
				byte[] values = new byte[1024];
				int byteNum = is.read(values); //���ڱ� ������ ���� �߻��� �� �ִ�.
				if(byteNum == -1) {throw new IOException();}
				String data = new String(values, 0, byteNum, "UTF-8");
				Platform.runLater(new Runnable(){
					public void run() {
					displayText("[�ޱ� �Ϸ�]" + data);
					};
				});
			} catch (Exception e) {
				Platform.runLater(new Runnable(){
					public void run() {
					displayText("[���� ��� �ȵ�]");
					};
				});
				stopClient();
				break;
			}
		}
	}
	
	void send(String data) { //send ��ư
		Thread thread = new Thread() {
			@Override
			public void run() {
				try{
					OutputStream os = socket.getOutputStream();
					byte[] values = data.getBytes("UTF-8");
					os.write(values);
					os.flush();
					Platform.runLater(new Runnable(){
						public void run() {
						displayText("[������ �Ϸ�]");
						};
					});
				} catch(Exception e) {
					Platform.runLater(new Runnable(){
						public void run() {
						displayText("[���� ��� �ȵ�]");
						};
					});
					stopClient();
				}
			}
		};
		thread.start();
	}
	
	//////////////////////////////////////////////////////
	TextArea txtDisplay;
	TextField txtInput;
	Button btnConn, btnSend;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);
		
		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0,0,2,0));
		root.setCenter(txtDisplay);
		
		BorderPane bottom = new BorderPane();
			txtInput = new TextField();
			txtInput.setPrefSize(60, 30);
			BorderPane.setMargin(txtInput, new Insets(0,1,1,1));
			
			btnConn = new Button("start");
			btnConn.setPrefSize(60, 30);
			btnConn.setOnAction(e->{
				if(btnConn.getText().equals("start")) {
					startClient();
				} else if(btnConn.getText().equals("stop")){
					stopClient();
				}
			});
			
			btnSend = new Button("send"); 
			btnSend.setPrefSize(60, 30);
			btnSend.setDisable(true);
			btnSend.setOnAction(e->send(txtInput.getText()));
			
			bottom.setCenter(txtInput);
			bottom.setLeft(btnConn);
			bottom.setRight(btnSend);
		root.setBottom(bottom);
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Client");
		primaryStage.setOnCloseRequest(event->stopClient());
		primaryStage.show();
	}
	
	void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}	
	
	public static void main(String[] args) {
		launch(args);
	}
}