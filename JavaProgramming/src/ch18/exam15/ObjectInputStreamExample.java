package ch18.exam15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("src/ch18/exam15/data,obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Member member2 = (Member) ois.readObject();
		fis.close();
		ois.close();
		
		System.out.println(member2.getMid());
		System.out.println(member2.getMname());
		System.out.println(member2.getMpassword());
		System.out.println(member2.getMage());
		System.out.println(Member.getNation()); //복원된 데이터가 아닌 그냥 단순 출력만 한 상태
	}

}
