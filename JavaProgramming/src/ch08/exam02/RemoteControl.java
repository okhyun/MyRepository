package ch08.exam02;

public interface RemoteControl {
	//Constant(상수)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//Abstract Method(추상)
	void turnOn(); 
	void turnOff();
	void setVolume(int volume);
	
	
	//Default Method(디폴트)
	default void setMute(boolean mute) {
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
