package ch18.exam07;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutExample {

	public static void main(String[] args) throws IOException {
		
		
		//2���� ���� ��� ���� ������.
		System.out.println("�ֿܼ� ����մϴ�.");
		
		
		OutputStream os = System.out;
		String data = "�ֿܼ� ����մϴ�.";
		byte[] values = data.getBytes();
		os.write(values);
		os.flush();
		os.close();
		
		System.err.println("�ֿܼ� ����մϴ�.");
		
	}

}
