package ch11.exam10;

import java.io.UnsupportedEncodingException;

public class ByteToStringExample {// 496page // 11.7 String Ŭ����
	public static void main(String[] atrgs) throws UnsupportedEncodingException {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97}; //byte�� �� �迭 �� �����. //�Ű������� �Է��� ���ڸ� ���ڷ� �ٲپ��ش�. 
		//ASCII(�ƽ�Ű�ڵ�) ��ȣ(0~155) ���� ���ĺ�(��,�ҹ���) Ư�����ڷ� ����
		
		String str1 = new String(bytes); //byte�� �Ű������� �޴� ������ 
		System.out.println(str1);
		
		
		String str2 = new String(bytes, 6, 4);//String �����ڿ� �Ű����� 3���� ����.//�����ڿ� ����ִ� �Ű�������  6�� index(�迭�� ��ġ)��ġ�̰�, 4�� �����̴�.
		System.out.println(str2);// -->��������� 6��° �迭��ġ���� 4������ �д´�.
		
		
		//___________________________________________________________________________________________
		
		// JAVA�� 2byte UNICODE�� ����Ѵ�.
		
		String str3 = "ȫ�浿"; //�ѱ��� �ƽ�Ű�ڵ�� ��ȯ�� �Ұ����ϴ�.
		byte[] strBytes3 = str3.getBytes(); 
		String str4 = new String(strBytes3);
		System.out.println(str4);
		
		
		
		String str5 = "ȫ�浿";
		byte[] strBytes5 = str5.getBytes("EUC-KR"); // UTF-8��  3byte�̴�. �ٵ�  java�� �����ڵ�� �⺻ 2byte�̴�.(Encoding�۾�)
		String str6 = new String(strBytes5, "EUC-KR");//  �׷��� ��ȯ �۾��� ������Ѵ�.(Decoding�۾�) // ���ڼ��� �־��ָ� ���� �������ʴ´�.
		System.out.println(str6);
		String str7 = new String(strBytes5, 2, 2, "EUC-KR"); //�Ű����� 6�� �о� ���̴� byte���̴�.
		System.out.println(str7);
		
		
		
		//Encoding ���ڼ°� Decoding ���ڼ��� ���ƾ��Ѵ�.
		/*String str5 = "abȫ�浿"; //�� 8byte�̴�.
		byte[] strBytes5 = str5.getBytes("EUC-KR"); // EUC-KR�� �ѱ�+�ƽ�Ű�ڵ� //EUC-KR���� �ѱ��� 2byte�̴�.
		String str6 = new String(strBytes5, "EUC-KR"); //UTF-8�� �ƽ�Ű�ڵ�+�����ڵ�(�� ���󺰷� Byte���� �ٸ���)
		System.out.println(str6);*/
	}

}
