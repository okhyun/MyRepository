package com.mycompany.myweb.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myweb.dto.PhotoBoard;
import com.mycompany.myweb.service.PhotoBoardService;

@Controller
@RequestMapping("/photoboard")
public class PhotoBoardController {
	
	@Autowired
	private PhotoBoardService photoBoardService;
	
/*	@RequestMapping("/list")
	public String list() {
		return "photoboard/list";
	}
	*/
	@RequestMapping("/list")
	public String list(String pageNo, Model model, HttpSession session) {
		
		int intPageNo = 1;
		if(pageNo == null) {
			pageNo = (String) session.getAttribute("pageNo");//session에서 불러오기
			if(pageNo != null) {
				intPageNo = Integer.parseInt(pageNo);
			}
		} else {
			intPageNo = Integer.parseInt(pageNo);
		}
		session.setAttribute("pageNo", String.valueOf(intPageNo)); //session에 저장
	
		
		
		int rowsPerPage =8; //고정적으로 줘야하는값
		int pagesPerGroup = 5;
		
		int totalBoardNo = photoBoardService.getCount();
		
		int totalPageNo = (totalBoardNo/rowsPerPage) + ((totalBoardNo%rowsPerPage!=0)?1:0); //정수 나누기 정수는 정수기때문에 소수 아래를 생략한다. 그렇ㄷ게 되면 페이지 수가 달라진다. 해서 +해준다
		int totalGroupNo = (totalPageNo/pagesPerGroup) + ((totalPageNo%pagesPerGroup!=0)?1:0);
		
		int groupNo = (intPageNo-1)/pagesPerGroup +1; //현재 그룹의값
		int startPageNo = (groupNo-1)*pagesPerGroup + 1;
		int endPageNo = startPageNo + pagesPerGroup -1;
		if(groupNo == totalGroupNo) {endPageNo = totalPageNo;}
		
		List<PhotoBoard> list = photoBoardService.list(intPageNo, rowsPerPage);
		
		model.addAttribute("pageNo", intPageNo);
		model.addAttribute("rowsPerPage", rowsPerPage);
		model.addAttribute("pagesPerGroup", pagesPerGroup);
		model.addAttribute("totalBoardNo", totalBoardNo);
		model.addAttribute("totalPageNo", totalPageNo);
		model.addAttribute("totalGroupNo", totalGroupNo);
		model.addAttribute("groupNo", groupNo);
		model.addAttribute("startPageNo", startPageNo);
		model.addAttribute("endPageNo", endPageNo);
		model.addAttribute("list", list);
		
		
		return "photoboard/list";
		
	}
	
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write() {
		return "photoboard/write";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(PhotoBoard photoBoard, HttpSession session) {
		try{
			String mid = (String) session.getAttribute("login");
			photoBoard.setBwriter(mid);
			
			photoBoard.setOriginalfile(photoBoard.getPhoto().getOriginalFilename());
			
			String savedfile = new Date().getTime() + photoBoard.getPhoto().getOriginalFilename();
			String realpath = session.getServletContext().getRealPath("/WEB-INF/photo/" + savedfile); //"/resources/image/"는 실제 실행하는 코드
			photoBoard.getPhoto().transferTo(new File(realpath)); //실제파일을 저장하는 코드
			photoBoard.setSavedfile(savedfile);
			
			photoBoard.setMimetype(photoBoard.getPhoto().getContentType());
			
			int result = photoBoardService.write(photoBoard); //DB에 저장되는 코드
			
				return "redirect:/photoboard/list";
			
		} catch(Exception e) {
			e.printStackTrace();
			return "photoboard/write";
		}
	}
	
	@RequestMapping("/showPhoto")
	public void showPhoto(String savedfile, HttpServletRequest request, HttpServletResponse response) {
		try{
		String fileName = savedfile;
				
		
		/*브라우저에서 보여주지 않고 강제로 다운로드 할 경우
		 * String fileName = "사진2.jpg";
		fileName = URLEncoder.encode(fileName, "UTF-8"); // 한글로 다운로드 하고싶을때 변환해서 사용한다.(강제 다운)
		response.setHeader("Content-Disposition", "attachment; filename= \"" + fileName + "\""); 
		//원하는 이름으로 다운로드 photo1.jpg 
		// \이름\ 역슬래쉬를 넣으면 안에서 띄어쓰기를 해도 상관없이 이름으로 인식한다.*/
		
		String mimeType = request.getServletContext().getMimeType(fileName); 
		response.setContentType(mimeType);
		
		OutputStream os = response.getOutputStream();
		String filePath = request.getServletContext().getRealPath("/WEB-INF/photo/" + fileName); //실제파일의 경로 RealPath
		InputStream is = new FileInputStream(filePath);
		
		byte[] values = new byte[1024];
		int byteNum = -1;
		while((byteNum = is.read(values)) != -1 ) {
			os.write(values, 0, byteNum);
			
		}
		os.flush();
		is.close();
		os.close();
	} catch(Exception e) {
		e.printStackTrace();
	}
}
	@RequestMapping("/info")
	public String info(int bno, Model model) {
		PhotoBoard photoBoard = photoBoardService.info(bno);
		photoBoard.setBhitcount(photoBoard.getBhitcount() + 1);
		photoBoardService.modify(photoBoard);
		model.addAttribute("photoBoard", photoBoard);
		return "photoboard/info";
	}
}




