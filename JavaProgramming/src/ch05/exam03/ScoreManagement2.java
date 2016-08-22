package ch05.exam03;

import java.util.Scanner;

public class ScoreManagement2 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);// 컨트롤 + 쉬프트 + o를 입력해서 import한다.
		String[][] students = new String[100][]; //null값의 의미는 아직 참조하고있지않다.
		while(true){
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.목록 | 2.글쓰기 | 3.상세보기 | 4.수정 | 5.삭제 | 6.종료 ");			
			System.out.println("--------------------------------------------------------------------");
			System.out.print("선택 : ");
			
			String choice = scanner.nextLine();
			if( choice.equals("1") ){
				System.out.println("********************************************************************");
				System.out.println("번호 : \t\t제목 : \t\t글쓴이 : \t조회수 : ");//\t는 한만큼 띄운다.
				System.out.println("********************************************************************");
				for(String[] student : students){ //students 항목만큼 for문을 돌린다.
					if(student !=null){
							System.out.println(student[0] + "\t\t" + student[1]+ "\t\t" + student[2] + "\t\t" + student[3]);
						}
					}
				
			} else if( choice.equals("2") ){
				System.out.println("제목 : ");
				String title = scanner.nextLine();
				System.out.println("글쓴이 : ");
				String name = scanner.nextLine();
				System.out.println("조회수 : ");
				String count = scanner.nextLine();
				System.out.println("내용 : ");
				String typing = scanner.nextLine();
				System.out.println("번호 : ");
				String num = scanner.nextLine();
				for(int i=0; i<students.length; i++){ //중간에 비어있는 null값을 찾을때
					if(students[i] == null){
						String[] student = { String.valueOf(i), title, name, count, typing, num};//문자를 정수로 바꿀때는 Integer.parseInt()// 정수를 문자로 바꿀땐 String.valueOf()
						students[i] = student;
						break;
					}
				}
				
				
			} else if( choice.equals("3") ){
				for(String[] student : students){ //students 항목만큼 for문을 돌린다.
					if(student !=null){
						System.out.println("*************************");
						System.out.println("번호 : \t\t제목 : ");//\t는 1칸만큼 띄운다.
						System.out.println("*************************");
							System.out.println(student[0] + "\t\t" + student[1]);
						}
					}
				System.out.println("번호 선택 : ");//-------------------------****여기수정
				String numchoice = scanner.nextLine();
				for(int i = 0; i<students.length; i++){
					if(students[i] != null){
						break;
					}
				}
				
				
			} else if( choice.equals("4") ){
				
			} else if( choice.equals("5") ){
				System.out.println("삭제할 번호 : ");
				int delnum = Integer.parseInt(scanner.nextLine());
				students[delnum] = null;
				
			} else if( choice.equals("6") ){
				break;
			}
			
			
		}
	}

}
