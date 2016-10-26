package com.mycompany.myweb.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myweb.dao.MemberDao;
import com.mycompany.myweb.dto.Member;

@Component
public class MemberService {
	public static final int JOIN_SUCCESS = 0;
	public static final int JOIN_FAIL =1;
	
	public static final int LOGIN_SUCCESS = 0; //상수를 적용하려면 3가지 이상의 경우의 수가 생길때 사용한다.
	public static final int LOGIN_FAIL_MID = 1; 
	public static final int LOGIN_FAIL_MPASSWORD = 2;
	
	public static final int LOGOUT_SUCCESS = 0;
	public static final int LOGOUT_FAIL_MID = 1;
	
	public static final int WITHDAW_SUCCESS = 0;
	public static final int WITHDRAW_FAIL = 1;
	
	@Autowired
	private MemberDao memberDao;
	
	public int join(Member member) {	 //성공&실패 2가지만 있는 경우 void타입으로 리턴이 필요치 않다.(성공하거나 예외가 발생하거나)
		memberDao.insert(member);
		return JOIN_SUCCESS;
	}
	
	public int login(String mid, String mpassword, HttpSession session) {
		Member member = memberDao.selectByMid(mid);
		if(member == null) {return LOGIN_FAIL_MID;}
		if(member.getMpassword().equals(mpassword)==false) {return LOGIN_FAIL_MPASSWORD;}
		return LOGIN_SUCCESS;
	} //정보를 가져와야 하기에 타입은 Int--
		
	public int logout(HttpSession session) {
		session.removeAttribute("login");
		return LOGOUT_SUCCESS;
	}//로그아웃 정보를 세션에 저장한다
	
	public String findMpassword(String mid, String memail) {
		Member member = memberDao.selectByMid(mid);
		if(member == null) return null;
		if(member.getMemail().equals(memail)==false) return null;
		return member.getMpassword();
	} //정보를 가져와야 하기에 타입은 String--
	
	public String findMid(String memail) {
		return memberDao.selectByMemail(memail);
	}//정보를 가져와야 하기에 타입은 String--
	
	
	public Member info(String mpassword, HttpSession session) {
		String mid = (String) session.getAttribute("login");
		Member member = memberDao.selectByMid(mid);
		if(member.getMpassword().equals(mpassword) == false) {return null;}
		return member;
	}//정보를 가져와야 하기에 타입은 Member--
	
	
	public void modify(Member member) {
		
	}
	
	
	public int withdraw(String mpassword, HttpSession session) {
		String mid = (String)session.getAttribute("login");
		Member member = memberDao.selectByMid(mid);
		if(member.getMpassword().equals(mpassword) == false) {return WITHDRAW_FAIL;}
			logout(session);
			memberDao.delete(mid);
			return WITHDAW_SUCCESS;
	}//정보를 가져와야 하기에 타입은 int--
	
	
	public boolean isMid(String mid) {} //boolean타입을 쓰는 곳에서는 보통is를 쓴다.

}
