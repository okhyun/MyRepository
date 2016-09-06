package ch0.Test;

public class MemberService {
	
	//메소드
	//6장 예제 15번
	//리턴타입 이름 
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")){ //&& 그리고 and이다.   
		return true;
	} else {
		return false;
		}
	}
	
	void logout(String id){
		System.out.println("로그아웃 되었습니다.");
	}

}
