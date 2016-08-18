package ch02.exam02;

public class OperationPromotion {

	public static void main(String[] args) {
		int v1 = 10+20;
		System.out.println("v1:" + v1);
		
		byte v2 = 10;
		byte v3 = 20;
		//int v4 = v2 + v3;
		int v5 = v2 + v3; //연산을 하면 자동으로 int 타입으로 계산을 하기때문에 다른타입의변수를 적용하면 에러가 난다.
		System.out.println("v5:" + v5);
		
		char v6 = 'A';
		int v7 = v6 + 1;
		char v8 =(char) v7;
		System.out.println("v8:" + v8);

	}

}
