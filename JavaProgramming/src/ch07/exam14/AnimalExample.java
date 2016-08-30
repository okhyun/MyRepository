package ch07.exam14;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("_____");
		
		
		//������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal.sound();
		System.out.println("_____");
		
		//�޼ҵ��� ������
		animalSound(new Dog()); //AnimalExample�� �����Ǿ��ִ�. �ڽ� Ŭ�������� ���� �����ϴ�.   AnimalExample.animalSound(new Dog());
		animalSound(new Cat());

	}
	public static void animalSound(Animal animal){
		animal.sound();
	}

}
