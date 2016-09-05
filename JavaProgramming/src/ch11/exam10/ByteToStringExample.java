package ch11.exam10;

import java.io.UnsupportedEncodingException;

public class ByteToStringExample {// 496page // 11.7 String 클래스
	public static void main(String[] atrgs) throws UnsupportedEncodingException {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97}; //byte로 된 배열 을 만든다. //매개값으로 입력한 숫자를 문자로 바꾸어준다. 
		//ASCII(아스키코드) 번호(0~155) 숫자 알파벳(대,소문자) 특수문자로 구성
		
		String str1 = new String(bytes); //byte를 매개값으로 받는 생성자 
		System.out.println(str1);
		
		
		String str2 = new String(bytes, 6, 4);//String 생성자에 매개변수 3개가 선언.//생성자에 들어있는 매개변수는  6은 index(배열의 위치)위치이고, 4는 갯수이다.
		System.out.println(str2);// -->결과적으로 6번째 배열위치부터 4개까지 읽는다.
		
		
		//___________________________________________________________________________________________
		
		// JAVA는 2byte UNICODE를 사용한다.
		
		String str3 = "홍길동"; //한글은 아스키코드로 변환이 불가능하다.
		byte[] strBytes3 = str3.getBytes(); 
		String str4 = new String(strBytes3);
		System.out.println(str4);
		
		
		
		String str5 = "홍길동";
		byte[] strBytes5 = str5.getBytes("EUC-KR"); // UTF-8은  3byte이다. 근데  java의 유니코드는 기본 2byte이다.(Encoding작업)
		String str6 = new String(strBytes5, "EUC-KR");//  그래서 변환 작업을 해줘야한다.(Decoding작업) // 문자셋을 넣어주면 글이 깨지지않는다.
		System.out.println(str6);
		String str7 = new String(strBytes5, 2, 2, "EUC-KR"); //매개변수 6은 읽어 들이는 byte수이다.
		System.out.println(str7);
		
		
		
		//Encoding 문자셋과 Decoding 문자셋은 같아야한다.
		/*String str5 = "ab홍길동"; //총 8byte이다.
		byte[] strBytes5 = str5.getBytes("EUC-KR"); // EUC-KR은 한글+아스키코드 //EUC-KR에서 한글은 2byte이다.
		String str6 = new String(strBytes5, "EUC-KR"); //UTF-8은 아스키코드+유니코드(각 나라별로 Byte수가 다르다)
		System.out.println(str6);*/
	}

}
