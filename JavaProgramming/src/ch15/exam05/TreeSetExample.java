package ch15.exam05;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		
		//���� ã��
		int firstScore = scores.first();
		System.out.println(firstScore);
		System.out.println();
		
		int lastScore = scores.last();
		System.out.println(lastScore);
		System.out.println();
		
		int lowerScore = scores.lower(95);
		System.out.println(lowerScore);
		System.out.println();
		
		int higherScore = scores.higher(95);
		System.out.println(higherScore);
		System.out.println();
		
		int floorScore = scores.floor(95);
		System.out.println(lowerScore);
		System.out.println();
		
		int ceilingScore = scores.ceiling(95);
		System.out.println(ceilingScore);
		System.out.println();
		
		
		
		//����
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for(Integer score : descendingSet) {
			System.out.print(score + ",");
		}
		System.out.println();
		
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for(Integer score : ascendingSet) {
			System.out.print(score + ",");
		}
		System.out.println();
		
		
		//���� �˻�
		TreeSet<String> words = new TreeSet<>();
		words.add("apple");
		words.add("forever");
		words.add("descroption");
		words.add("ever");
		words.add("zoo");
		words.add("base");
		words.add("guess");
		words.add("cherry");
		
		NavigableSet<String> ns = words.descendingSet();
		for(String score : ns) {
			System.out.print(score + ",");
		}
		System.out.println();
		
		NavigableSet<String>ns2 = words.subSet("c", true, "f", false);
		for(String word : ns2)
			System.out.println(word + ",");
		System.out.println();
		
	}

}
