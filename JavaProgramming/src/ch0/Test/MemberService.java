package ch0.Test;

public class MemberService {
	
	//�޼ҵ�
	//6�� ���� 15��
	//����Ÿ�� �̸� 
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")){ //&& �׸��� and�̴�.   
		return true;
	} else {
		return false;
		}
	}
	
	void logout(String id){
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}

}
