package ch11.exam09;

public class NewInstanceExample {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("ch11.exam09." + args[0]);
		Object obj = clazz.newInstance(); //객체를 만들고자 할때 클래스를 모른다면
		Action action = (Action) obj; //부모의 타입변환
		
		//Action action = (Action)clazz.newInstance();
		action.execute();

	}

}
