package ch12.exam02;

public class ThreadC extends Thread {
	public ThreadC(int num) {
		setName("ThreadC-" + num);
	}
	
	@Override
	public void run() {
		for(int i = 1; i<=21000000; i++){
			String str = "a";
			str += "b";
			str += "c";
			
		}
		System.out.println(getName() + "Á¾·á");
	}

}
