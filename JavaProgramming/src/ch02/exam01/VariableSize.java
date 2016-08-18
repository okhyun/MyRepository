package ch02.exam01;

public class VariableSize {

	public static void main(String[] args) {
		byte var1 = 10;
		//byte var2 = 200;
		
		int var3 = 200;
		byte var4 =(byte) var3;
		System.out.println(var4);
		
		int var5 = 200000;
		char var6 = (char) var5;
		System.out.println(var6);
		//(캐스팅) 소괄호 안에 들어가있는 타입의 크기만큼 지정한 변수에 타입크기가 적용된다.  

	}

}
