package com.merakl.mmm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merakl.mmm.mapper.ApplicationStepMapper;
import com.merakl.mmm.service.ApplicationService;
import com.merakl.mmm.vo.ApplicationStepVO;

@Service
public class ApplicationServiceImpl implements ApplicationService {
	
	@Autowired
	private ApplicationStepMapper applicationMapper;

	@Override
	public List<ApplicationStepVO> applicationStepList(int memberSeqNo) {
		// TODO Auto-generated method stub
		return applicationMapper.applicationStepList(memberSeqNo);
	}
	
	
}
