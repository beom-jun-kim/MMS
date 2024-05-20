package com.merakl.mmm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.merakl.mmm.vo.CustomerVO;
import com.merakl.mmm.vo.MenteeVO;
import com.merakl.mmm.vo.UserVO;

@Mapper
public interface MenteeMapper {

	public int menteeSequence();
	public List<MenteeVO> menteeList(MenteeVO menteeVO);
	public MenteeVO mentee(MenteeVO menteeVO);
	public void insertMentee(MenteeVO menteeVO);
	public void updateMentee(MenteeVO menteeVO);
	public void deleteMentee(MenteeVO menteeVO);
	public MenteeVO checkAccount(UserVO paramVO);
	public void initPassword(UserVO paramVO);
	public void upsertMentee(MenteeVO menteeVO);
	public void addProject(MenteeVO menteeVO);

}
