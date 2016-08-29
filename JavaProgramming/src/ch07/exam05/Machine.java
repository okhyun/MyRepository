package ch07.exam05;

public class Machine {
	public void work(){
		System.out.println("Machine-work() 실행");
	}
	
	public final void powerOn(){ //메소드 앞에 final은 재정의(override 오버라이드)를 할수없다.
		System.out.println("전원을 연결합니다.");
	}
	
	public final void powerOff() {
		System.out.println("전원을 끊습니다.");
	}

}
