package ch06.exam09;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5); //리턴값이 있는것
		
		boolean gasState = myCar.isLeftGas(); //리턴값이 없는것
		if(gasState){
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()){
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입해주세요.");
		}
	}

}
