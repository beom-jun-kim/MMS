package com.merakl.mmm.vo;

import java.util.Date;

// 회원사직원(매니저, 슈퍼바이저라 생각하면 됨)
public class MemberEmployeeVO extends UserVO {
	private int seqNo;
	private int memberSeq;
	private String position;

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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
