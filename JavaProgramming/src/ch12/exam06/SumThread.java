package ch12.exam06;

public class SumThread extends Thread{
	
	private long sum;
		
	
	
	public long getSum() {
		return sum;
	}

	
	
	public void setSum(long sum) {
		this.sum = sum;
	}

	
	
	@Override
	public void run() { // Thread로 만들려면 run을 재정의를 해줘야한다.
		for(int i=1; i<=100; i++){
			sum += i;
		}
	}

}
