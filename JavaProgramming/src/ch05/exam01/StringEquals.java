package ch05.exam01;

public class StringEquals {

	public static void main(String[] args) {
		String name1 = "자바";
		String name2 = "자바";
		String name3 = new String("자바");
		//다른객체 하지만 문자열은 같다. 이럴때 ==가 아닌 equals로 비교한다
		
		//객체비교
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		
		//문자열 비교
		System.out.println(name1.equals(name2)); 
		System.out.println(name1.equals(name3));

	}

}
