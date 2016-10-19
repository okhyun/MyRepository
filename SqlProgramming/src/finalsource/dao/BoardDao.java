package finalsource.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import finalsource.dto.Board;
import finalsource.dto.Member;

public class BoardDao {
	private Connection conn; //하나의 연결로 여러개를 사용 
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	public int insert(Board board) throws SQLException{
		String sql ="insert into board(bno, btitle, bcontent, bwriter, bhitcount, bdate) values(?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, board.getBno());
		pstmt.setString(2, board.getBtitle());
		pstmt.setString(3, board.getBcontent());
		pstmt.setString(4, board.getBwriter());
		pstmt.setInt(5, board.getBhitcount());
		pstmt.setDate(6, new Date(board.getBdate().getTime()));
		int rowNo = pstmt.executeUpdate();
		pstmt.close();
		return rowNo;
	}
	
	
	public Board selectByBno(int bno) throws SQLException{
		String sql = "select bno, btitle, bcontent, bwriter, bhitcount, bdate from board where bno=?";
		Board board = null;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, bno);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			board = new Board();
			board.setBno(rs.getInt("bno"));
			board.setBtitle(rs.getString("btitle"));
			board.setBcontent(rs.getString("bcontent"));
			board.setBwriter(rs.getString("bwriter"));
			board.setBhitcount(rs.getInt("bhitcount"));
			board.setBdate(rs.getDate("bdate"));
		}
		rs.close();
		pstmt.close();
		return board;
	}
	
	
	public List<Board> selectByBtitle(String btitle) throws SQLException{ //이름은 유일한값이 아니므로 List타입으로 저장해야한다(중복값 존재)
		String sql ="select  bno, btitle, bcontent, bwriter, bhitcount, bdate from board where btitle like ?";
		List<Board> list = new ArrayList<>();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "%"+ btitle +"%");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Board board = new Board();
			board.setBno(rs.getInt("bno"));
			board.setBtitle(rs.getString("btitle"));
			board.setBcontent(rs.getString("bcontent"));
			board.setBwriter(rs.getString("bwriter"));
			board.setBhitcount(rs.getInt("bhitcount"));
			board.setBdate(rs.getDate("bdate"));
			list.add(board);
		}
		rs.close();
		pstmt.close();
		return list;
	}
	
	public int update(Board board) throws SQLException { //수정된 행수를 알기 위해서 숫자(int)로
		String sql = "update board set bno=?, bcontent=?, bwriter=?, bhitcount=?, bdate=? where btitle=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, board.getBno());		
		pstmt.setString(2, board.getBcontent());
		pstmt.setString(3, board.getBwriter());
		pstmt.setInt(4, board.getBhitcount());
		pstmt.setDate(5, new Date(board.getBdate().getTime()));
		pstmt.setString(6, board.getBtitle());
		int rowNo = pstmt.executeUpdate();
		pstmt.close();
		return rowNo;
	}
	
	public int deleteByBno(int bno) throws SQLException { //삭제된 행수를 알기 위해서 숫자(int)로 
		String sql = "delete board where bno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);	
		pstmt.setInt(1, bno);
		int rowNo = pstmt.executeUpdate();
		pstmt.close();
		return rowNo;
	}
}
