package com.mycompany.myapp.exam06;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam06")
public class Exam06Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam06Controller.class);
	
	@RequestMapping("/index")
	public String index() {
		logger.info("index 요청 처리");
		return "exam06/index";
	}
	
	
//---------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------	
	
	@RequestMapping("/method1")
	public String method1(HttpServletRequest request) { //요청 Http에 대한 모든것을 가지고 있다. 모든것을 다 얻을수 있다.
		logger.info("method1 요청 처리");
		//클라이언트의 IP얻기
		logger.info("WebClient IP : " + request.getRemoteAddr());
		//클라이언트의 브라우저 종류 얻기
		logger.info("WebClient 종류 : " + request.getHeader("User-Agent"));
		if(request.getHeader("User-Agent").contains("chrome")) {
			logger.info("브라우저 종류 : 크롬");
		} else if(request.getHeader("User-Agent").contains("Trident/7.0")){
			logger.info("브라우저 종류 : 인터넷 익스플로러 11");
		} else if(request.getHeader("User-Agent").contains("MSIE")){
			logger.info("브라우저 종류 : 익스플로러 10 이하");
		}
		//요청 파라미터 값 얻기
		logger.info("mid : " + request.getParameter("mid"));
		logger.info("mname : " + request.getParameter("mname"));
		//쿼리 문자열 얻기
		logger.info("쿼리 문자열 : " + request.getQueryString());
		//요청 URI, 요청 URI, 요청 방식, 시스템 경로 얻기
		logger.info("요청 URI : " + request.getRequestURI());//포트를 포함한 주소까지
		logger.info("요청 URL : " + request.getRequestURL());//전체
		logger.info("요청 방식 : " + request.getMethod());
		logger.info("시스템 파일 경로 : " + request.getServletContext().getRealPath("/WEB-INF/image/photo1.jpg"));//절대경로
		return "exam06/index";
	}
	

	
	
//---------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------	
	
	
	@RequestMapping("/method2")
	public void method2(HttpServletResponse response, HttpServletRequest request) throws IOException {
		/*response.setContentType("application/json; charset=UTF-8"); //보낼려고 한는것이 문자다.
		//OutputStream os = response.getOutputStream(); printWriter 가 더 효율적이다.
		PrintWriter pw = response.getWriter();
		pw.println("{mid:'fall', mname:'한가을'}");
		pw.flush();
		pw.close();*/
		
		
		response.setContentType("image/jpeg");
		String fileName = "사진2.jpg";
		fileName = URLEncoder.encode(fileName, "UTF-8"); // 한글로 다운로드 하고싶을때 변환해서 사용한다.
		response.setHeader("Content-Disposition", "attachment; filename= \"" + fileName + "\""); 
		//원하는 이름으로 다운로드 photo1.jpg 
		// \이름\ 역슬래쉬를 넣으면 안에서 띄어쓰기를 해도 상관없이 이름으로 인식한다.
		
		response.setContentType("image/jpeg");
		OutputStream os = response.getOutputStream();
		
		String filePath = request.getServletContext().getRealPath("/WEB-INF/image/사진2.jpg");
		InputStream is = new FileInputStream(filePath);
		
		byte[] values = new byte[1024];
		int byteNum = -1;
		while((byteNum = is.read(values)) != -1 ) {
			os.write(values, 0, byteNum);
			
		}
		os.flush();
		is.close();
		os.close();
	}
	
	
	
	@RequestMapping("/method3")
	public String method3(@RequestHeader("User-Agent") String userAgent){
		if(userAgent.contains("chrome")) {
			logger.info("브라우저 종류 : 크롬");
		} else if(userAgent.contains("Trident/7.0")){
			logger.info("브라우저 종류 : 인터넷 익스플로러 11");
		} else if(userAgent.contains("MSIE")){
			logger.info("브라우저 종류 : 익스플로러 10 이하");
		}
		return "exam06/index"; 
				
	}
	
	
	
//---------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/method4CreateCookie")
	public String method4CreateCookie(HttpServletResponse response) throws UnsupportedEncodingException {
		//쿠키생성
		Cookie cookie1 = new Cookie("mid", "fall");
		
		String name = "홍길동"; //한글 쓰고싶을때 에러가 나기때문에 String으로 받고 인코더로 변환
		name = URLEncoder.encode(name, "UTF-8");
		Cookie cookie2 = new Cookie("mname", name); //한글값을 저장할 수 없다.
		cookie2.setMaxAge(60); //초단위
		
		//쿠키 보내기(저장) - 응답 해더에 쿠키 정보를 저장
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		
		return "exam06/index";
	}
	
	
	
	@RequestMapping("/method4ReceiveCookieHow1")
	public String method4ReceiveCookieHow1(HttpServletRequest request) throws UnsupportedEncodingException {
		//쿠키 받기 - 요청 해더의 쿠키 정보를 읽기
		Cookie[] cookies = request.getCookies();
		if(cookies!=null) {
			for(Cookie cookie : cookies) {
				String name = cookie.getName();
				String value = null;
				if(name.equals("mname")) { //cookie의 이름이 한글일때만 변환해주라
					value = URLDecoder.decode(cookie.getValue(), "UTF-8");
				} else {
					value = cookie.getValue();
				}
				
				System.out.println(name + ":" + value);
			}
		}
		
		return "exam06/index";
	}
	
	
	
	
	@RequestMapping("/method4ReceiveCookieHow2") //쿠키값이 넘어오지 않으면 에러가 난다. 그래서 에러가 안나게 하려면 default 값을 준다 어떻게?
	public String method4ReceiveCookieHow2(@CookieValue(defaultValue="") String mid, @CookieValue(defaultValue="") String mname) { //이렇게 (defaultValue="")
		System.out.println("mid : " + mid);
		System.out.println("mname : " + mname);
		return "exam06/index";
	}
	
	
	
	@RequestMapping("/method4DeleteCookie")
	public String method4DeleteCookie(HttpServletResponse response) {
		Cookie cookie1 = new Cookie("mid", "");
		cookie1.setMaxAge(0);
		
		Cookie cookie2 = new Cookie("mname", "");
		cookie2.setMaxAge(0);
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		return "exam06/index";
	}
	
	
//--------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------	
	
	
	 @RequestMapping("/method5SetObject")
	 public String method5SetObject(HttpSession session) {
		 //객체 생성
		 Member member = new Member("fall", "한가을");
		 
		 
		 //HttpSession에 객체 저장
		 session.setAttribute("member", member); //키 , 값   ---키이름은 아무거나 상관없어
		 
		 		 
		 return "exam06/index";
	 }
	
	 
	 
	 @RequestMapping("/method5GetObject")
	 public String method5GetObject(HttpSession session) {
		 //HttpSession에 객체 얻기
		 Member member = (Member) session.getAttribute("member"); //키를 주고 객체 얻어온다.
		 if(member != null){
		 	 System.out.println("mid : " + member.getMid());
		 	 System.out.println("mname : " + member.getMname());
		 }
		 return "exam06/index";
	 }
	 
	 
	 
	 @RequestMapping("/method5RemoveObject")
	 public String method5RemoveObject(HttpSession session) {
		 //HttpSession에 객체 삭제
		 session.removeAttribute("member");
		 return "exam06/index";
	 }
}
