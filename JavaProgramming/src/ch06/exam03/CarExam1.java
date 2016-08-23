package ch06.exam03;

public class CarExam1 {

	public static void main(String[] args) {
		//객체생성
		CarExam mycar = new CarExam();
		System.out.println("제작회사 : " + mycar.company);
		System.out.println("모델 : " + mycar.model);
		System.out.println("색깔 : " + mycar.color);
		System.out.println("최고속도 : " + mycar.maxSpeed);
		System.out.println("현재속도 : " + mycar.speed);
		
		//필드값 변경
		mycar.speed = 120;
		System.out.println("변경된 속도 : " + mycar.speed);

	}

}
