package ch08.exam01;

public interface RemoteControl {
	//Constant(���)
	public static final int MAX_VOLUME = 10; // int MAX_VOLUME = 10; �� �������̴�.
	int MIN_VOLUME = 0;
	
	//Abstract Method(�߻�)
	public abstract void turnOn(); // void turnOn(); �� �������̴�.
	void turnOff();
	void setVolume(int volume);
	
	
	//Default Method(����Ʈ)
	default public void setMute(boolean mute) {  // default void setMute() �� �������̴�.
		if(mute){
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� ��ü�մϴ�.");
		}
	}
	
	
	//Static Method(����)
	static public void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}

}
