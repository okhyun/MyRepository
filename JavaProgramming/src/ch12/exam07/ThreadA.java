package ch12.exam07;

public class ThreadA extends Thread {
	public boolean stop = false;
	public Work work = Work.CONTINUE;
	
	
	@Override
	public void run() {
		while(!stop) { //while문의 stop이  true일때
			if(work == Work.CONTINUE){
				System.out.println("ThreadA 작업 내용");
			} else if(work == Work.PAUSE){
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료");
	}

}
