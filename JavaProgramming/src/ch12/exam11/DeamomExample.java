package ch12.exam11;

public class DeamomExample {

	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		ast.setDaemon(true);//main Thread가 죽으면 같이 죽게 만든다.
		ast.start();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) { }
		
		System.out.println("메인 스레드 종료");

	}

}
