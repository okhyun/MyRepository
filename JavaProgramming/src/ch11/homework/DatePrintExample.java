package ch11.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

//확인문제13번
public class DatePrintExample {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
		System.out.println(sdf.format(now));

	}

}
