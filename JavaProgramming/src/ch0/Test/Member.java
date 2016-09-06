package ch0.Test;

public class Member {
	
	//필드정의
	//13번문제
	String name;
	String id;
	String password;
	int age;
	
	//생성자
	//14번 문제
	//name, id 필드를 외부에서 받은 값으로 초기화하려면 생성자를 어떻게 선언 합니까?
	Member(String name, String id){
		this.name = name;
		this.id = id;
	}
}