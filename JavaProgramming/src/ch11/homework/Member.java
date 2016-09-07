package ch11.homework;

//11장 확인문제4번
public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() { //오버라이딩(재정의)한 후 리턴값으로 
		return id + " : " + name; //결과값이--> blue : 이파란<-- 이것이기 때문에 리턴한값의 형태는  id + " : " + name; 이다.
	}

}
