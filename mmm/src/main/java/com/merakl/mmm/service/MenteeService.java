package com.merakl.mmm.service;

import com.merakl.mmm.vo.CustomerVO;
import com.merakl.mmm.vo.MenteeVO;

public interface MenteeService {
	public MenteeVO upsertMentee(CustomerVO customerVO);
	public void addProject(MenteeVO menteeVO);

}
