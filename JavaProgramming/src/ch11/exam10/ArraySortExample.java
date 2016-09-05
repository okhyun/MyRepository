package ch11.exam10;

import java.util.Arrays;//�߿��ϴ�.����

public class ArraySortExample {
	public static void main(String[] args){
		int[] scores = {99, 97, 98};
		
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
		
		Member2[] members = {
				new Member2("ȫ�浿", 99),
				new Member2("�ڵ���", 97),
				new Member2("��μ�", 98)
		};
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
	}

}


class Member2 implements Comparable{ //sorting �Ҷ� implements Comparable ������ ����
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
		//return name.compareTo(target.name); //return name.compareTo(target.name); �������� ���� // return target.name.compareTo(name); �������� ����
		return score-target.score;
	}
	@Override
	public String toString() {
		return name;
	}
}