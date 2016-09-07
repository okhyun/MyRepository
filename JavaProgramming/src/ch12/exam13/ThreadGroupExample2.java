package ch12.exam13;

public class ThreadGroupExample2 {

	public static void main(String[] args) {
		Thread thread;
		
		thread = new Thread("t1") { //�θ�����ڸ� ȣ���ϴ°��̴�.
			@Override
			public void run() {
				while(true) {
					System.out.println(getName()+ " : ������...");
					if(isInterrupted()) break;
				}
				System.out.println(getName() + " : ����");
			}
		};
		thread.start();
		
		
		thread = new Thread("t2") { //�θ�����ڸ� ȣ���ϴ°��̴�.
			@Override
			public void run() {
				while(true) {
					System.out.println(getName()+ " : ������...");
					if(isInterrupted()) break;
				}
				System.out.println(getName() + " : ����");
			}
		};
		
		thread.start();
		
		ThreadGroup sub = new ThreadGroup("sub"); //main �׷� �ؿ� �����.
		
		//sub�� ����  thread
		thread = new Thread(sub, "t3") { //�θ�����ڸ� ȣ���ϴ°��̴�.
			@Override
			public void run() {
				while(true) {
					System.out.println(getName()+ " : ������...");
					if(isInterrupted()) break;
				}
				System.out.println(getName() + " : ����");
			}
		};
		
		thread.start();
		
		//sub�� ����  thread
		thread = new Thread(sub, "t4") { //�θ�����ڸ� ȣ���ϴ°��̴�.
			@Override
			public void run() {
				while(true) {
					System.out.println(getName()+ " : ������...");
					if(isInterrupted()) break;
				}
				System.out.println(getName() + " : ����");
			}
		};
		
		thread.start();
		
		try {	Thread.sleep(3000);	} catch (InterruptedException e) {	}
		
		//sub.interrupt();
		Thread.currentThread().getThreadGroup().interrupt();
	}

}
