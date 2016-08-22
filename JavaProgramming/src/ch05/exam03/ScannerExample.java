package ch05.exam03;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in); //스캐너 선언

		
		System.out.print("학생수 : ");
		String strNum  = scanner.nextLine(); //학생의 수를 String타입으로 입력받겠다.
		int num = Integer.parseInt(strNum); //String타입을 int타입으로 변환해서 받겠다.
		int[] scores = new int [num];
		
		
		for(int i=0; i<scores.length; i++){
			System.out.print("점수 : ");
			String data  = scanner.nextLine();
			int score = Integer.parseInt(data); //타입 변환
			scores[i] = score;
			
		}
		
		int sum = 0;
		for(int score2 : scores){  //향상된 for문
			sum +=score2;
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (double)sum / scores.length);

	}

}
