package ch11.exam10;

public class StringValueOfExample {

	public static void main(String[] args) {
		String str1 = "" + 10; // 문자열 + 숫자 
		String str2 = String.valueOf(10); //문자열을 숫자로 바꾸는 것
		
		int value = Integer.parseInt(str2);

	}

}
