package ch11.exam10;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�."; //String ���ο� ���ڿ��� �ٲ��� ���Ѵ�.
		String newStr = oldStr.replace("�ڹ�", "Java");
		System.out.println(oldStr);
		System.out.println(newStr);
		System.out.println(oldStr == newStr);

	}

}
