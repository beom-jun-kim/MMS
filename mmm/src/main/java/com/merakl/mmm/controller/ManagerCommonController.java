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
@RequestMapping(value = "/manager/common")
public class ManagerCommonController {

	@RequestMapping(value = "/wayView")
	public ModelAndView wayView(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/manager/common/wayView");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/insertWayView")
	public ModelAndView insertWayView(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/manager/common/wayView");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/insertWay", produces = "application/json;charset=UTF-8")
	public @ResponseBody String insertWay(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		return null;
	}
	
	@RequestMapping(value = "/diagnosisView")
	public ModelAndView diagnosisView(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/manager/common/diagnosisView");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/insertDiagnosisView")
	public ModelAndView insertDiagnosisView(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/manager/common/insertDiagnosisView");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/insertDiagnosis", produces = "application/json;charset=UTF-8")
	public @ResponseBody String insertDiagnosis(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		return null;
	}
	
	@RequestMapping(value = "/agreementView")
	public ModelAndView agreementView(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/manager/common/agreementView");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/insertAgreement", produces = "application/json;charset=UTF-8")
	public @ResponseBody String insertAgreement(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		return null;
	}
	
	@RequestMapping(value = "/stepView")
	public ModelAndView stepView(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/manager/common/stepView");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/insertStep", produces = "application/json;charset=UTF-8")
	public @ResponseBody String insertStep(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		return null;
	}
	
	
}
