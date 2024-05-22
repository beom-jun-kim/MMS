package com.merakl.mmm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.merakl.mmm.service.LoginService;
import com.merakl.mmm.service.MemberCompanyService;
import com.merakl.mmm.vo.MemberCompanyVO;
import com.merakl.mmm.vo.UserVO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@RestController
@RequestMapping(value = "/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService; 
	
	@Autowired
	private MemberCompanyService memberCompanyService;

	@RequestMapping(value = "/home")
	public ModelAndView loginView(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response, MemberCompanyVO paramVO) {
		
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		// 링크 타고온 회원사 정보 세션에 저장
		MemberCompanyVO memberCompanyVO = memberCompanyService.memberCompany(paramVO);
		session.setAttribute("memberCompany", memberCompanyVO);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("memberCompanyVO", memberCompanyVO);
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/managerLoginView")
	public ModelAndView managerLoginView(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		UserVO userVO = new UserVO();
		userVO.setUserType(2); // 매니저 로그인
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("loginView");
		modelAndView.addObject("userVO", userVO);
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/loginView")
	public ModelAndView loginView(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response, UserVO userVO) {
		
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("loginView");
		modelAndView.addObject("userVO", userVO);
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/checkAccount", produces = "application/json;charset=UTF-8")
	public @ResponseBody String checkAccount(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response, UserVO userVO) {
		
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		return loginService.checkAccount(session, userVO);
	}
	
}
