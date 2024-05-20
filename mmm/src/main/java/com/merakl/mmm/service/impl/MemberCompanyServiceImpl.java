package com.merakl.mmm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merakl.mmm.mapper.MemberCompanyMapper;
import com.merakl.mmm.service.MemberCompanyService;
import com.merakl.mmm.vo.MemberCompanyVO;

@Service
public class MemberCompanyServiceImpl implements MemberCompanyService {
	
	@Autowired
	private MemberCompanyMapper memberCompanyMapper;

	@Override
	public MemberCompanyVO memberCompany(MemberCompanyVO memberCompanyVO) {
		// TODO Auto-generated method stub
		return memberCompanyMapper.memberCompany(memberCompanyVO);
	}
	
	

}
