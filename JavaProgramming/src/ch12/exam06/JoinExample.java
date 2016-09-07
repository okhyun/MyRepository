package ch12.exam06;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start(); // 대기상태
		
		try {sumThread.join();} catch (InterruptedException e) {	}
		System.out.println("1~100 합 : " + sumThread.getSum()); //값을 얻기 위해 getSum을 사용 //main Thread

	}

}
