package ch06.exam03;

public class CarExam1 {

	public static void main(String[] args) {
		//��ü����
		CarExam mycar = new CarExam();
		System.out.println("����ȸ�� : " + mycar.company);
		System.out.println("�� : " + mycar.model);
		System.out.println("���� : " + mycar.color);
		System.out.println("�ְ�ӵ� : " + mycar.maxSpeed);
		System.out.println("����ӵ� : " + mycar.speed);
		
		//�ʵ尪 ����
		mycar.speed = 120;
		System.out.println("����� �ӵ� : " + mycar.speed);

	}

}
