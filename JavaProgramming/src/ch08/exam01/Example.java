package ch08.exam01;

public class Example {
	public static void powerOn(RemoteControl rc){ //인터페이스로 사용가능한 객체, 객체를 구현만 가능하다면 어떤것이든 실행 가능하다.
		rc.turnOn();
	}

	public static void main(String[] args) {
		//상수
		int max = RemoteControl.MAX_VOLUME;
		int min = RemoteControl.MIN_VOLUME;
		
		//추상
		//RemoteControl.turnOn(); 구현객체가 없기 때문에 실행할 수 없다.
		//RemoteControl.turnOff();
		//RemoteControl.setVolume(5);
		
		
		//디폴트
		//RemoteControl.setMute(true); 디폴트도 구현객체가 없기 때문에 실행 할수 없다.
		
		
		//정적
		RemoteControl.changeBattery();
		
		
		//_____________________________________________________________________________________________
		
		//________인터페이스를 사용한 예__________
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
		
		powerOn(new Television()); //RemoteControl rc = new Television(); 와 같은것이다.
	}

}
