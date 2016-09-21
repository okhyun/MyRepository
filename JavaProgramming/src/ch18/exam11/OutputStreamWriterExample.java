package ch18.exam11;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		
		String data = "가";
		
		/*보조 스트림을 쓰지 않은 상태
		 * byte[] values = data.getBytes();
		for(int i = 0; i<values.length; i++) {
			os.write(values[i]);
		}
		os.flush();*/
		
		//보조 스트림을 쓴 상태
		Writer write = new OutputStreamWriter(os);
		write.write(data);
		write.flush();
		
	}

}
