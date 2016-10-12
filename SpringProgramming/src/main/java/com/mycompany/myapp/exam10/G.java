package com.mycompany.myapp.exam10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.exam10.Exam10Controller;

@Component      //관리객체가 된다. G가 관리 객체가 되어야한다.
public class G {
	private static final Logger logger = LoggerFactory.getLogger(G.class);
	
	public G() {
		logger.info("G 객체 생성");
	}
	
	public void method() {
		logger.info("method 실행");
	}
}
