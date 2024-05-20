package com.merakl.mmm.mapper;

import java.util.List;

import com.merakl.mmm.vo.ConsultFieldVO;
import com.merakl.mmm.vo.ConsultWayVO;

public interface ConsultFieldMapper {

	public List<ConsultFieldVO> consultFieldList(int waySeq);
	public ConsultFieldVO consultField(ConsultFieldVO consultFieldVO);
	public void insertConsultField(ConsultFieldVO consultFieldVO);
	public void updateConsultField(ConsultFieldVO consultFieldVO);
	public void deleteConsultField(ConsultFieldVO consultFieldVO);

}
