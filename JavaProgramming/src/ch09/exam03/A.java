package ch09.exam03;

public class A {
	//Field
	int field1;
	
	
	//Constructor
	
	
	
	//Method
	public void method() {
		final int value = 1;
		class B {
			public void method2(){
				//value = 3;
				int result = value + 1;
				System.out.println(result);
			}
		}
	
	
	B b = new B();
	b.method2();
	}
	

}
