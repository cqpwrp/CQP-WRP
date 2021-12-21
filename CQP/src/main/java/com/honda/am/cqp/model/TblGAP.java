package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the tblGAPS database table.
 * 
 */
@Embeddable
@Table(name="tblGAPS")
@NamedQuery(name="TblGAP.findAll", query="SELECT t FROM TblGAP t")
public class TblGAP implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DEALER_NET_AMT")
	private BigDecimal dealerNetAmt;

	@Column(name="FOB_AMT")
	private BigDecimal fobAmt;

	@Column(name="FORMAT_LONG_PART")
	private String formatLongPart;

	@Column(name="[HOURS]")
	private BigDecimal hours;

	@Column(name="LONG_PART_NO")
	private String longPartNo;

	@Column(name="MODEL_NAMES")
	private String modelNames;

	@Column(name="MODEL_YEARS")
	private String modelYears;

	@Column(name="SHIPPING_COST_AMT")
	private BigDecimal shippingCostAmt;

	@Column(name="SHORT_PART_NAME")
	private String shortPartName;

	@Column(name="SHORT_PART_NO")
	private String shortPartNo;

	@Column(name="SUPP_NAME")
	private String suppName;

	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="UPDATE_TS")
	private Timestamp updateTs;

	@Column(name="UPDATE_USR")
	private String updateUsr;

	@Column(name="WEIGHT")
	private BigDecimal weight;

	public TblGAP() {
	}

	public BigDecimal getDealerNetAmt() {
		return this.dealerNetAmt;
	}

	public void setDealerNetAmt(BigDecimal dealerNetAmt) {
		this.dealerNetAmt = dealerNetAmt;
	}

	public BigDecimal getFobAmt() {
		return this.fobAmt;
	}

	public void setFobAmt(BigDecimal fobAmt) {
		this.fobAmt = fobAmt;
	}

	public String getFormatLongPart() {
		return this.formatLongPart;
	}

	public void setFormatLongPart(String formatLongPart) {
		this.formatLongPart = formatLongPart;
	}

	public BigDecimal getHours() {
		return this.hours;
	}

	public void setHours(BigDecimal hours) {
		this.hours = hours;
	}

	public String getLongPartNo() {
		return this.longPartNo;
	}

	public void setLongPartNo(String longPartNo) {
		this.longPartNo = longPartNo;
	}

	public String getModelNames() {
		return this.modelNames;
	}

	public void setModelNames(String modelNames) {
		this.modelNames = modelNames;
	}

	public String getModelYears() {
		return this.modelYears;
	}

	public void setModelYears(String modelYears) {
		this.modelYears = modelYears;
	}

	public BigDecimal getShippingCostAmt() {
		return this.shippingCostAmt;
	}

	public void setShippingCostAmt(BigDecimal shippingCostAmt) {
		this.shippingCostAmt = shippingCostAmt;
	}

	public String getShortPartName() {
		return this.shortPartName;
	}

	public void setShortPartName(String shortPartName) {
		this.shortPartName = shortPartName;
	}

	public String getShortPartNo() {
		return this.shortPartNo;
	}

	public void setShortPartNo(String shortPartNo) {
		this.shortPartNo = shortPartNo;
	}

	public String getSuppName() {
		return this.suppName;
	}

	public void setSuppName(String suppName) {
		this.suppName = suppName;
	}

	public String getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

	public Timestamp getUpdateTs() {
		return this.updateTs;
	}

	public void setUpdateTs(Timestamp updateTs) {
		this.updateTs = updateTs;
	}

	public String getUpdateUsr() {
		return this.updateUsr;
	}

	public void setUpdateUsr(String updateUsr) {
		this.updateUsr = updateUsr;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

}