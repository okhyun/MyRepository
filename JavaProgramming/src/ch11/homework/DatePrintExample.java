package ch11.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

//11장 확인문제13번
public class DatePrintExample {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");//특정 문자열을 얻고 싶을때 SimpleDateFormat 클래스를 이용한다.
		System.out.println(sdf.format(now));

	}

}
