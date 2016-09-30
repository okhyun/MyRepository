package com.mycompany.myapp1.okhyun4;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/okhyun4")
public class OkhyunController4 {
	private static final Logger logger = LoggerFactory.getLogger(OkhyunController4.class);
		
	@RequestMapping("/index")
	public String index() {
		logger.info("index 요청 처리");
		return "okhyun4/index";
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.GET ) //요청할때 get방식
	public String loginform() {
		logger.info("index 요청 처리");
		return "okhyun4/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)//요청할때 post방식 보내는 양의 제한이 없다
	public String login(Member member ) {
		logger.info("index 요청 처리");
		logger.info("mname : " + member.getMname());
		logger.info("memail : " + member.getMemail());
		return "okhyun4/joinform";
	}
	
	
	@RequestMapping(value="/save", method=RequestMethod.GET ) //요청할때 get방식
	public String saveform() {
		logger.info("index 요청 처리");
		return "okhyun4/joinform";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)//요청할때 post방식 보내는 양의 제한이 없다
	public String save(Member member ) {
		logger.info("index 요청 처리");	
		logger.info("mname : " + member.getMname());
		logger.info("mtitle : " + member.getMtitle());
		logger.info("mpassword : " + member.getMpassword());
		logger.info("mcontent : " + member.getMcontent());
		logger.info("memail : " + member.getMemail());
		logger.info("msex : " + member.getMsex());
		return "okhyun4/index";
	}
	
	
	

}
