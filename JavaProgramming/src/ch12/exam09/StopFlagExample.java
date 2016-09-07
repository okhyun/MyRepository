package ch12.exam09;

public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 pt = new PrintThread1();
		pt.start();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {	} //딜레이
		
		pt.setStop(true);  //안전하게 종료
	}

}
