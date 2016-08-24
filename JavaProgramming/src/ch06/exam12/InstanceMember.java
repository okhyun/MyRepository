package ch06.exam12;

public class InstanceMember {
	//Instance Field
	String field;
	
	//Constructor
	//Instance Field는 생성자안에서 초기화 한다.
	InstanceMember(){
		System.out.println("InstanceMember() 실행");
		field = "자바";
	}
	
	//Instance Method
	void method(){
		
	}

}
