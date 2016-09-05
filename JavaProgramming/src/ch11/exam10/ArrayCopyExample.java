package ch11.exam10;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		
		//배열 복사 방법1
		char[] arr2 = new char[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr2));
		
		
		
		//배열 복사 방법2
		char[] arr3 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length); //(원본배열, 원본시작점, 타켁배열, 타겟시작점, 복사개수)
		System.out.println(Arrays.toString(arr3));
		
		
		
		//배열 복사 방법3
		char[] arr4 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr4));

	}

}
