package com.mycompany.myapp.exam10;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.myapp.exam09.Exam09Controller;

@Controller
@RequestMapping("/exam10")
public class Exam10Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam10Controller.class);
	
	private G g;
	@Autowired //자동으로 연결한다는 뜻 set위에 @Autowired가 붙어있으면 관리객체가 붙는다.
	public void setG(G g) {
		logger.info("setG() 실행");
		this.g =g;
	}
	
	private H h; //자동으로 연결한다는 뜻은 바로 불러온다는 뜻
	@Autowired
	public void setH(H h) {
		logger.info("setH() 실행");
		this.h = h;
	}
	
	public Service service;
	//@Autowired--> Type으로 주입  컨테이너안에 같은 객체가 2개이상이면 에러가 난다.
	//@Resource --> 등록이름으로 주입
	@Resource(name = "serviceImpl1") //첫글자는 소문자로,  이름을 바꾸고자 하면 class안에 있는 @Component 옆에 이름을 지정한다. 
	public void setService(Service service) {
		logger.info("setService() 실행");
		this.service = service;
	}
	
	private I i;
	@Autowired
	public void setI(I i) {
		logger.info("setI() 실행");
		this.i = i;
	}
	
	private J j;
	@Autowired
	public void setJ(J j) {
		logger.info("setJ() 실행");
		this.j = j;
	}
	
	@Autowired
	private K k;	
	
	@RequestMapping("/index")
	public String index() {
		return "exam10/index";
	}
	
	@RequestMapping("/method1")
	public String method1() {
		logger.info("method1 처리");
		g.method();
		h.method();
		service.method();
		return "redirect:/exam10/index";
	}
	
	@RequestMapping("/method2")
	public String method2() {
		logger.info("method2 처리");
		i.method();
		j.method();
		return "redirect:/exam10/index";
	}
	
	@RequestMapping("/method3")
	public String method3() {
		logger.info("method3 처리");
		k.method();
		return "redirect:/exam10/index";
	}
}
