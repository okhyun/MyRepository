package ch12.exam14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteServiceExample { //서버프로그램 만들때

	public static void main(String[] args) {
		//ThreadPool 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5); //스레드를 5개까지 쓰겠다;
		
		
		//작업생성
		Runnable task = new Runnable() { //작업생성
			@Override
			public void run() { //재정의
				for(int i=0; i<10; i++) {
					System.out.println("실행 중 ... " + Thread.currentThread().getName()); //작업
				}
				
			}
		};
		
		
		//작업 큐에 작업 넣기
		executorService.submit(task);
		
		
		//스레드풀 종류
		executorService.shutdown();

	}

}
