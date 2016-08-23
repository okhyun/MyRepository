package ch06.exam03;

public class Car {//설계도
	//Field
	String company = "현대자동차"; //객체안에 들어간다
	
	//Constructor
	Car(){
		System.out.println("Car( )실행됨");
		//Integer.parseInt("a");
	}
	//Method
	void run(){
		System.out.println("run( )실행됨");//객체안에 들어간다
	}

}
