package com.merakl.mmm.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestParam;

// 회원사의 고객
public class CustomerVO {
	private int seqNo;
	private int memberSeq;
	private String businessItems;
	private String businessType;
	private String name;
	private String businessNo;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	private String phone;
	private String fax;
	private String address1;
	private String address2;
	private String zipCode;
	private String ownerName;
	private String ownerId;
	private String ownerBirthDate;
	private String ownerPhone;
	private String ownerMail1;
	private String ownerMail2;
	private String password;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createDate;
	private int updateUser;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updateDate;
	private String deleteYn;
	private int deleteUser;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date deleteDate;

	public int getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

	public int getMemberSeq() {
		return memberSeq;
	}

	public void setMemberSeq(int memberSeq) {
		this.memberSeq = memberSeq;
	}

	public String getBusinessItems() {
		return businessItems;
	}

	public void setBusinessItems(String businessItems) {
		this.businessItems = businessItems;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
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

	public void setAddress2(String addrsess2) {
		this.address2 = addrsess2;
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

	public String getOwnerBirthDate() {
		return ownerBirthDate;
	}

	public void setOwnerBirthDate(String ownerBirthDate) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
