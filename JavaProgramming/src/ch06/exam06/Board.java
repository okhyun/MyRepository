package ch06.exam06;

public class Board {
	//Field 
	int no;
	String title;
	String content;
	String writer;
	int hitcount;
	
	
	//Consturctor Overloading :��ü ���� ����� �پ��ϰ� �ϱ����ؼ�
	//�����ε�(Overloading) ����
	// 1. �Ű������� ���� �޶���Ѵ�.
	// 2. �Ű������� Ÿ���� �޶���Ѵ�.
	//������: ��ü�� �����ϴ°�
	Board(){} //�⺻����
	Board(int no){}
	Board(int no, String title){}
	Board(String title, int no){}//(��ġ�� �޶� �ȴ�.)
	Board(int no, String title, String count){}
	Board(int no, String title, String content, String writer){}
	Board(int no, String title, String content, String writer, int hitcount){}
	
	//Method

}
