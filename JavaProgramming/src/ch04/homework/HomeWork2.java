package ch04.homework;

public class HomeWork2 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++){ 
			// i�� 1���� 10���� 1�������ϸ鼭 �ݺ� (�ݺ���)
			for(int j=1; j<=10; j++){
				// j�� 1���� 10���� 1�������ϸ鼭 �ݺ� (�ݺ���)
				if(4*i+5*j==60){ 
					/* 4*i+5*j==60 ���� ���϶� ����Ѵ�. 
					�ݴ�� �����̸� ������� �ʴ´�.(���ǹ�)*/ 
					System.out.println("4X+5Y=60 �϶�" + " ( " + " X : " +  i  + ","+ " Y : " +  j  +" )");
					//(��¹�)
					System.out.println();
					
				}
				
			}
		}

	}

}
