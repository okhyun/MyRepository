package com.mycompany.myapp1.okhyun2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		logger.info("mid : " + member.getMid());
		logger.info("mname : " + member.getMname());
		logger.info("mage : " + member.getMage());
		return "okhyun2/index";
	}
	
	
	@RequestMapping("/login")
	public String login(
			@RequestParam("id") String mid, 
			@RequestParam("password") String mpassword) {
		logger.info("login 요청 처리");
		logger.info("mid : " + mid);
		logger.info("mpassword : " + mpassword);
		return "okhyun2/index";
	}
	
	
	@RequestMapping("/order")
	public String order(String pid, String pname, String pprice, String pcompany) {
		logger.info("order 요청 처리");
		logger.info("pid : " + pid);
		logger.info("pname : " + pname);
		logger.info("pprice : " + pprice);
		logger.info("pcompany : " + pcompany);
		return "okhyun2/index";
	}
	
	@RequestMapping("/write")
	public String writer(@RequestParam(defaultValue="1") int bno, 
			String title, String content, 
			@RequestParam(defaultValue="0") int hitcount) {
		logger.info("writer 요청 처리");
		logger.info("bno : " + bno);
		logger.info("title : " + title);
		logger.info("content : " + content);
		logger.info("hitcount : " + hitcount);
		return "okhyun2/index";
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam(defaultValue="1") int bno, 
			String title, String content, 
			@RequestParam(defaultValue="0") int hitcount) {
		logger.info("update 요청 처리");
		logger.info("bno : " + bno);
		logger.info("title : " + title);
		logger.info("content : " + content);
		logger.info("hitcount : " + hitcount);
		return "okhyun2/index";
	}
	
	@RequestMapping("/send")
	public String send(Board board) {
		logger.info("send 요청 처리");
		logger.info("bno : " + board.getBno());
		logger.info("title : " + board.getTitle());
		logger.info("content : " + board.getContent());
		logger.info("hitcount : " + board.getHitcount());
		return "okhyun2/index";
	}


}
