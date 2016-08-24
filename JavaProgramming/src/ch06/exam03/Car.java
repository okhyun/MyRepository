package ch06.exam03;

public class Car {//설계도
	//Field 필드
	String company = "현대자동차"; //객체안에 들어간다(데이터)
	
	
	//Constructor 생성자
	Car(){
		System.out.println("Car( )실행됨");
		//Integer.parseInt("a");
	}
	
	//Method 메소드(기능을 정의한다.)(실행)
	void run(){
		System.out.println("run( )실행됨");//객체안에 들어간다
	}

}
