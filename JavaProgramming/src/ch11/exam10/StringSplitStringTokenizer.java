package ch11.exam10;

import java.util.StringTokenizer;

public class StringSplitStringTokenizer {
	public static void main(String[] args) {
		String data = "홍길동,이수홍,박연수,김자바,최명호"; //Token은 문자열 홍길동, 이수홍 같은 것들을 지칭한다.(각각)
		
		String[] dataArray = data.split(",");
		System.out.println(dataArray.length);
		for(String name : dataArray) {
			System.out.println(name);
		}
		
		StringTokenizer st = new StringTokenizer(data, ",");  //StringTokenizer를 쓸려면 " , " 로 문자열이 나누어져 있어야한다.// StringTokenizer는 1개만 구분해 줄수있다.
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			System.out.println(name);
			
		}
		
		
		data = "홍길동&이수홍,박연수,김자바-최명호"; //split는 구분자를 여러개 구분해 줄수있다.
		
		dataArray = data.split("&|,|-");
		System.out.println(dataArray.length);
		for(String name : dataArray) {
			System.out.println(name);
		}
	}
}
