package com.merakl.mmm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merakl.mmm.mapper.ConsultWayMapper;
import com.merakl.mmm.service.ConsultWayService;
import com.merakl.mmm.vo.ConsultWayVO;

@Service
public class ConsultWayServiceImpl implements ConsultWayService {

	@Autowired
	private ConsultWayMapper consultWayMapper;

	@Override
	public List<ConsultWayVO> consultWayList(int memberSeq) {
		// TODO Auto-generated method stub
		return consultWayMapper.consultWayList(memberSeq);
	}
	
	
}
