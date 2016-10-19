package ch08.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ch08.dto.Board;
import ch08.dto.Board;



public class BoardDao {
	public void insert(Board board){
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
			String sql = "insert into board(bno, btitle, bcontent, bwriter, bhitcount, bdate) values(?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getBno() );
			pstmt.setString(2, board.getBtitle() );
			pstmt.setString(3, board.getBcontent() );
			pstmt.setString(4, board.getBwriter() );
			pstmt.setInt(5, board.getBhitcount() );
			pstmt.setDate(6, new Date(board.getBdate().getTime()));
			int rowNo = pstmt.executeUpdate(); //select문을 제외한 모든문은 executeUpdate을 사용한다.
			if(rowNo == 1) {
				System.out.println("저장 성공");
			}
			pstmt.close();
		} catch (Exception e) {
			System.out.println("저장 실패");
			e.printStackTrace();
		} finally {
			try{conn.close();} catch (SQLException e){ }
		}
	}
	
//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void update(Board board) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
			String sql = "update board set btitle=?, bdate=? where bno=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBtitle() );
			pstmt.setDate(2, new Date(board.getBdate().getTime()));
			pstmt.setInt(3, board.getBno() );
			int rowNo = pstmt.executeUpdate(); //경우의 수 : 1. 값이 1이상일 수 있다. ,  2.  값 0 어떤행도 수정되지 않을 수 있다. ,  3. 예외발생
			if(rowNo >= 1) { //무조건 리턴을 1일수는 없다. 이유는 여러가지 경우의 수가 있기에. 
				System.out.println(rowNo + "행이 수정됨");
			} else if(rowNo ==0) {
				System.out.println("수정된 행이 없음");
			}
			pstmt.close();
		} catch (Exception e) {
			System.out.println("수정 실패");
			e.printStackTrace();
		} finally {
			try{conn.close();} catch (SQLException e){ }
		}
	}
	
	
//--------------------------------------------------------------------------------------------------------------------------------------------------	
	
	
	public void deleteByBtitle(String btitle) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
			String sql = "delete board where btitle=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, btitle);
			int rowNo = pstmt.executeUpdate(); //경우의 수 : 1. 값이 1이상일 수 있다. ,  2.  값 0 어떤행도 수정되지 않을 수 있다. ,  3. 예외발생
			if(rowNo >= 1) { //무조건 리턴을 1일수는 없다. 이유는 여러가지 경우의 수가 있기에. 
				System.out.println(rowNo + "행이 삭제됨");
			} else if(rowNo ==0) {
				System.out.println("삭제된 행이 없음");
			}
			pstmt.close();
		} catch (Exception e) {
			System.out.println("삭제 실패");
			e.printStackTrace();
		} finally {
			try{conn.close();} catch (SQLException e){ }
		}
	}
	
	

}
