package com.merakl.mmm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.merakl.mmm.vo.MemberEmployeeVO;
import com.merakl.mmm.vo.UserVO;

@Mapper
public interface MemberEmplyeeMapper {
	public int employeeSequence();
	public List<MemberEmployeeVO> employeeList(MemberEmployeeVO employeeVO);
	public MemberEmployeeVO employee(MemberEmployeeVO employeeVO);
	public void insertEmployee(MemberEmployeeVO employeeVO);
	public void updateEmployee(MemberEmployeeVO employeeVO);
	public void deleteEmployee(MemberEmployeeVO employeeVO);
	public MemberEmployeeVO checkAccount(UserVO paramVO);
	public void initPassword(UserVO paramVO);
}
