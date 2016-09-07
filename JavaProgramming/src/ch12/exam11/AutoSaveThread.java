package ch12.exam11;

public class AutoSaveThread extends Thread {
	
	public void save() {
		System.out.println("작업 내용을 저장함");
	}
	
	@Override
	public void run() {
		while(true) {
			try {Thread.sleep(1000);} catch (InterruptedException e) { } //1초단위로 저장을 게속하겠다. while문이 무한루프이다.
			save();
		}
	}

}
