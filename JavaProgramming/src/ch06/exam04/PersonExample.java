package ch06.exam04;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person( "김소현", "여자", 18, 167.8);
		//기본적으로 들어가 있는 데이터
		System.out.println(p1.name);
		System.out.println(p1.sex);
		System.out.println(p1.age);
		System.out.println(p1.height);
		System.out.println(p1.married);
		//데이터 수정
		p1.age = 20;
		
		
		

	}

}
