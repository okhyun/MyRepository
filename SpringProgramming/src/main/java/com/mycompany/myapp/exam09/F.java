package com.mycompany.myapp.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class F {
	private static final Logger logger = LoggerFactory.getLogger(F.class);
	
	private ServiceA sa;//클래스
	private ServiceB sb;//클래스
	private ServiceC sc; //인터페이스는 구현객체를 가져와야한다.
		
	public F(ServiceA sa,  ServiceB sb, ServiceC sc){
		logger.info("F 객체 생성");
		this.sa = sa;
		this.sb = sb;
		this.sc = sc;
	}
	
	public void method() {
		logger.info("method 실행");
		sa.method();
		sb.method();
		sc.method();
	}
}
