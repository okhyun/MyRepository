package ch11.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

//11�� Ȯ�ι���13��
public class DatePrintExample {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm�� ss��");//Ư�� ���ڿ��� ��� ������ SimpleDateFormat Ŭ������ �̿��Ѵ�.
		System.out.println(sdf.format(now));

	}

}