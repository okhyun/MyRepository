package ch18.exam07;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class SystemInExample {

	public static void main(String[] args) throws IOException {
		//한개의 키만 읽기
		InputStream is = System.in;
		
		/*System.out.println("키 하나만 입력 : ");
		int keyCode =is.read(); //in의 타입은 InputStream
		System.out.println(keyCode + ":" + (char)keyCode);*/
		
		//한글과 같은 여러키의 조합을 읽기
		System.out.println("여러 키를 입력 : ");
		byte[] values = new byte[100]; //읽을때 최대 100byte를 읽는다. 
		int byteNum = is.read(values);//엔터키 값 13,10 (2개) 까지 읽는다.
		String data = new String(values, 0, byteNum-2); // -2를 해주는 이유는 엔터값 13,10을 빼주는 과정이다.
		System.out.println(data);
		
	}

}
