package ch11.exam10;

public class StringIndexOfExample {

	public static void main(String[] args) {
		/*String subject = "이것이 C++이다.";
		String subject1 = "이것이 자바다.";*/
		String subject = "자바 프로그래밍";
		
		boolean result1 = subject.contains("자바");
		if(result1) {
			System.out.println("자바 관련 책이군요");
		} else {
			System.out.println("자바 관련 책이 아니군요");
		}
		
		
		
		
		int result2 = subject.indexOf("자바");
		if(result2 != -1) {
			System.out.println("자바 관련 책이군요");
		} else {
			System.out.println("자바 관련 책이 아니군요");
		}
		
		
		int startIndex = subject.indexOf("자바");
		int endIndex = startIndex +2;
		String token1 = subject.substring(startIndex, endIndex);
		System.out.println(token1);
		
		String find = "프로그래밍";
		startIndex = subject.indexOf("자바"); //원하는 문자열을 찾을때
		/*endIndex = startIndex +"프로그래밍".length();
		String token2 = subject.substring(startIndex, endIndex);*/ //정한 위치에서 정한 끝지점까지 출력할때 //endIndex는 자기번지를 포함하지 않는다.
		String token2 = subject.substring(startIndex);   //정한 위치에서 끝까지 출력할때
		System.out.println(token2);
		
		
		/*String token = subject.substring(4, 7);
		System.out.println(token);
		
		String token1 = subject1.substring(4, 6); //(4, 6) = (stratIndex, endIndex) 같다. //endIndex는 자기번지를 포함하지 않는다.
		System.out.println(token1);*/

	}

}
