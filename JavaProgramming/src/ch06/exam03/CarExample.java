package ch06.exam03;

public class CarExample {//Car.class에서 생성자를 통해서 만든 설계도를 이용하여 실행한다.

	public static void main(String[] args) {
		//Car 변수 선언
		Car myCar = null;
		
		//Car 객체 생성하고 위치 정보 얻기
		try{
			myCar = new Car();//생성자를 호출한다는것은 생성자의 실행문을 실행하는것이다.
		} catch(Exception e){
			
		  }
		
		//Car 객체가 있는지를 조사
		if(myCar !=null){
			System.out.println("Car 객체 있음");
		} else{
			System.out.println("Car 객체 없음");
		}
		
		//객체 내부의 필드값을 읽어보자.
		System.out.println(myCar.company);
		
		//객체 내부의 필드값을 변경해 보자.
		myCar.company = "KOSA";
		System.out.println(myCar.company);
		
		//객체 내부의 메소드를 호출해 보자.
		myCar.run();
		 

	}

}
