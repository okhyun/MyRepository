package ch18.exam07;

import java.io.Console;

public class ConsoleExample {

	public static void main(String[] args) {
		Console console = System.console();
				
				
		System.out.println("���̵� : ");
		String id = console.readLine();
		
		System.out.println("�н�����");
		char[] values = console.readPassword( );
		String password = new String(values);
		
		System.out.println("�Էµ� ����");
		System.out.println(id);
		System.out.println(password);
	}

}
