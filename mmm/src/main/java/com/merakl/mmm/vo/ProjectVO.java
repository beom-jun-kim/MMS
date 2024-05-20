package com.merakl.mmm.vo;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

// 프로젝트(모든게 프로젝트 단위로 움직임.)
public class ProjectVO {
	private int seqNo;
	private int waySeq; // 방법
	private int fieldSeq; // 분야
	private String programYn; // 컨설팅 프로그램(분야 여러개 합쳐진거)
	private int customerSeq; // 고객
	private String status; // REQ : 요청, ING: 진행중, CMP: 완료
	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endDate;
	private String customerAbout;
	private String projectGoal;
	private String projectRange;
	private String planAbout;
	private String kpiTitle;
	private String kpiAbout;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createDate;
	private int updateUser;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updateDate;
	private String deleteYn;
	private int deleteUser;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date deleteDate;
	private List<KpiVO> kpiList;

	public int getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

	public int getWaySeq() {
		return waySeq;
	}

	public void setWaySeq(int waySeq) {
		this.waySeq = waySeq;
	}

	public int getFieldSeq() {
		return fieldSeq;
	}

	public void setFieldSeq(int fieldSeq) {
		this.fieldSeq = fieldSeq;
	}

	public String getProgramYn() {
		return programYn;
	}

	public void setProgramYn(String programYn) {
		this.programYn = programYn;
	}

	public int getCustomerSeq() {
		return customerSeq;
	}

	public void setCustomerSeq(int customerSeq) {
		this.customerSeq = customerSeq;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCustomerAbout() {
		return customerAbout;
	}

	public void setCustomerAbout(String customerAbout) {
		this.customerAbout = customerAbout;
	}

	public String getProjectGoal() {
		return projectGoal;
	}

	public void setProjectGoal(String projectGoal) {
		this.projectGoal = projectGoal;
	}

	public String getProjectRange() {
		return projectRange;
	}

	public void setProjectRange(String projectRange) {
		this.projectRange = projectRange;
	}

	public String getPlanAbout() {
		return planAbout;
	}

	public void setPlanAbout(String planAbout) {
		this.planAbout = planAbout;
	}

	public String getKpiTitle() {
		return kpiTitle;
	}

	public void setKpiTitle(String kpiTitle) {
		this.kpiTitle = kpiTitle;
	}

	public String getKpiAbout() {
		return kpiAbout;
	}

	public void setKpiAbout(String kpiAbout) {
		this.kpiAbout = kpiAbout;
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

	public List<KpiVO> getKpiList() {
		return kpiList;
	}

	public void setKpiList(List<KpiVO> kpiList) {
		this.kpiList = kpiList;
	}

}
