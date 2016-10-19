package ch08.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ch08.dto.Member;

public class MemberDao {
	public void insert(Member member){
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
			String sql = "insert into member(mid, mname, mage, mbirth) values(?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMid() );
			pstmt.setString(2, member.getMname() );
			pstmt.setInt(3, member.getMage() );
			pstmt.setDate(4, new Date(member.getMbirth().getTime())); // Import SQL 데이터를 사용하는곳이 Date(날짜)를 사용할때이다. 
			//new Date(Long long) 여기서 Long의 값의 의미는 날짜를 숫자화 한다 라는 뜻이다 1970.00.00 기준으로 
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
	
	public void update(Member member) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
			String sql = "update member set mage=?, mbirth=? where mid=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, member.getMage() );
			pstmt.setDate(2, new Date(member.getMbirth().getTime()));
			pstmt.setString(3, member.getMid());
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
	
	
	public void deleteByMid(String mid) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
			String sql = "delete member where mid=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid);
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
