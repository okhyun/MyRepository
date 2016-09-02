package ch11.exam08;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		//Class classCar = Car.class;
		//Class classCar = Class.forName("ch11.exam08.Car"); //메모리에 로딩된 번지가 classCar에 저장된다.
		
		
		Car car = new Car();
		Class classCar = car.getClass();
		
		System.out.println(classCar.getName());
		System.out.println(classCar.getSimpleName());
		System.out.println(classCar.getPackage().getName());

	}

}
