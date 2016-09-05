package ch11.exam10;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) { //toLowerCase(), toUpperCase()
		String oldStr = "java Programming";
		String newStr = oldStr.toLowerCase(); //toLower는 소문자를 지칭한다.
		System.out.println(oldStr);
		System.out.println(newStr);
		System.out.println(oldStr == newStr);
		
		System.out.println(oldStr.equals("JAVA programming"));
		System.out.println(oldStr.toLowerCase().equals("JAVA programming".toLowerCase()));
		System.out.println(oldStr.toUpperCase().equals("JAVA programming".toUpperCase()));
		
		String targetStr = "                Java Progrmming                  "; // trim() 잘라내기
		System.out.println(oldStr == targetStr);
		System.out.println(oldStr.equals(targetStr));
		System.out.println(oldStr.equals(targetStr.trim()));

	}

}
