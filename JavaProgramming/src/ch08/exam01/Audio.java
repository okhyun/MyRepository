package ch08.exam01;

public class Audio implements RemoteControl { //Audio�� RemoteControl�� ��밡���ϴ�.
	
	@Override
	public void turnOn() { //public�� �� �ٿ����ϴ� ������ �������̽����� public�� �����ε� public�� ������ �ʰ� void turnOn()�� ���� ����Ʈ ������ �����Ǳ� ������ �ȵȴ�.
		System.out.println("Audio�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("���� Audio ����" + volume);
		
	}

}
