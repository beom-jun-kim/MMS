package com.merakl.mmm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/manager")
public class ManagerController {

	@RequestMapping(value = "/profileView")
	public ModelAndView profileView(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/manager/profileView");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/updateProfile", produces = "application/json;charset=UTF-8")
	public @ResponseBody String insupdateProfileertWay(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		return null;
	}
	
}
