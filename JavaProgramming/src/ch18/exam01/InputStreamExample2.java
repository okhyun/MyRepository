package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamExample2 {

	public static void main(String[] args) throws IOException {
		String filePath = InputStreamExample2.class.getResource("data.txt").getPath();
		
		
		
		//////////////////////1번째 방법///////////////////////////////////
		int count = 0;
		InputStream is = new FileInputStream(filePath);
		byte[] values = new byte[3]; //읽은 데이터
		while(true){
			int byteNum = is.read(values);
			if(byteNum == -1) break;
			System.out.println(byteNum + ":" + Arrays.toString(values));
			count++;
		}
		System.out.println("읽은 회수" + count);
		is.close();
		
		System.out.println();
		count =0;
		
		//////////////////////2번째 방법///////////////////////////////////
		is = new FileInputStream(filePath);
		values = new byte[3]; //읽은 데이터
		int byteNum = -1;
		while((byteNum = is.read(values)) != -1) {
			System.out.println(byteNum + ":" + Arrays.toString(values));
			count++;
		}
		System.out.println("읽은 회수" + count);
		is.close();
		

	}

}
