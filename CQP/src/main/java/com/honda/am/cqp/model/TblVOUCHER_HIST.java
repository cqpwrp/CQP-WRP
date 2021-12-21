package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the tblVOUCHER_HIST database table.
 * 
 */
@Entity
@Table(name="tblVOUCHER_HIST")
@NamedQuery(name="TblVOUCHER_HIST.findAll", query="SELECT t FROM TblVOUCHER_HIST t")
public class TblVOUCHER_HIST implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="VOUCHER_SK")
	private int voucherSk;

	@Column(name="ADDL_SHIPPING_CHARGES_AMT")
	private BigDecimal addlShippingChargesAmt;

	@Column(name="CLAIM_QUARTER")
	private String claimQuarter;

	@Column(name="DUE_DATE")
	private Timestamp dueDate;

	@Column(name="INVOICE_DATE")
	private Timestamp invoiceDate;

	@Column(name="INVOICE_NO")
	private String invoiceNo;

	@Column(name="ISSUE_DATE")
	private Timestamp issueDate;

	@Column(name="OVERALL_ADJUSTMENT_AMT")
	private BigDecimal overallAdjustmentAmt;

	@Column(name="OVERALL_DISCOUNT_TYPE")
	private String overallDiscountType;

	@Column(name="PERCENT_DISCOUNT")
	private BigDecimal percentDiscount;

	@Column(name="STATUS_ID")
	private short statusId;

	@Column(name="SUB_TOTAL_AMT")
	private BigDecimal subTotalAmt;

	@Column(name="SUPP_NAME")
	private String suppName;

	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="SUPPLIER_ADDL_SHIPPING_CHARGES_AMT")
	private BigDecimal supplierAddlShippingChargesAmt;

	@Column(name="TOTAL_AMT")
	private BigDecimal totalAmt;

	@Column(name="TOTAL_MARKET_CLAIM")
	private BigDecimal totalMarketClaim;

	@Column(name="TOTAL_SUPPLIER_RESPONSIBILITY_PCT")
	private BigDecimal totalSupplierResponsibilityPct;

	@Column(name="VOUCHER_DESC")
	private String voucherDesc;

	@Column(name="VOUCHER_NO")
	private String voucherNo;

	@Column(name="VOUCHER_QUARTER")
	private short voucherQuarter;

	@Column(name="VOUCHER_YEAR")
	private int voucherYear;

	public TblVOUCHER_HIST() {
	}

	public int getVoucherSk() {
		return this.voucherSk;
	}

	public void setVoucherSk(int voucherSk) {
		this.voucherSk = voucherSk;
	}

	public BigDecimal getAddlShippingChargesAmt() {
		return this.addlShippingChargesAmt;
	}

	public void setAddlShippingChargesAmt(BigDecimal addlShippingChargesAmt) {
		this.addlShippingChargesAmt = addlShippingChargesAmt;
	}

	public String getClaimQuarter() {
		return this.claimQuarter;
	}

	public void setClaimQuarter(String claimQuarter) {
		this.claimQuarter = claimQuarter;
	}

	public Timestamp getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Timestamp dueDate) {
		this.dueDate = dueDate;
	}

	public Timestamp getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceDate(Timestamp invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public Timestamp getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(Timestamp issueDate) {
		this.issueDate = issueDate;
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

	public short getStatusId() {
		return this.statusId;
	}

	public void setStatusId(short statusId) {
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

	public String getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

	public BigDecimal getSupplierAddlShippingChargesAmt() {
		return this.supplierAddlShippingChargesAmt;
	}

	public void setSupplierAddlShippingChargesAmt(BigDecimal supplierAddlShippingChargesAmt) {
		this.supplierAddlShippingChargesAmt = supplierAddlShippingChargesAmt;
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

	public short getVoucherQuarter() {
		return this.voucherQuarter;
	}

	public void setVoucherQuarter(short voucherQuarter) {
		this.voucherQuarter = voucherQuarter;
	}

	public int getVoucherYear() {
		return this.voucherYear;
	}

	public void setVoucherYear(int voucherYear) {
		this.voucherYear = voucherYear;
	}

}