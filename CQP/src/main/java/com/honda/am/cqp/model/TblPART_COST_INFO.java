package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the tblPART_COST_INFO database table.
 * 
 */
@Entity
@Table(name="tblPART_COST_INFO")
@NamedQuery(name="TblPART_COST_INFO.findAll", query="SELECT t FROM TblPART_COST_INFO t")
public class TblPART_COST_INFO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PART_NO")
	private String partNo;

	@Column(name="DEALER_NET_AMT")
	private BigDecimal dealerNetAmt;

	@Column(name="FLAT_RATE_AMT")
	private BigDecimal flatRateAmt;

	@Column(name="FOB_AMT")
	private BigDecimal fobAmt;

	@Column(name="INSERT_TIME")
	private Timestamp insertTime;

	@Column(name="KILOGRAMS_QTY")
	private BigDecimal kilogramsQty;

	@Column(name="POUNDS_QTY")
	private int poundsQty;

	@Column(name="PROGRAM_NAME")
	private String programName;

	@Column(name="SHORT_PART_NO")
	private String shortPartNo;

	@Column(name="UPDATE_TIME")
	private Timestamp updateTime;

	public TblPART_COST_INFO() {
	}

	public String getPartNo() {
		return this.partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public BigDecimal getDealerNetAmt() {
		return this.dealerNetAmt;
	}

	public void setDealerNetAmt(BigDecimal dealerNetAmt) {
		this.dealerNetAmt = dealerNetAmt;
	}

	public BigDecimal getFlatRateAmt() {
		return this.flatRateAmt;
	}

	public void setFlatRateAmt(BigDecimal flatRateAmt) {
		this.flatRateAmt = flatRateAmt;
	}

	public BigDecimal getFobAmt() {
		return this.fobAmt;
	}

	public void setFobAmt(BigDecimal fobAmt) {
		this.fobAmt = fobAmt;
	}

	public Timestamp getInsertTime() {
		return this.insertTime;
	}

	public void setInsertTime(Timestamp insertTime) {
		this.insertTime = insertTime;
	}

	public BigDecimal getKilogramsQty() {
		return this.kilogramsQty;
	}

	public void setKilogramsQty(BigDecimal kilogramsQty) {
		this.kilogramsQty = kilogramsQty;
	}

	public int getPoundsQty() {
		return this.poundsQty;
	}

	public void setPoundsQty(int poundsQty) {
		this.poundsQty = poundsQty;
	}

	public String getProgramName() {
		return this.programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getShortPartNo() {
		return this.shortPartNo;
	}

	public void setShortPartNo(String shortPartNo) {
		this.shortPartNo = shortPartNo;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

}