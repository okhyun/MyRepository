package ch06.exam14;

public class Calculator3 {
	//Class�� �������
	//final  = ���� �ٸ����� �ο������� �ٲܼ����°�� �϶� (��. �ֹι�ȣ, �й� ���)
	//Field
	final int field2; 
	
		
	//Constructor
	Calculator3(int field2) { //�����ڿ� �Ű����� �������ش�.
		this.field2 = field2; 
	}
	
	//Method
	
	//Main Method
	public static void main(String[] args) {
		Calculator3 ca1 = new Calculator3(5);
		Calculator3 ca2 = new Calculator3(7);
	}

}
