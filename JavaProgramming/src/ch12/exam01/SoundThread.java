package ch12.exam01;

import java.awt.Toolkit;

public class SoundThread extends Thread {
	//�ʵ�
	
	
	
	//������
	public SoundThread() {
		setName("SoundThread");
	}
	
	//�޼ҵ�
	
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i =0; i<5; i++){
			toolkit.beep();
			System.out.println("�Ҹ� : " + Thread.currentThread().getName());
			try {	Thread.sleep(500);	} catch (Exception e) {	} //�����带 �����(0.5��) //�����̽�Ű�°�
		}
	}


}
