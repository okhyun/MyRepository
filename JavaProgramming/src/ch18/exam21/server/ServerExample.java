package ch18.exam21.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExample {

	private static ServerSocket serverSocket;
	private static boolean stop;

	public static void main(String[] args) {
		System.out.println("��������");
		try {
			//������ � IP�� ������ �� �ֵ��� �� ��
			serverSocket = new ServerSocket(5001);
			
			Thread thread = new Thread() {
				@Override
				public void run() {
					waitAndAccept();
				}
			};
			thread.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.print("��ɾ� �Է� : ");
			String command = scanner.nextLine();
			if(command.equals("stop")) {
				stop = true;	//�۾� ������(Ŭ���̾�Ʈ�� ���� ������ ����)
				try {
					serverSocket.close();
				} catch (IOException e) {}
				System.out.println("��������");
				System.exit(0); //���� ���μ���(Process) ����
			}
		}
	}
	
	//�۾� ������
	private static void waitAndAccept() {// static�� �־���� waitAndAccept(); ���� ������ ���� �ʴ´�
		try{
			while(!stop) {
				//Ŭ���̾�Ʈ�� ������ �����ϰ� ��ſ� Socket �� ����
				Socket socket = serverSocket.accept();
				
				try{			
				//Ŭ���̾�Ʈ���� ���� �����͸� �ޱ�
				InputStream is = socket.getInputStream();
				byte[] receiveValues = new byte[1024];
				int byteNum = is.read(receiveValues);
				if(byteNum != -1){
					String data = new String(receiveValues, 0, byteNum, "UTF-8");
					//Ŭ���̾�Ʈ�� ���� ������
					OutputStream os = socket.getOutputStream();
					byte[] sendValues = data.getBytes("UTF-8");
					os.write(sendValues);
					os.flush();
					
				} else {
					System.out.println("Ŭ���̾�Ʈ�� ���� �����");
				}
							
				//Ŭ���̾�Ʈ�� ������ ����
				socket.close();
				} catch(IOException e){
					System.out.println("Ŭ���̾�Ʈ�� ������������ �����");
					
				}
			}
			
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
