package ch12.exam14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteServiceExample { //�������α׷� ���鶧

	public static void main(String[] args) {
		//ThreadPool ����
		ExecutorService executorService = Executors.newFixedThreadPool(5); //�����带 5������ ���ڴ�;
		
		
		//�۾�����
		Runnable task = new Runnable() { //�۾�����
			@Override
			public void run() { //������
				for(int i=0; i<10; i++) {
					System.out.println("���� �� ... " + Thread.currentThread().getName()); //�۾�
				}
				
			}
		};
		
		
		//�۾� ť�� �۾� �ֱ�
		executorService.submit(task);
		
		
		//������Ǯ ����
		executorService.shutdown();

	}

}
