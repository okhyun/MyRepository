package com.mycompany.myapp1.okhyun1;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/okhyun1")
public class OkhyunController {
	private static final Logger logger = LoggerFactory.getLogger(OkhyunController.class);
	
	@RequestMapping("/join")
	public String join() {
		logger.info("join 요청 처리");
		return "okhyun1/join";
	}
	
	
	@RequestMapping("/login")
	public String login() {
		logger.info("login 요청 처리");
		return "okhyun1/login";
	}
	
	
	@RequestMapping("/logout")
	public String logout() {
		logger.info("logout 요청 처리");
		return "okhyun1/logout";
	}
	
	
	@RequestMapping("/withdraw")
	public String withdraw() {
		logger.info("withdraw 요청 처리");
		return "okhyun1/withdraw";
	}
	
}
