package ch05.exam03;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in); //��ĳ�� ����

		
		System.out.print("�л��� : ");
		String strNum  = scanner.nextLine(); //�л��� ���� StringŸ������ �Է¹ްڴ�.
		int num = Integer.parseInt(strNum); //StringŸ���� intŸ������ ��ȯ�ؼ� �ްڴ�.
		int[] scores = new int [num];
		
		
		for(int i=0; i<scores.length; i++){
			System.out.print("���� : ");
			String data  = scanner.nextLine();
			int score = Integer.parseInt(data); //Ÿ�� ��ȯ
			scores[i] = score;
			
		}
		
		int sum = 0;
		for(int score2 : scores){  //���� for��
			sum +=score2;
		}
		System.out.println("���� : " + sum);
		System.out.println("��� : " + (double)sum / scores.length);

	}

}
