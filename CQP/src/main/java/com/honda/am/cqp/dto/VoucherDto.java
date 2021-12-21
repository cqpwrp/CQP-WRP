package com.honda.am.cqp.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class VoucherDto {

	private String voucherNo;
	private String suppNo;
	private String qtrNo;
	private String qtrYear;
	private String suppName;
	private int statusId;
	private String voucherDesc;
	private Timestamp issueDate;
	private Timestamp dueDate;
	private BigDecimal subTotalAmt;
	private BigDecimal totalAddlShippingChargesAmt;
	private BigDecimal totalSupplierResponsibilityPct;
	private BigDecimal supplierRespAddlShippingChargesAmt;
	private BigDecimal overallAdjustmentAmt;
	private BigDecimal diagnosticAdjustmentAmt;
	private BigDecimal totalAmt;
	private BigDecimal totalMarketClaim;
	private BigDecimal calcShippingRespPct;
	private BigDecimal totalSupplierChargeAmt;
	private String statusName;
	private BigDecimal totalSupplierRespSubTotalAmt;
	private String plantOverallAdjFlag;

	public VoucherDto() {
	}

	public String getVoucherNo() {
		return voucherNo;
	}

	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}

	public String getSuppNo() {
		return suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

	public String getQtrNo() {
		return qtrNo;
	}

	public void setQtrNo(String qtrNo) {
		this.qtrNo = qtrNo;
	}

	public String getQtrYear() {
		return qtrYear;
	}

	public void setQtrYear(String qtrYear) {
		this.qtrYear = qtrYear;
	}

	public String getSuppName() {
		return suppName;
	}

	public void setSuppName(String suppName) {
		this.suppName = suppName;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getVoucherDesc() {
		return voucherDesc;
	}

	public void setVoucherDesc(String voucherDesc) {
		this.voucherDesc = voucherDesc;
	}

	public Timestamp getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Timestamp issueDate) {
		this.issueDate = issueDate;
	}

	public Timestamp getDueDate() {
		return dueDate;
	}

	public void setDueDate(Timestamp dueDate) {
		this.dueDate = dueDate;
	}

	public BigDecimal getSubTotalAmt() {
		return subTotalAmt;
	}

	public void setSubTotalAmt(BigDecimal subTotalAmt) {
		this.subTotalAmt = subTotalAmt;
	}

	public BigDecimal getTotalAddlShippingChargesAmt() {
		return totalAddlShippingChargesAmt;
	}

	public void setTotalAddlShippingChargesAmt(BigDecimal totalAddlShippingChargesAmt) {
		this.totalAddlShippingChargesAmt = totalAddlShippingChargesAmt;
	}

	public BigDecimal getTotalSupplierResponsibilityPct() {
		return totalSupplierResponsibilityPct;
	}

	public void setTotalSupplierResponsibilityPct(BigDecimal totalSupplierResponsibilityPct) {
		this.totalSupplierResponsibilityPct = totalSupplierResponsibilityPct;
	}

	public BigDecimal getSupplierRespAddlShippingChargesAmt() {
		return supplierRespAddlShippingChargesAmt;
	}

	public void setSupplierRespAddlShippingChargesAmt(BigDecimal supplierRespAddlShippingChargesAmt) {
		this.supplierRespAddlShippingChargesAmt = supplierRespAddlShippingChargesAmt;
	}

	public BigDecimal getOverallAdjustmentAmt() {
		return overallAdjustmentAmt;
	}

	public void setOverallAdjustmentAmt(BigDecimal overallAdjustmentAmt) {
		this.overallAdjustmentAmt = overallAdjustmentAmt;
	}

	public BigDecimal getDiagnosticAdjustmentAmt() {
		return diagnosticAdjustmentAmt;
	}

	public void setDiagnosticAdjustmentAmt(BigDecimal diagnosticAdjustmentAmt) {
		this.diagnosticAdjustmentAmt = diagnosticAdjustmentAmt;
	}

	public BigDecimal getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	public BigDecimal getTotalMarketClaim() {
		return totalMarketClaim;
	}

	public void setTotalMarketClaim(BigDecimal totalMarketClaim) {
		this.totalMarketClaim = totalMarketClaim;
	}

	public BigDecimal getCalcShippingRespPct() {
		return calcShippingRespPct;
	}

	public void setCalcShippingRespPct(BigDecimal calcShippingRespPct) {
		this.calcShippingRespPct = calcShippingRespPct;
	}

	public BigDecimal getTotalSupplierChargeAmt() {
		return totalSupplierChargeAmt;
	}

	public void setTotalSupplierChargeAmt(BigDecimal totalSupplierChargeAmt) {
		this.totalSupplierChargeAmt = totalSupplierChargeAmt;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public BigDecimal getTotalSupplierRespSubTotalAmt() {
		return totalSupplierRespSubTotalAmt;
	}

	public void setTotalSupplierRespSubTotalAmt(BigDecimal totalSupplierRespSubTotalAmt) {
		this.totalSupplierRespSubTotalAmt = totalSupplierRespSubTotalAmt;
	}

	public String getPlantOverallAdjFlag() {
		return plantOverallAdjFlag;
	}

	public void setPlantOverallAdjFlag(String plantOverallAdjFlag) {
		this.plantOverallAdjFlag = plantOverallAdjFlag;
	}

	@Override
	public String toString() {
		return "VoucherDto [voucherNo=" + voucherNo + ", suppNo=" + suppNo + ", qtrNo=" + qtrNo + ", qtrYear=" + qtrYear
				+ ", suppName=" + suppName + ", statusId=" + statusId + ", voucherDesc=" + voucherDesc + ", issueDate="
				+ issueDate + ", dueDate=" + dueDate + ", subTotalAmt=" + subTotalAmt + ", totalAddlShippingChargesAmt="
				+ totalAddlShippingChargesAmt + ", totalSupplierResponsibilityPct=" + totalSupplierResponsibilityPct
				+ ", supplierRespAddlShippingChargesAmt=" + supplierRespAddlShippingChargesAmt
				+ ", overallAdjustmentAmt=" + overallAdjustmentAmt + ", diagnosticAdjustmentAmt="
				+ diagnosticAdjustmentAmt + ", totalAmt=" + totalAmt + ", totalMarketClaim=" + totalMarketClaim
				+ ", calcShippingRespPct=" + calcShippingRespPct + ", totalSupplierChargeAmt=" + totalSupplierChargeAmt
				+ ", statusName=" + statusName + ", totalSupplierRespSubTotalAmt=" + totalSupplierRespSubTotalAmt
				+ ", plantOverallAdjFlag=" + plantOverallAdjFlag + "]";
	}

}
