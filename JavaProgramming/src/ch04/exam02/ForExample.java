package ch04.exam02;

public class ForExample {

	public static void main(String[] args) {
		 // i = i+2 같은 의미   i+=2  i에 2씩증가
		 // % 나눈 나머지의값
		//sum = sum + i; 같은 의미  sum +=i
		int sum=0;
		double avg=0;
		for( int i=0; i<3; i++){
			int num = (int)(Math.random()*6) + 1;
			sum += num;
			avg = sum/3.0; //나누는 수를 실수로 나눠야 소수점까지 나온다.
			System.out.println(num);
		}
		System.out.println(sum);
		System.out.println(avg);
		
				
	}

}
