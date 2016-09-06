package ch12.exam01;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args)  {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		Thread thread	= new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i =0; i<5; i++){
					toolkit.beep();
					System.out.println("�Ҹ� : " + Thread.currentThread().getName());
					try {	Thread.sleep(500);	} catch (Exception e) {	} //�����带 �����(0.5��) //�����̽�Ű�°�
				}
			}
		});	
		
		thread.start();
		
		for(int i =0; i<5; i++){
			System.out.println("��");
			System.out.println("��� : " + Thread.currentThread().getName());
			try {Thread.sleep(500);
			} catch (Exception e) {
			} //�����带 �����(0.5��)
		}
		

	}

}
