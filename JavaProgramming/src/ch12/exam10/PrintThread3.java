package ch12.exam10;

public class PrintThread3 extends Thread {
	
	
	@Override
	public void run() {
			while(true) {
			System.out.println("������.......");
			//if(isInterrupted()) {
			if(Thread.interrupted()){
				break;
			}
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}

}
