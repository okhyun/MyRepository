package ch08.exam01;

public class Television implements RemoteControl {

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
		System.out.println("현재 TV 볼륨" + volume);
		
	}

}
