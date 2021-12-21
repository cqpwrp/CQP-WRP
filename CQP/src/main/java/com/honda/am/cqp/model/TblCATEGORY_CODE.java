package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblCATEGORY_CODES database table.
 * 
 */
@Entity
@Table(name="tblCATEGORY_CODES")
@NamedQuery(name="TblCATEGORY_CODE.findAll", query="SELECT t FROM TblCATEGORY_CODE t")
public class TblCATEGORY_CODE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CATEGORY_ID")
	private int categoryId;

	@Column(name="APPROVED_BY_NAME")
	private String approvedByName;

	@Column(name="APPROVED_DATE")
	private Timestamp approvedDate;

	@Column(name="CATEGORY_DESC_TXT")
	private String categoryDescTxt;

	@Column(name="INSERT_DATE")
	private Timestamp insertDate;

	@Column(name="INSERTED_BY_NAME")
	private String insertedByName;

	@Column(name="PART_NO")
	private String partNo;

	@Column(name="STATUS")
	private String status;

	@Column(name="SUPP_NO")
	private String suppNo;

	public TblCATEGORY_CODE() {
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getApprovedByName() {
		return this.approvedByName;
	}

	public void setApprovedByName(String approvedByName) {
		this.approvedByName = approvedByName;
	}

	public Timestamp getApprovedDate() {
		return this.approvedDate;
	}

	public void setApprovedDate(Timestamp approvedDate) {
		this.approvedDate = approvedDate;
	}

	public String getCategoryDescTxt() {
		return this.categoryDescTxt;
	}

	public void setCategoryDescTxt(String categoryDescTxt) {
		this.categoryDescTxt = categoryDescTxt;
	}

	public Timestamp getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(Timestamp insertDate) {
		this.insertDate = insertDate;
	}

	public String getInsertedByName() {
		return this.insertedByName;
	}

	public void setInsertedByName(String insertedByName) {
		this.insertedByName = insertedByName;
	}

	public String getPartNo() {
		return this.partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

}