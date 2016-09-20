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
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
			
		}
		System.out.println("프로그램 종료");
	}
	
		//계좌생성하기
		private static void createAccount() {
			//작성위치
			System.out.println("---------------------------");
			System.out.println("계좌생성");
			System.out.println("---------------------------");
			
			System.out.println("계좌번호 : ");
			String ano = scanner.next();
			
			System.out.println("계좌주 : ");
			String owner = scanner.next();
			
			System.out.println("초기입금액 : ");
			int balance = scanner.nextInt();
			
			Account newAccount = new Account(ano, owner, balance);
			for(int i = 0; i < accountArray.length; i++) {
				if(accountArray[i] == null) { //만약에 배열에 값이 없고 null값이라면 
					accountArray[i] = newAccount; //null값인 부분에 새로운 Account를 생성 
					System.out.println("결과: 계좌가 생성되었습니다.");
					break;
				}
			}
			
		}
		
		//계좌목록보기
		private static void accountList() {
			//작성위치
			System.out.println("--------------------------------");
			System.out.println("계좌목록");
			System.out.println("--------------------------------");
			for(int i = 0; i<accountArray.length; i++){
				Account account = accountArray[i];
				if(account != null){
					System.out.print(account.getAno() + "\t\t");
					System.out.print(account.getOwner() + "\t\t");
					System.out.print(account.getBalance());
					System.out.println();
				}
			}
		}
		
		//예금하기
		private static void deposit() {
			//작성위치
			System.out.println("----------------------------");
			System.out.println("예금");
			System.out.println("----------------------------");
			
			System.out.println("계좌번호 : ");
			String ano = scanner.next();
						
			System.out.println("예금액 : ");
			int money = scanner.nextInt();
			
			Account account = findAccount(ano);
			if(account == null) {
				System.out.println("결과 : 계좌가 없습니다.");
				return;
			}
			account.setBalance(account.getBalance() + money); //기존의 예금금액에 지금 예금한 금액을 더한다.
			System.out.println("결과 : 예금이 성공되었습니다.");
		}
		
		//출금하기
		private static void withdraw() {
			//작성위치
			System.out.println("---------------------------");
			System.out.println("출금");
			System.out.println("---------------------------");
			System.out.println("계좌번호 : ");
			String ano = scanner.next();
			
			System.out.println("출금액 : ");
			int money1 = scanner.nextInt();
			
			Account account = findAccount(ano);
			if(account == null){
				System.out.println("결과 : 계좌가 없습니다.");
				return;
			}
			
			account.setBalance(account.getBalance() - money1);
			System.out.println("결과 :  출금 성공되었습니다.");
		}
		
		//Account 배열에서 ano와 동일한 Account 객체 찾기
		private static Account findAccount(String ano) {
			Account account = null;
			for(int i = 0; i<accountArray.length; i++){
				if(accountArray[i] != null) {
					String dbAno = accountArray[i].getAno();
					if(dbAno.equals(ano)) {
						account = accountArray[i];
						break;
					}
				}
			}
			return account;
		}
	

}
