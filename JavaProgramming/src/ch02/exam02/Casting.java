package ch02.exam02;

public class Casting {

	public static void main(String[] args) {
		long v1 = 300;
		int v2 = (int) v1;
		System.out.println("v2:" + v2);
		
		byte v3 = (byte) v1;
		System.out.println("v3:" + v3);
		
		char v5= 'A'; //���� ǥ���� ' '�� ǥ���Ѵ�. char�� �����ڵ�� ǥ���ϱ� ������ ���ڱ״�� A�� ǥ���Ѵ�.
		int v6 = 'A';
		int v7 ='��';
		//byte v7 = '��';
		System.out.println("v5:" + v5);
		System.out.println("v6:" + v6);
		System.out.println("v7:" + v7);
		
		byte v8 = 65;
		char v9 = (char) v8; //char�� ���ܷ� �����ȿ� ���� ���� ���������� ������ �ȳ����� �������ؼ� ��������� ������ ����.
		System.out.println("v9:" + v9);
		
		char v10 = 66;
		System.out.println("v10:" + v10); //char Ÿ�Կ��� ���ڸ� �Է��ϸ� ���ڷ� ��ȯ�ȴ�.

	}

}
