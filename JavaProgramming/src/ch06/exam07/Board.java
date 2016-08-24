package ch06.exam07;

public class Board {
	//Field 
	int no;
	String title;
	String content;
	String writer;
	int hitcount;
	
	
	//Consturctor Overloading :객체 생성 방법을 다양하게 하기위해서
	Board(){
		
	}
	Board(int no){
		this(no, null, null, null, 0);//객체자신의 생성자--이코딩의 뜻은
		int b = 10;
	}
	Board(int no, String title){
		this(no, title, null, null, 0);
	}
	Board(String title, int no){
		this(no, title, null, null, 0);
	}
	Board(int no, String title, String content){
		this(no, title, content, null, 0);
	}
	Board(int no, String title, String content, String writer){
		this(no, title, content, writer, 0);
	}
	Board(int no, String title, String content, String writer, int hitcount){
		
	}
	
	//Method

}
