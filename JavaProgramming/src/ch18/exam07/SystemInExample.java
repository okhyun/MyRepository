package ch18.exam07;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class SystemInExample {

	public static void main(String[] args) throws IOException {
		//�Ѱ��� Ű�� �б�
		InputStream is = System.in;
		
		/*System.out.println("Ű �ϳ��� �Է� : ");
		int keyCode =is.read(); //in�� Ÿ���� InputStream
		System.out.println(keyCode + ":" + (char)keyCode);*/
		
		//�ѱ۰� ���� ����Ű�� ������ �б�
		System.out.println("���� Ű�� �Է� : ");
		byte[] values = new byte[100]; //������ �ִ� 100byte�� �д´�. 
		int byteNum = is.read(values);//����Ű �� 13,10 (2��) ���� �д´�.
		String data = new String(values, 0, byteNum-2); // -2�� ���ִ� ������ ���Ͱ� 13,10�� ���ִ� �����̴�.
		System.out.println(data);
		
	}

}
