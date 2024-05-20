package com.merakl.mmm.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		String requestURI = request.getRequestURI();
		System.out.println("[interceptor] requestURI : " + requestURI);
		
		HttpSession session = request.getSession(false);
		
		if(session == null || session.getAttribute("member") == null) {
			System.out.println("[미인증 사용자 요청]");
			
			//로그인으로 redirect
			response.sendRedirect("/mmm/login/home?seqNo=0");
			return false;
		}
		
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
}
