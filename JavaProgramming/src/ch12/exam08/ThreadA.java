package ch12.exam08;

public class ThreadA extends Thread{
	private WorkObject workObject; //주입  setter 주입, Constructor 주입
	
	
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10; i++){
			workObject.methodA();
		}
		
	}
	
	
}


