package com.mycompany.myapp1;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/okhyun")
public class OkhyunController2 {
	private static final Logger logger = LoggerFactory.getLogger(OkhyunController2.class);
	
	@RequestMapping("/join")
	public String join() {
		logger.info("join 요청 처리");
		return "okhyun/join";
	}
	
	
	@RequestMapping("/login")
	public String login() {
		logger.info("login 요청 처리");
		return "okhyun/login";
	}
	
	
	@RequestMapping("/logout")
	public String logout() {
		logger.info("logout 요청 처리");
		return "okhyun/logout";
	}
	
	
	@RequestMapping("/withdraw")
	public String withdraw() {
		logger.info("withdraw 요청 처리");
		return "okhyun/withdraw";
	}

	
}
