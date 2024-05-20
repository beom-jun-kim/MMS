package com.merakl.mmm.vo;

public class ResultVO {
	private String status; // 성공여부
	private String message; // 엘럿창 메시지
	private Object data;
	
	public ResultVO() {
	}

	public ResultVO(String status, String message) {
		this.status = status;
		this.message = message;
	}
	
	public ResultVO(String status, String message, Object data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	

}
