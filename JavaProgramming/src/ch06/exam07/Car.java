package ch06.exam07;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){
		
	}
	
	Car(String model){
		this(model, null, 0);
	}
	
	Car(String model, String color){
		this(model, color, 0);
	}
	
	Car(String model, String color, int maxSpeed){//마지막 생성자는 형태를 가지고 있어야한다.
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}

}
