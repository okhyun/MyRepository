package ch05.exam02;

public class ArrayCreateByValueList1 {

	public static void main(String[] args) {
		//how1
		int[] scores1 = {83,90,87};//배열에선 타입선언을 변수를 만들때 선언해야한다.
		
		//how2
		int[] scores2;
		scores2 = new int[] {83,90,87};//배열변수 선언후  값을 입력할때
		
		sum(new int[] {83,90,87});

	}
	
	public static void sum(int[]arr){
		
	}

}
