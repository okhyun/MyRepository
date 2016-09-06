package ch11.exam13;

public class CompareValueExample {

	public static void main(String[] args) {
		//정상
		Integer obj1 = 500;
		Integer obj2 = 500;
		
		System.out.println(obj1 ==obj2);
		System.out.println(obj1.intValue() == obj2.intValue()); //언박싱후 비교 //결론적으론 값비교이다.
		System.out.println(obj1.equals(obj2));
		
		
		//비정상
		Integer obj3 = 100;
		Integer obj4 = 100;
		
		System.out.println(obj3 ==obj4);
		System.out.println(obj3.intValue() == obj4.intValue());
		System.out.println(obj3.equals(obj4));

	}

}
