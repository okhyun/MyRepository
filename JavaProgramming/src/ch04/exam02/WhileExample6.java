package ch04.exam02;

public class WhileExample6 {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int change=0;
		int Code=0;
		
		while(run){
			if(Code !=13 && Code !=10){
			System.out.println("----------------");
			System.out.println("1.����, 2.���, 3.����");
			System.out.println("----------------");
			}
			
			Code = System.in.read();
			if(Code == 49){
				change= change+1000;				
				System.out.println("�����ܾ� :" + change);
				
			}
			if(Code == 50){
				change= change-500;
				System.out.println("�����ܾ� :" + change);
				
			}
			if(Code == 51){
				System.out.println("���α׷� ����");
				run = false;
			}
			
		}

	}

}
