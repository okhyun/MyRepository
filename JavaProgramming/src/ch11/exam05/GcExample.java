package ch11.exam05;

public class GcExample {

	public static void main(String[] args) {
		Employee emp = new Employee(1);
		emp = null; //null 값을 넣어서 참조가 끊어진 쓰레기 객체가 생긴다.
		emp = new Employee(2);
		emp = new Employee(3);
		System.gc(); //쓰레기 객체를 제거해라.

	}

}
