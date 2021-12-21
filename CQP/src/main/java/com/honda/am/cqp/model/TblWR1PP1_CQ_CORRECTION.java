package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblWR1PP1_CQ_CORRECTIONS database table.
 * 
 */
@Entity
@Table(name="tblWR1PP1_CQ_CORRECTIONS")
@NamedQuery(name="TblWR1PP1_CQ_CORRECTION.findAll", query="SELECT t FROM TblWR1PP1_CQ_CORRECTION t")
public class TblWR1PP1_CQ_CORRECTION implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RECORD_ID")
	private int recordId;

	@Column(name="ACTION_TYPE")
	private String actionType;

	@Column(name="COMMENTS")
	private String comments;

	@Column(name="INSERT_TSTP")
	private Timestamp insertTstp;

	@Column(name="MTC_MODEL")
	private String mtcModel;

	@Column(name="MTC_OPTION")
	private String mtcOption;

	@Column(name="MTC_TYPE")
	private String mtcType;

	@Column(name="SHORT_PART_NO")
	private String shortPartNo;

	@Column(name="SUPPLIER_NO")
	private String supplierNo;

	@Column(name="USER_ID")
	private String userId;

	public TblWR1PP1_CQ_CORRECTION() {
	}

	public int getRecordId() {
		return this.recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	public String getActionType() {
		return this.actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Timestamp getInsertTstp() {
		return this.insertTstp;
	}

	public void setInsertTstp(Timestamp insertTstp) {
		this.insertTstp = insertTstp;
	}

	public String getMtcModel() {
		return this.mtcModel;
	}

	public void setMtcModel(String mtcModel) {
		this.mtcModel = mtcModel;
	}

	public String getMtcOption() {
		return this.mtcOption;
	}

	public void setMtcOption(String mtcOption) {
		this.mtcOption = mtcOption;
	}

	public String getMtcType() {
		return this.mtcType;
	}

	public void setMtcType(String mtcType) {
		this.mtcType = mtcType;
	}

	public String getShortPartNo() {
		return this.shortPartNo;
	}

	public void setShortPartNo(String shortPartNo) {
		this.shortPartNo = shortPartNo;
	}

	public String getSupplierNo() {
		return this.supplierNo;
	}

	public void setSupplierNo(String supplierNo) {
		this.supplierNo = supplierNo;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}