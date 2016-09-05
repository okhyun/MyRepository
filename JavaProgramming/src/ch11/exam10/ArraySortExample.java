package ch11.exam10;

import java.util.Arrays;//중요하다.정렬

public class ArraySortExample {
	public static void main(String[] args){
		int[] scores = {99, 97, 98};
		
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
		
		Member2[] members = {
				new Member2("홍길동", 99),
				new Member2("박동수", 97),
				new Member2("김민수", 98)
		};
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
	}

}


class Member2 implements Comparable{ //sorting 할때 implements Comparable 무조건 구현
	String name;
	int score;
	
	Member2(String name, int score) {
		this.name = name;
		this.score = score;
	}
	@Override
	public int compareTo(Object o) {
		System.out.println("compareTo");
		Member2 target = (Member2) o;
		//return name.compareTo(target.name); //return name.compareTo(target.name); 오름차순 형태 // return target.name.compareTo(name); 내림차순 형태
		return score-target.score;
	}
	@Override
	public String toString() {
		return name;
	}
}