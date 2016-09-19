package ch15.homework;

import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {//향상된 for문을 사용
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}

}
