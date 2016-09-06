package ch10.homeWork;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white", "12345");      //try블록에는 예외 발생가능한 코드를 입력해서 예외가 발생하는지 안하는지의 여부를 판단한다. 
		} catch (Exception e) {
			System.out.println(e.getMessage());   //catch블록에선 try블록에서 코드가 정상실행되지 않는 코드라 인식되면 catch블록으로 넘어와 예외처리 코드를 실행한다.
		}
		
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
				
		if(!id.equals("blue")){
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		//예외를 발생시킨다.
		
		if(!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}

}
