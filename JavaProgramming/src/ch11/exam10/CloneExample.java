package ch11.exam10;

import java.util.Arrays;

public class CloneExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		int[] arr1 = {1, 2, 3};
		
		int[] arr2 = arr1.clone(); // �迭 ����
		System.out.println(arr1 == arr2); // �迭 ��ü�� �ٸ���.
		System.out.println(Arrays.equals(arr1, arr2)); //�׸��� ����.
		
		Member m1 = new Member("hong", "�浿");
		System.out.println(m1);
		Member m2 = (Member) m1.clone();
		System.out.println(m1 == m2);
		System.out.println(m2);

	}

}

class Member implements Cloneable { //�� ���Ͽ� �ΰ��� Ŭ������ ���� �� �ִ�. //�����̸��� �ٸ�Ŭ������ public�� ���� �� ����.
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
