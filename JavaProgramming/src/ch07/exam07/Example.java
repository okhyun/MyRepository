package ch07.exam07;

public class Example {

	public static void main(String[] args) {
		A a; //부모
		a = new B();//부모 자식간의 관계이기에 자동타입변환이 가능하다.
		a = new C();
		
		B b;
		b = new B();
		//b = new C(): 상속관계가 아니기에 안된다.(자동타입변환이)

	}

}
