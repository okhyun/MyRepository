package ch12.exam05;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	
	@Override
	public void run() {
		while(!stop) { //while���� stop��  true�϶�
			if(work){
				System.out.println("ThreadA �۾� ����");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA ����");
	}

}
