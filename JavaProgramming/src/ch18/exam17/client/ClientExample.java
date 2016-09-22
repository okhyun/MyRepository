package ch18.exam17.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class ClientExample {

	public static void main(String[] args) {
		//���� ����
		Socket socket = new Socket();
		
		//���� ��û�ϱ�
		try {
			SocketAddress sa = new InetSocketAddress("192.168.0.26", 5001);
			socket.connect(sa);
			System.out.println("[������ �����]");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//������ ������ ����
		try {
			socket.close(); //������ ����� ���� �ʰڴ�.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
