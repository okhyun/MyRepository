package ch07.exam13;

public abstract class Phone { //����Ǵ°��� ���� ���ؼ�
	public String number;
	
	
	public abstract void ring();
	
	public void sendVoice() {
		System.out.println("������ �����մϴ�.");
	}
	
	public void receiveVoice() {
		System.out.println("������ �����մϴ�.");
	}

}
