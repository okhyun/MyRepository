package ch04.exam02;

public class ForExample {

	public static void main(String[] args) {
		 // i = i+2 ���� �ǹ�   i+=2  i�� 2������
		 // % ���� �������ǰ�
		//sum = sum + i; ���� �ǹ�  sum +=i
		int sum=0;
		double avg=0;
		for( int i=0; i<3; i++){
			int num = (int)(Math.random()*6) + 1;
			sum += num;
			avg = sum/3.0; //������ ���� �Ǽ��� ������ �Ҽ������� ���´�.
			System.out.println(num);
		}
		System.out.println(sum);
		System.out.println(avg);
		
				
	}

}
