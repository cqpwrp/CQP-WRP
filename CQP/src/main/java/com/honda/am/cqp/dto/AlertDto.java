package com.honda.am.cqp.dto;

public class AlertDto {

	String itemType;
	String suppNo;
	String status;
	String itemText;

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getSuppNo() {
		return suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getItemText() {
		return itemText;
	}

	public void setItemText(String itemText) {
		this.itemText = itemText;
	}

	@Override
	public String toString() {
		return "AlertDto [itemType=" + itemType + ", suppNo=" + suppNo + ", status=" + status + ", itemText=" + itemText
				+ "]";
	}

}
