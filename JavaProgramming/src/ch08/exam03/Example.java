package ch08.exam03;

public class Example {

	public static void main(String[] args) {
		
		//RemoteControl.setMute(true); 이런식의 호출은 불가능하다.
		
		RemoteControl rc = new Television();
		rc.setMute(true);
		
		RemoteControl.changeBattery();
		
		
		
	}

}
