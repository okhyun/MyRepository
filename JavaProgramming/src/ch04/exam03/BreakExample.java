package ch04.exam03;

public class BreakExample {

	public static void main(String[] args) {//���������� 
		//�ֻ����� ���� 6�� ������ ���α׷��� �����ϼ���.
		while(true){
			
			/*double num = Math.random();
			num = num*6;
			int value = (int) num;
			value +=1;*/
			
			int value = (int)(Math.random()*6)+1;
			System.out.println(value);
			
			if(value==6){
				break;
			}
		}
		System.out.println("����");

	}

}
