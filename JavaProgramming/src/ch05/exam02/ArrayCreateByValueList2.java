package ch05.exam02;

public class ArrayCreateByValueList2 {

	public static void main(String[] args) {
		int[] scores = {83,90,87};
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		//System.out.println(scores[3]); �����߻�.
		
		int arrayLength = scores.length; //�迭�� ������ �˼� �ִ�.
		System.out.println("�迭�� ���� : " + arrayLength);
		
		for(int i=0; i<scores.length; i++){//�迭�� ���̸� �˼� ������ .length���ؼ� �������ش�.
			System.out.println(scores[i]);
		}
		
		int sum = 0;
		for(int i=0; i<scores.length; i++){
			sum +=scores[i];
		}
		System.out.println("��ü �� : " + sum);
		double avg = (double)sum / scores.length;
		//double avg = (double) sum / scores.length; ������ �Ǽ��� ������
		System.out.println("��ü ��� : " + avg);
	}

}
