package ch15.exam02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		//Set 계열 컬렉션 생성
		Set<String> set = new HashSet<String>();
		
		//객체 생성
		set.add("Servet/JSP");
		set.add("Java");
		set.add("JDBC");
		set.add("Java");
		set.add("iBATIS");
		System.out.println(set.size());
		System.out.println();
		
		//객체를 일괄 처리하기
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			if(str.equals("JDBC")){ //제거하는 코드 
				iterator.remove();
			}
			System.out.println(str);
		}
		System.out.println();
		
		
		
		for(String str : set) { //향상된 for문
			System.out.println(str);
			/*if(str.equals("JDBC")){  //향상된 for문 안에서는 이 코드를 사용할 수 없다.
				iterator.remove();
			}*/
		}
		System.out.println();

	}

}
