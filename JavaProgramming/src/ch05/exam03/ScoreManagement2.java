package ch05.exam03;

import java.util.Scanner;

public class ScoreManagement2 { //������ 1��

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);// ��Ʈ�� + ����Ʈ + o�� �Է��ؼ� import�Ѵ�.
		String[][] students = new String[100][];//StringŸ�� �迭�� ����
		String num =null;
		String title = null;
		String name = null;
		String typing = null;
		int count = 0; 
		
		
		while(true){//while �ݺ����� ������ ���϶� �׹�ȣ�� ���� ���ǹ� ����.
			System.out.println("--------------------------------------------------------------------"); //�޴��� ����Ѵ�.
			System.out.println(" 1.��� | 2.�۾��� | 3.�󼼺��� | 4.���� | 5.���� | 6.���� ");			
			System.out.println("--------------------------------------------------------------------");
			System.out.print("���� : ");
			
			String choice = scanner.nextLine();//String Ÿ�� choice ������ scanner�� ���ڿ�Ÿ���� �ְڴ�.(scanner�� ���ڿ� Ÿ������ �ްڴ�.)
			if( choice.equals("1") ){ //1.���//���ǹ����� ���Ҷ� .equals�� �� ������ ��������(��ü)�� ���ؾ��ϱ⶧���̴�.(���ڿ� ��)
				System.out.println("********************************************************************");
				System.out.println("��ȣ : \t\t���� : \t\t�۾��� : \t��ȸ�� : ");//\t�� �Ѹ�ŭ ����.
				System.out.println("********************************************************************");
				for(String[] student : students){ //students �׸�ŭ for���� ������.
					if(student !=null){//�迭 student�� null�� �ƴҶ� student�迭�� 0��°���� 3��°���� ����Ѵ�.//student��� �迭�� ���� ������ �Ǿ����� ���� ����.
							System.out.println(student[0] + "\t\t" + student[1]+ "\t\t" + student[2] + "\t\t" + student[4]); 
							//����Ҷ� students��� �迭�ȿ� ������ ����Ǿ��ִ� student�迭�� ���� ����Ѵ�.
					}
				}
				
			} else if( choice.equals("2") ){ //2.�۾���(�Է�)
				System.out.println("���� : ");
				title = scanner.nextLine();//StringŸ��(���ڿ�)�� ���� Ű����� �Է¹޴´�.
				System.out.println("�۾��� : ");
				name = scanner.nextLine();//StringŸ��(���ڿ�)�� ���� Ű����� �Է¹޴´�.
				System.out.println("���� : ");
				typing = scanner.nextLine();//StringŸ��(���ڿ�)�� ���� Ű����� �Է¹޴´�.
				for(int i=0; i<students.length; i++){ //���� i�� �����ϰ� i��  0~99  [100]���� 1�� ���� ��Ű�鼭 ������.
					if(students[i] == null){ //�迭 students�� ���� null�� ������ student���� �־��ش�.
						num = String.valueOf(i);
						String[] student = { num, title, name, typing, String.valueOf(count)};// String Ÿ�� �迭 student�� ������ �Է¹��� title name typing�� �־��ش�.
						students[i] = student;
						break;
					}
				}
				
				
			} else if( choice.equals("3") ){ //3.�󼼺���
				for(String[] student : students){ //students �׸�ŭ for���� ������.
					if(student !=null){
						System.out.println("***********************************************");
						System.out.println("��ȣ\t\t����\t\t��ȸ��");//\t�� 1ĭ��ŭ ����.
						System.out.println("***********************************************");
							System.out.println(student[0] + "\t\t" + student[1] + "\t\t" + student[4]);
					}
				}
					System.out.println("��ȣ ���� : ");
					int numchoice = scanner.nextInt();//Ű����� �Է¹޴´�.
					for(int i = 0; i<students.length; i++){
						if(students[i] != null){
							System.out.println(students[numchoice][3]);
													
							break;
					}
				}	
					count = Integer.parseInt(String.valueOf(count)); //count�� intŸ���̱⶧���� ��ȸ���� �ø������ؼ� �̹� �迭�� ���ִ� StringŸ�� ��ȸ���� intŸ������ �ٲ��ش�.
					count++;//ī��Ʈ �Ѵ�.
					students[numchoice][4] = String.valueOf(count); //int Ÿ������ �ٲ��־��� count�� �ٽ� StringŸ������ ��ȯ���� �Ŀ� students[numchoice][4]�ȿ� �ٽ� �־��ش�. 
					
				
			} else if( choice.equals("4") ){ //4.����
				System.out.println("������ ��ȣ : ");
				int modify = Integer.parseInt(scanner.nextLine()); //���� modify�� ���� intŸ���� ���� Ű���� �Է°��� �ִ´�.
				//students[modify] = null;// ������ �迭�� ���� null�������Ѵ�.
				System.out.println("������ ���� ");
				title = scanner.nextLine(); // Ű����� �Է¹޴´�.
				System.out.println("������ ���� ");
				typing = scanner.nextLine(); //Ű����� �Է¹޴´�.
								
				students[modify][1] = title;//������ ��ġ�� Ű����� �Է¹��� ���� �ִ´�.
				students[modify][3] = typing;//������ ��ġ�� Ű����� �Է¹��� ���� �ִ´�.
				
				
			} else if( choice.equals("5") ){ //5.����
				System.out.println("������ ��ȣ : ");
				int delnum = Integer.parseInt(scanner.nextLine()); 
				students[delnum] = null; //students �迭�� null���� �־��ش�.(StringŸ�� ���ڿ��� intŸ���� ������ ��ȯ�Ѵ�.) null���� students[100]�迭�� ���� ����.
				
			} else if( choice.equals("6") ){ //6.����
				break;
			  }
			
			
		}
	}

}
