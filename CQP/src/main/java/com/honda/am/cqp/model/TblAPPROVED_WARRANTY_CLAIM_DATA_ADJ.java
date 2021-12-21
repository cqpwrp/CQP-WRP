package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tblAPPROVED_WARRANTY_CLAIM_DATA_ADJ database table.
 * 
 */
@Embeddable
@Table(name="tblAPPROVED_WARRANTY_CLAIM_DATA_ADJ")
@NamedQuery(name="TblAPPROVED_WARRANTY_CLAIM_DATA_ADJ.findAll", query="SELECT t FROM TblAPPROVED_WARRANTY_CLAIM_DATA_ADJ t")
public class TblAPPROVED_WARRANTY_CLAIM_DATA_ADJ implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CLAIM_NO")
	private String claimNo;

	@Column(name="DEALER_NO")
	private String dealerNo;

	@Column(name="FAC_NAME")
	private String facName;

	@Column(name="FULL_PART_NO")
	private String fullPartNo;

	@Column(name="MARKET")
	private String market;

	@Column(name="MODEL_NAME")
	private String modelName;

	@Column(name="MODEL_YEAR")
	private String modelYear;

	@Column(name="OTHER_CHARGE")
	private BigDecimal otherCharge;

	@Column(name="REPLACED_PART")
	private String replacedPart;

	@Column(name="REPLACED_PART_NAME")
	private String replacedPartName;

	@Column(name="ROYR")
	private String royr;

	@Column(name="SUBLET_CHARGE")
	private BigDecimal subletCharge;

	@Column(name="SUPP_NAME")
	private String suppName;

	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="VIN")
	private String vin;

	@Column(name="WAR_RESP_DISTR_CDE")
	private String warRespDistrCde;

	public TblAPPROVED_WARRANTY_CLAIM_DATA_ADJ() {
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

	public String getFullPartNo() {
		return this.fullPartNo;
	}

	public void setFullPartNo(String fullPartNo) {
		this.fullPartNo = fullPartNo;
	}

	public String getMarket() {
		return this.market;
	}

	public void setMarket(String market) {
		this.market = market;
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

	public BigDecimal getOtherCharge() {
		return this.otherCharge;
	}

	public void setOtherCharge(BigDecimal otherCharge) {
		this.otherCharge = otherCharge;
	}

	public String getReplacedPart() {
		return this.replacedPart;
	}

	public void setReplacedPart(String replacedPart) {
		this.replacedPart = replacedPart;
	}

	public String getReplacedPartName() {
		return this.replacedPartName;
	}

	public void setReplacedPartName(String replacedPartName) {
		this.replacedPartName = replacedPartName;
	}

	public String getRoyr() {
		return this.royr;
	}

	public void setRoyr(String royr) {
		this.royr = royr;
	}

	public BigDecimal getSubletCharge() {
		return this.subletCharge;
	}

	public void setSubletCharge(BigDecimal subletCharge) {
		this.subletCharge = subletCharge;
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

	public String getWarRespDistrCde() {
		return this.warRespDistrCde;
	}

	public void setWarRespDistrCde(String warRespDistrCde) {
		this.warRespDistrCde = warRespDistrCde;
	}

}