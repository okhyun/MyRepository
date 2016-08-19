package ch05.exam02;

public class ArrayCreateByNew2 {

	public static void main(String[] args) {
		//기본타입 배열
		int[] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<arr1.length; i++){ 
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}
		
		//참조타입 배열
		String[]arr4 = new String[3];
		arr4[0] = "자바일";
		arr4[1] = "자바이";
		arr4[2] = "자바삼";
		for(int i=0; i<arr4.length; i++){ 
			System.out.println("arr4[" + i + "] = " + arr4[i]);
		}
	}

}
