package ch07.exam06.pack1;

public class B {
	//�ʵ�
	A a = new A();
	
	//������
	B(){
		A a = new A();
		a.field = 10;
		a.method();
	}
	
	//�޼ҵ�
	void method() {
		A a = new A();
		a.field = 10;
		a.method();
	}

}
