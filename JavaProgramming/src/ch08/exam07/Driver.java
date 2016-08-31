package ch08.exam07;

public class Driver {
	//필드
	
	//생성자
	
	//메소드
	public void drive(Vehicle vehicle) { //인터페이스를 구현한 객체가 매개변수 자리에 들어간다.
		if(vehicle instanceof Bus){
			Bus bus = (Bus) vehicle;
			bus.CheckFare();
		}
		vehicle.run();
	}
}
