package ch08.exam01;

public class Example {
	public static void powerOn(RemoteControl rc){ //�������̽��� ��밡���� ��ü, ��ü�� ������ �����ϴٸ� ����̵� ���� �����ϴ�.
		rc.turnOn();
	}

	public static void main(String[] args) {
		//���
		int max = RemoteControl.MAX_VOLUME;
		int min = RemoteControl.MIN_VOLUME;
		
		//�߻�
		//RemoteControl.turnOn(); ������ü�� ���� ������ ������ �� ����.
		//RemoteControl.turnOff();
		//RemoteControl.setVolume(5);
		
		
		//����Ʈ
		//RemoteControl.setMute(true); ����Ʈ�� ������ü�� ���� ������ ���� �Ҽ� ����.
		
		
		//����
		RemoteControl.changeBattery();
		
		
		//_____________________________________________________________________________________________
		
		//________�������̽��� ����� ��__________
		Television tv = new Television();
		tv.turnOn();
		
		RemoteControl rc = tv;
		rc.turnOn();
		//___________________________________________
		
		Audio audio = new Audio();
		audio.turnOn();
		
		rc = audio;
		rc.turnOn();
		//____________________________________________
		
		powerOn(new Television()); //RemoteControl rc = new Television(); �� �������̴�.
	}

}
