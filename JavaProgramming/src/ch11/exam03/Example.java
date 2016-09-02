package ch11.exam03;

public class Example {

	public static void main(String[] args) {
		Date d1 =new Date();
		String d1Str = d1.toString(); //리턴 타입은 String이다.
		System.out.println(d1Str);
		System.out.println(d1);
		String result = d1 + "맑음";
		System.out.println(result);
		
		java.util.Date d2  = new java.util.Date(); //패캐지를 앞에 쓰면 그곳에 있는 정보를 사용한다.
		String d2Str = d2.toString();
		System.out.println(d2Str);

	}

}
