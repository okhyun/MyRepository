package ch12.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) throws InterruptedException {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i =0; i<5; i++){
			toolkit.beep();
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(500); //스레드를 재워라(0.5초) //딜레이시키는것
		}
		
		for(int i =0; i<5; i++){
			System.out.println("띵");
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(500); //스레드를 재워라(0.5초)
		}
		

	}

}
