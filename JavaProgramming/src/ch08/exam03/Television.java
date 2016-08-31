package ch08.exam03;

public class Television implements RemoteControl {
	
	private int volume;
	
	@Override
	public void turnOn() { //public�� �� �ٿ����ϴ� ������ �������̽����� public�� �����ε� public�� ������ �ʰ� void turnOn()�� ���� ����Ʈ ������ �����Ǳ� ������ �ȵȴ�.
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME){
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ����" + volume);
		
	}

}
