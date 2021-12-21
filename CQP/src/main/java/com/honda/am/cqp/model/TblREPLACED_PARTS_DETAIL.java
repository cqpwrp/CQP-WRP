package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;


/**
 * The persistent class for the tblREPLACED_PARTS_DETAILS database table.
 * 
 */
@Embeddable
@Table(name="tblREPLACED_PARTS_DETAILS")
@NamedQuery(name="TblREPLACED_PARTS_DETAIL.findAll", query="SELECT t FROM TblREPLACED_PARTS_DETAIL t")
public class TblREPLACED_PARTS_DETAIL implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AF_OFF_DATE")
	private Timestamp afOffDate;

	@Column(name="AF_OFF_MONTH")
	private String afOffMonth;

	@Column(name="CLAIM_NO")
	private String claimNo;

	@Column(name="CUSTOMER_CONTENTION_TEXT")
	private String customerContentionText;

	@Column(name="DEALER_NO")
	private String dealerNo;

	@Column(name="DEALER_STATE")
	private String dealerState;

	@Column(name="DTF")
	private int dtf;

	@Column(name="ECUCODE")
	private String ecucode;

	@Column(name="ENGINE_NO")
	private String engineNo;

	@Column(name="ENGINE_OFF_DATE")
	private String engineOffDate;

	@Column(name="ENGINE_OFF_MONTH")
	private String engineOffMonth;

	@Column(name="MTC_SK")
	private int mtcSk;

	@Column(name="MTF")
	private int mtf;

	@Column(name="PART_NAME")
	private String partName;

	@Column(name="PART_NO")
	private String partNo;

	@Column(name="PRODUCTION_LINE")
	private String productionLine;

	@Column(name="QTY")
	private int qty;

	@Column(name="RECEIVED_DATE")
	private Timestamp receivedDate;

	@Column(name="RETAIL_SALE")
	private Timestamp retailSale;

	@Column(name="RODATE")
	private Timestamp rodate;

	@Column(name="ROYR")
	private String royr;

	@Column(name="SUPP_NAME")
	private String suppName;

	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="SYMPTOM_CODE")
	private String symptomCode;

	@Column(name="TOTAL_CHARGE")
	private BigDecimal totalCharge;

	@Column(name="TRANS_OFF_DATE")
	private Time transOffDate;

	@Column(name="TRANSMISSION_NO")
	private String transmissionNo;

	@Column(name="VIN")
	private String vin;

	public TblREPLACED_PARTS_DETAIL() {
	}

	public Timestamp getAfOffDate() {
		return this.afOffDate;
	}

	public void setAfOffDate(Timestamp afOffDate) {
		this.afOffDate = afOffDate;
	}

	public String getAfOffMonth() {
		return this.afOffMonth;
	}

	public void setAfOffMonth(String afOffMonth) {
		this.afOffMonth = afOffMonth;
	}

	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getCustomerContentionText() {
		return this.customerContentionText;
	}

	public void setCustomerContentionText(String customerContentionText) {
		this.customerContentionText = customerContentionText;
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

	public int getDtf() {
		return this.dtf;
	}

	public void setDtf(int dtf) {
		this.dtf = dtf;
	}

	public String getEcucode() {
		return this.ecucode;
	}

	public void setEcucode(String ecucode) {
		this.ecucode = ecucode;
	}

	public String getEngineNo() {
		return this.engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getEngineOffDate() {
		return this.engineOffDate;
	}

	public void setEngineOffDate(String engineOffDate) {
		this.engineOffDate = engineOffDate;
	}

	public String getEngineOffMonth() {
		return this.engineOffMonth;
	}

	public void setEngineOffMonth(String engineOffMonth) {
		this.engineOffMonth = engineOffMonth;
	}

	public int getMtcSk() {
		return this.mtcSk;
	}

	public void setMtcSk(int mtcSk) {
		this.mtcSk = mtcSk;
	}

	public int getMtf() {
		return this.mtf;
	}

	public void setMtf(int mtf) {
		this.mtf = mtf;
	}

	public String getPartName() {
		return this.partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getPartNo() {
		return this.partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getProductionLine() {
		return this.productionLine;
	}

	public void setProductionLine(String productionLine) {
		this.productionLine = productionLine;
	}

	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Timestamp getReceivedDate() {
		return this.receivedDate;
	}

	public void setReceivedDate(Timestamp receivedDate) {
		this.receivedDate = receivedDate;
	}

	public Timestamp getRetailSale() {
		return this.retailSale;
	}

	public void setRetailSale(Timestamp retailSale) {
		this.retailSale = retailSale;
	}

	public Timestamp getRodate() {
		return this.rodate;
	}

	public void setRodate(Timestamp rodate) {
		this.rodate = rodate;
	}

	public String getRoyr() {
		return this.royr;
	}

	public void setRoyr(String royr) {
		this.royr = royr;
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

	public String getSymptomCode() {
		return this.symptomCode;
	}

	public void setSymptomCode(String symptomCode) {
		this.symptomCode = symptomCode;
	}

	public BigDecimal getTotalCharge() {
		return this.totalCharge;
	}

	public void setTotalCharge(BigDecimal totalCharge) {
		this.totalCharge = totalCharge;
	}

	public Time getTransOffDate() {
		return this.transOffDate;
	}

	public void setTransOffDate(Time transOffDate) {
		this.transOffDate = transOffDate;
	}

	public String getTransmissionNo() {
		return this.transmissionNo;
	}

	public void setTransmissionNo(String transmissionNo) {
		this.transmissionNo = transmissionNo;
	}

	public String getVin() {
		return this.vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

}