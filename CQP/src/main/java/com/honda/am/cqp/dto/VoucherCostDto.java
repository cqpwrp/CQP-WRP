package com.honda.am.cqp.dto;

import java.math.BigDecimal;

public class VoucherCostDto {

	private String suppNo;
	private String suppName;
	private String shortPartNo;
	private String partNo;
	private String modelNames;
	private String modelYears;
	private BigDecimal fobAmt;
	private BigDecimal dealerNetAmt;
	private BigDecimal flatRateAmt;

	public VoucherCostDto() {

	}

	public String getSuppNo() {
		return suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

	public String getSuppName() {
		return suppName;
	}

	public void setSuppName(String suppName) {
		this.suppName = suppName;
	}

	public String getShortPartNo() {
		return shortPartNo;
	}

	public void setShortPartNo(String shortPartNo) {
		this.shortPartNo = shortPartNo;
	}

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getModelNames() {
		return modelNames;
	}

	public void setModelNames(String modelNames) {
		this.modelNames = modelNames;
	}

	public String getModelYears() {
		return modelYears;
	}

	public void setModelYears(String modelYears) {
		this.modelYears = modelYears;
	}

	public BigDecimal getFobAmt() {
		return fobAmt;
	}

	public void setFobAmt(BigDecimal fobAmt) {
		this.fobAmt = fobAmt;
	}

	public BigDecimal getDealerNetAmt() {
		return dealerNetAmt;
	}

	public void setDealerNetAmt(BigDecimal dealerNetAmt) {
		this.dealerNetAmt = dealerNetAmt;
	}

	public BigDecimal getFlatRateAmt() {
		return flatRateAmt;
	}

	public void setFlatRateAmt(BigDecimal flatRateAmt) {
		this.flatRateAmt = flatRateAmt;
	}

	@Override
	public String toString() {
		return "VoucherCostDto [suppNo=" + suppNo + ", suppName=" + suppName + ", shortPartNo=" + shortPartNo
				+ ", partNo=" + partNo + ", modelNames=" + modelNames + ", modelYears=" + modelYears + ", fobAmt="
				+ fobAmt + ", dealerNetAmt=" + dealerNetAmt + ", flatRateAmt=" + flatRateAmt + "]";
	}

}
