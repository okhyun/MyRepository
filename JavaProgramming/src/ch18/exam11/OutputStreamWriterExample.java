package ch18.exam11;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		
		String data = "��";
		
		/*���� ��Ʈ���� ���� ���� ����
		 * byte[] values = data.getBytes();
		for(int i = 0; i<values.length; i++) {
			os.write(values[i]);
		}
		os.flush();*/
		
		//���� ��Ʈ���� �� ����
		Writer write = new OutputStreamWriter(os);
		write.write(data);
		write.flush();
		
	}

}
