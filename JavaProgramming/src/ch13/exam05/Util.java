package ch13.exam05;


public class Util {
	public static <T> Box<T> boxing(T t) { //������ �ƴ϶� ����ϴ°��̸� ��ü���� Ÿ���� ����ؾ��Ѵ�.
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
