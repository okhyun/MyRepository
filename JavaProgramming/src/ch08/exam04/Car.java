package ch08.exam04;

public class Car {
	Tire forntLeftTire = new HankookTire();
	Tire forntRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		 forntLeftTire.roll();
		 forntRightTire.roll();
		 backLeftTire.roll();
		 backRightTire.roll();
	}

}
