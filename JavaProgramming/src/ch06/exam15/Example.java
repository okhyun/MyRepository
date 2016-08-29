package ch06.exam15;

//import 
import ch06.exam15.pack1.*;
import ch06.exam15.pack2.*;


public class Example {

	public static void main(String[] args) {
		A a = new A();
		B b =  new B();
		//C c = new C();//ambiguous C의 타입이 애매하다.
		ch06.exam15.pack1.C c = new ch06.exam15.pack1.C();
	}

}
