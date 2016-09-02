package ch11.exam04;

public class ExitExample {//서버

	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {//exit메소드가 호출되었는지 체크하겠다. 문장이 정상처리되면 종료가 된다.
				if(status !=5) {
				System.out.println("엥?");
				throw new SecurityException(); //예외처리 해야한다.
				}
			}
		});
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try{
				System.exit(i); //출력이 안된다. --프로그램을 종료해라. i는 종료상태번호
				//break; //출력이 된다. --for문을 나가라
				//return; //출력이 안된다. --메소드를 중지해라
			} catch(SecurityException e) { }
		}

	}
}