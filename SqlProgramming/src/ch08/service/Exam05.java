package ch08.service;



import java.util.Date;

import ch08.dao.BoardDao;
import ch08.dto.Board;

public class Exam05 { //수정

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		
		Board board = new Board();
		board.setBno(1);
		board.setBtitle("제목100");
		board.setBdate(new Date(1987/10/27));
		
		dao.update(board);

	}

}
