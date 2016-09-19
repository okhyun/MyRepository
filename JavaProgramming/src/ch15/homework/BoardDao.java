package ch15.homework;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List <Board> getBoardList(){  // 문제 : getBoardList() 메소드를 호출하면 List<Board> 타입의 컬렉션을 리턴하도록 한다.
	List <Board> list  = new ArrayList<>(); 
		list.add(new Board("제목1", "내용1")); //Board(String title, String content) 생성자의 매개변수 2개가 String 타입
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		return list; //  List<Board>타입인 ArrayList<>()의 list를 리턴 
	}
	

}
