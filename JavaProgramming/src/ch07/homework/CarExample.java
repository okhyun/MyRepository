package ch07.homework;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(); //��ü ����
		
		for(int i =1; i<=5; i++) {
			int problemLocation = car.run(); //Car ��ü�� run( ) �޼ҵ� 5�� �ݺ�����
			if(problemLocation !=0){
				System.out.println(car.tires[problemLocation-1].location + "HankookTire�� ��ü");
				car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("_________________________________"); //1ȸ�� �� ��µǴ� ������ ����
		}

	}

}
