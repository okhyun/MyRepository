package ch06.exam12;

public class StaticMember {
	//Static Field
	static String field;
	
	
	//Static Block 
	//Static Block�ȿ��� Static field�� �ʱ�ȭ�Ѵ�.
	static{
		System.out.println("Static Block ����"); //����ɶ� ������ȴ�.
		field = "�ڹ�";
		
	}
	
	//Static Method
	static void method(){
		
	}

}
