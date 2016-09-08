package ch13.exam02;

import java.util.Date;

public class BoxExample {
	public static void main(String[] args) {
		Box <String> box1 = new Box<>(); //뒤쪽 <>제레닉에 타입을 넣지 않아도 앞쪽에 타입을보고 자동으로 타입이 들어간다
		box1.setItem("홍길동");
		String name = box1.getItem();
		
		Box<Integer> box2 = new Box<>();// 제네릭에 기본타입은 쓰지 못한다.
		box2.setItem(10);
		int value = box2.getItem();
		
		
		Box<Date> box3 = new Box<>(); //제레닉을 사용해도 구체적인 타입을 사용해야한다.
		box3.setItem(new Date());
		Date now =  box3.getItem();
	}
}
