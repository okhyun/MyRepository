package ch08.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ch08.dto.Account;

public class AccountDao {
	private Connection conn;

	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	
	public int update(Account account) throws SQLException { //update에선 try and catch를 쓰면 안된다. 이유는 내부에서 예외처리를 해버리면 예외가발생한값 그대로 성공해서 출력한다. 
		String sql = "update account set abalance=? where ano=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, account.getAbalance());
		pstmt.setString(2, account.getAno());
		int rowNo = pstmt.executeUpdate();
		return rowNo;
	}

}
