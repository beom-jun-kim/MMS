package com.merakl.mmm.vo;

import java.util.Date;

// 프로젝트 총평
public class ProjectResultVO {
	private int menteeSeq;
	private String projectReason;
	private String projectTask;
	private String projectDiscussion;
	private String projectResult;
	private String projectAfter;
	private String projectEffect;
	private Date createDate;
	private int updateUser;
	private Date updateDate;
	private String deleteYn;
	private int deleteUser;
	private Date deleteDate;

	public int getMenteeSeq() {
		return menteeSeq;
	}

	public void setMenteeSeq(int menteeSeq) {
		this.menteeSeq = menteeSeq;
	}

	public String getProjectReason() {
		return projectReason;
	}

	public void setProjectReason(String projectReason) {
		this.projectReason = projectReason;
	}

	public String getProjectTask() {
		return projectTask;
	}

	public void setProjectTask(String projectTask) {
		this.projectTask = projectTask;
	}

	public String getProjectDiscussion() {
		return projectDiscussion;
	}

	public void setProjectDiscussion(String projectDiscussion) {
		this.projectDiscussion = projectDiscussion;
	}

	public String getProjectResult() {
		return projectResult;
	}

	public void setProjectResult(String projectResult) {
		this.projectResult = projectResult;
	}

	public String getProjectAfter() {
		return projectAfter;
	}

	public void setProjectAfter(String projectAfter) {
		this.projectAfter = projectAfter;
	}

	public String getProjectEffect() {
		return projectEffect;
	}

	public void setProjectEffect(String projectEffect) {
		this.projectEffect = projectEffect;
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
