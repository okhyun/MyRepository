package ch11.exam10;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.println("�Է� : ");
		int readByteNo = System.in.read(bytes);//�Ű����� ���������� 1byte�� �д´�. //���ʹ� 2byte�̴�.
		
		
		//String str = new String( bytes ); //���Ͱ� ����. ������ �����ǰ��� ����� �ϱ⿡
		String str = new String(bytes, 0, readByteNo-2); //���͸� ���ִ� �Ű����� �־��־���.
		System.out.println(str);
	}

}
