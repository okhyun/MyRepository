package ch10.homeWork;

public class WrongPasswordException  extends Exception{
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);//		
	}
	/*  String 타입의 매개변수를 갖는 생성자는 부모클래스 생성자에게 메시지를 넘겨준다.
	  이유는 부모클래스의 catch{} 블록안에 예외처리 코드를 사용 하기위해서 이다.
	  부모를 지칭하는 super를 넣어주고 넘겨줄 매개변수 넘어준다.
	 *
	 */
}
