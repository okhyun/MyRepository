package ch05.exam03;

import java.util.Scanner;

public class ScoreManagement2 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);// ��Ʈ�� + ����Ʈ + o�� �Է��ؼ� import�Ѵ�.
		String[][] students = new String[100][]; //null���� �ǹ̴� ���� �����ϰ������ʴ�.
		while(true){
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.��� | 2.�۾��� | 3.�󼼺��� | 4.���� | 5.���� | 6.���� ");			
			System.out.println("--------------------------------------------------------------------");
			System.out.print("���� : ");
			
			String choice = scanner.nextLine();
			if( choice.equals("1") ){
				System.out.println("********************************************************************");
				System.out.println("��ȣ : \t\t���� : \t\t�۾��� : \t��ȸ�� : ");//\t�� �Ѹ�ŭ ����.
				System.out.println("********************************************************************");
				for(String[] student : students){ //students �׸�ŭ for���� ������.
					if(student !=null){
							System.out.println(student[0] + "\t\t" + student[1]+ "\t\t" + student[2] + "\t\t" + student[3]);
						}
					}
				
			} else if( choice.equals("2") ){
				System.out.println("���� : ");
				String title = scanner.nextLine();
				System.out.println("�۾��� : ");
				String name = scanner.nextLine();
				System.out.println("��ȸ�� : ");
				String count = scanner.nextLine();
				System.out.println("���� : ");
				String typing = scanner.nextLine();
				System.out.println("��ȣ : ");
				String num = scanner.nextLine();
				for(int i=0; i<students.length; i++){ //�߰��� ����ִ� null���� ã����
					if(students[i] == null){
						String[] student = { String.valueOf(i), title, name, count, typing, num};//���ڸ� ������ �ٲܶ��� Integer.parseInt()// ������ ���ڷ� �ٲܶ� String.valueOf()
						students[i] = student;
						break;
					}
				}
				
				
			} else if( choice.equals("3") ){
				for(String[] student : students){ //students �׸�ŭ for���� ������.
					if(student !=null){
						System.out.println("*************************");
						System.out.println("��ȣ : \t\t���� : ");//\t�� 1ĭ��ŭ ����.
						System.out.println("*************************");
							System.out.println(student[0] + "\t\t" + student[1]);
						}
					}
				System.out.println("��ȣ ���� : ");//-------------------------****�������
				String numchoice = scanner.nextLine();
				for(int i = 0; i<students.length; i++){
					if(students[i] != null){
						break;
					}
				}
				
				
			} else if( choice.equals("4") ){
				
			} else if( choice.equals("5") ){
				System.out.println("������ ��ȣ : ");
				int delnum = Integer.parseInt(scanner.nextLine());
				students[delnum] = null;
				
			} else if( choice.equals("6") ){
				break;
			}
			
			
		}
	}

}
