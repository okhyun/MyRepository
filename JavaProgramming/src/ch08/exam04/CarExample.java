package ch08.exam04;

public class CarExample {

	public static void main(String[] args) {
		Car myCar =new Car();
		
		myCar.run();
		
		myCar.forntLeftTire = new KumhoTire();
		myCar.forntRightTire = new KumhoTire();
		
		myCar.run();
	}

}
