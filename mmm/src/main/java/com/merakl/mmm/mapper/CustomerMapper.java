package com.merakl.mmm.mapper;

import java.util.List;

import com.merakl.mmm.vo.CustomerVO;

public interface CustomerMapper {

	public int customerSequence();
	public List<CustomerVO> customerList(int memberSeq);
	public CustomerVO customer(CustomerVO customerVO);
	public void insertCustomer(CustomerVO customerVO);
	public void updateCustomer(CustomerVO customerVO);
	public void deleteCustomer(CustomerVO customerVO);
}
