package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblTRANSFER_PART_LIST_EXTENSION_HIST database table.
 * 
 */
@Entity
@Table(name="tblTRANSFER_PART_LIST_EXTENSION_HIST")
@NamedQuery(name="TblTRANSFER_PART_LIST_EXTENSION_HIST.findAll", query="SELECT t FROM TblTRANSFER_PART_LIST_EXTENSION_HIST t")
public class TblTRANSFER_PART_LIST_EXTENSION_HIST implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TRANSFER_PART_LIST_ITEM_DETAIL_SK")
	private int transferPartListItemDetailSk;

	@Column(name="APPROVAL_EXTENSION_FLAG")
	private String approvalExtensionFlag;

	@Column(name="APPROVED_REJECTED_BY_NAME")
	private String approvedRejectedByName;

	@Column(name="APPROVED_REJECTED_DATE")
	private Timestamp approvedRejectedDate;

	@Column(name="EXTENSION_CREATE_DATE")
	private Timestamp extensionCreateDate;

	@Column(name="EXTENSION_REASON_TXT")
	private String extensionReasonTxt;

	@Column(name="EXTENSION_REPLY_TXT")
	private String extensionReplyTxt;

	@Column(name="EXTENSION_REQ_DUE_DATE")
	private Timestamp extensionReqDueDate;

	@Column(name="REQ_BY_NAME")
	private String reqByName;

	@Column(name="STATUS_ID")
	private int statusId;

	@Column(name="TRANSFER_PART_LIST_DETAIL_SK")
	private int transferPartListDetailSk;

	public TblTRANSFER_PART_LIST_EXTENSION_HIST() {
	}

	public int getTransferPartListItemDetailSk() {
		return this.transferPartListItemDetailSk;
	}

	public void setTransferPartListItemDetailSk(int transferPartListItemDetailSk) {
		this.transferPartListItemDetailSk = transferPartListItemDetailSk;
	}

	public String getApprovalExtensionFlag() {
		return this.approvalExtensionFlag;
	}

	public void setApprovalExtensionFlag(String approvalExtensionFlag) {
		this.approvalExtensionFlag = approvalExtensionFlag;
	}

	public String getApprovedRejectedByName() {
		return this.approvedRejectedByName;
	}

	public void setApprovedRejectedByName(String approvedRejectedByName) {
		this.approvedRejectedByName = approvedRejectedByName;
	}

	public Timestamp getApprovedRejectedDate() {
		return this.approvedRejectedDate;
	}

	public void setApprovedRejectedDate(Timestamp approvedRejectedDate) {
		this.approvedRejectedDate = approvedRejectedDate;
	}

	public Timestamp getExtensionCreateDate() {
		return this.extensionCreateDate;
	}

	public void setExtensionCreateDate(Timestamp extensionCreateDate) {
		this.extensionCreateDate = extensionCreateDate;
	}

	public String getExtensionReasonTxt() {
		return this.extensionReasonTxt;
	}

	public void setExtensionReasonTxt(String extensionReasonTxt) {
		this.extensionReasonTxt = extensionReasonTxt;
	}

	public String getExtensionReplyTxt() {
		return this.extensionReplyTxt;
	}

	public void setExtensionReplyTxt(String extensionReplyTxt) {
		this.extensionReplyTxt = extensionReplyTxt;
	}

	public Timestamp getExtensionReqDueDate() {
		return this.extensionReqDueDate;
	}

	public void setExtensionReqDueDate(Timestamp extensionReqDueDate) {
		this.extensionReqDueDate = extensionReqDueDate;
	}

	public String getReqByName() {
		return this.reqByName;
	}

	public void setReqByName(String reqByName) {
		this.reqByName = reqByName;
	}

	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public int getTransferPartListDetailSk() {
		return this.transferPartListDetailSk;
	}

	public void setTransferPartListDetailSk(int transferPartListDetailSk) {
		this.transferPartListDetailSk = transferPartListDetailSk;
	}

}