package ch09.exam07;

public class A {
	int field = 5;
	
	public void method() {
		
		class B{
			int field = 10;
			B(){
				field = 20;
				this.field = 30;
				A.this.field = 40; //AŸ���� ��ü, �ܺ� �ʵ� ���ٹ��
			}
		}
		B b = new B();
		
		System.out.println("B�� �ʵ�" + b.field);
		System.out.println("A�� �ʵ�" + field);
	}
	
	

}