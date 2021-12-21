package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblCLAIM_SUMMARY database table.
 * 
 */
@Embeddable
@Table(name="tblCLAIM_SUMMARY")
@NamedQuery(name="TblCLAIM_SUMMARY.findAll", query="SELECT t FROM TblCLAIM_SUMMARY t")
public class TblCLAIM_SUMMARY implements Serializable {
	private static final long serialVersionUID = 1L;

	private int AF_Month_SK;

	@Column(name="MTC_SK")
	private int mtcSk;

	@Column(name="Repl_Qty")
	private int repl_Qty;

	private int RO_Month_SK;

	@Column(name="SHORT_PART_NO")
	private String shortPartNo;

	@Column(name="SUPP_NO")
	private String suppNo;

	public TblCLAIM_SUMMARY() {
	}

	public int getAF_Month_SK() {
		return this.AF_Month_SK;
	}

	public void setAF_Month_SK(int AF_Month_SK) {
		this.AF_Month_SK = AF_Month_SK;
	}

	public int getMtcSk() {
		return this.mtcSk;
	}

	public void setMtcSk(int mtcSk) {
		this.mtcSk = mtcSk;
	}

	public int getRepl_Qty() {
		return this.repl_Qty;
	}

	public void setRepl_Qty(int repl_Qty) {
		this.repl_Qty = repl_Qty;
	}

	public int getRO_Month_SK() {
		return this.RO_Month_SK;
	}

	public void setRO_Month_SK(int RO_Month_SK) {
		this.RO_Month_SK = RO_Month_SK;
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