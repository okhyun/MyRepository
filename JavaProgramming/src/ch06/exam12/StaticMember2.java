package ch06.exam12;

public class StaticMember2 {
	//Static Field
	static String field;
	String field2;
	
	//Static Block 
	//Static Block안에서 Static field를 초기화한다.
	static{
		System.out.println("Static Block 실행"); //적재될때 사용실행된다.
		field = "자바"; //static블럭 안에서는 static 메소드를 실행 할수 있다. 
		//field2 = "자바";
	}
	
	//Static Method
	static void method(){
		field = "자바";
		//field2 = "자바";
		
	}
	void method2(){
		field = "자바";
		field2 = "자바";
	}
	
	public static void main(String[] args){//main 실행문도  객체가 있어야지 사용 할 수 있는 인스턴스는 사용할수 없다.
		field = "자바";
		//field2 = "자바"; 인스턴스
		
		method();
		//method2();
		
		StaticMember2 sm = new StaticMember2(); //인스턴스를 사용하려면 객체를 생성해야한다.
		sm.field2 = "자바";
		sm.method2();
		
	}

}
