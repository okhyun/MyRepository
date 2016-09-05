package ch11.exam10;

import java.util.StringTokenizer;

public class StringSplitStringTokenizer {
	public static void main(String[] args) {
		String data = "ȫ�浿,�̼�ȫ,�ڿ���,���ڹ�,�ָ�ȣ"; //Token�� ���ڿ� ȫ�浿, �̼�ȫ ���� �͵��� ��Ī�Ѵ�.(����)
		
		String[] dataArray = data.split(",");
		System.out.println(dataArray.length);
		for(String name : dataArray) {
			System.out.println(name);
		}
		
		StringTokenizer st = new StringTokenizer(data, ",");  //StringTokenizer�� ������ " , " �� ���ڿ��� �������� �־���Ѵ�.// StringTokenizer�� 1���� ������ �ټ��ִ�.
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			System.out.println(name);
			
		}
		
		
		data = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ"; //split�� �����ڸ� ������ ������ �ټ��ִ�.
		
		dataArray = data.split("&|,|-");
		System.out.println(dataArray.length);
		for(String name : dataArray) {
			System.out.println(name);
		}
	}
}
