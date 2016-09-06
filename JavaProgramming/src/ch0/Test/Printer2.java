package ch0.Test;

public class Printer2 {
	//6장 예제 16번
	//void 리턴 타입
	//int, boolean,double, String 으로 메소드 
	static void println(int value) { //정적멤버는 정적 메소드, 필드 이다.
		System.out.println(value); // static은 고정된의 의미로 객체를 생성하지 않고 사용할수있는것 이다.
	}
	
	static public void println(boolean value) {
		System.out.println(value);
	}
	
	static public void println(double value) {
		System.out.println(value);
	}
	
	static public void println(String value) {
		System.out.println(value);
	}

}
