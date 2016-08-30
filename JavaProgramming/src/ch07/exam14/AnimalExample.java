package ch07.exam14;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("_____");
		
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal.sound();
		System.out.println("_____");
		
		//메소드의 다형성
		animalSound(new Dog()); //AnimalExample이 생략되어있다. 자신 클래스에선 생략 가능하다.   AnimalExample.animalSound(new Dog());
		animalSound(new Cat());

	}
	public static void animalSound(Animal animal){
		animal.sound();
	}

}
