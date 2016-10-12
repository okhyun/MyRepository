package com.mycompany.myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/")//사이트 주소의 /와 같아야한다.
	public String index() {
		logger.info("home() 실행2"); //출력되는 정보를(위치) 보기위해서 API를 사용
		return "index"; //jsp 이름과 같아야한다.
	}
	
	
}
