package ch02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Connection conn = null;
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Scanner scanner = new Scanner(System.in);
				while(true) {
					System.out.println("검색할 이름:");
					String name = scanner.nextLine();
					conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "kosa12345");
					String sql = "select employee_id, first_name from employees where lower(first_name) like ?";
					PreparedStatement pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, "%" + name + "%");
					ResultSet rs = pstmt.executeQuery(); 
					while(rs.next()) {
						String employee_id = rs.getString(1);
						String first_name = rs.getString(2);
						System.out.println(employee_id + ":" + first_name);
					}
					rs.close();
					pstmt.close();
					conn.close();														
				}
			} catch (Exception e) {
				
				try {conn.close();} catch (SQLException e2) {}
				e.printStackTrace(); 
			} 

	}

}
