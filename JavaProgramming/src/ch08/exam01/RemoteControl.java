package ch08.exam01;

public interface RemoteControl {
	//Constant(상수)
	public static final int MAX_VOLUME = 10; // int MAX_VOLUME = 10; 와 같은것이다.
	int MIN_VOLUME = 0;
	
	//Abstract Method(추상)
	public abstract void turnOn(); // void turnOn(); 와 같은것이다.
	void turnOff();
	void setVolume(int volume);
	
	
	//Default Method(디폴트)
	default public void setMute(boolean mute) {  // default void setMute() 와 같은것이다.
		if(mute){
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해체합니다.");
		}
	}
	
	
	//Static Method(정적)
	static public void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

}
