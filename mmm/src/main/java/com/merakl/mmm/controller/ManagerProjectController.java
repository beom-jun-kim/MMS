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
@RequestMapping(value = "/manager/project")
public class ManagerProjectController {

	@RequestMapping(value = "/view")
	public ModelAndView view(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/manager/project/view");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/list")
	public ModelAndView list(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/manager/project/list");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/signView")
	public ModelAndView signView(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/manager/project/signView");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/sign", produces = "application/json;charset=UTF-8")
	public @ResponseBody String sign(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		return null;
	}
	
	@RequestMapping(value = "/insertView")
	public ModelAndView insertView(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/manager/project/signView");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/insertProject", produces = "application/json;charset=UTF-8")
	public @ResponseBody String insertProject(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		return null;
	}
	
	@RequestMapping(value = "/menteeView")
	public ModelAndView menteeView(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/manager/project/menteeView");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/menteeList")
	public ModelAndView menteeList(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/manager/project/menteeList");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/insertMentee", produces = "application/json;charset=UTF-8")
	public @ResponseBody String insertMentee(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		return null;
	}
	
	@RequestMapping(value = "/mentorView")
	public ModelAndView mentorView(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/manager/project/mentorView");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/mentementorListeList")
	public ModelAndView mentorList(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/manager/project/mentorList");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/insertMentor", produces = "application/json;charset=UTF-8")
	public @ResponseBody String insertMentor(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		return null;
	}
}
