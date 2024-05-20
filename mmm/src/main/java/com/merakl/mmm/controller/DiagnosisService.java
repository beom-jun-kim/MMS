package com.merakl.mmm.controller;

import java.util.List;

import com.merakl.mmm.vo.AnswerVO;
import com.merakl.mmm.vo.DiagnosisVO;

public interface DiagnosisService {
	public List<DiagnosisVO> questionList(int memberSeq);
	public void insertAllAnswers(List<AnswerVO> answerList);

}
