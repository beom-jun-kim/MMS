package com.merakl.mmm.service;


import com.merakl.mmm.vo.UserVO;

import jakarta.servlet.http.HttpSession;

public interface LoginService {
	public String checkAccount(HttpSession session, UserVO userVO);
}
