package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the tblINCOMING_SHIPPING_RATES database table.
 * 
 */
@Embeddable
@Table(name="tblINCOMING_SHIPPING_RATES")
@NamedQuery(name="TblINCOMING_SHIPPING_RATE.findAll", query="SELECT t FROM TblINCOMING_SHIPPING_RATE t")
public class TblINCOMING_SHIPPING_RATE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="INSERT_TSTP")
	private Timestamp insertTstp;

	@Column(name="SHIPPING_COST_AMT")
	private BigDecimal shippingCostAmt;

	@Column(name="UPDATE_TSTP")
	private Timestamp updateTstp;

	@Column(name="WEIGHT_LBS_QTY")
	private int weightLbsQty;

	public TblINCOMING_SHIPPING_RATE() {
	}

	public Timestamp getInsertTstp() {
		return this.insertTstp;
	}

	public void setInsertTstp(Timestamp insertTstp) {
		this.insertTstp = insertTstp;
	}

	public BigDecimal getShippingCostAmt() {
		return this.shippingCostAmt;
	}

	public void setShippingCostAmt(BigDecimal shippingCostAmt) {
		this.shippingCostAmt = shippingCostAmt;
	}

	public Timestamp getUpdateTstp() {
		return this.updateTstp;
	}

	public void setUpdateTstp(Timestamp updateTstp) {
		this.updateTstp = updateTstp;
	}

	public int getWeightLbsQty() {
		return this.weightLbsQty;
	}

	public void setWeightLbsQty(int weightLbsQty) {
		this.weightLbsQty = weightLbsQty;
	}

}