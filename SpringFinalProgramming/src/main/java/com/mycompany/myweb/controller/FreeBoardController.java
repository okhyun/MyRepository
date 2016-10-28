package com.mycompany.myweb.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mycompany.myweb.dto.FreeBoard;
import com.mycompany.myweb.service.FreeBoardService;

@Controller
@RequestMapping("/freeboard")
public class FreeBoardController {
	@Autowired
	private FreeBoardService freeBoardService;
	
	@RequestMapping("/list")
	public String list(String pageNo, Model model, HttpSession session) { 
		System.out.println(pageNo);
		
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
	
		
		
		int rowsPerPage =10; //고정적으로 줘야하는값
		int pagesPerGroup = 5;
		
		int totalBoardNo = freeBoardService.getCount();
		
		int totalPageNo = (totalBoardNo/rowsPerPage) + ((totalBoardNo%rowsPerPage!=0)?1:0); //정수 나누기 정수는 정수기때문에 소수 아래를 생략한다. 그렇ㄷ게 되면 페이지 수가 달라진다. 해서 +해준다
		int totalGroupNo = (totalPageNo/pagesPerGroup) + ((totalPageNo%pagesPerGroup!=0)?1:0);
		
		int groupNo = (intPageNo-1)/pagesPerGroup +1; //현재 그룹의값
		int startPageNo = (groupNo-1)*pagesPerGroup + 1;
		int endPageNo = startPageNo + pagesPerGroup -1;
		if(groupNo == totalGroupNo) {endPageNo = totalPageNo;}
		
		List<FreeBoard> list = freeBoardService.list(intPageNo, rowsPerPage);
		
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
		
		
		return "freeboard/list";
		
	}
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write() {
		return "freeboard/write";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(FreeBoard freeBoard, HttpSession session) {
		String mid = (String) session.getAttribute("login");
		freeBoard.setBwriter(mid);
		int result = freeBoardService.write(freeBoard);
		if(result == FreeBoardService.WRITE_FAIL) {
			return "freeboard/write";
		} else {
			return "redirect:/freeboard/list";
		}
		
	}
	
	@RequestMapping("/info")
	public String info(int bno, Model model) {
		FreeBoard freeBoard = freeBoardService.info(bno);
		freeBoard.setBhitcount(freeBoard.getBhitcount() + 1);
		freeBoardService.modify(freeBoard);
		model.addAttribute("freeboard", freeBoard);
		return "freeboard/info";
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public String modifyForm(int bno, Model model) {
		FreeBoard freeBoard = freeBoardService.info(bno);
		model.addAttribute("freeboard", freeBoard);
		return "freeboard/modify";
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(FreeBoard freeBoard) {
		FreeBoard dbFreeBoard = freeBoardService.info(freeBoard.getBno());
		freeBoard.setBhitcount(dbFreeBoard.getBhitcount());
		freeBoardService.modify(freeBoard);
		return "redirect:/freeboard/list";
	}
	
	@RequestMapping("/remove") //삭제는 예외가 발생할 확률이 없다. 이유는? 글내용보기 상태에서(정보를 이미 받은 상태) 삭제하기 때문에
	public String remove(int bno) {
		freeBoardService.remove(bno);
		return "redirect:/freeboard/list";
	}
	
	

}





