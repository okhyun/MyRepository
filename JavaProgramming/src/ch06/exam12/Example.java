package ch06.exam12;

public class Example {

	public static void main(String[] args) {
		//Instance Member 사용
		InstanceMember im = new InstanceMember(); //생성자는 이부분에서 실행
		im.field = "자바"; //im변수가 참고하고있는 객체에서 자바
		im.method(); 
		
		
		//Static Member 사용
		StaticMember.field = "자바"; //사용하고있을때 적재가된다.
		StaticMember.method(); //class이름으로 바로 접근한다.
		

	}

}
