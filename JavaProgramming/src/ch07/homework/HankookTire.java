package ch07.homework;

public class HankookTire extends Tire { //Tire(부모)로 부터 필드, 메소드를 물려받는다.
	//필드
	//생성자
	public HankookTire(String location, int maxRotation) { 
		super(location, maxRotation); //super는 Tire의 생성자를 지칭한다.
	}
	
	//메소드
	@Override //밑에 선언부가 맞는지 확인하는 (컴파일러)
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 : " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "HankookTire 펑크 ***");
			return false;
		}
	}

}
