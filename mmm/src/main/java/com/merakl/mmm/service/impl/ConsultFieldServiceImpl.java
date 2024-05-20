package com.merakl.mmm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merakl.mmm.mapper.ConsultFieldMapper;
import com.merakl.mmm.service.ConsultFieldService;
import com.merakl.mmm.vo.ConsultFieldVO;

@Service
public class ConsultFieldServiceImpl implements ConsultFieldService {

	@Autowired
	private ConsultFieldMapper consultFieldMapper;

	@Override
	public List<ConsultFieldVO> consultFieldList(int waySeq) {
		// TODO Auto-generated method stub
		return consultFieldMapper.consultFieldList(waySeq);
	}
	
}
