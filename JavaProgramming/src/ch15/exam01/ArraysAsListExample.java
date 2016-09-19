package ch15.exam01;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Jdbc", "Database"); //ArrayList�ʹ� �ٸ��� ��ü�ȿ� �迭�� ������ �Ǿ��ִµ� �� �迭�� �����Ȱ��� ������ �־ ����(�߰�/����)�� �Ұ��ϴ�.
		System.out.println(list.size());
		for(String str : list) {
			System.out.println(str);
		}
		
		list.add("SQL"); //UnsupportedOperationException �������� �ʴ� ������ �߻��Ѵ�.
		list.remove(1); //UnsupportedOperationException �������� �ʴ� ������ �߻��Ѵ�.

	}

}
