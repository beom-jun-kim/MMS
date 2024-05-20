package com.merakl.mmm.vo;

import java.util.Date;

// 수행결과
public class PerformResultVO {
	private int performSeq;
	private String performTitle;
	private String performContent;
	private String etcContent;
	private String performPhoto1;
	private String performPhoto2;
	private String etcFile;
	private String pmMent;
	private Date createDate;
	private int updateUser;
	private Date updateDate;
	private String deleteYn;
	private int deleteUser;
	private Date deleteDate;

	public int getPerformSeq() {
		return performSeq;
	}

	public void setPerformSeq(int performSeq) {
		this.performSeq = performSeq;
	}

	public String getPerformTitle() {
		return performTitle;
	}

	public void setPerformTitle(String performTitle) {
		this.performTitle = performTitle;
	}

	public String getPerformContent() {
		return performContent;
	}

	public void setPerformContent(String performContent) {
		this.performContent = performContent;
	}

	public String getEtcContent() {
		return etcContent;
	}

	public void setEtcContent(String etcContent) {
		this.etcContent = etcContent;
	}

	public String getPerformPhoto1() {
		return performPhoto1;
	}

	public void setPerformPhoto1(String performPhoto1) {
		this.performPhoto1 = performPhoto1;
	}

	public String getPerformPhoto2() {
		return performPhoto2;
	}

	public void setPerformPhoto2(String performPhoto2) {
		this.performPhoto2 = performPhoto2;
	}

	public String getEtcFile() {
		return etcFile;
	}

	public void setEtcFile(String etcFile) {
		this.etcFile = etcFile;
	}

	public String getPmMent() {
		return pmMent;
	}

	public void setPmMent(String pmMent) {
		this.pmMent = pmMent;
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
