package ch06.exam06;

public class Board {
	//Field 
	int no;
	String title;
	String content;
	String writer;
	int hitcount;
	
	
	//Consturctor Overloading :객체 생성 방법을 다양하게 하기위해서
	//오버로딩(Overloading) 조건
	// 1. 매개변수의 수가 달라야한다.
	// 2. 매개변수의 타입이 달라야한다.
	//생성자: 객체를 생성하는것
	Board(){} //기본형태
	Board(int no){}
	Board(int no, String title){}
	Board(String title, int no){}//(위치가 달라도 된다.)
	Board(int no, String title, String count){}
	Board(int no, String title, String content, String writer){}
	Board(int no, String title, String content, String writer, int hitcount){}
	
	//Method

}
