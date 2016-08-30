package ch07.homework;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(); //객체 생성
		
		for(int i =1; i<=5; i++) {
			int problemLocation = car.run(); //Car 객체의 run( ) 메소드 5번 반복실행
			if(problemLocation !=0){
				System.out.println(car.tires[problemLocation-1].location + "HankookTire로 교체");
				car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("_________________________________"); //1회전 시 출력되는 내용을 구분
		}

	}

}
