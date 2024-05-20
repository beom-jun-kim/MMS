package com.merakl.mmm.mapper;

import java.util.List;

import com.merakl.mmm.vo.DiagnosisVO;

public interface DiagnosisMapper {

	public List<DiagnosisVO> questionList(int memberSeq);

}
