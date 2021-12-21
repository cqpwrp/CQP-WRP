package com.honda.am.cqp.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the tblMESSAGE_CENTER database table.
 * 
 */
@Entity
@Table(name = "tblMESSAGE_CENTER")
@NamedQuery(name = "TblMESSAGE_CENTER.findAll", query = "SELECT t FROM TblMESSAGE_CENTER t")
public class TblMESSAGE_CENTER implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "MESSAGE_ID")
	private int messageId;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATED_TS")
	private Timestamp createdTs;

	@Column(name = "EXPIRY_DATE")
	private Timestamp expiryDate;

	@Column(name = "[MESSAGE]")
	private String message;

	@Column(name = "SUPP_NO")
	private String suppNo;

	@Column(name = "USER_TYPE")
	private char userType;

	public TblMESSAGE_CENTER() {
	}

	public int getMessageId() {
		return this.messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedTs() {
		return this.createdTs;
	}

	public void setCreatedTs(Timestamp createdTs) {
		this.createdTs = createdTs;
	}

	public Timestamp getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Timestamp expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

	public char getUserType() {
		return this.userType;
	}

	public void setUserType(char userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "TblMESSAGE_CENTER [messageId=" + messageId + ", createdBy=" + createdBy + ", createdTs=" + createdTs
				+ ", expiryDate=" + expiryDate + ", message=" + message + ", suppNo=" + suppNo + ", userType="
				+ userType + "]";
	}
}