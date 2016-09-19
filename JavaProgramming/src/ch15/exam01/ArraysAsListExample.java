package ch15.exam01;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Jdbc", "Database"); //ArrayList와는 다르게 객체안에 배열이 생성이 되어있는데 그 배열은 고정된값을 가지고 있어서 변경(추가/삭제)이 불가하다.
		System.out.println(list.size());
		for(String str : list) {
			System.out.println(str);
		}
		
		list.add("SQL"); //UnsupportedOperationException 지원하지 않는 에러가 발생한다.
		list.remove(1); //UnsupportedOperationException 지원하지 않는 에러가 발생한다.

	}

}
