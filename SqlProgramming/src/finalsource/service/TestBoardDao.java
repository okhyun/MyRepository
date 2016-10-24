package finalsource.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import finalsource.dao.BoardDao;
import finalsource.dao.MemberDao;
import finalsource.dto.Board;
import finalsource.dto.Member;

public class TestBoardDao {
	public static void main(String[] args) {
		//testInsert();
		//testSelectByBno();
		//testSelectByBtitle();
		//testUpdate();
		//testDeleteByBno();
		testSelectByPage(2,10);
	}
	
	public static void testSelectByPage(int pageNo, int rowsPerPage) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			
			BoardDao dao = new BoardDao();
			dao.setConn(conn);
			
			List<Board> list = dao.selectByPage(pageNo, rowsPerPage);
			for(Board board : list) {
				System.out.print(board.getBno() + ":");
				System.out.print(board.getBtitle() + ":");
				System.out.print(board.getBcontent() + ":");
				System.out.print(board.getBwriter() + ":");
				System.out.print(board.getBhitcount() + ":");
				System.out.print(board.getBdate() + ":");
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { conn.close(); } catch (SQLException e) { }
		}
		
	}
	
	public static void testInsert() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			
			BoardDao dao = new BoardDao();
			dao.setConn(conn);
			
			for(int i =1; i<10000; i++) {
				Board board = new Board();
				board.setBtitle("테스트" + i + "제목");
				board.setBcontent("테스트" + i + "내용");
				board.setBwriter("user777");
				board.setBhitcount(7);
				
				int rowNo = dao.insert(board);
			}
			System.out.println("10000행이 저장됨");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { conn.close(); } catch (SQLException e) { }
		}
	}
	
	public static void testSelectByBno() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			
			BoardDao dao = new BoardDao();
			dao.setConn(conn);
			
			Board board = dao.selectByBno(10);
			if(board != null) {
				System.out.print(board.getBno() + ":");
				System.out.print(board.getBtitle() + ":");
				System.out.print(board.getBcontent() + ":");
				System.out.print(board.getBwriter() + ":");
				System.out.print(board.getBhitcount() + ":");
				System.out.print(board.getBdate() + ":");
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { conn.close(); } catch (SQLException e) { }
		}
	}
	
	public static void testSelectByBtitle() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			
			BoardDao dao = new BoardDao();
			dao.setConn(conn);
			
			List<Board> list = dao.selectByBtitle("제목");
			for(Board board : list) {
				System.out.print(board.getBno() + ":");
				System.out.print(board.getBtitle() + ":");
				System.out.print(board.getBcontent() + ":");
				System.out.print(board.getBwriter() + ":");
				System.out.print(board.getBhitcount() + ":");
				System.out.print(board.getBdate() + ":");
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { conn.close(); } catch (SQLException e) { }
		}
	}
	
	public static void testUpdate() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			
			BoardDao dao = new BoardDao();
			dao.setConn(conn);
			
			Board board = new Board();
			board.setBno(10);
			board.setBtitle("제목20");
			board.setBcontent("내용20");
			board.setBwriter("user20");
			board.setBhitcount(20);
			board.setBdate(new Date());
			
			int rowNo = dao.update(board);
			System.out.println(rowNo + "행이 수정됨");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { conn.close(); } catch (SQLException e) { }
		}
	}
	
	public static void testDeleteByBno() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1","kosa12345");
			
			BoardDao dao = new BoardDao();
			dao.setConn(conn);
			
			int rowNo = dao.deleteByBno(10);
			System.out.println(rowNo + "행이 삭제됨");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { conn.close(); } catch (SQLException e) { }
		}
	}
}

