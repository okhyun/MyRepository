package ch12.exam08;

public class WorkObject {
	public synchronized void methodA() { //실행중에 Thread를 건들수없다.
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify();
		try { wait(); } catch (InterruptedException e) { }
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업실행");
		notify();
		try { wait(); } catch (InterruptedException e) { }
	}

}
