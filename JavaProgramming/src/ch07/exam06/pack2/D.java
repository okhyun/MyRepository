package ch07.exam06.pack2;

import ch07.exam06.pack1.A;

public class D extends A {//����Ҷ� �������� import���� Ȯ��--> ��Ʈ��+����Ʈ+��
	//�ʵ�
	//A a = new A();
	
	//������
	D() {
		/*A a = new A();
		a.field = 5;
		a.method();*/ //��Ӱ� ���þ��� ����
		
		super(); //�θ� ������ ȣ�� ���--�ڽĻ����ڿ��� �θ������ ȣ���ϴ� ��ɾ�
		field =5;
		method(); //��Ӱ� �����ִ� ����
	}
	
	//�޼ҵ�
	/*void method2() {
		A a = new A();
	}*/
	
	
}
