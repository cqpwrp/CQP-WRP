package com.honda.am.cqp.dto;

public class CallInDto {

	private int callinPartSk;
	private String suppNo;
	private String suppName;
	private String statusName;

	public CallInDto() {
		// TODO Auto-generated constructor stub
	}

	public int getCallinPartSk() {
		return callinPartSk;
	}

	public void setCallinPartSk(int callinPartSk) {
		this.callinPartSk = callinPartSk;
	}

	public String getSuppNo() {
		return suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

	public String getSuppName() {
		return suppName;
	}

	public void setSuppName(String suppName) {
		this.suppName = suppName;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	@Override
	public String toString() {
		return "CallInDto [callinPartSk=" + callinPartSk + ", suppNo=" + suppNo + ", suppName=" + suppName
				+ ", statusName=" + statusName + "]";
	}

}
