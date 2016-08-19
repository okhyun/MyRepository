package ch05.exam02;

public class ArrayCreateByValueList2 {

	public static void main(String[] args) {
		int[] scores = {83,90,87};
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		//System.out.println(scores[3]); 오류발생.
		
		int arrayLength = scores.length; //배열의 갯수를 알수 있다.
		System.out.println("배열의 길이 : " + arrayLength);
		
		for(int i=0; i<scores.length; i++){//배열의 길이를 알수 없을때 .length를해서 대입해준다.
			System.out.println(scores[i]);
		}
		
		int sum = 0;
		for(int i=0; i<scores.length; i++){
			sum +=scores[i];
		}
		System.out.println("전체 합 : " + sum);
		double avg = (double)sum / scores.length;
		//double avg = (double) sum / scores.length; 정수를 실수로 받을때
		System.out.println("전체 평균 : " + avg);
	}

}
