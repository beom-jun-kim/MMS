package com.merakl.mmm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.merakl.mmm.vo.MentorVO;
import com.merakl.mmm.vo.UserVO;

@Mapper
public interface MentorMapper {

	public int mentorSequence();
	public List<MentorVO> mentorList(MentorVO mentorVO);
	public MentorVO mentor(MentorVO mentorVO);
	public void insertMentor(MentorVO mentorVO);
	public void updateMentor(MentorVO mentorVO);
	public void deleteMentor(MentorVO mentorVO);
	public MentorVO checkAccount(UserVO paramVO);
	public void initPassword(UserVO paramVO);

}
