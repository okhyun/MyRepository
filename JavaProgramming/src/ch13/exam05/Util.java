package ch13.exam05;


public class Util {
	public static <T> Box<T> boxing(T t) { //선언이 아니라 사용하는것이면 구체적인 타입을 명시해야한다.
		Box<T> box = new Box<T>();
		box.setItem(t);
		return box;
	}
	
	/*public static Box<Date> boxing(Date t) {
		Box<Date> box = new Box<Date>();
		box.setItem(t);
		return box;
	}
	
	public static Box<Integer> boxing(Integer t) { 
		Box<Integer> box = new Box<Integer>();
		box.setItem(t);
		return box;
	}*/
}
