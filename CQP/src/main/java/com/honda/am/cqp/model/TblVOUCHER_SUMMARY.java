package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the tblVOUCHER_SUMMARY database table.
 * 
 */
@Entity
@Table(name="tblVOUCHER_SUMMARY")
@NamedQuery(name="TblVOUCHER_SUMMARY.findAll", query="SELECT t FROM TblVOUCHER_SUMMARY t")
public class TblVOUCHER_SUMMARY implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TblVOUCHER_SUMMARYPK id;

	@Column(name="ACK_DATE")
	private Timestamp ackDate;

	@Column(name="AUTO_DEBIT_FLAG")
	private String autoDebitFlag;

	@Column(name="CALC_SHIPPING_RESP_PCT")
	private BigDecimal calcShippingRespPct;

	@Column(name="DIAGNOSTIC_ADJUSTMENT_AMT")
	private BigDecimal diagnosticAdjustmentAmt;

	@Column(name="DUE_DATE")
	private Timestamp dueDate;

	@Column(name="IN_ADDL_SHIPPING_CHARGES_AMT")
	private BigDecimal inAddlShippingChargesAmt;

	@Column(name="IN_SUPPLIER_SHIPPING_SUBTOTAL_AMT")
	private BigDecimal inSupplierShippingSubtotalAmt;

	@Column(name="ISSUE_DATE")
	private Timestamp issueDate;

	@Column(name="OUT_ADDL_SHIPPING_CHARGES_AMT")
	private BigDecimal outAddlShippingChargesAmt;

	@Column(name="OVERALL_ADJUSTMENT_AMT")
	private BigDecimal overallAdjustmentAmt;

	@Column(name="OVERALL_DISCOUNT_TYPE")
	private String overallDiscountType;

	@Column(name="PERCENT_DISCOUNT")
	private BigDecimal percentDiscount;

	@Column(name="PLANT_OVERALL_ADJ_FLAG")
	private String plantOverallAdjFlag;

	@Column(name="STATUS_ID")
	private int statusId;

	@Column(name="SUB_TOTAL_AMT")
	private BigDecimal subTotalAmt;

	@Column(name="SUPP_NAME")
	private String suppName;

	@Column(name="SUPPLIER_RESP_ADDL_SHIPPING_CHARGES_AMT")
	private BigDecimal supplierRespAddlShippingChargesAmt;

	@Column(name="TOTAL_ADDL_SHIPPING_CHARGES_AMT")
	private BigDecimal totalAddlShippingChargesAmt;

	@Column(name="TOTAL_AMT")
	private BigDecimal totalAmt;

	@Column(name="TOTAL_MARKET_CLAIM")
	private BigDecimal totalMarketClaim;

	@Column(name="TOTAL_SUPPLIER_CHARGE_AMT")
	private BigDecimal totalSupplierChargeAmt;

	@Column(name="TOTAL_SUPPLIER_RESP_SUB_TOTAL_AMT")
	private BigDecimal totalSupplierRespSubTotalAmt;

	@Column(name="TOTAL_SUPPLIER_RESPONSIBILITY_PCT")
	private BigDecimal totalSupplierResponsibilityPct;

	@Column(name="VOUCHER_DESC")
	private String voucherDesc;

	@Column(name="VOUCHER_NO")
	private String voucherNo;

	public TblVOUCHER_SUMMARY() {
	}

	public TblVOUCHER_SUMMARYPK getId() {
		return this.id;
	}

	public void setId(TblVOUCHER_SUMMARYPK id) {
		this.id = id;
	}

	public Timestamp getAckDate() {
		return this.ackDate;
	}

	public void setAckDate(Timestamp ackDate) {
		this.ackDate = ackDate;
	}

	public String getAutoDebitFlag() {
		return this.autoDebitFlag;
	}

	public void setAutoDebitFlag(String autoDebitFlag) {
		this.autoDebitFlag = autoDebitFlag;
	}

	public BigDecimal getCalcShippingRespPct() {
		return this.calcShippingRespPct;
	}

	public void setCalcShippingRespPct(BigDecimal calcShippingRespPct) {
		this.calcShippingRespPct = calcShippingRespPct;
	}

	public BigDecimal getDiagnosticAdjustmentAmt() {
		return this.diagnosticAdjustmentAmt;
	}

	public void setDiagnosticAdjustmentAmt(BigDecimal diagnosticAdjustmentAmt) {
		this.diagnosticAdjustmentAmt = diagnosticAdjustmentAmt;
	}

	public Timestamp getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Timestamp dueDate) {
		this.dueDate = dueDate;
	}

	public BigDecimal getInAddlShippingChargesAmt() {
		return this.inAddlShippingChargesAmt;
	}

	public void setInAddlShippingChargesAmt(BigDecimal inAddlShippingChargesAmt) {
		this.inAddlShippingChargesAmt = inAddlShippingChargesAmt;
	}

	public BigDecimal getInSupplierShippingSubtotalAmt() {
		return this.inSupplierShippingSubtotalAmt;
	}

	public void setInSupplierShippingSubtotalAmt(BigDecimal inSupplierShippingSubtotalAmt) {
		this.inSupplierShippingSubtotalAmt = inSupplierShippingSubtotalAmt;
	}

	public Timestamp getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(Timestamp issueDate) {
		this.issueDate = issueDate;
	}

	public BigDecimal getOutAddlShippingChargesAmt() {
		return this.outAddlShippingChargesAmt;
	}

	public void setOutAddlShippingChargesAmt(BigDecimal outAddlShippingChargesAmt) {
		this.outAddlShippingChargesAmt = outAddlShippingChargesAmt;
	}

	public BigDecimal getOverallAdjustmentAmt() {
		return this.overallAdjustmentAmt;
	}

	public void setOverallAdjustmentAmt(BigDecimal overallAdjustmentAmt) {
		this.overallAdjustmentAmt = overallAdjustmentAmt;
	}

	public String getOverallDiscountType() {
		return this.overallDiscountType;
	}

	public void setOverallDiscountType(String overallDiscountType) {
		this.overallDiscountType = overallDiscountType;
	}

	public BigDecimal getPercentDiscount() {
		return this.percentDiscount;
	}

	public void setPercentDiscount(BigDecimal percentDiscount) {
		this.percentDiscount = percentDiscount;
	}

	public String getPlantOverallAdjFlag() {
		return this.plantOverallAdjFlag;
	}

	public void setPlantOverallAdjFlag(String plantOverallAdjFlag) {
		this.plantOverallAdjFlag = plantOverallAdjFlag;
	}

	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public BigDecimal getSubTotalAmt() {
		return this.subTotalAmt;
	}

	public void setSubTotalAmt(BigDecimal subTotalAmt) {
		this.subTotalAmt = subTotalAmt;
	}

	public String getSuppName() {
		return this.suppName;
	}

	public void setSuppName(String suppName) {
		this.suppName = suppName;
	}

	public BigDecimal getSupplierRespAddlShippingChargesAmt() {
		return this.supplierRespAddlShippingChargesAmt;
	}

	public void setSupplierRespAddlShippingChargesAmt(BigDecimal supplierRespAddlShippingChargesAmt) {
		this.supplierRespAddlShippingChargesAmt = supplierRespAddlShippingChargesAmt;
	}

	public BigDecimal getTotalAddlShippingChargesAmt() {
		return this.totalAddlShippingChargesAmt;
	}

	public void setTotalAddlShippingChargesAmt(BigDecimal totalAddlShippingChargesAmt) {
		this.totalAddlShippingChargesAmt = totalAddlShippingChargesAmt;
	}

	public BigDecimal getTotalAmt() {
		return this.totalAmt;
	}

	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	public BigDecimal getTotalMarketClaim() {
		return this.totalMarketClaim;
	}

	public void setTotalMarketClaim(BigDecimal totalMarketClaim) {
		this.totalMarketClaim = totalMarketClaim;
	}

	public BigDecimal getTotalSupplierChargeAmt() {
		return this.totalSupplierChargeAmt;
	}

	public void setTotalSupplierChargeAmt(BigDecimal totalSupplierChargeAmt) {
		this.totalSupplierChargeAmt = totalSupplierChargeAmt;
	}

	public BigDecimal getTotalSupplierRespSubTotalAmt() {
		return this.totalSupplierRespSubTotalAmt;
	}

	public void setTotalSupplierRespSubTotalAmt(BigDecimal totalSupplierRespSubTotalAmt) {
		this.totalSupplierRespSubTotalAmt = totalSupplierRespSubTotalAmt;
	}

	public BigDecimal getTotalSupplierResponsibilityPct() {
		return this.totalSupplierResponsibilityPct;
	}

	public void setTotalSupplierResponsibilityPct(BigDecimal totalSupplierResponsibilityPct) {
		this.totalSupplierResponsibilityPct = totalSupplierResponsibilityPct;
	}

	public String getVoucherDesc() {
		return this.voucherDesc;
	}

	public void setVoucherDesc(String voucherDesc) {
		this.voucherDesc = voucherDesc;
	}

	public String getVoucherNo() {
		return this.voucherNo;
	}

	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}

}