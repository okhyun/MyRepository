package ch07.exam06.pack2;

import ch07.exam06.pack1.A;

public class D extends A {//상속할때 에러나면 import부터 확인--> 컨트롤+쉬프트+오
	//필드
	//A a = new A();
	
	//생성자
	D() {
		/*A a = new A();
		a.field = 5;
		a.method();*/ //상속과 관련없는 문장
		
		super(); //부모 생성자 호출 허용--자식생성자에서 부모생성자 호출하는 명령어
		field =5;
		method(); //상속과 관련있는 문장
	}
	
	//메소드
	/*void method2() {
		A a = new A();
	}*/
	
	
}
