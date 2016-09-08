package ch13.exam05;

public class Box<T> { //제네릭은 인터페이스타입 클래스타입 이다.// 타입이 결정되지 않은 상태
	private T item; 

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	

}
