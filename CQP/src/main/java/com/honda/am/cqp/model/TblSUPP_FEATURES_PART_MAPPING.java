package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblSUPP_FEATURES_PART_MAPPING database table.
 * 
 */
@Embeddable
@Table(name="tblSUPP_FEATURES_PART_MAPPING")
@NamedQuery(name="TblSUPP_FEATURES_PART_MAPPING.findAll", query="SELECT t FROM TblSUPP_FEATURES_PART_MAPPING t")
public class TblSUPP_FEATURES_PART_MAPPING implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="EFF_END_DATE_SK")
	private int effEndDateSk;

	@Column(name="EFF_START_DATE_SK")
	private int effStartDateSk;

	@Column(name="MTC_SK")
	private int mtcSk;

	@Column(name="SHORT_PART_NO")
	private String shortPartNo;

	@Column(name="SUPP_NO")
	private String suppNo;

	public TblSUPP_FEATURES_PART_MAPPING() {
	}

	public int getEffEndDateSk() {
		return this.effEndDateSk;
	}

	public void setEffEndDateSk(int effEndDateSk) {
		this.effEndDateSk = effEndDateSk;
	}

	public int getEffStartDateSk() {
		return this.effStartDateSk;
	}

	public void setEffStartDateSk(int effStartDateSk) {
		this.effStartDateSk = effStartDateSk;
	}

	public int getMtcSk() {
		return this.mtcSk;
	}

	public void setMtcSk(int mtcSk) {
		this.mtcSk = mtcSk;
	}

	public String getShortPartNo() {
		return this.shortPartNo;
	}

	public void setShortPartNo(String shortPartNo) {
		this.shortPartNo = shortPartNo;
	}

	public String getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

}