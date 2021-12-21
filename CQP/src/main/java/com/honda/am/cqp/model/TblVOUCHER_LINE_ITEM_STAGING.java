package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tblVOUCHER_LINE_ITEM_STAGING database table.
 * 
 */
@Embeddable
@Table(name="tblVOUCHER_LINE_ITEM_STAGING")
@NamedQuery(name="TblVOUCHER_LINE_ITEM_STAGING.findAll", query="SELECT t FROM TblVOUCHER_LINE_ITEM_STAGING t")
public class TblVOUCHER_LINE_ITEM_STAGING implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACTUAL_PARTS_SHIPPED")
	private int actualPartsShipped;

	@Column(name="APPROVE_CLAIM_QTY")
	private int approveClaimQty;

	@Column(name="BLOCK_PART_FLAG")
	private String blockPartFlag;

	@Column(name="CALC_SUPPLIER_RESP_PCT")
	private BigDecimal calcSupplierRespPct;

	@Column(name="CALLIN_PART_SK")
	private int callinPartSk;

	@Column(name="CLAIM_COST_SUBTOTAL_AMT")
	private BigDecimal claimCostSubtotalAmt;

	@Column(name="COST_PER_PART_AMT")
	private BigDecimal costPerPartAmt;

	@Column(name="DEALER_NET_AMT")
	private BigDecimal dealerNetAmt;

	@Column(name="DESTINATION_NAME")
	private String destinationName;

	@Column(name="FAC_NAME")
	private String facName;

	@Column(name="FIXED_SUPPLIER_RESP_PCT")
	private BigDecimal fixedSupplierRespPct;

	@Column(name="FOB_AMT")
	private BigDecimal fobAmt;

	@Column(name="FORCE_CREATE_SUPPLIER_RESP_PCT")
	private BigDecimal forceCreateSupplierRespPct;

	@Column(name="HANDLING_AMT")
	private BigDecimal handlingAmt;

	@Column(name="[HOURS]")
	private BigDecimal hours;

	@Column(name="IN_SHIPPING_AMT")
	private BigDecimal inShippingAmt;

	@Column(name="IN_SUPPLIER_SHIPPING_AMT")
	private BigDecimal inSupplierShippingAmt;

	@Column(name="LABOR_FLAT_RATE_AMT")
	private BigDecimal laborFlatRateAmt;

	@Column(name="LABOR_PER_PART_AMT")
	private BigDecimal laborPerPartAmt;

	@Column(name="LONG_PART_NO")
	private String longPartNo;

	@Column(name="MARKET_NAME")
	private String marketName;

	@Column(name="MODEL_NAME")
	private String modelName;

	@Column(name="MODEL_YEAR")
	private String modelYear;

	@Column(name="NINETY_PCT_DEALER_NET_AMT")
	private BigDecimal ninetyPctDealerNetAmt;

	@Column(name="OTHER_AMT")
	private BigDecimal otherAmt;

	@Column(name="OVERRIDE_SUPPLIER_RESP_AMOUNT")
	private BigDecimal overrideSupplierRespAmount;

	@Column(name="QTR_NO")
	private String qtrNo;

	@Column(name="QTR_YEAR")
	private String qtrYear;

	@Column(name="REQUEST_NO")
	private String requestNo;

	@Column(name="RESP_PAYER_CODE")
	private String respPayerCode;

	@Column(name="SHIPPING_COST_AMT")
	private BigDecimal shippingCostAmt;

	@Column(name="SHORT_PART_NAME")
	private String shortPartName;

	@Column(name="SHORT_PART_NO")
	private String shortPartNo;

	@Column(name="SUPP_NAME")
	private String suppName;

	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="SUPPLIER_CHARGE_AMT")
	private BigDecimal supplierChargeAmt;

	@Column(name="TOTAL_WARRANTY_COST_AMT")
	private BigDecimal totalWarrantyCostAmt;

	@Column(name="TWICE_FOB_AMT")
	private BigDecimal twiceFobAmt;

	@Column(name="WAR_EXCH_RATE_AMT")
	private BigDecimal warExchRateAmt;

	@Column(name="WEIGHT")
	private BigDecimal weight;

	@Column(name="WRP_FLAG")
	private String wrpFlag;

	public TblVOUCHER_LINE_ITEM_STAGING() {
	}

	public int getActualPartsShipped() {
		return this.actualPartsShipped;
	}

	public void setActualPartsShipped(int actualPartsShipped) {
		this.actualPartsShipped = actualPartsShipped;
	}

	public int getApproveClaimQty() {
		return this.approveClaimQty;
	}

	public void setApproveClaimQty(int approveClaimQty) {
		this.approveClaimQty = approveClaimQty;
	}

	public String getBlockPartFlag() {
		return this.blockPartFlag;
	}

	public void setBlockPartFlag(String blockPartFlag) {
		this.blockPartFlag = blockPartFlag;
	}

	public BigDecimal getCalcSupplierRespPct() {
		return this.calcSupplierRespPct;
	}

	public void setCalcSupplierRespPct(BigDecimal calcSupplierRespPct) {
		this.calcSupplierRespPct = calcSupplierRespPct;
	}

	public int getCallinPartSk() {
		return this.callinPartSk;
	}

	public void setCallinPartSk(int callinPartSk) {
		this.callinPartSk = callinPartSk;
	}

	public BigDecimal getClaimCostSubtotalAmt() {
		return this.claimCostSubtotalAmt;
	}

	public void setClaimCostSubtotalAmt(BigDecimal claimCostSubtotalAmt) {
		this.claimCostSubtotalAmt = claimCostSubtotalAmt;
	}

	public BigDecimal getCostPerPartAmt() {
		return this.costPerPartAmt;
	}

	public void setCostPerPartAmt(BigDecimal costPerPartAmt) {
		this.costPerPartAmt = costPerPartAmt;
	}

	public BigDecimal getDealerNetAmt() {
		return this.dealerNetAmt;
	}

	public void setDealerNetAmt(BigDecimal dealerNetAmt) {
		this.dealerNetAmt = dealerNetAmt;
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

	public BigDecimal getFixedSupplierRespPct() {
		return this.fixedSupplierRespPct;
	}

	public void setFixedSupplierRespPct(BigDecimal fixedSupplierRespPct) {
		this.fixedSupplierRespPct = fixedSupplierRespPct;
	}

	public BigDecimal getFobAmt() {
		return this.fobAmt;
	}

	public void setFobAmt(BigDecimal fobAmt) {
		this.fobAmt = fobAmt;
	}

	public BigDecimal getForceCreateSupplierRespPct() {
		return this.forceCreateSupplierRespPct;
	}

	public void setForceCreateSupplierRespPct(BigDecimal forceCreateSupplierRespPct) {
		this.forceCreateSupplierRespPct = forceCreateSupplierRespPct;
	}

	public BigDecimal getHandlingAmt() {
		return this.handlingAmt;
	}

	public void setHandlingAmt(BigDecimal handlingAmt) {
		this.handlingAmt = handlingAmt;
	}

	public BigDecimal getHours() {
		return this.hours;
	}

	public void setHours(BigDecimal hours) {
		this.hours = hours;
	}

	public BigDecimal getInShippingAmt() {
		return this.inShippingAmt;
	}

	public void setInShippingAmt(BigDecimal inShippingAmt) {
		this.inShippingAmt = inShippingAmt;
	}

	public BigDecimal getInSupplierShippingAmt() {
		return this.inSupplierShippingAmt;
	}

	public void setInSupplierShippingAmt(BigDecimal inSupplierShippingAmt) {
		this.inSupplierShippingAmt = inSupplierShippingAmt;
	}

	public BigDecimal getLaborFlatRateAmt() {
		return this.laborFlatRateAmt;
	}

	public void setLaborFlatRateAmt(BigDecimal laborFlatRateAmt) {
		this.laborFlatRateAmt = laborFlatRateAmt;
	}

	public BigDecimal getLaborPerPartAmt() {
		return this.laborPerPartAmt;
	}

	public void setLaborPerPartAmt(BigDecimal laborPerPartAmt) {
		this.laborPerPartAmt = laborPerPartAmt;
	}

	public String getLongPartNo() {
		return this.longPartNo;
	}

	public void setLongPartNo(String longPartNo) {
		this.longPartNo = longPartNo;
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

	public BigDecimal getNinetyPctDealerNetAmt() {
		return this.ninetyPctDealerNetAmt;
	}

	public void setNinetyPctDealerNetAmt(BigDecimal ninetyPctDealerNetAmt) {
		this.ninetyPctDealerNetAmt = ninetyPctDealerNetAmt;
	}

	public BigDecimal getOtherAmt() {
		return this.otherAmt;
	}

	public void setOtherAmt(BigDecimal otherAmt) {
		this.otherAmt = otherAmt;
	}

	public BigDecimal getOverrideSupplierRespAmount() {
		return this.overrideSupplierRespAmount;
	}

	public void setOverrideSupplierRespAmount(BigDecimal overrideSupplierRespAmount) {
		this.overrideSupplierRespAmount = overrideSupplierRespAmount;
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

	public String getRequestNo() {
		return this.requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getRespPayerCode() {
		return this.respPayerCode;
	}

	public void setRespPayerCode(String respPayerCode) {
		this.respPayerCode = respPayerCode;
	}

	public BigDecimal getShippingCostAmt() {
		return this.shippingCostAmt;
	}

	public void setShippingCostAmt(BigDecimal shippingCostAmt) {
		this.shippingCostAmt = shippingCostAmt;
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

	public BigDecimal getSupplierChargeAmt() {
		return this.supplierChargeAmt;
	}

	public void setSupplierChargeAmt(BigDecimal supplierChargeAmt) {
		this.supplierChargeAmt = supplierChargeAmt;
	}

	public BigDecimal getTotalWarrantyCostAmt() {
		return this.totalWarrantyCostAmt;
	}

	public void setTotalWarrantyCostAmt(BigDecimal totalWarrantyCostAmt) {
		this.totalWarrantyCostAmt = totalWarrantyCostAmt;
	}

	public BigDecimal getTwiceFobAmt() {
		return this.twiceFobAmt;
	}

	public void setTwiceFobAmt(BigDecimal twiceFobAmt) {
		this.twiceFobAmt = twiceFobAmt;
	}

	public BigDecimal getWarExchRateAmt() {
		return this.warExchRateAmt;
	}

	public void setWarExchRateAmt(BigDecimal warExchRateAmt) {
		this.warExchRateAmt = warExchRateAmt;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public String getWrpFlag() {
		return this.wrpFlag;
	}

	public void setWrpFlag(String wrpFlag) {
		this.wrpFlag = wrpFlag;
	}

}