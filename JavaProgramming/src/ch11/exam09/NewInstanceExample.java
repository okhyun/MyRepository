package ch11.exam09;

public class NewInstanceExample {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("ch11.exam09." + args[0]);
		Object obj = clazz.newInstance(); //��ü�� ������� �Ҷ� Ŭ������ �𸥴ٸ�
		Action action = (Action) obj; //�θ��� Ÿ�Ժ�ȯ
		
		//Action action = (Action)clazz.newInstance();
		action.execute();

	}

}
