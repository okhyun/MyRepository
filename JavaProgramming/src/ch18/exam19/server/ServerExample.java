package ch18.exam19.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		System.out.println("��������");
		ServerSocket serverSocket = null;
		try {
			//������ � IP�� ������ �� �ֵ��� �� ��
			serverSocket = new ServerSocket(5001);
			
			for(int i = 0; i<10; i++){ //������ 10����
				//Ŭ���̾�Ʈ�� ������ �����ϰ� ��ſ� Socket �� ����
				Socket socket = serverSocket.accept();
				
				//Ŭ���̾�Ʈ���� ���� �����͸� �ޱ�
				InputStream is = socket.getInputStream();
				byte[] receiveValues = new byte[1024];
				int byteNum = is.read(receiveValues);
				String data = new String(receiveValues, 0, byteNum, "UTF-8");
				
				
				//Ŭ���̾�Ʈ�� ���� ������
				OutputStream os = socket.getOutputStream();
				byte[] sendValues = data.getBytes("UTF-8");
				os.write(sendValues);
				os.flush();
				
				
				//Ŭ���̾�Ʈ�� ������ ����
				socket.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			serverSocket.close();
		} catch (IOException e) {
			System.out.println("��������");
		}
	}

}
