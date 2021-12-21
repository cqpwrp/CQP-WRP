package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the tblVOUCHER_PLANT_SUMMARY_HIST database table.
 */
@Embeddable
@Table(name="tblVOUCHER_PLANT_SUMMARY_HIST")
@NamedQuery(name="TblVOUCHER_PLANT_SUMMARY_HIST.findAll", query="SELECT t FROM TblVOUCHER_PLANT_SUMMARY_HIST t")
public class TblVOUCHER_PLANT_SUMMARY_HIST implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	@Column(name="DEPT_NO")
	private String deptNo;

	@Column(name="DESTINATION_NAME")
	private String destinationName;

	@Column(name="INVOICE_DATE")
	private Timestamp invoiceDate;

	@Column(name="INVOICE_NO")
	private String invoiceNo;

	@Column(name="PLANT_DIAGNOSTIC_ADJUSTMENT_AMT")
	private BigDecimal plantDiagnosticAdjustmentAmt;

	@Column(name="PLANT_MARKET_CLAIM")
	private BigDecimal plantMarketClaim;

	@Column(name="PLANT_OVERALL_ADJUSTMENT_AMT")
	private BigDecimal plantOverallAdjustmentAmt;

	@Column(name="PLANT_SUB_TOTAL_AMT")
	private BigDecimal plantSubTotalAmt;

	@Column(name="PLANT_SUPP_RESP_ADDL_SHIPPING_CHARGES_AMT")
	private BigDecimal plantSuppRespAddlShippingChargesAmt;

	@Column(name="PLANT_SUPPLIER_RESP_SUB_TOTAL_AMT")
	private BigDecimal plantSupplierRespSubTotalAmt;

	@Column(name="PLANT_SUPPLIER_RESPONSIBILITY_PCT")
	private BigDecimal plantSupplierResponsibilityPct;

	@Column(name="PLANT_TOTAL_AMT")
	private BigDecimal plantTotalAmt;

	@Column(name="PLANT_TOTAL_SUPPLIER_CHARGE_AMT")
	private BigDecimal plantTotalSupplierChargeAmt;

	@Column(name="PROJECT_NO")
	private String projectNo;

	@Column(name="PURCHASE_ORDER_NO")
	private String purchaseOrderNo;

	@Column(name="QTR_NO")
	private String qtrNo;

	@Column(name="QTR_YEAR")
	private String qtrYear;

	@Column(name="SUPP_NAME")
	private String suppName;

	@Column(name="SUPP_NO")
	private String suppNo;

	public TblVOUCHER_PLANT_SUMMARY_HIST() {
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getDeptNo() {
		return this.deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getDestinationName() {
		return this.destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
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

	public BigDecimal getPlantDiagnosticAdjustmentAmt() {
		return this.plantDiagnosticAdjustmentAmt;
	}

	public void setPlantDiagnosticAdjustmentAmt(BigDecimal plantDiagnosticAdjustmentAmt) {
		this.plantDiagnosticAdjustmentAmt = plantDiagnosticAdjustmentAmt;
	}

	public BigDecimal getPlantMarketClaim() {
		return this.plantMarketClaim;
	}

	public void setPlantMarketClaim(BigDecimal plantMarketClaim) {
		this.plantMarketClaim = plantMarketClaim;
	}

	public BigDecimal getPlantOverallAdjustmentAmt() {
		return this.plantOverallAdjustmentAmt;
	}

	public void setPlantOverallAdjustmentAmt(BigDecimal plantOverallAdjustmentAmt) {
		this.plantOverallAdjustmentAmt = plantOverallAdjustmentAmt;
	}

	public BigDecimal getPlantSubTotalAmt() {
		return this.plantSubTotalAmt;
	}

	public void setPlantSubTotalAmt(BigDecimal plantSubTotalAmt) {
		this.plantSubTotalAmt = plantSubTotalAmt;
	}

	public BigDecimal getPlantSuppRespAddlShippingChargesAmt() {
		return this.plantSuppRespAddlShippingChargesAmt;
	}

	public void setPlantSuppRespAddlShippingChargesAmt(BigDecimal plantSuppRespAddlShippingChargesAmt) {
		this.plantSuppRespAddlShippingChargesAmt = plantSuppRespAddlShippingChargesAmt;
	}

	public BigDecimal getPlantSupplierRespSubTotalAmt() {
		return this.plantSupplierRespSubTotalAmt;
	}

	public void setPlantSupplierRespSubTotalAmt(BigDecimal plantSupplierRespSubTotalAmt) {
		this.plantSupplierRespSubTotalAmt = plantSupplierRespSubTotalAmt;
	}

	public BigDecimal getPlantSupplierResponsibilityPct() {
		return this.plantSupplierResponsibilityPct;
	}

	public void setPlantSupplierResponsibilityPct(BigDecimal plantSupplierResponsibilityPct) {
		this.plantSupplierResponsibilityPct = plantSupplierResponsibilityPct;
	}

	public BigDecimal getPlantTotalAmt() {
		return this.plantTotalAmt;
	}

	public void setPlantTotalAmt(BigDecimal plantTotalAmt) {
		this.plantTotalAmt = plantTotalAmt;
	}

	public BigDecimal getPlantTotalSupplierChargeAmt() {
		return this.plantTotalSupplierChargeAmt;
	}

	public void setPlantTotalSupplierChargeAmt(BigDecimal plantTotalSupplierChargeAmt) {
		this.plantTotalSupplierChargeAmt = plantTotalSupplierChargeAmt;
	}

	public String getProjectNo() {
		return this.projectNo;
	}

	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public String getPurchaseOrderNo() {
		return this.purchaseOrderNo;
	}

	public void setPurchaseOrderNo(String purchaseOrderNo) {
		this.purchaseOrderNo = purchaseOrderNo;
	}

	public String getQtrNo() {
		return this.qtrNo;
	}

	public void setQtrNo(String qtrNo) {
		this.qtrNo = qtrNo;
	}

	public String getQtrYear() {
		return this.qtrYear;
	}

	public void setQtrYear(String qtrYear) {
		this.qtrYear = qtrYear;
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

}