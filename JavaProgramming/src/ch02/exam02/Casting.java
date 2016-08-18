package ch02.exam02;

public class Casting {

	public static void main(String[] args) {
		long v1 = 300;
		int v2 = (int) v1;
		System.out.println("v2:" + v2);
		
		byte v3 = (byte) v1;
		System.out.println("v3:" + v3);
		
		char v5= 'A'; //문자 표현은 ' '로 표시한다. char는 유니코드로 표현하기 때문에 문자그대로 A를 표시한다.
		int v6 = 'A';
		int v7 ='한';
		//byte v7 = '한';
		System.out.println("v5:" + v5);
		System.out.println("v6:" + v6);
		System.out.println("v7:" + v7);
		
		byte v8 = 65;
		char v9 = (char) v8; //char는 예외로 범위안에 들어가는 값을 직접넣으면 에러가 안나지만 변수로해서 집어넣으면 에러가 난다.
		System.out.println("v9:" + v9);
		
		char v10 = 66;
		System.out.println("v10:" + v10); //char 타입에서 숫자를 입력하면 문자로 변환된다.

	}

}
