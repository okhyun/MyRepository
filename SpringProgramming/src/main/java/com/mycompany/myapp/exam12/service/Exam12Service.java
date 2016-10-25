package com.mycompany.myapp.exam12.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.exam12.dao.Exam12Dao;
import com.mycompany.myapp.exam12.dto.Member;


@Component
public class Exam12Service {
	private static final Logger logger = LoggerFactory.getLogger(Exam12Service.class);
	
	@Autowired //@Autowired를 하면 DataSource 생성되어있으면 자동 연결한다.
	private DataSource dataSource;
	
	@Autowired
	private Exam12Dao dao;
	
	public void join(Member member){
		Connection conn = null;
		try {
			conn = dataSource.getConnection(); //대여한다.
			dao.setConn(conn);
			int rowNo = dao.insert(member);
			logger.info(rowNo + "행이 저장됨");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { conn.close(); } catch (SQLException e) { } //close 하면서 반납을 하는것
		}
	}

}
