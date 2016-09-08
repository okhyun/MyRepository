package ch13.exam04;

public interface Map<K,V> {//제네릭 타입
	void add(K k,V v);
	V get(K k);
}
