package ch11.exam10;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		String tel1  = "010-123-1234";
		String tel2  = "013-123-1234";
		String tel3  = "010-1234-1234";
		String tel4  = "010-123-123";
		
		String regExp = "(010|011)-\\d{3,4}-\\d{4}"; // \d{3,4}는 3자리 또는 4자리
		
		System.out.println(Pattern.matches(regExp, tel1)); //매개변수에 들어가있는 자리값은 (정규식, 검증할 문자열) 이다.
		System.out.println(Pattern.matches(regExp, tel2));
		System.out.println(Pattern.matches(regExp, tel3));
		System.out.println(Pattern.matches(regExp, tel4));
		
		String email1 = "hong@naver.com";
		String email2 = "hongnaver.com";
		String email3 = "hong@naver";
		
		String regExp2 = "\\w+@\\w+\\.\\w+";
		
		System.out.println(Pattern.matches(regExp2, email1)); 
		System.out.println(Pattern.matches(regExp2, email2));
		System.out.println(Pattern.matches(regExp2, email3));

	}

}
