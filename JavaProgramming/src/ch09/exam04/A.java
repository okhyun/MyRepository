package ch09.exam04;

public class A {
	int field;
	
	
	public A(int field){
		B b = new B();
	}
	
	static void method2(){
		B b = new B();
	}
	
	
	
	public static class B{
		static int field1;
		static void method() {}
		}

}
