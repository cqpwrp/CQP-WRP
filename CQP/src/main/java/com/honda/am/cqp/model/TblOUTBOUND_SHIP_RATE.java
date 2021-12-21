package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tblOUTBOUND_SHIP_RATE database table.
 * 
 */
@Embeddable
@Table(name="tblOUTBOUND_SHIP_RATE")
@NamedQuery(name="TblOUTBOUND_SHIP_RATE.findAll", query="SELECT t FROM TblOUTBOUND_SHIP_RATE t")
public class TblOUTBOUND_SHIP_RATE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="COST_AMT")
	private BigDecimal costAmt;

	@Column(name="[MONTH]")
	private String month;

	@Column(name="QUARTER_NO")
	private short quarterNo;

	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="Year")
	private String year;

	public TblOUTBOUND_SHIP_RATE() {
	}

	public BigDecimal getCostAmt() {
		return this.costAmt;
	}

	public void setCostAmt(BigDecimal costAmt) {
		this.costAmt = costAmt;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public short getQuarterNo() {
		return this.quarterNo;
	}

	public void setQuarterNo(short quarterNo) {
		this.quarterNo = quarterNo;
	}

	public String getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}