package ch07.exam05;

public class Machine {
	public void work(){
		System.out.println("Machine-work() ����");
	}
	
	public final void powerOn(){ //�޼ҵ� �տ� final�� ������(override �������̵�)�� �Ҽ�����.
		System.out.println("������ �����մϴ�.");
	}
	
	public final void powerOff() {
		System.out.println("������ �����ϴ�.");
	}

}
