package ch07.exam08;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		
		Parent parent = child; //Parent타입엔 2가지밖에 호출할수 없다.
		parent.method1();
		parent.method2();
		


	}

}
