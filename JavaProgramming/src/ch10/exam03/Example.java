package ch10.exam03;

public class Example {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(100000);
		System.out.println(account.getBalance());
		
		try{ //����ϴ°����� try catch �Ѵ�.
			account.withdraw(200000);
			System.out.println("����� �Ǿ����ϴ�.");
		} catch(BalanceInsufficientException e){
			System.out.println(e.getMessage());
			e.printStackTrace(); //���ܸ� �����Ѵ�.
			System.out.println("����� ���� �ʽ��ϴ�.");
		}
	}

}
