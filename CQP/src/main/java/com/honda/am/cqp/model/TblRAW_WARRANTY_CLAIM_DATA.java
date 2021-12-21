package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the tblRAW_WARRANTY_CLAIM_DATA database table.
 * 
 */
@Embeddable
@Table(name="tblRAW_WARRANTY_CLAIM_DATA")
@NamedQuery(name="TblRAW_WARRANTY_CLAIM_DATA.findAll", query="SELECT t FROM TblRAW_WARRANTY_CLAIM_DATA t")
public class TblRAW_WARRANTY_CLAIM_DATA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACTUAL_QTY")
	private int actualQty;

	@Column(name="AF_OFF_DATE")
	private Timestamp afOffDate;

	@Column(name="CLAIM_NO")
	private String claimNo;

	@Column(name="CLAIM_RECEIVED_DATE")
	private Timestamp claimReceivedDate;

	@Column(name="CLAIM_SK")
	private int claimSk;

	@Column(name="DEALER_NO")
	private String dealerNo;

	@Column(name="DEALER_STATE")
	private String dealerState;

	@Column(name="ENGINE_OFF_DATE")
	private String engineOffDate;

	@Column(name="MODEL_NAME")
	private String modelName;

	@Column(name="MODEL_YEAR")
	private String modelYear;

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

	@Column(name="WAR_VEHICLE_DESTINATION")
	private String warVehicleDestination;

	public TblRAW_WARRANTY_CLAIM_DATA() {
	}

	public int getActualQty() {
		return this.actualQty;
	}

	public void setActualQty(int actualQty) {
		this.actualQty = actualQty;
	}

	public Timestamp getAfOffDate() {
		return this.afOffDate;
	}

	public void setAfOffDate(Timestamp afOffDate) {
		this.afOffDate = afOffDate;
	}

	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public Timestamp getClaimReceivedDate() {
		return this.claimReceivedDate;
	}

	public void setClaimReceivedDate(Timestamp claimReceivedDate) {
		this.claimReceivedDate = claimReceivedDate;
	}

	public int getClaimSk() {
		return this.claimSk;
	}

	public void setClaimSk(int claimSk) {
		this.claimSk = claimSk;
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

	public String getEngineOffDate() {
		return this.engineOffDate;
	}

	public void setEngineOffDate(String engineOffDate) {
		this.engineOffDate = engineOffDate;
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

	public String getWarVehicleDestination() {
		return this.warVehicleDestination;
	}

	public void setWarVehicleDestination(String warVehicleDestination) {
		this.warVehicleDestination = warVehicleDestination;
	}

}