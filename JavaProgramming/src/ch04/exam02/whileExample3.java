package ch04.exam02;

public class whileExample3 {

	public static void main(String[] args) throws Exception{ //Unhandled exception ���� ���ýÿ�
		while(true){
			int num = System.in.read(); //System.in.read(); �޼ҵ� ȣ��
			/*if(num !=13){
				if(num !=10)
				System.out.println(num);
			}*/
			if(num !=13 && num !=10){
				System.out.println(num);
			}

		}

	}
}