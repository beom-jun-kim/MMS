package com.merakl.mmm.mapper;

import java.util.List;

import com.merakl.mmm.vo.ConsultWayVO;

public interface ConsultWayMapper {

	public List<ConsultWayVO> consultWayList(int memberSeq);
	public ConsultWayVO consultWay(ConsultWayVO consultWayVO);
	public void insertConsultWay(ConsultWayVO consultWayVO);
	public void updateConsultWay(ConsultWayVO consultWayVO);
	public void deleteConsultWay(ConsultWayVO consultWayVO);

}
