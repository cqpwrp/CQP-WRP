package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the tblTRANSFER_PART_LIST_DETAIL_HIST database table.
 * 
 */
@Entity
@Table(name="tblTRANSFER_PART_LIST_DETAIL_HIST")
@NamedQuery(name="TblTRANSFER_PART_LIST_DETAIL_HIST.findAll", query="SELECT t FROM TblTRANSFER_PART_LIST_DETAIL_HIST t")
public class TblTRANSFER_PART_LIST_DETAIL_HIST implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TRANSFER_PART_LIST_DETAIL_SK")
	private int transferPartListDetailSk;

	@Column(name="AF_OFF_DATE")
	private Timestamp afOffDate;

	@Column(name="ALERT_ID")
	private int alertId;

	@Column(name="CALC_SUPP_RESP_PCT")
	private BigDecimal calcSuppRespPct;

	@Column(name="CALL_IN_REF")
	private int callInRef;

	@Column(name="CLAIM_NO")
	private String claimNo;

	@Column(name="CLAIM_SK")
	private int claimSk;

	@Column(name="CONCLUSION_ID")
	private String conclusionId;

	@Column(name="CREATED_BY_NAME")
	private String createdByName;

	@Column(name="DEALER_NO")
	private String dealerNo;

	@Column(name="DEALER_STATE")
	private String dealerState;

	@Column(name="ENGINE_OFF_DATE")
	private Timestamp engineOffDate;

	@Column(name="FAC_NAME")
	private String facName;

	@Column(name="FORCE_CREATE_FLAG")
	private String forceCreateFlag;

	@Column(name="IN_SERVICE_DAYS")
	private int inServiceDays;

	@Column(name="INSERT_DATE")
	private Timestamp insertDate;

	@Column(name="MARKET_NAME")
	private String marketName;

	@Column(name="MODEL_NAME")
	private String modelName;

	@Column(name="MODEL_YEAR")
	private String modelYear;

	@Column(name="PICKUP_DATE")
	private Timestamp pickupDate;

	@Column(name="QTY")
	private int qty;

	@Column(name="ROYR")
	private String royr;

	@Column(name="SERVICED_PART_NO")
	private String servicedPartNo;

	@Column(name="SHORT_PART_NAME")
	private String shortPartName;

	@Column(name="SHORT_PART_NO")
	private String shortPartNo;

	@Column(name="STATUS_ID")
	private int statusId;

	@Column(name="SUPP_NAME")
	private String suppName;

	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="SUPP_RES_PER")
	private BigDecimal suppResPer;

	@Column(name="VEH_MILEAGE")
	private int vehMileage;

	@Column(name="VIN")
	private String vin;

	public TblTRANSFER_PART_LIST_DETAIL_HIST() {
	}

	public int getTransferPartListDetailSk() {
		return this.transferPartListDetailSk;
	}

	public void setTransferPartListDetailSk(int transferPartListDetailSk) {
		this.transferPartListDetailSk = transferPartListDetailSk;
	}

	public Timestamp getAfOffDate() {
		return this.afOffDate;
	}

	public void setAfOffDate(Timestamp afOffDate) {
		this.afOffDate = afOffDate;
	}

	public int getAlertId() {
		return this.alertId;
	}

	public void setAlertId(int alertId) {
		this.alertId = alertId;
	}

	public BigDecimal getCalcSuppRespPct() {
		return this.calcSuppRespPct;
	}

	public void setCalcSuppRespPct(BigDecimal calcSuppRespPct) {
		this.calcSuppRespPct = calcSuppRespPct;
	}

	public int getCallInRef() {
		return this.callInRef;
	}

	public void setCallInRef(int callInRef) {
		this.callInRef = callInRef;
	}

	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public int getClaimSk() {
		return this.claimSk;
	}

	public void setClaimSk(int claimSk) {
		this.claimSk = claimSk;
	}

	public String getConclusionId() {
		return this.conclusionId;
	}

	public void setConclusionId(String conclusionId) {
		this.conclusionId = conclusionId;
	}

	public String getCreatedByName() {
		return this.createdByName;
	}

	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	public String getDealerNo() {
		return this.dealerNo;
	}

	public void setDealerNo(String dealerNo) {
		this.dealerNo = dealerNo;
	}

	public String getDealerState() {
		return this.dealerState;
	}

	public void setDealerState(String dealerState) {
		this.dealerState = dealerState;
	}

	public Timestamp getEngineOffDate() {
		return this.engineOffDate;
	}

	public void setEngineOffDate(Timestamp engineOffDate) {
		this.engineOffDate = engineOffDate;
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

	public int getInServiceDays() {
		return this.inServiceDays;
	}

	public void setInServiceDays(int inServiceDays) {
		this.inServiceDays = inServiceDays;
	}

	public Timestamp getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(Timestamp insertDate) {
		this.insertDate = insertDate;
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

	public Timestamp getPickupDate() {
		return this.pickupDate;
	}

	public void setPickupDate(Timestamp pickupDate) {
		this.pickupDate = pickupDate;
	}

	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getRoyr() {
		return this.royr;
	}

	public void setRoyr(String royr) {
		this.royr = royr;
	}

	public String getServicedPartNo() {
		return this.servicedPartNo;
	}

	public void setServicedPartNo(String servicedPartNo) {
		this.servicedPartNo = servicedPartNo;
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

	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
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

	public BigDecimal getSuppResPer() {
		return this.suppResPer;
	}

	public void setSuppResPer(BigDecimal suppResPer) {
		this.suppResPer = suppResPer;
	}

	public int getVehMileage() {
		return this.vehMileage;
	}

	public void setVehMileage(int vehMileage) {
		this.vehMileage = vehMileage;
	}

	public String getVin() {
		return this.vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

}