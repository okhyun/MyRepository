package ch07.exam01;

public class Machine {
	//Field
	public String kind;
	public String maker;
	
	
	
	//Constructor
	public Machine(){
		System.out.println("Machine() �����");
	}
	
	
	
	//Method
	public void powerOn() {
		System.out.println("maker" + "." + "kind" + "�Ŀ���");
	}
	public void powerOff() {
		System.out.println("maker" + "." + "kind" + "�Ŀ�����");
	}

}
