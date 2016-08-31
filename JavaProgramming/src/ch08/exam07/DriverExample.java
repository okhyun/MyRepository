package ch08.exam07;

public class DriverExample {

	public static void main(String[] args) {
		/*Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus) vehicle;
		bus.CheckFare(); //Casting 강제 타입 변환
*/	
	
		Driver driver = new Driver();
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
	}

}
