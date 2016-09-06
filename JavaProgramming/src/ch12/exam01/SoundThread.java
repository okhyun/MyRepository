package ch12.exam01;

import java.awt.Toolkit;

public class SoundThread extends Thread {
	//필드
	
	
	
	//생성자
	public SoundThread() {
		setName("SoundThread");
	}
	
	//메소드
	
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i =0; i<5; i++){
			toolkit.beep();
			System.out.println("소리 : " + Thread.currentThread().getName());
			try {	Thread.sleep(500);	} catch (Exception e) {	} //스레드를 재워라(0.5초) //딜레이시키는것
		}
	}


}
