package ch11.homework;

//확인문제9번
public class StringBuilderExample {

	public static void main(String[] args) {
		String str = "";
		for(int i = 1; i <=100; i++) {
			str += i;
		}
		
		System.out.println(str);
		
		//개선 코드 작성
		StringBuilder sb =new StringBuilder();
		for(int i = 1; i<=100; i++) {
			sb.append(i);
		}
		str = sb.toString();
		System.out.println(str);

	}

}
