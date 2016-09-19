package ch15.exam02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		//Set �迭 �÷��� ����
		Set<String> set = new HashSet<String>();
		
		//��ü ����
		set.add("Servet/JSP");
		set.add("Java");
		set.add("JDBC");
		set.add("Java");
		set.add("iBATIS");
		System.out.println(set.size());
		System.out.println();
		
		//��ü�� �ϰ� ó���ϱ�
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			if(str.equals("JDBC")){ //�����ϴ� �ڵ� 
				iterator.remove();
			}
			System.out.println(str);
		}
		System.out.println();
		
		
		
		for(String str : set) { //���� for��
			System.out.println(str);
			/*if(str.equals("JDBC")){  //���� for�� �ȿ����� �� �ڵ带 ����� �� ����.
				iterator.remove();
			}*/
		}
		System.out.println();

	}

}
