package ch11.exam10;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.println("입력 : ");
		int readByteNo = System.in.read(bytes);//매개값을 주지않으면 1byte만 읽는다. //엔터는 2byte이다.
		
		
		//String str = new String( bytes ); //엔터가 들어간다. 하지만 엔터의값은 빼줘야 하기에
		String str = new String(bytes, 0, readByteNo-2); //엔터를 빼주는 매개값을 넣어주었다.
		System.out.println(str);
	}

}
