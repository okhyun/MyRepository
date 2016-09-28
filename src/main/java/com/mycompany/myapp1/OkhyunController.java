package com.mycompany.myapp1;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OkhyunController {
	private static final Logger logger = LoggerFactory.getLogger(OkhyunController.class);
	
	@RequestMapping("/")
	public String okhyun1() {
		logger.info("okhyun1() 실행");
		
		return "okhyun1";
	}
	
	
	@RequestMapping("/okhyun2")
	public String okhyun2() {
		logger.info("okhyun2() 실행");
		
		return "okhyun2";
	}
	
}
