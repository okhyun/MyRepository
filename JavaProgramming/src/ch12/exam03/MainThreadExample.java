package ch12.exam03;

public class MainThreadExample {

	public static void main(String[] args) {
		//������ü ����
		Calculator calculator = new Calculator();
		
		//������ ��ü ����
		User1 user1 = new User1();
		User2 user2 = new User2();
		
		
		//���� ��ü�� �� �����忡�� ����
		user1.setCaculator(calculator);
		user2.setCaculator(calculator);
		
		//������ ����
		user1.start();
		user2.start();

	}

}
