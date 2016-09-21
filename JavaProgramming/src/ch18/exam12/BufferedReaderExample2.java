package ch18.exam12;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample2 {

	public static void main(String[] args) throws IOException {
				
		FileReader fr2 = new FileReader("src/ch18/exam12/NAVER.html");
		BufferedReader br = new BufferedReader(fr2);
		
		int count = 0;
		while(true) {
			String line = br.readLine(); //�������� �дٰ� �������� �������� null���� ����Ѵ�.
			if(line == null) break;
			System.out.println((++count) + ":" + line);
		}
	}

}
