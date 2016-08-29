package ch06.exam12;

public class StaticMember {
	//Static Field
	static String field;
	
	
	//Static Block 
	//Static Block안에서 Static field를 초기화한다.
	static{
		System.out.println("Static Block 실행"); //적재될때 사용실행된다.
		field = "자바"; //static블럭 안에서는 static 메소드를 실행 할수 있다. 
		
	}
	
	//Static Method
	static void method(){
		
	}

}
