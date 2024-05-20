package com.merakl.mmm.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ProjectProgramVO {
	private int projectSeq;
	private int fieldSeq;
	private int consultCount;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createDate;
	private int updateUser;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updateDate;
	private String deleteYn;
	private int deleteUser;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date deleteDate;

	public int getProjectSeq() {
		return projectSeq;
	}

	public void setProjectSeq(int projectSeq) {
		this.projectSeq = projectSeq;
	}

	public int getFieldSeq() {
		return fieldSeq;
	}

	public void setFieldSeq(int fieldSeq) {
		this.fieldSeq = fieldSeq;
	}

	public int getConsultCount() {
		return consultCount;
	}

	public void setConsultCount(int consultCount) {
		this.consultCount = consultCount;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(int updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getDeleteYn() {
		return deleteYn;
	}

	public void setDeleteYn(String deleteYn) {
		this.deleteYn = deleteYn;
	}

	public int getDeleteUser() {
		return deleteUser;
	}

	public void setDeleteUser(int deleteUser) {
		this.deleteUser = deleteUser;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

}
