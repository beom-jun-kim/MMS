package com.merakl.mmm.service;

import java.util.List;

import com.merakl.mmm.vo.ApplicationStepVO;

public interface ApplicationService {

	public List<ApplicationStepVO> applicationStepList(int memberSeqNo);

}
