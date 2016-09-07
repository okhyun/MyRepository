package ch12.exam08;

public class WorkObject {
	public synchronized void methodA() { //�����߿� Thread�� �ǵ������.
		System.out.println("ThreadA�� methodA() �۾� ����");
		notify();
		try { wait(); } catch (InterruptedException e) { }
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB() �۾�����");
		notify();
		try { wait(); } catch (InterruptedException e) { }
	}

}
