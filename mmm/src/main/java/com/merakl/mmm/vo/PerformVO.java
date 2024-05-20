package com.merakl.mmm.vo;

import java.util.Date;

// 컨설팅 수행
public class PerformVO {
	private int seqNo;
	private int menteeSeq;
	private int mentorSeq;
	private int orderNo;
	private String title;
	private String planDivision;
	private int planScore;
	private String planWay;
	private Date createDate;
	private int updateUser;
	private Date updateDate;
	private String deleteYn;
	private int deleteUser;
	private Date deleteDate;

	public int getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

	public int getMenteeSeq() {
		return menteeSeq;
	}

	public void setMenteeSeq(int menteeSeq) {
		this.menteeSeq = menteeSeq;
	}

	public int getMentorSeq() {
		return mentorSeq;
	}

	public void setMentorSeq(int mentorSeq) {
		this.mentorSeq = mentorSeq;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPlanDivision() {
		return planDivision;
	}

	public void setPlanDivision(String planDivision) {
		this.planDivision = planDivision;
	}

	public int getPlanScore() {
		return planScore;
	}

	public void setPlanScore(int planScore) {
		this.planScore = planScore;
	}

	public String getPlanWay() {
		return planWay;
	}

	public void setPlanWay(String planWay) {
		this.planWay = planWay;
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
