package ch05.exam01;

public class StringEquals {

	public static void main(String[] args) {
		String name1 = "�ڹ�";
		String name2 = "�ڹ�";
		String name3 = new String("�ڹ�");
		//�ٸ���ü ������ ���ڿ��� ����. �̷��� ==�� �ƴ� equals�� ���Ѵ�
		
		//��ü��
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		
		//���ڿ� ��
		System.out.println(name1.equals(name2)); 
		System.out.println(name1.equals(name3));

	}

}
