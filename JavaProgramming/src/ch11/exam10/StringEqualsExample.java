package ch11.exam10;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "홍길동"; //코드상에서 주는 문자열을 리터럴이라 한다.
		String strVar2 = new String("홍길동");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1.equals(strVar2));

	}

}
