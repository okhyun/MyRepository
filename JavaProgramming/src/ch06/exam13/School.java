package ch06.exam13;

public class School {
	//Class�� �������
	
	//Field
	private static School singleton = new School(); //private�� ���ο����� ����Ѵ�. �ܺ��� ��ü�� ���´�.
	
	//Constructor
	private School() {
		
	}
	
	//Method
	static School getInstance() { //�ܺη� ����ϱ� ���ؼ� return�޾Ƽ� �ܺη� ����Ѵ�.
		return singleton;
	}

}
