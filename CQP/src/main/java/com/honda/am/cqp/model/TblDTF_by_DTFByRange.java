package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblDTF_by_DTFByRange database table.
 * 
 */
@Embeddable
@Table(name="tblDTF_by_DTFByRange")
@NamedQuery(name="TblDTF_by_DTFByRange.findAll", query="SELECT t FROM TblDTF_by_DTFByRange t")
public class TblDTF_by_DTFByRange implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="Days_Range")
	private String days_Range;

	@Column(name="Days_Start")
	private int days_Start;

	@Column(name="MTC_SK")
	private int mtcSk;

	@Column(name="Rpl_Qty")
	private int rpl_Qty;

	@Column(name="SHORT_PART_NO")
	private String shortPartNo;

	@Column(name="SUPP_NO")
	private String suppNo;

	public TblDTF_by_DTFByRange() {
	}

	public String getDays_Range() {
		return this.days_Range;
	}

	public void setDays_Range(String days_Range) {
		this.days_Range = days_Range;
	}

	public int getDays_Start() {
		return this.days_Start;
	}

	public void setDays_Start(int days_Start) {
		this.days_Start = days_Start;
	}

	public int getMtcSk() {
		return this.mtcSk;
	}

	public void setMtcSk(int mtcSk) {
		this.mtcSk = mtcSk;
	}

	public int getRpl_Qty() {
		return this.rpl_Qty;
	}

	public void setRpl_Qty(int rpl_Qty) {
		this.rpl_Qty = rpl_Qty;
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