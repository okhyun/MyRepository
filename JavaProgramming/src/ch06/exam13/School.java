package ch06.exam13;

public class School {
	//Class의 구성요소
	
	//Field
	private static School singleton = new School(); //private은 내부에서만 사용한다. 외부의 객체를 막는다.
	
	//Constructor
	private School() {
		
	}
	
	//Method
	static School getInstance() { //외부로 사용하기 위해선 return받아서 외부로 사용한다.
		return singleton;
	}

}
