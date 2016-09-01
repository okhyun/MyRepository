package ch10.exam03;

public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException(){	} //예외 이름을 정의 할때 
	public BalanceInsufficientException(String message) {
		super(message);
	}

}
