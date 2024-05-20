package com.merakl.mmm.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.merakl.mmm.service.ApplicationService;
import com.merakl.mmm.service.ConsultFieldService;
import com.merakl.mmm.service.ConsultWayService;
import com.merakl.mmm.service.CustomerService;
import com.merakl.mmm.service.MenteeService;
import com.merakl.mmm.service.ProjectService;
import com.merakl.mmm.vo.AnswerVO;
import com.merakl.mmm.vo.ConsultFieldVO;
import com.merakl.mmm.vo.ConsultWayVO;
import com.merakl.mmm.vo.CustomerVO;
import com.merakl.mmm.vo.MemberCompanyVO;
import com.merakl.mmm.vo.MenteeVO;
import com.merakl.mmm.vo.ProjectVO;
import com.merakl.mmm.vo.ResultVO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/guest")
public class GuestController {
	
	@Autowired
	private ConsultWayService consultWayService;
	
	@Autowired
	private ConsultFieldService consultFieldService;
	
	@Autowired
	private ApplicationService applicationService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private MenteeService menteeService;
	
	@Autowired
	private DiagnosisService diagnosisService;
	
	@RequestMapping(value = "/wayView")
	public ModelAndView wayView(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		MemberCompanyVO memberCompanyVO = (MemberCompanyVO) session.getAttribute("memberCompany");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("consultingApplication/wayView");
		modelAndView.addObject("consultWayList", consultWayService.consultWayList(memberCompanyVO.getSeqNo()));
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/fieldView")
	public ModelAndView fieldView(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response, ConsultWayVO consultWayVO, ConsultFieldVO consultFieldVO) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("consultingApplication/fieldView");
		if(consultWayVO.getProgramYn().equalsIgnoreCase("N")) {
			modelAndView.addObject("fieldList", consultFieldService.consultFieldList(consultFieldVO.getWaySeq()));
		} else {
			// 컨설팅 프로그램은 분야없음.
			modelAndView.addObject("fieldList", new ArrayList<ConsultFieldVO>());
		}
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/applyStep")
	public ModelAndView guide(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response, ProjectVO projectVO) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		MemberCompanyVO memberCompanyVO = (MemberCompanyVO) session.getAttribute("memberCompany");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("consultingApplication/applyStep");
		modelAndView.addObject("stepList", applicationService.applicationStepList(memberCompanyVO.getSeqNo()));
		
		// 방법, 분야가 선택된 상태
		modelAndView.addObject("projectVO", projectVO);
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/agreement")
	public ModelAndView agreement(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response, ProjectVO projectVO) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		MemberCompanyVO memberCompanyVO = (MemberCompanyVO) session.getAttribute("memberCompany");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("consultingApplication/agreement");
		
		// 방법, 분야가 선택된 상태
		modelAndView.addObject("projectVO", projectVO);
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/customerView")
	public ModelAndView customerView(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response, ProjectVO projectVO) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("customer/customerView");
		modelAndView.addObject("projectVO", projectVO);
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/addProject", produces = "application/json;charset=UTF-8")
	public @ResponseBody String addProject(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response, ProjectVO projectVO, CustomerVO customerVO) {
		// 1. 고객사정보 저장
		projectVO.setCustomerSeq(customerService.insertCustomer(customerVO));
		
		// 2. 프로젝트 저장
		projectVO.setStatus("REQ");
		int projectSeq = projectService.insertProject(projectVO);
		projectVO.setSeqNo(projectSeq);
		
		// 3. 멘티정보 저장
		MenteeVO menteeVO = menteeService.upsertMentee(customerVO); 
		
		// 4. 프로젝트 - 멘티 맵 저장
		menteeVO.setProjectSeq(projectSeq);
		menteeService.addProject(menteeVO);
		
		return new Gson().toJson(new ResultVO("O", null, menteeVO));
	}
	
	@RequestMapping(value = "/diagnosis")
	public ModelAndView diagnosis(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response, MenteeVO menteeVO) {
		// 뒤로가기 할때 새로고침 설정
		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
		response.setHeader("Pragma", "no-cache");
		
		MemberCompanyVO memberCompanyVO = (MemberCompanyVO) session.getAttribute("memberCompany");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("consultingApplication/diagnosis");
		modelAndView.addObject("menteeVO", menteeVO);
		modelAndView.addObject("questionList", diagnosisService.questionList(memberCompanyVO.getSeqNo()));
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/answer", produces = "application/json;charset=UTF-8")
	public @ResponseBody String answer(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response, @RequestParam("answerAry") String answerAry, MenteeVO menteeVO) {
		
		List<AnswerVO> answerList = new Gson().fromJson(answerAry, new TypeToken<List<AnswerVO>>(){}.getType());
		diagnosisService.insertAllAnswers(answerList);
		
		return new Gson().toJson(new ResultVO("O", null, menteeVO));
	}
}
