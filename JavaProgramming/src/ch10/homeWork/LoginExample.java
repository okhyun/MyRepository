package ch10.homeWork;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white", "12345");      //try��Ͽ��� ���� �߻������� �ڵ带 �Է��ؼ� ���ܰ� �߻��ϴ��� ���ϴ����� ���θ� �Ǵ��Ѵ�. 
		} catch (Exception e) {
			System.out.println(e.getMessage());   //catch��Ͽ��� try��Ͽ��� �ڵ尡 ���������� �ʴ� �ڵ�� �νĵǸ� catch������� �Ѿ�� ����ó�� �ڵ带 �����Ѵ�.
		}
		
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
				
		if(!id.equals("blue")){
			throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");
		}
		//���ܸ� �߻���Ų��.
		
		if(!password.equals("12345")) {
			throw new WrongPasswordException("�н����尡 Ʋ���ϴ�.");
		}
	}

}
