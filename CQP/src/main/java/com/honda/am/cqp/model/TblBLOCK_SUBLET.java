package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblBLOCK_SUBLETS database table.
 * 
 */
@Embeddable
@Table(name="tblBLOCK_SUBLETS")
@NamedQuery(name="TblBLOCK_SUBLET.findAll", query="SELECT t FROM TblBLOCK_SUBLET t")
public class TblBLOCK_SUBLET implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CREATED_BY_NAME")
	private String createdByName;

	@Column(name="INSERT_DATE")
	private Timestamp insertDate;

	@Column(name="SUBLET_CODE")
	private String subletCode;

	@Column(name="SUPP_NO")
	private String suppNo;

	public TblBLOCK_SUBLET() {
	}

	public String getCreatedByName() {
		return this.createdByName;
	}

	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	public Timestamp getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(Timestamp insertDate) {
		this.insertDate = insertDate;
	}

	public String getSubletCode() {
		return this.subletCode;
	}

	public void setSubletCode(String subletCode) {
		this.subletCode = subletCode;
	}

	public String getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

}