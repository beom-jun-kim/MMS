package com.merakl.mmm.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class AnswerVO {
	private int diagnosisSeq;
	private int projectSeq;
	private String menteeMail1;
	private String menteeMail2;
	private int result;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createDate;
	private int updateUser;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updateDate;
	private String deleteYn;
	private int deleteUser;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date deleteDate;

	public int getDiagnosisSeq() {
		return diagnosisSeq;
	}

	public void setDiagnosisSeq(int diagnosisSeq) {
		this.diagnosisSeq = diagnosisSeq;
	}

	public int getProjectSeq() {
		return projectSeq;
	}

	public void setProjectSeq(int projectSeq) {
		this.projectSeq = projectSeq;
	}

	public String getMenteeMail1() {
		return menteeMail1;
	}

	public void setMenteeMail1(String menteeMail1) {
		this.menteeMail1 = menteeMail1;
	}

	public String getMenteeMail2() {
		return menteeMail2;
	}

	public void setMenteeMail2(String menteeMail2) {
		this.menteeMail2 = menteeMail2;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
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
