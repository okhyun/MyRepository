package finalsource.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import finalsource.dto.Member;

public class MemberDao {
	private Connection conn; //하나의 연결로 여러개를 사용 
	public void setConn(Connection conn) {
		this.conn = conn;
	}


	public int insert(Member member) throws SQLException{
		String sql ="insert into member(mid, mname, mage, mbirth) values(?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, member.getMid());
		pstmt.setString(2, member.getMname());
		pstmt.setInt(3, member.getMage());
		pstmt.setDate(4, new Date(member.getMbirth().getTime()));
		int rowNo = pstmt.executeUpdate();
		pstmt.close();
		return rowNo;
	}
	
	
	public Member selectByMid(String mid) throws SQLException{
		String sql = "select mid, mname, mage, mbirth from member where mid=?";
		Member member = null;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, mid);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			member = new Member();
			member.setMid(rs.getString("mid"));
			member.setMname(rs.getString("mname"));
			member.setMage(rs.getInt("mage"));
			member.setMbirth(rs.getDate("mbirth"));
		}
		rs.close();
		pstmt.close();
		return member;
	}
	
	public List<Member> selectByMname(String mname) throws SQLException{ //이름은 유일한값이 아니므로 List타입으로 저장해야한다(중복값 존재)
		String sql ="select mid, mname, mage, mbirth from member where mname like ?";
		List<Member> list = new ArrayList<>();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "%"+ mname +"%");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Member member = new Member();
			member.setMid(rs.getString("mid"));
			member.setMname(rs.getString("mname"));
			member.setMage(rs.getInt("mage"));
			member.setMbirth(rs.getDate("mbirth"));
			list.add(member);
		}
		rs.close();
		pstmt.close();
		return list;
	}
	
	public int update(Member member) throws SQLException { //수정된 행수를 알기 위해서 숫자(int)로
		String sql = "update member set mname=?, mage=?, mbirth=? where mid=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, member.getMname());
		pstmt.setInt(2, member.getMage());
		pstmt.setDate(3, new Date(member.getMbirth().getTime()));
		pstmt.setString(4, member.getMid());
		int rowNo = pstmt.executeUpdate();
		pstmt.close();
		return rowNo;
	}
	
	public int deleteByMid(String mid) throws SQLException { //삭제된 행수를 알기 위해서 숫자(int)로 
		String sql = "delete member where mid=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);	
		pstmt.setString(1, mid);
		int rowNo = pstmt.executeUpdate();
		pstmt.close();
		return rowNo;
	}
}
