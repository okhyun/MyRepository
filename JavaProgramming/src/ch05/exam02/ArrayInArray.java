package ch05.exam02;

public class ArrayInArray {

	public static void main(String[] args) {
		int[][]scores = new int[2][3]; //�迭�ȿ� �迭���ִ� ���·� �ν��ؾ��Ѵ�.
		
		System.out.println("�迭�� ����");
		
		System.out.println("scores.length = "+scores.length);
		System.out.println("scores[0].length = "+scores[0].length);
		System.out.println("scores[1].length = "+scores[1].length);
		
		System.out.println("�׸� ����"); // ����Ÿ���� ����Ʈ������ 0�� ���ִ�.
		
		System.out.println("scores[0][0] ="+scores[0][0]);
		System.out.println("scores[0][1] ="+scores[0][1]);
		System.out.println("scores[0][2] ="+scores[0][2]);
		
		System.out.println("scores[1][0] ="+scores[1][0]);
		System.out.println("scores[1][1] ="+scores[1][1]);
		System.out.println("scores[1][2] ="+scores[1][2]);
		
		System.out.println("for�� �̿�");
		
		for(int i1 = 0; i1 <scores.length; i1++){
			for(int i2 = 0; i2<scores[i1].length; i2++){
				System.out.println("scores[i1][i2] = "+scores[i1][i2]);
			}
		}
		
		System.out.println("�� ����");
		
		scores[0][1] = 50;
		System.out.println("scores[0][1] =" + scores[0][1]);

	}

}