package com.merakl.mmm.mapper;

import java.util.HashMap;
import java.util.List;

import com.merakl.mmm.vo.AnswerVO;

public interface AnswerMapper {

	public void insertAllAnswers(HashMap<String, List<AnswerVO>> map);

}
