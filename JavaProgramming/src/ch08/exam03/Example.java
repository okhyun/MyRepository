package ch08.exam03;

public class Example {

	public static void main(String[] args) {
		
		//RemoteControl.setMute(true); �̷����� ȣ���� �Ұ����ϴ�.
		
		RemoteControl rc = new Television();
		rc.setMute(true);
		
		RemoteControl.changeBattery();
		
		
		
	}

}
