package ch06.exam07;

public class Board {
	//Field 
	int no;
	String title;
	String content;
	String writer;
	int hitcount;
	
	
	//Consturctor Overloading :��ü ���� ����� �پ��ϰ� �ϱ����ؼ�
	Board(){
		
	}
	Board(int no){
		this(no, null, null, null, 0);//��ü�ڽ��� ������--���ڵ��� ����
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
