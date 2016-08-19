package ch05.exam02;

public class ArrayCreateByNew {

	public static void main(String[] args) {
		int[] arr1 = new int[5]; //int 타입으로 배열을 만들면 기본값 0이 들어간다.
		for(int i=0; i<arr1.length; i++){ 
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}
		System.out.println();
		
		double[] arr2 = new double[5]; //double 타입으로 배열을 만들면 기본값 0이 들어간다.
		for(int i=0; i<arr2.length; i++){ 
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
		System.out.println();		
		
		boolean[] arr3 = new boolean[5]; //boolean 타입으로 배열을 만들면 기본값 0이 들어간다.
		for(int i=0; i<arr3.length; i++){ 
			System.out.println("arr3[" + i + "] = " + arr3[i]);
		}
		System.out.println();
		
			String[] arr4 = new String[5]; //String(참조) 타입으로 배열을 만들면 기본값 0이 들어간다.
			for(int i=0; i<arr4.length; i++){ 
				System.out.println("arr4[" + i + "] = " + arr4[i]);
			}
	}

}
