package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//List �迭�� �÷��� ����
		List<String> list = new ArrayList<>(); //��ü�� �������̽��� ����(Ÿ�Ժ�ȯ�� ������), ArrayList cannot be resolved to a type ������ ���ö� import�� �Ǿ����� ������
		
		//��ü ����
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBatis");
		
		//����� ��ü�� ���
		int size = list.size();
		System.out.println("�� ��ü�� : " + size);
		System.out.println();
		
		//��ü ã��
		String skill = list.get(2); //2���� ��ü�� �˰������
		System.out.println("2 : " + skill);
		
		//��ü ��ü�� �ϰ� ó��
		 //for���� �̿��ؼ� ��ü����
		for(int i = 0; i < list.size(); i++) { // size�� ���� ����� ũ��
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		for(String str :  list){ //���� for������ �迭��  Iterable<E>�� ����� �͸� �ü� �ִ�.
			System.out.println(str);
		}
		System.out.println();
		
		//��ü ����
		list.remove(2);
		list.remove(2);
		list.remove(new String("iBatis"));
		System.out.println(list.size());
	}

}
