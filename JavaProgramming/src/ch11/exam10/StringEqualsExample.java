package ch11.exam10;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "ȫ�浿"; //�ڵ�󿡼� �ִ� ���ڿ��� ���ͷ��̶� �Ѵ�.
		String strVar2 = new String("ȫ�浿");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1.equals(strVar2));

	}

}
