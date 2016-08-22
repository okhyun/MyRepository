package ch05.exam03;

import java.util.Scanner;

public class ScoreManagement {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);// 컨트롤 + 쉬프트 + o를 입력해서 import한다.
		String[][] students = null; //null값의 의미는 아직 참조하고있지않다.
		while(true){
			System.out.println("--------------------------------------------------------------------");
			if(students == null){
				System.out.println("1.총학생수 | 7.종료");
			} else {
				System.out.println("1.총학생수 | 2.목록 | 3.입력 | 4.삭제 | 5.최고점수 | 6.평균 | 7.종료");
			}
			System.out.println("--------------------------------------------------------------------");
			System.out.print("선택 : ");
			
			String choice = scanner.nextLine();
			if( choice.equals("1") ){
				System.out.print("총학생수 : ");
				int totalNum = Integer.parseInt( scanner.nextLine() );
				students = new String[totalNum][];
				
			} else if( choice.equals("2") ){
				System.out.println("*************************************************");
				System.out.println("학번 : \t\t이름 : \t\t점수 : ");//\t는 1칸만큼 띄운다.
				System.out.println("*************************************************");
				for(String[] student : students){ //students 항목만큼 for문을 돌린다.
					if(student !=null){
							System.out.println(student[0] + "\t\t" + student[1]+ "\t\t" + student[2]);
						}
					}
			} else if( choice.equals("3") ){  //입력
				System.out.println("학생이름 : ");
				String name = scanner.nextLine();
				System.out.println("점수 : ");
				String score = scanner.nextLine();
				for(int i=0; i<students.length; i++){ //중간에 비어있는 null값을 찾을때
					if(students[i] == null){
						String[] student = { String.valueOf(i), name, score};//문자를 정수로 바꿀때는 Integer.parseInt()// 정수를 문자로 바꿀땐 String.valueOf()
						students[i] = student;
						break; //null이 없으면 나가라 if문에는 영향이 없으니 가장가까운 for문에 영향을 미친다.
					}
				}
			} else if( choice.equals("4") ){  //삭제
				System.out.println("삭제할 학번 : ");
				int sno = Integer.parseInt(scanner.nextLine());
				students[sno] = null;				
				
			} else if( choice.equals("5") ){ //최고점수 점수비교
				int max = 0; //최고점수 값
				for(String[] student : students){
					if(student !=null){
						int score = Integer.parseInt(student[2]);
						if(max < score){
						max = score;
						}
					}
				}
				System.out.println("*************************************************");
				System.out.println("학번 : \t\t이름 : \t\t점수 : ");
				System.out.println("*************************************************");
				
				for(String[] student : students){//최고점수를 가진학생을 찾는 for문
					if(student !=null){
						int score = Integer.parseInt(student[2]);
						if(max == score){ //최고점수와 같은 점수를 비교. max값과 같으면 찾기성공. 
							System.out.println(student[0] + "\t\t" + student[1]+ "\t\t" + student[2]);
						}
					}
				}
				
			} else if( choice.equals("6") ){ //평균 값을 구한다.
				int count = 0;
				int sum = 0;
				for(String[] student : students){
					if(student != null){ //null 값을 제외한 값만
						count++;
						sum += Integer.parseInt(student[2]);
					}
				}
				System.out.println("평점 : " + (double)sum/count);
				
			} else if( choice.equals("7") ){
				break; //반복문을 빠져나가게한다.
			}
		}


	}

}
