package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tblHOURLY_RATES database table.
 * 
 */
@Entity
@Table(name="tblHOURLY_RATES")
@NamedQuery(name="TblHOURLY_RATE.findAll", query="SELECT t FROM TblHOURLY_RATE t")
public class TblHOURLY_RATE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Rate_Id")
	private int rate_Id;

	@Column(name="DESTINATION_NAME")
	private String destinationName;

	@Column(name="MODEL_TYPE")
	private String modelType;

	@Column(name="RATE_AMT")
	private BigDecimal rateAmt;

	public TblHOURLY_RATE() {
	}

	public int getRate_Id() {
		return this.rate_Id;
	}

	public void setRate_Id(int rate_Id) {
		this.rate_Id = rate_Id;
	}

	public String getDestinationName() {
		return this.destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public String getModelType() {
		return this.modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public BigDecimal getRateAmt() {
		return this.rateAmt;
	}

	public void setRateAmt(BigDecimal rateAmt) {
		this.rateAmt = rateAmt;
	}

}