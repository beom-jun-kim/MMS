package com.merakl.mmm.mapper;

import java.util.List;

import com.merakl.mmm.vo.MemberCompanyVO;

public interface MemberCompanyMapper {
	public int memberCompanySequence();
	public List<MemberCompanyVO> memberCompanyList(MemberCompanyVO memberCompanyVO);
	public MemberCompanyVO memberCompany(MemberCompanyVO memberCompanyVO);
	public void insertEmployee(MemberCompanyVO memberCompanyVO);
	public void updateEmployee(MemberCompanyVO memberCompanyVO);
	public void deleteEmployee(MemberCompanyVO memberCompanyVO);
}
