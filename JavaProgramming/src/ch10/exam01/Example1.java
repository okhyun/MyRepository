package ch10.exam01;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			try{ // try���� �����ڵ带 �Է�
				System.out.println("�Է� : ");
				String data = scanner.nextLine();
				int value = Integer.parseInt(data);
				System.out.println(value);
			} catch(Exception e){ //���ܸ� ��°�
				System.out.println("���ڰ� �ƴѰ� �����ϴ�.");
			} finally { //catch�Ŀ� finally ����
				System.out.println("������ ����");
			}
		}
	}

}
