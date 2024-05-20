package com.merakl.mmm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merakl.mmm.mapper.CustomerMapper;
import com.merakl.mmm.service.CustomerService;
import com.merakl.mmm.vo.CustomerVO;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public int insertCustomer(CustomerVO customerVO) {
		// TODO Auto-generated method stub
		int customerSeq = customerMapper.customerSequence();
		customerVO.setSeqNo(customerSeq);
		customerMapper.insertCustomer(customerVO);
		return customerSeq;
	}

}
