package ch07.homework;

import java.util.Scanner;

public class ScoreManagement2 { //������ 1��

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);// ��Ʈ�� + ����Ʈ + o�� �Է��ؼ� import�Ѵ�.
		Student2[] students = new Student2[100]; //new Student2[100];//StringŸ�� �迭�� ����
		int count = 0;
		 
		
		
		while(true){//while �ݺ����� ������ ���϶� �׹�ȣ�� ���� ���ǹ� ����.
			System.out.println("--------------------------------------------------------------------"); //�޴��� ����Ѵ�.
			System.out.println(" 1.��� | 2.�۾��� | 3.�󼼺��� | 4.���� | 5.���� | 6.���� ");			
			System.out.println("--------------------------------------------------------------------");
			System.out.print("���� : ");
			
			String choice = scanner.nextLine(); //String Ÿ�� choice ������ scanner�� ���ڿ�Ÿ���� �ְڴ�.(scanner�� ���ڿ� Ÿ������ �ްڴ�.)
			if( choice.equals("1") ){  //1.���//���ǹ����� ���Ҷ� .equals�� �� ������ ��������(��ü)�� ���ؾ��ϱ⶧���̴�.(���ڿ� ��)
				System.out.println("********************************************************************");
				System.out.println("��ȣ : \t\t���� : \t\t�۾��� : \t��ȸ�� : ");//\t�� �Ѹ�ŭ ����.
				System.out.println("********************************************************************");
				for(Student2 student : students){ //students �׸�ŭ for���� ������.
					if(student !=null){ //�迭 student�� null�� �ƴҶ� student�迭�� 0��°���� 3��°���� ����Ѵ�.//student��� �迭�� ���� ������ �Ǿ����� ���� ����.
							System.out.println(student.getNum() + "\t\t" + student.getTitle()+ "\t\t" + student.getName() + "\t\t" + student.getCount()); 
							
					}
				}
				
			} else if( choice.equals("2") ){ //2.�۾���(�Է�)
				System.out.println("���� : ");
				String title = scanner.nextLine();//StringŸ��(���ڿ�)�� ���� Ű����� �Է¹޴´�.
				System.out.println("�۾��� : ");
				String name = scanner.nextLine();//StringŸ��(���ڿ�)�� ���� Ű����� �Է¹޴´�.
				System.out.println("���� : ");
				String typing = scanner.nextLine();//StringŸ��(���ڿ�)�� ���� Ű����� �Է¹޴´�.
				for(int i=0; i<students.length; i++){ //���� i�� �����ϰ� i��  0~99  [100]���� 1�� ���� ��Ű�鼭 ������.
					if(students[i] == null){ //�迭 students�� ���� null�� ������ student���� �־��ش�.
						students[i] = new Student2(i, title, name, typing, count);// String Ÿ�� �迭 student�� ������ �Է¹��� title name typing�� �־��ش�.
						break;
					}
				}
				
				
			} else if( choice.equals("3") ){ //3.�󼼺���
				for(Student2 student : students){ //students �׸�ŭ for���� ������.
					if(student !=null){
						System.out.println("***********************************************");
						System.out.println("��ȣ\t\t����\t\t��ȸ��");//\t�� 1ĭ��ŭ ����.
						System.out.println("***********************************************");
							System.out.println(student.getNum() + "\t\t" + student.getTitle() + "\t\t" + student.getCount());
					}
				}
					System.out.println("��ȣ ���� : ");
					int numchoice = scanner.nextInt();//Ű����� �Է¹޴´�.
					for(int i = 0; i<students.length; i++){
						if(students[i] != null){
							System.out.println(students[numchoice]);
													
							break;
					}
				}	
					//count�� intŸ���̱⶧���� ��ȸ���� �ø������ؼ� �̹� �迭�� ���ִ� StringŸ�� ��ȸ���� intŸ������ �ٲ��ش�.
					count++;//ī��Ʈ �Ѵ�.
					students[numchoice].setCount(count);//students[numchoice][4] = String.valueOf(count); //int Ÿ������ �ٲ��־��� count�� �ٽ� StringŸ������ ��ȯ���� �Ŀ� students[numchoice][4]�ȿ� �ٽ� �־��ش�. 
					
				
			} else if( choice.equals("4") ){ //4.����
				System.out.println("������ ��ȣ : ");
				int modify = Integer.parseInt(scanner.nextLine()); //���� modify�� ���� intŸ���� ���� Ű���� �Է°��� �ִ´�.
				//students[modify] = null;// ������ �迭�� ���� null�������Ѵ�.
				System.out.println("������ ���� ");
				String title = scanner.nextLine(); // Ű����� �Է¹޴´�.
				System.out.println("������ ���� ");
				String typing = scanner.nextLine(); //Ű����� �Է¹޴´�.
								
				students[modify].setTitle(title);//������ ��ġ�� Ű����� �Է¹��� ���� �ִ´�.
				students[modify].setTyping(typing);//������ ��ġ�� Ű����� �Է¹��� ���� �ִ´�.
				
				
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
