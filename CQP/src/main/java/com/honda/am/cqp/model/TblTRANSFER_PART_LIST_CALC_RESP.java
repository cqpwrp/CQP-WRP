package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tblTRANSFER_PART_LIST_CALC_RESP database table.
 * 
 */
@Embeddable
@Table(name="tblTRANSFER_PART_LIST_CALC_RESP")
@NamedQuery(name="TblTRANSFER_PART_LIST_CALC_RESP.findAll", query="SELECT t FROM TblTRANSFER_PART_LIST_CALC_RESP t")
public class TblTRANSFER_PART_LIST_CALC_RESP implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CALL_IN_REF")
	private int callInRef;

	@Column(name="FAC_NAME")
	private String facName;

	@Column(name="MODEL_NAME")
	private String modelName;

	@Column(name="MODEL_YEAR")
	private String modelYear;

	@Column(name="QTR_NO")
	private int qtrNo;

	@Column(name="QTR_YEAR")
	private String qtrYear;

	@Column(name="RESP_PCT")
	private BigDecimal respPct;

	@Column(name="SHIPPED_QTY")
	private int shippedQty;

	@Column(name="SHORT_PART_NO")
	private String shortPartNo;

	@Column(name="SUPP_NO")
	private String suppNo;

	public TblTRANSFER_PART_LIST_CALC_RESP() {
	}

	public int getCallInRef() {
		return this.callInRef;
	}

	public void setCallInRef(int callInRef) {
		this.callInRef = callInRef;
	}

	public String getFacName() {
		return this.facName;
	}

	public void setFacName(String facName) {
		this.facName = facName;
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelYear() {
		return this.modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public int getQtrNo() {
		return this.qtrNo;
	}

	public void setQtrNo(int qtrNo) {
		this.qtrNo = qtrNo;
	}

	public String getQtrYear() {
		return this.qtrYear;
	}

	public void setQtrYear(String qtrYear) {
		this.qtrYear = qtrYear;
	}

	public BigDecimal getRespPct() {
		return this.respPct;
	}

	public void setRespPct(BigDecimal respPct) {
		this.respPct = respPct;
	}

	public int getShippedQty() {
		return this.shippedQty;
	}

	public void setShippedQty(int shippedQty) {
		this.shippedQty = shippedQty;
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