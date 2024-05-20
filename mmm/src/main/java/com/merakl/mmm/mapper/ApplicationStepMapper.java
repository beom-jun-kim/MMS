package com.merakl.mmm.mapper;

import java.util.List;

import com.merakl.mmm.vo.ApplicationStepVO;
import com.merakl.mmm.vo.ConsultFieldVO;

public interface ApplicationStepMapper {

	public List<ApplicationStepVO> applicationStepList(int memberSeqNo);
	public ApplicationStepVO applicationStep(ApplicationStepVO applicationStepVO);
	public void insertApplicationStep(ApplicationStepVO applicationStepVO);
	public void updateApplicationStep(ApplicationStepVO applicationStepVO);
	public void deleteApplicationStep(ApplicationStepVO applicationStepVO);
}
