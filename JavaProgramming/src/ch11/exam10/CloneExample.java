package ch11.exam10;

import java.util.Arrays;

public class CloneExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		int[] arr1 = {1, 2, 3};
		
		int[] arr2 = arr1.clone(); // 배열 복제
		System.out.println(arr1 == arr2); // 배열 자체는 다르다.
		System.out.println(Arrays.equals(arr1, arr2)); //항목이 같다.
		
		Member m1 = new Member("hong", "길동");
		System.out.println(m1);
		Member m2 = (Member) m1.clone();
		System.out.println(m1 == m2);
		System.out.println(m2);

	}

}

class Member implements Cloneable { //한 파일에 두개의 클래스를 만들 수 있다. //파일이름과 다른클래스는 public을 붙일 수 없다.
	String mid;
	String mname;
	Member(String mid, String mname) {
		this.mid = mid;
		this.mname = mname;
	}
	
	@Override
	public String toString() {
		return mid + ":" + mname;
	}
	
	
	@Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
}
