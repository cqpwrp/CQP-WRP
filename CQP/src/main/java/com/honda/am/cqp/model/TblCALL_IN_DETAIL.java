package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblCALL_IN_DETAIL database table.
 * 
 */
@Entity
@Table(name="tblCALL_IN_DETAIL")
@NamedQuery(name="TblCALL_IN_DETAIL.findAll", query="SELECT t FROM TblCALL_IN_DETAIL t")
public class TblCALL_IN_DETAIL implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CALLIN_PART_SK")
	private int callinPartSk;

	@Column(name="AH_REQUEST_NO")
	private String ahRequestNo;

	@Column(name="ALERT_ID")
	private short alertId;

	@Column(name="CREATED_BY_NAME")
	private String createdByName;

	@Column(name="CREATED_DATE")
	private Timestamp createdDate;

	@Column(name="DESTINATION_NAME")
	private String destinationName;

	@Column(name="FAC_NAME")
	private String facName;

	@Column(name="IN_USE_BY_NAME")
	private String inUseByName;

	@Column(name="INSERT_TIME")
	private Timestamp insertTime;

	@Column(name="IPPTAG_SHIP_DATE")
	private String ipptagShipDate;

	@Column(name="ISSUED_QTY")
	private int issuedQty;

	@Column(name="LAST_UPDATED_BY_NAME")
	private String lastUpdatedByName;

	@Column(name="LAST_UPDATED_DATE")
	private Timestamp lastUpdatedDate;

	@Column(name="LONG_PART_NO")
	private String longPartNo;

	@Column(name="MODEL_DESC")
	private String modelDesc;

	@Column(name="MODEL_NAME")
	private String modelName;

	@Column(name="MODEL_YEAR")
	private String modelYear;

	@Column(name="QTR_END_DATE")
	private Timestamp qtrEndDate;

	@Column(name="QTR_START_DATE")
	private Timestamp qtrStartDate;

	@Column(name="RECEIVED_QTY")
	private int receivedQty;

	@Column(name="REQUESTED_QTY")
	private int requestedQty;

	@Column(name="SHELF_NO")
	private String shelfNo;

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

	@Column(name="[VERSION]")
	private int version;

	@Column(name="VIN_END")
	private String vinEnd;

	@Column(name="VIN_START")
	private String vinStart;

	public TblCALL_IN_DETAIL() {
	}

	public int getCallinPartSk() {
		return this.callinPartSk;
	}

	public void setCallinPartSk(int callinPartSk) {
		this.callinPartSk = callinPartSk;
	}

	public String getAhRequestNo() {
		return this.ahRequestNo;
	}

	public void setAhRequestNo(String ahRequestNo) {
		this.ahRequestNo = ahRequestNo;
	}

	public short getAlertId() {
		return this.alertId;
	}

	public void setAlertId(short alertId) {
		this.alertId = alertId;
	}

	public String getCreatedByName() {
		return this.createdByName;
	}

	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getDestinationName() {
		return this.destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public String getFacName() {
		return this.facName;
	}

	public void setFacName(String facName) {
		this.facName = facName;
	}

	public String getInUseByName() {
		return this.inUseByName;
	}

	public void setInUseByName(String inUseByName) {
		this.inUseByName = inUseByName;
	}

	public Timestamp getInsertTime() {
		return this.insertTime;
	}

	public void setInsertTime(Timestamp insertTime) {
		this.insertTime = insertTime;
	}

	public String getIpptagShipDate() {
		return this.ipptagShipDate;
	}

	public void setIpptagShipDate(String ipptagShipDate) {
		this.ipptagShipDate = ipptagShipDate;
	}

	public int getIssuedQty() {
		return this.issuedQty;
	}

	public void setIssuedQty(int issuedQty) {
		this.issuedQty = issuedQty;
	}

	public String getLastUpdatedByName() {
		return this.lastUpdatedByName;
	}

	public void setLastUpdatedByName(String lastUpdatedByName) {
		this.lastUpdatedByName = lastUpdatedByName;
	}

	public Timestamp getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getLongPartNo() {
		return this.longPartNo;
	}

	public void setLongPartNo(String longPartNo) {
		this.longPartNo = longPartNo;
	}

	public String getModelDesc() {
		return this.modelDesc;
	}

	public void setModelDesc(String modelDesc) {
		this.modelDesc = modelDesc;
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

	public Timestamp getQtrEndDate() {
		return this.qtrEndDate;
	}

	public void setQtrEndDate(Timestamp qtrEndDate) {
		this.qtrEndDate = qtrEndDate;
	}

	public Timestamp getQtrStartDate() {
		return this.qtrStartDate;
	}

	public void setQtrStartDate(Timestamp qtrStartDate) {
		this.qtrStartDate = qtrStartDate;
	}

	public int getReceivedQty() {
		return this.receivedQty;
	}

	public void setReceivedQty(int receivedQty) {
		this.receivedQty = receivedQty;
	}

	public int getRequestedQty() {
		return this.requestedQty;
	}

	public void setRequestedQty(int requestedQty) {
		this.requestedQty = requestedQty;
	}

	public String getShelfNo() {
		return this.shelfNo;
	}

	public void setShelfNo(String shelfNo) {
		this.shelfNo = shelfNo;
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

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
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

}