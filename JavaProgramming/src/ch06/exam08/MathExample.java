package ch06.exam08;

public class MathExample {

	public static void main(String[] args) {
		Math math = new Math();
		math.printInfo("수한 객체가 생성됨"); //void 타입
		
		int result = math.max(7, 5); //리턴타입
		System.out.println(result);
		math.max(5, 8);
		
		int[] values = {10, 20, 30, 40, 50};
		double result1 = math.avg1(values);
		System.out.println(result1);
		
		double result2 = math.avg2(10, 20, 30, 40, 50);
		System.out.println(result2);

	}

}
