package ch11.exam02;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		Key key1 = new Key(1);
		Key key2 = new Key(1);
		
		System.out.println(key1 == key2);  //false
		System.out.println(key1.equals(key2));  //true
		System.out.println(key1.hashCode() == key2.hashCode());  //false
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		//HashMap<Key, String> Ÿ���Դϴ�.
		hashMap.put(key1, "ȫ�浿");
		hashMap.put(key2, "���ڹ�");
		
		System.out.println(hashMap.size()); //hashMap.size()�� hashMap�� ����� ���� ����� �˼� �ִ�.
	}

}
