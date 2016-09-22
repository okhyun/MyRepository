package ch18.exam17.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			//������ � IP�� ������ �� �ֵ��� �� ��
			serverSocket = new ServerSocket(5001);
			
			//������ Ư�� IP�� ������ �� �ֵ��� �� ��
			/*serverSocket = new ServerSocket();
			SocketAddress sa = new InetSocketAddress("192.168.0.26", 5002);
			serverSocket.bind(sa);*/
			
			for(int i = 0; i<10; i++){ //������ 10����
				//Ŭ���̾�Ʈ�� ������ �����ϰ� ��ſ� Socket �� ����
				System.out.println("[Ŭ���̾���� ������ ��ٸ�]");
				Socket socket = serverSocket.accept();
				
				//Ŭ���̾�Ʈ�� IP ���� ���
				String clientIP = socket.getInetAddress().getHostAddress();
				System.out.println("[Ŭ���̾���� (" + clientIP + ") ������ ������]");
				
				//Ŭ���̾�Ʈ�� ������ ����
				socket.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
