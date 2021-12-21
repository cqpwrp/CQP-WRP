package com.honda.am.cqp.dto;

public class TPLDto {

	private int tplRefID;
	private String suppNo;
	private String SuppName;
	private String StatusName;

	public int getTplRefID() {
		return tplRefID;
	}

	public void setTplRefID(int tplRefID) {
		this.tplRefID = tplRefID;
	}

	public String getSuppNo() {
		return suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

	public String getSuppName() {
		return SuppName;
	}

	public void setSuppName(String suppName) {
		SuppName = suppName;
	}

	public String getStatusName() {
		return StatusName;
	}

	public void setStatusName(String statusName) {
		StatusName = statusName;
	}

	@Override
	public String toString() {
		return "TPLDto [tplRefID=" + tplRefID + ", suppNo=" + suppNo + ", SuppName=" + SuppName + ", StatusName="
				+ StatusName + "]";
	}

}
