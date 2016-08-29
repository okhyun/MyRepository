package ch06.exam14;

public class Calculator2 {
	//Class의 구성요소
	
	//Field
	final int field2; 
	static final int field4;
	
		
	//Constructor
	Calculator2() {
		field2 = 5; //초기화 하는법 인스턴스생성자는 생성자에서 값을준다.
	}
	
	static{
		field4 = 5; //초기화 하는법 static생성자는 static블럭 안에서 값을 준다.
	}
	
	//Method

}
