package ch06.exam12;

public class StaticMember2 {
	//Static Field
	static String field;
	String field2;
	
	//Static Block 
	//Static Block�ȿ��� Static field�� �ʱ�ȭ�Ѵ�.
	static{
		System.out.println("Static Block ����"); //����ɶ� ������ȴ�.
		field = "�ڹ�"; //static�� �ȿ����� static �޼ҵ带 ���� �Ҽ� �ִ�. 
		//field2 = "�ڹ�";
	}
	
	//Static Method
	static void method(){
		field = "�ڹ�";
		//field2 = "�ڹ�";
		
	}
	void method2(){
		field = "�ڹ�";
		field2 = "�ڹ�";
	}
	
	public static void main(String[] args){//main ���๮��  ��ü�� �־���� ��� �� �� �ִ� �ν��Ͻ��� ����Ҽ� ����.
		field = "�ڹ�";
		//field2 = "�ڹ�"; �ν��Ͻ�
		
		method();
		//method2();
		
		StaticMember2 sm = new StaticMember2(); //�ν��Ͻ��� ����Ϸ��� ��ü�� �����ؾ��Ѵ�.
		sm.field2 = "�ڹ�";
		sm.method2();
		
	}

}
