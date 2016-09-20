package ch07.homework;

import java.util.Scanner;

public class ScoreManagement2 { //팀과제 1번

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);// 컨트롤 + 쉬프트 + o를 입력해서 import한다.
		Student2[] students = new Student2[100]; //new Student2[100];//String타입 배열을 생성
		int count = 0;
		 
		
		
		while(true){//while 반복문을 돌려서 참일때 그번호에 대한 조건문 실행.
			System.out.println("--------------------------------------------------------------------"); //메뉴를 출력한다.
			System.out.println(" 1.목록 | 2.글쓰기 | 3.상세보기 | 4.수정 | 5.삭제 | 6.종료 ");			
			System.out.println("--------------------------------------------------------------------");
			System.out.print("선택 : ");
			
			String choice = scanner.nextLine(); //String 타입 choice 변수에 scanner로 문자열타입을 넣겠다.(scanner로 문자열 타입으로 받겠다.)
			if( choice.equals("1") ){  //1.목록//조건문에서 비교할때 .equals를 쓴 이유는 참조변수(객체)를 비교해야하기때문이다.(문자열 비교)
				System.out.println("********************************************************************");
				System.out.println("번호 : \t\t제목 : \t\t글쓴이 : \t조회수 : ");//\t는 한만큼 띄운다.
				System.out.println("********************************************************************");
				for(Student2 student : students){ //students 항목만큼 for문을 돌린다.
					if(student !=null){ //배열 student가 null이 아닐때 student배열의 0번째부터 3번째까지 출력한다.//student라는 배열이 아직 생성이 되어있지 않은 상태.
							System.out.println(student.getNum() + "\t\t" + student.getTitle()+ "\t\t" + student.getName() + "\t\t" + student.getCount()); 
							
					}
				}
				
			} else if( choice.equals("2") ){ //2.글쓰기(입력)
				System.out.println("제목 : ");
				String title = scanner.nextLine();//String타입(문자열)의 값을 키보드로 입력받는다.
				System.out.println("글쓴이 : ");
				String name = scanner.nextLine();//String타입(문자열)의 값을 키보드로 입력받는다.
				System.out.println("내용 : ");
				String typing = scanner.nextLine();//String타입(문자열)의 값을 키보드로 입력받는다.
				for(int i=0; i<students.length; i++){ //변수 i를 지정하고 i를  0~99  [100]까지 1씩 증가 시키면서 돌린다.
					if(students[i] == null){ //배열 students의 값이 null과 같을때 student값을 넣어준다.
						students[i] = new Student2(i, title, name, typing, count);// String 타입 배열 student에 위에서 입력받은 title name typing을 넣어준다.
						break;
					}
				}
				
				
			} else if( choice.equals("3") ){ //3.상세보기
				for(Student2 student : students){ //students 항목만큼 for문을 돌린다.
					if(student !=null){
						System.out.println("***********************************************");
						System.out.println("번호\t\t제목\t\t조회수");//\t는 1칸만큼 띄운다.
						System.out.println("***********************************************");
							System.out.println(student.getNum() + "\t\t" + student.getTitle() + "\t\t" + student.getCount());
					}
				}
					System.out.println("번호 선택 : ");
					int numchoice = scanner.nextInt();//키보드로 입력받는다.
					for(int i = 0; i<students.length; i++){
						if(students[i] != null){
							System.out.println(students[numchoice]);
													
							break;
					}
				}	
					//count는 int타입이기때문에 조회수를 올리기위해선 이미 배열에 들어가있는 String타입 조회수를 int타입으로 바뀌준다.
					count++;//카운트 한다.
					students[numchoice].setCount(count);//students[numchoice][4] = String.valueOf(count); //int 타입으로 바꿔주었던 count를 다시 String타입으로 변환해준 후에 students[numchoice][4]안에 다시 넣어준다. 
					
				
			} else if( choice.equals("4") ){ //4.수정
				System.out.println("수정할 번호 : ");
				int modify = Integer.parseInt(scanner.nextLine()); //변수 modify에 정수 int타입의 값을 키보드 입력값을 넣는다.
				//students[modify] = null;// 지정한 배열의 값을 null값으로한다.
				System.out.println("수정할 제목 ");
				String title = scanner.nextLine(); // 키보드로 입력받는다.
				System.out.println("수정할 내용 ");
				String typing = scanner.nextLine(); //키보드로 입력받는다.
								
				students[modify].setTitle(title);//수정할 위치에 키보드로 입력받은 값을 넣는다.
				students[modify].setTyping(typing);//수정할 위치에 키보드로 입력받은 값을 넣는다.
				
				
			} else if( choice.equals("5") ){ //5.삭제
				System.out.println("삭제할 번호 : ");
				int delnum = Integer.parseInt(scanner.nextLine()); 
				students[delnum] = null; //students 배열에 null값을 넣어준다.(String타입 문자열을 int타입의 정수로 변환한다.) null값이 students[100]배열에 값이 들어간다.
				
			} else if( choice.equals("6") ){ //6.종료
				break;
			  } 
			
			
		}
	}

}
