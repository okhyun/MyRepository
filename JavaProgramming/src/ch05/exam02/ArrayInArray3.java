package ch05.exam02;

public class ArrayInArray3 {

	public static void main(String[] args) {
		int [][] scores = { {2, 3, 4 }, {5, 6, 7 } };//배열에 값을 넣어줬을때
		
		
	System.out.println("scores.length = "+scores.length);
	System.out.println("scores[0].length = "+scores[0].length);
	System.out.println("scores[1].length = "+scores[1].length);
	
	for(int i1 = 0; i1 <scores.length; i1++){
		for(int i2 = 0; i2<scores[i1].length; i2++){
			System.out.println(scores[i1][i2]);
		}
	}
	
	}

}
