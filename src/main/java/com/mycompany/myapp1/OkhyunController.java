package com.mycompany.myapp1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OkhyunController {
	private static final Logger logger = LoggerFactory.getLogger(OkhyunController.class);

	@RequestMapping("/")
	public String index() {
		logger.info("okhyun() 실행"); 
		return "index";
	}
	
	
}