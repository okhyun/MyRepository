package ch07.exam01;

public class DmbCellPhone extends CellPhone {
	//필드
	int channel;
	
	//생성자
	 DmbCellPhone(String model, String color, int channel) {
		this.model = model;//this는 자기자신을 지칭한다.
		super.color = color; //super는 부모를 지칭하는 명령어(CellPhone), 자식클래스 안에서만 쓸수있다, 인스턴스 객체에서만 쓸수있다.
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int chnnel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void tuenOffDmb(){
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}

}
