package ch07.exam03;

public class Robot extends Machine {// 오버라이드(재정의) 컨트롤+스페이스로 찾아서 정의한다.
	@Override //어노테이션 : 이름이 복잡하거나 재정의가 잘되었는지 알려고 할때 어노테이션을 써준다.
	public void work(){
		System.out.println("Robot-work() 실행");
	}

}
