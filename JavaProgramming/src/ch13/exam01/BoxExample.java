package ch13.exam01;

import java.util.Date;

public class BoxExample {
	public static void main(String[] args) {
		Box box1 = new Box();
		box1.setItem("ȫ�浿");
		String name = (String)box1.getItem();
		
		Box box2 = new Box();
		box2.setItem(10);
		int value = (Integer)box2.getItem();
		
		
		Box box3 = new Box();
		box3.setItem(new Date());
		Date now = (Date) box3.getItem();
	}
}
