package ch11.exam12;

import java.util.Arrays;
//항목 검색
public class ArraySearchExample {

	public static void main(String[] args) {
		int [] scores = {99, 97, 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99); // 찾고자하는 배열, 찾을항목
		System.out.println("찾은 인덱스 : " + index);
		
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("찾은 인덱스 : " + index);
		
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("찾은 인덱스 : " + index);

	}

}
