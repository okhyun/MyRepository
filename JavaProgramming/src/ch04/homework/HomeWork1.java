package ch04.homework;

public class HomeWork1 {

	public static void main(String[] args) {
		
		for (int i = 1 ; i <= 100 ; i++ ){ //�ֻ��� 100�� ���� (�ݺ���)
			int num1 = (int) (Math.random() * 6) + 1 ; 
			// 1���� 6������ ������ ���� �ֻ��� A
			int num2 = (int) (Math.random() * 6) + 1 ;
			// 1���� 6������ ������ ���� �ֻ��� B
						 
			if ( num1 + num2 == 10 ) { 
				/*num1 �� num2 �� ���� 10�� ������ ���̹Ƿ� ����Ѵ�. 
				�ݴ�� ���������� �����̹Ƿ� ������� �ʴ´�.(���ǹ�)*/
				System.out.println("( �ֻ��� A�� " + num1 + ", �ֻ��� B�� " + num2 + " )");
				System.out.println();
			}
		}

	}

}
