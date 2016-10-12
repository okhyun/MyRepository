package com.mycompany.myapp.exam04;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myapp.exam04.Exam04Controller;

@Controller
public class Exam04Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam04Controller.class);
	
	@RequestMapping("/exam04/index")
	public String index() {
		logger.info("index 요청 처리");
		return "exam04/index";
	}
	
	
	@RequestMapping(value="/exam04/join", method=RequestMethod.GET ) //요청할때 get방식
	public String joinForm() {
		logger.info("index 요청 처리");
		return "exam04/joinform";
	}
	
	@RequestMapping(value="/exam04/join", method=RequestMethod.POST)//요청할때 post방식 보내는 양의 제한이 없다
	public String join(Member member ) {
		logger.info("index 요청 처리");
		logger.info("mid : " + member.getMid());		
		/*String name = member.getMname();
		try {
			name = new String(name.getBytes("8859_1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {	} //한글이 깨질때 변환하는 방법*/		
		logger.info("mname : " + member.getMname());
		logger.info("mpassword : " + member.getMpassword());
		logger.info("memail : " + member.getMemail());
		logger.info("mtel : " + member.getMtel());
		logger.info("mjob : " + member.getMjob());
		logger.info("mskill : " + Arrays.toString(member.getMskill()));
		logger.info("maddress1 : " + member.getMaddress1());
		logger.info("maddress2 : " + member.getMaddress2());
		logger.info("mbirth : " + member.getMbirth());
		return "exam04/index";
	}
	
	@RequestMapping(value="/exam04/write", method=RequestMethod.GET)
		public String WriteForm(Member member ) {
			logger.info("WriteForm 요청 처리");
			return "exam04/WriteForm";
		}

}
