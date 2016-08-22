package ch05.exam02;

public class AdvancedFor {

	public static void main(String[] args) {
		int[] scores = {90, 92, 95};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++){  //기본형태*
			sum+= scores[i]; //sum = sum + scores[i] 
		}
		System.out.println(sum);
		
		
		sum = 0;
		for(int score : scores){ // for(int score : 배열)  //변형 형태*
			sum += score;
		}
		System.out.println(sum);
		
		String[] names = {"자바","C언어","파이썬"};
		
		for(int i=0; i<names.length; i++){ //기본형태**
			System.out.println(names[i]);
		}
		
		for(String name : names){ //변형 형태**
			System.out.println(name);
		}

	}

}
