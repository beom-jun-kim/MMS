package com.merakl.mmm.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merakl.mmm.controller.DiagnosisService;
import com.merakl.mmm.mapper.AnswerMapper;
import com.merakl.mmm.mapper.DiagnosisMapper;
import com.merakl.mmm.vo.AnswerVO;
import com.merakl.mmm.vo.DiagnosisVO;

@Service
public class DiagnosisServiceImpl implements DiagnosisService {

	@Autowired
	private DiagnosisMapper diagnosisMapper;
	
	@Autowired
	private AnswerMapper answerMapper;

	@Override
	public List<DiagnosisVO> questionList(int memberSeq) {
		// TODO Auto-generated method stub
		return diagnosisMapper.questionList(memberSeq);
	}

	@Override
	public void insertAllAnswers(List<AnswerVO> answerList) {
		// TODO Auto-generated method stub
		HashMap<String, List<AnswerVO>> map = new HashMap<String, List<AnswerVO>>();
		map.put("answerList", answerList);
		answerMapper.insertAllAnswers(map);
	}
	
	
	
}
