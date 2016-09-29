package com.mycompany.myapp1.okhyun2;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/okhyun2")
public class OkhyunController2 {
	private static final Logger logger = LoggerFactory.getLogger(OkhyunController2.class);
	
	@RequestMapping("/index")
	public String index() {
		logger.info("index 요청 처리");
		return "okhyun2/index";
	}
	
	@RequestMapping("/join")
	public String join(Member member) {
		logger.info("join 요청 처리");
		logger.info("mid : " + member.getMid() );
		logger.info("mname : " + member.getMname());
		logger.info("mname : " + member.getMage());
		return "okhyun2/join";
	}
	
	
	@RequestMapping("/login")
	public String login() {
		logger.info("login 요청 처리");
		return "okhyun2/login";
	}
	
	
	@RequestMapping("/logout")
	public String logout() {
		logger.info("logout 요청 처리");
		return "okhyun2/logout";
	}
	
	
	@RequestMapping("/withdraw")
	public String withdraw() {
		logger.info("withdraw 요청 처리");
		return "okhyun2/withdraw";
	}

	
}
