package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//List 계열의 컬렉션 생성
		List<String> list = new ArrayList<>(); //객체를 인터페이스에 대입(타입변환과 다형성), ArrayList cannot be resolved to a type 에러가 나올땐 import가 되어있지 않은것
		
		//객체 저장
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBatis");
		
		//저장된 객체수 얻기
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		//객체 찾기
		String skill = list.get(2); //2번의 객체를 알고싶을때
		System.out.println("2 : " + skill);
		
		//전체 객체를 일괄 처리
		 //for문을 이용해서 객체보기
		for(int i = 0; i < list.size(); i++) { // size는 실제 저장된 크기
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		for(String str :  list){ //향상된 for문에선 배열과  Iterable<E>로 적용된 것만 올수 있다.
			System.out.println(str);
		}
		System.out.println();
		
		//객체 삭제
		list.remove(2);
		list.remove(2);
		list.remove(new String("iBatis"));
		System.out.println(list.size());
	}

}
