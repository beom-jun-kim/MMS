package com.merakl.mmm.vo;

import java.util.Date;
import java.util.List;

// 멘토
public class MentorVO extends UserVO {
	private List<ConsultFieldVO> fieldList;

	public List<ConsultFieldVO> getFieldList() {
		return fieldList;
	}

	public void setFieldList(List<ConsultFieldVO> fieldList) {
		this.fieldList = fieldList;
	}

}
