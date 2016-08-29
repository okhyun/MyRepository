package ch06.exam14;

public class Calculator3 {
	//Class의 구성요소
	//final  = 값이 다르지만 부여받으면 바꿀수없는경우 일때 (예. 주민번호, 학번 등등)
	//Field
	final int field2; 
	
		
	//Constructor
	Calculator3(int field2) { //생성자에 매개값을 설정해준다.
		this.field2 = field2; 
	}
	
	//Method
	
	//Main Method
	public static void main(String[] args) {
		Calculator3 ca1 = new Calculator3(5);
		Calculator3 ca2 = new Calculator3(7);
	}

}
