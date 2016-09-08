package ch13.exam02;

public class Box<T> { //제네릭은 인터페이스타입 클래스타입 이다.
	private T item; 

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	

}
