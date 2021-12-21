package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PLANT_AND_SUMMARY database table.
 * 
 */
@Embeddable
@Table(name="PLANT_AND_SUMMARY")
@NamedQuery(name="PlantAndSummary.findAll", query="SELECT p FROM PlantAndSummary p")
public class PlantAndSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DIAGNOSTIC_ADJUSTMENT_AMT")
	private BigDecimal diagnosticAdjustmentAmt;

	@Column(name="OVERALL_ADJUSTMENT_AMT")
	private BigDecimal overallAdjustmentAmt;

	@Column(name="PLANT_DIAGNOSTIC_ADJUSTMENT_AMT")
	private BigDecimal plantDiagnosticAdjustmentAmt;

	@Column(name="PLANT_OVERALL_ADJUSTMENT_AMT")
	private BigDecimal plantOverallAdjustmentAmt;

	@Column(name="PLANT_SUB_TOTAL_AMT")
	private BigDecimal plantSubTotalAmt;

	@Column(name="PLANT_SUPP_RESP_ADDL_SHIPPING_CHARGES_AMT")
	private BigDecimal plantSuppRespAddlShippingChargesAmt;

	@Column(name="PLANT_SUPPLIER_RESP_SUB_TOTAL_AMT")
	private BigDecimal plantSupplierRespSubTotalAmt;

	@Column(name="PLANT_TOTAL_AMT")
	private BigDecimal plantTotalAmt;

	@Column(name="PLANT_TOTAL_SUPPLIER_CHARGE_AMT")
	private BigDecimal plantTotalSupplierChargeAmt;

	@Column(name="QTR_NO")
	private String qtrNo;

	@Column(name="QTR_YEAR")
	private String qtrYear;

	@Column(name="SUB_TOTAL_AMT")
	private BigDecimal subTotalAmt;

	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="SUPPLIER_RESP_ADDL_SHIPPING_CHARGES_AMT")
	private BigDecimal supplierRespAddlShippingChargesAmt;

	@Column(name="TOTAL_ADDL_SHIPPING_CHARGES_AMT")
	private BigDecimal totalAddlShippingChargesAmt;

	@Column(name="TOTAL_AMT")
	private BigDecimal totalAmt;

	@Column(name="TOTAL_SUPPLIER_CHARGE_AMT")
	private BigDecimal totalSupplierChargeAmt;

	@Column(name="TOTAL_SUPPLIER_RESP_SUB_TOTAL_AMT")
	private BigDecimal totalSupplierRespSubTotalAmt;

	public PlantAndSummary() {
	}

	public BigDecimal getDiagnosticAdjustmentAmt() {
		return this.diagnosticAdjustmentAmt;
	}

	public void setDiagnosticAdjustmentAmt(BigDecimal diagnosticAdjustmentAmt) {
		this.diagnosticAdjustmentAmt = diagnosticAdjustmentAmt;
	}

	public BigDecimal getOverallAdjustmentAmt() {
		return this.overallAdjustmentAmt;
	}

	public void setOverallAdjustmentAmt(BigDecimal overallAdjustmentAmt) {
		this.overallAdjustmentAmt = overallAdjustmentAmt;
	}

	public BigDecimal getPlantDiagnosticAdjustmentAmt() {
		return this.plantDiagnosticAdjustmentAmt;
	}

	public void setPlantDiagnosticAdjustmentAmt(BigDecimal plantDiagnosticAdjustmentAmt) {
		this.plantDiagnosticAdjustmentAmt = plantDiagnosticAdjustmentAmt;
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

	public BigDecimal getSubTotalAmt() {
		return this.subTotalAmt;
	}

	public void setSubTotalAmt(BigDecimal subTotalAmt) {
		this.subTotalAmt = subTotalAmt;
	}

	public String getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
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

}