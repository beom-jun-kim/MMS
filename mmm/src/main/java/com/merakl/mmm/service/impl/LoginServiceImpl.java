package com.merakl.mmm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.merakl.mmm.mapper.MemberEmplyeeMapper;
import com.merakl.mmm.mapper.MenteeMapper;
import com.merakl.mmm.mapper.MentorMapper;
import com.merakl.mmm.service.LoginService;
import com.merakl.mmm.vo.ResultVO;
import com.merakl.mmm.vo.UserVO;

import jakarta.servlet.http.HttpSession;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private MentorMapper mentorMapper;
	
	@Autowired
	private MenteeMapper menteeMapper;
	
	@Autowired
	private MemberEmplyeeMapper memberEmployeeMapper;
	
	@Override
	public String checkAccount(HttpSession session, UserVO paramVO) {
		// TODO Auto-generated method stub
		// 1: 관리자(메라클직원), 2: 매니저(회원사직원), 3: 멘토, 4: 멘티
		ResultVO resultVO = new ResultVO("X", "존재하지 않는 계정입니다!!");
		UserVO userVO = null;
		switch(paramVO.getUserType()) {
			case 1:
				
				break;
			case 2:
				userVO = memberEmployeeMapper.checkAccount(paramVO);
				break;
			case 3:
				userVO = mentorMapper.checkAccount(paramVO);
				break;
			case 4:
				userVO = menteeMapper.checkAccount(paramVO);
				break;
			default:
				break;
		}
		if(userVO != null) {
			resultVO = new ResultVO("O", null);
			session.setAttribute("user", userVO);
		}
		
		
		return new Gson().toJson(resultVO);
	}

}
