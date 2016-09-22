package ch18.exam16;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress myIA = InetAddress.getLocalHost(); //IP��ġ
		String myIp = myIA.getHostAddress();//IP�ּ�
		System.out.println("����ǻ�� IP : " + myIp);
		
		InetAddress[] naverIAs = InetAddress.getAllByName("www.naver.com");
		for(InetAddress ia : naverIAs) {
			System.out.println("���̹� ���� IP : " + ia.getHostAddress());
		}
	}

}
