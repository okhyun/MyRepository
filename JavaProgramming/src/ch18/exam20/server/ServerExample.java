package ch18.exam20.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExample {
	private static ServerSocket serverSocket;
	private static boolean stop;
	
	public static void main(String[] args)  {
		System.out.println("서버시작");
		try {
			//서버의 어떤 IP라도 접근할 수 있도록 한 것
			serverSocket = new ServerSocket(5001);
			//ServerSocket은 클라이언트가 연결 요청을 해오면 연결을 수락하고 통신용 socket을 만든다. 
			
			Thread thread = new Thread() {
				@Override
				public void run() {
					waitAndAccept();
				}
			};
			//Thread 생성자를 생성하고 thread실행코드에 run 메소드 실행
			
			thread.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("명령어 입력 : ");
			String command = scanner.nextLine();
			if(command.equals("stop")) {
				stop = true; //작업 스레드 중지(클라이언트의 연결 수락을 중지)
				try {
					serverSocket.close();
				} catch (IOException e) {}
				System.out.println("서버종료");
				System.exit(0); //서버 Process를 종료
			}
		}
	}
	
	private static void waitAndAccept() {
		try {
			while(!stop) {
				//클라이언트의 연결을 수락하고 통신용 소켓을 생성
				Socket socket = serverSocket.accept();
				
				//클라이언트에서 보낸 데이터를 받기
				InputStream is = socket.getInputStream();
				byte[] receiveValues = new byte[1024];
				int byteNum = is.read(receiveValues);
				String data = new String(receiveValues, 0, byteNum, "UTF-8");
				
				//다시 클라이언트로 에코 보내기	
				OutputStream os = socket.getOutputStream();
				byte[] sendValues = data.getBytes("UTF-8");
				os.write(sendValues);
				os.flush();
				
				//클라이언트의 연결을 끊음
				socket.close();
			}			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
