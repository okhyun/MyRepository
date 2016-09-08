package ch12.exam14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteServiceExample3 {

	public static void main(String[] args) {
		//ThreadPool ����
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		
		//�۾�����
		for(int i=0; i<=10; i++){  //for���� ������ 5���� thread�� ����ؼ� ó��
			int count = i; //������� thread ����
		Runnable task = new Runnable() {
			@Override
			public void run() {
				ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
				System.out.println("�������� �� �� : " + threadPoolExecutor.getPoolSize());
				System.out.println("���� �� ... (" + count + ")" + Thread.currentThread().getName());
				int value = Integer.parseInt("aa"); //NumberFormatException;
				
				
			}
		};
		
		
		//�۾� ť�� �۾� �ֱ�
		executorService.submit(task); //submit() --�������̸� ���
		//executorService.execute(task); //execute()
		}
		
		//������Ǯ ����
		executorService.shutdown();

	}

}
