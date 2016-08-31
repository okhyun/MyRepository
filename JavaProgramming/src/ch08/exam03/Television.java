package ch08.exam03;

public class Television implements RemoteControl {
	
	private int volume;
	
	@Override
	public void turnOn() { //public을 꼭 붙여야하는 이유는 인터페이스에선 public의 범위인데 public을 붙이지 않고 void turnOn()을 쓰면 디폴트 범위로 지정되기 때문에 안된다.
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
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
		System.out.println("현재 TV 볼륨" + volume);
		
	}

}
