package ch11.exam13;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		Integer obj = 100;
		
		int value = obj; // obj 안에 있는 100을 꺼내서 value에 넣는다.
		System.out.println(value);
		
		int result = obj +200;
		System.out.println(result);

	}

}
