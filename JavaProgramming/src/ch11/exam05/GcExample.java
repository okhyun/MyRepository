package ch11.exam05;

public class GcExample {

	public static void main(String[] args) {
		Employee emp = new Employee(1);
		emp = null; //null ���� �־ ������ ������ ������ ��ü�� �����.
		emp = new Employee(2);
		emp = new Employee(3);
		System.gc(); //������ ��ü�� �����ض�.

	}

}
