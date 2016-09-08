package ch12.exam14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteServiceExample3 {

	public static void main(String[] args) {
		//ThreadPool 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		
		//작업생성
		for(int i=0; i<=10; i++){  //for문을 돌려서 5가지 thread를 사용해서 처리
			int count = i; //사용중인 thread 갯수
		Runnable task = new Runnable() {
			@Override
			public void run() {
				ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
				System.out.println("스레드의 총 수 : " + threadPoolExecutor.getPoolSize());
				System.out.println("실행 중 ... (" + count + ")" + Thread.currentThread().getName());
				int value = Integer.parseInt("aa"); //NumberFormatException;
				
				
			}
		};
		
		
		//작업 큐에 작업 넣기
		executorService.submit(task); //submit() --가급적이면 사용
		//executorService.execute(task); //execute()
		}
		
		//스레드풀 종류
		executorService.shutdown();

	}

}
