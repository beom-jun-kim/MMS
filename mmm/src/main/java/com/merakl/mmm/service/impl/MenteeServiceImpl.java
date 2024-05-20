package com.merakl.mmm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merakl.mmm.mapper.MenteeMapper;
import com.merakl.mmm.service.MenteeService;
import com.merakl.mmm.vo.CustomerVO;
import com.merakl.mmm.vo.MenteeVO;

@Service
public class MenteeServiceImpl implements MenteeService {

	@Autowired
	private MenteeMapper menteeMapper;

	@Override
	public MenteeVO upsertMentee(CustomerVO customerVO) {
		// TODO Auto-generated method stub
		// 고객사 대표를 멘티로 저장
		MenteeVO menteeVO = new MenteeVO();
		menteeVO.setMail1(customerVO.getOwnerMail1());
		menteeVO.setMail2(customerVO.getOwnerMail2());
		menteeVO.setName(customerVO.getOwnerName());
		menteeVO.setPassword(customerVO.getPassword());

		// 멘티정보가 있으면 이름이랑 패스워드만 업데이트
		// 멘티정보가 없으면 인서트
		menteeMapper.upsertMentee(menteeVO);
		
		return menteeVO;
	}

	@Override
	public void addProject(MenteeVO menteeVO) {
		// TODO Auto-generated method stub
		menteeMapper.addProject(menteeVO);
	}
	
	
	
}
