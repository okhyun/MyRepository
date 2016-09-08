package ch13.exam07;

public class Util {
	public static <T extends Number> int compare(T t1, T t2) { //메소드를 작성할때 범위를 지정하지 않으면 object의 메소드를 사용하게된다(이유는 최상위 클래스가 object이기에)
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		
		/*if(v1 < v2) return-1;
		else if(v1 == v2) return 0;
		else return 1;*/
		
		return Double.compare(v1, v2);
	}
}
