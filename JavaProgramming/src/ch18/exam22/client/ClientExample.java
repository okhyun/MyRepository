package ch18.exam22.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class ClientExample {
	private static boolean stop;
	private static Socket socket;
	public static void main(String[] args) {
		//소켓생성
		socket = new Socket();
		
		try {
			//연결요청하기
			SocketAddress sa = new InetSocketAddress("192.168.0.48", 5001);
			socket.connect(sa);
			System.out.println("[서버와 연결됨]");
			
			Thread thread = new Thread(){
				@Override
				public void run() {
					sendAndReceive();
				}
			};
			thread.start();
		} catch(IOException e){
			System.out.println("[서버와 연결 않음]");
		}
	}
	private static void sendAndReceive(){
		try{
			while(!stop){
				//보낼 데이터를 키보드로부터 읽기
				Scanner scanner = new Scanner(System.in);
				System.out.print("명령어 입력[send or stop]: ");
				String data = scanner.nextLine();
				if(data.equals("send")){
					System.out.println("보낼 데이터: ");
					data = scanner.nextLine();
					//서버로 데이터를 보내기
					OutputStream os = socket.getOutputStream();
					byte[] sendValues = data.getBytes("UTF-8"); //UTF-8로 강제 변환
					os.write(sendValues);
					os.flush();
					
					//서버에서 보낸 데이터를 읽기
					InputStream is = socket.getInputStream();
					byte[] recieveValue = new byte[1024];
					int byteNum = is.read(recieveValue);
					data = new String(recieveValue, 0, byteNum, "UTF-8");
					System.out.println(data);
				} else if(data.equals("stop")){
					clientStop();
				}
			}
		} catch (Exception e) {
			System.out.println("[서버와 연결이 끊어짐]");
		}
	}
	private static void clientStop(){
		//클라이언트의 정상 종료 시키기
		try {
			stop = true; //보내고 받기 중지
			socket.close(); //클라이언트의 정상 종료
			System.out.println("[클라이언트 종료]");
		} catch (IOException e) {
			
		}
	}
}



