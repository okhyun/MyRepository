package ch04.exam02;

public class whileExample4 {

	public static void main(String[] args) throws Exception{ //Unhandled exception ���� ���ýÿ�
		System.out.println("���α׷� ����");
		int num=0;
		while(num !=113){ // q�� ���� ���ڷ� �ٲٸ� 113
			 num = System.in.read();
			
			if(num !=13 && num !=10){
				System.out.println(num);
			}

		}
		System.out.println("���α׷� ����");

	}
}