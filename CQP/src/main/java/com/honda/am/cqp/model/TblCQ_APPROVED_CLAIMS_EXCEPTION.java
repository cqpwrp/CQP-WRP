package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tblCQ_APPROVED_CLAIMS_EXCEPTION database table.
 * 
 */
@Embeddable
@Table(name="tblCQ_APPROVED_CLAIMS_EXCEPTION")
@NamedQuery(name="TblCQ_APPROVED_CLAIMS_EXCEPTION.findAll", query="SELECT t FROM TblCQ_APPROVED_CLAIMS_EXCEPTION t")
public class TblCQ_APPROVED_CLAIMS_EXCEPTION implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CALLIN_PART_SK")
	private int callinPartSk;

	@Column(name="CLAIM_NO")
	private String claimNo;

	@Column(name="DEALER_NO")
	private String dealerNo;

	@Column(name="FAC_NAME")
	private String facName;

	@Column(name="FORCE_CREATE_FLAG")
	private String forceCreateFlag;

	@Column(name="LONG_PART_NO")
	private String longPartNo;

	@Column(name="MARKET_NAME")
	private String marketName;

	@Column(name="MODEL_NAME")
	private String modelName;

	@Column(name="MODEL_YEAR")
	private String modelYear;

	@Column(name="OTHER_AMT")
	private BigDecimal otherAmt;

	@Column(name="QTR_NO")
	private int qtrNo;

	@Column(name="QTR_YEAR")
	private String qtrYear;

	@Column(name="REQUEST_NO")
	private String requestNo;

	@Column(name="RESP_PAYER_CODE")
	private String respPayerCode;

	@Column(name="ROYR")
	private String royr;

	@Column(name="SHORT_PART_NAME")
	private String shortPartName;

	@Column(name="SHORT_PART_NO")
	private String shortPartNo;

	@Column(name="SUPP_NAME")
	private String suppName;

	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="VIN")
	private String vin;

	@Column(name="VIN_END")
	private String vinEnd;

	@Column(name="VIN_START")
	private String vinStart;

	@Column(name="WAR_EXCH_RATE_AMT")
	private BigDecimal warExchRateAmt;

	public TblCQ_APPROVED_CLAIMS_EXCEPTION() {
	}

	public int getCallinPartSk() {
		return this.callinPartSk;
	}

	public void setCallinPartSk(int callinPartSk) {
		this.callinPartSk = callinPartSk;
	}

	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getDealerNo() {
		return this.dealerNo;
	}

	public void setDealerNo(String dealerNo) {
		this.dealerNo = dealerNo;
	}

	public String getFacName() {
		return this.facName;
	}

	public void setFacName(String facName) {
		this.facName = facName;
	}

	public String getForceCreateFlag() {
		return this.forceCreateFlag;
	}

	public void setForceCreateFlag(String forceCreateFlag) {
		this.forceCreateFlag = forceCreateFlag;
	}

	public String getLongPartNo() {
		return this.longPartNo;
	}

	public void setLongPartNo(String longPartNo) {
		this.longPartNo = longPartNo;
	}

	public String getMarketName() {
		return this.marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
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

	public BigDecimal getOtherAmt() {
		return this.otherAmt;
	}

	public void setOtherAmt(BigDecimal otherAmt) {
		this.otherAmt = otherAmt;
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

	public String getRequestNo() {
		return this.requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getRespPayerCode() {
		return this.respPayerCode;
	}

	public void setRespPayerCode(String respPayerCode) {
		this.respPayerCode = respPayerCode;
	}

	public String getRoyr() {
		return this.royr;
	}

	public void setRoyr(String royr) {
		this.royr = royr;
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

	public String getVin() {
		return this.vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getVinEnd() {
		return this.vinEnd;
	}

	public void setVinEnd(String vinEnd) {
		this.vinEnd = vinEnd;
	}

	public String getVinStart() {
		return this.vinStart;
	}

	public void setVinStart(String vinStart) {
		this.vinStart = vinStart;
	}

	public BigDecimal getWarExchRateAmt() {
		return this.warExchRateAmt;
	}

	public void setWarExchRateAmt(BigDecimal warExchRateAmt) {
		this.warExchRateAmt = warExchRateAmt;
	}

}