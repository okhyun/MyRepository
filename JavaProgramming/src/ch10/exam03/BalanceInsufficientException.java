package ch10.exam03;

public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException(){	} //���� �̸��� ���� �Ҷ� 
	public BalanceInsufficientException(String message) {
		super(message);
	}

}
