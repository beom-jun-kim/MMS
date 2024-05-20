package com.merakl.mmm.vo;

import java.util.Date;
import java.util.List;

// 회원사(메라클의 고객)
public class MemberCompanyVO {
	private int seqNo;
	private String name;
	private String businessNo;
	private String address1;
	private String address2;
	private String zipCode;
	private String ownerName;
	private String ownerId;
	private Date ownerBirthDate;
	private String ownerPhone;
	private String ownerMail1;
	private String ownerMail2;
	private Date createDate;
	private int updateUser;
	private Date updateDate;
	private String deleteYn;
	private int deleteUser;
	private Date deleteDate;
	
	private List<MemberEmployeeVO> employeeList;
	private List<CustomerVO> customerList;
	
	public int getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBusinessNo() {
		return businessNo;
	}

	public void setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public Date getOwnerBirthDate() {
		return ownerBirthDate;
	}

	public void setOwnerBirthDate(Date ownerBirthDate) {
		this.ownerBirthDate = ownerBirthDate;
	}

	public String getOwnerPhone() {
		return ownerPhone;
	}

	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}

	public String getOwnerMail1() {
		return ownerMail1;
	}

	public void setOwnerMail1(String ownerMail1) {
		this.ownerMail1 = ownerMail1;
	}

	public String getOwnerMail2() {
		return ownerMail2;
	}

	public void setOwnerMail2(String ownerMail2) {
		this.ownerMail2 = ownerMail2;
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

	public List<MemberEmployeeVO> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<MemberEmployeeVO> employeeList) {
		this.employeeList = employeeList;
	}

	public List<CustomerVO> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<CustomerVO> customerList) {
		this.customerList = customerList;
	}
	
}
