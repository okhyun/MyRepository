package ch07.exam02;

public class CellPhone {
	//�ʵ�
	String model;
	String color;
	
	//������
	public CellPhone(String model, String color){
		this.model = model;
		this.color = color; 
	}
	
	
	//�޼ҵ�
	void powerOn() {System.out.println("������ �մϴ�.");}
	void powerOff(){System.out.println("������ ���ϴ�.");}
	void bell(){System.out.println("���� �︳�ϴ�.");}
	void sendVoice(String message){System.out.println("�ڱ� : " + message);}
	void receiVoice(String message){System.out.println("���� : " + message);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�.");}
	

}
