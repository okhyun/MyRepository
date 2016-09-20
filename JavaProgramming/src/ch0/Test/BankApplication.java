package ch0.Test;

import java.util.Scanner;

public class BankApplication {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Account [] accountArray = new Account[100];
	
	public static void main (String [] args){
		boolean run = true;
		while(run){
			System.out.println("___________________________________________");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("___________________________________________");
			System.out.println("선택 : ");
			
			int selectNo = scanner.nextInt(); //
			
		}
	}

}
