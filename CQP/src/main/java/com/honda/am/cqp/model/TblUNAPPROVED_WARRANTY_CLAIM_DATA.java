package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;


/**
 * The persistent class for the tblUNAPPROVED_WARRANTY_CLAIM_DATA database table.
 * 
 */
@Embeddable
@Table(name="tblUNAPPROVED_WARRANTY_CLAIM_DATA")
@NamedQuery(name="TblUNAPPROVED_WARRANTY_CLAIM_DATA.findAll", query="SELECT t FROM TblUNAPPROVED_WARRANTY_CLAIM_DATA t")
public class TblUNAPPROVED_WARRANTY_CLAIM_DATA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AF_OFF_DATE")
	private Timestamp afOffDate;

	@Column(name="CLAIM_NO")
	private String claimNo;

	@Column(name="CLAIM_PART_NAME")
	private String claimPartName;

	@Column(name="CLAIM_RECEIVED_DATE")
	private Timestamp claimReceivedDate;

	@Column(name="CLAIM_SK")
	private int claimSk;

	@Column(name="DAYS_SALE_REP_QTY")
	private BigDecimal daysSaleRepQty;

	@Column(name="DEALER_NO")
	private String dealerNo;

	@Column(name="DEALER_STATE")
	private String dealerState;

	@Column(name="DEFECT_CODE_DESC")
	private String defectCodeDesc;

	@Column(name="DOORS")
	private String doors;

	@Column(name="ENGCYL")
	private String engcyl;

	@Column(name="ENGINE_OFF_DATE")
	private String engineOffDate;

	@Column(name="FAC_NAME")
	private String facName;

	@Column(name="FULL_PART_NO")
	private String fullPartNo;

	@Column(name="MODEL_NAME")
	private String modelName;

	@Column(name="MODEL_YEAR")
	private String modelYear;

	@Column(name="NAMEPLATE")
	private String nameplate;

	@Column(name="PROC_DATE_AF_OFF")
	private Time procDateAfOff;

	@Column(name="QTR_NO")
	private int qtrNo;

	@Column(name="QTR_YEAR")
	private String qtrYear;

	@Column(name="REPAIR_ORDER_DATE")
	private Timestamp repairOrderDate;

	@Column(name="REPLACED_PART")
	private String replacedPart;

	@Column(name="REPLACED_PART_NAME")
	private String replacedPartName;

	@Column(name="REPLACED_QTY")
	private int replacedQty;

	@Column(name="RESP_ASSIGN_DATE")
	private Time respAssignDate;

	@Column(name="ROYR")
	private String royr;

	@Column(name="SUBLET_CHARGE")
	private BigDecimal subletCharge;

	@Column(name="SUPP_NAME")
	private String suppName;

	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="TRANSMIS")
	private String transmis;

	@Column(name="VEHGRADE")
	private String vehgrade;

	@Column(name="VEHICLE_ODOM_QTY")
	private BigDecimal vehicleOdomQty;

	@Column(name="VIN")
	private String vin;

	@Column(name="WAR_CLAIM_DATE")
	private int warClaimDate;

	@Column(name="WAR_DEFECT_CODE")
	private String warDefectCode;

	@Column(name="WAR_EXCH_RATE_AMT")
	private BigDecimal warExchRateAmt;

	@Column(name="WAR_ORIG_DISTR_CDE")
	private String warOrigDistrCde;

	@Column(name="WAR_PROD_DISTR_CDE")
	private String warProdDistrCde;

	@Column(name="WAR_RESP_DISTR_CDE")
	private String warRespDistrCde;

	@Column(name="WAR_VEHICLE_DESTINATION")
	private String warVehicleDestination;

	public TblUNAPPROVED_WARRANTY_CLAIM_DATA() {
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

	public String getClaimPartName() {
		return this.claimPartName;
	}

	public void setClaimPartName(String claimPartName) {
		this.claimPartName = claimPartName;
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

	public BigDecimal getDaysSaleRepQty() {
		return this.daysSaleRepQty;
	}

	public void setDaysSaleRepQty(BigDecimal daysSaleRepQty) {
		this.daysSaleRepQty = daysSaleRepQty;
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

	public String getDefectCodeDesc() {
		return this.defectCodeDesc;
	}

	public void setDefectCodeDesc(String defectCodeDesc) {
		this.defectCodeDesc = defectCodeDesc;
	}

	public String getDoors() {
		return this.doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getEngcyl() {
		return this.engcyl;
	}

	public void setEngcyl(String engcyl) {
		this.engcyl = engcyl;
	}

	public String getEngineOffDate() {
		return this.engineOffDate;
	}

	public void setEngineOffDate(String engineOffDate) {
		this.engineOffDate = engineOffDate;
	}

	public String getFacName() {
		return this.facName;
	}

	public void setFacName(String facName) {
		this.facName = facName;
	}

	public String getFullPartNo() {
		return this.fullPartNo;
	}

	public void setFullPartNo(String fullPartNo) {
		this.fullPartNo = fullPartNo;
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

	public String getNameplate() {
		return this.nameplate;
	}

	public void setNameplate(String nameplate) {
		this.nameplate = nameplate;
	}

	public Time getProcDateAfOff() {
		return this.procDateAfOff;
	}

	public void setProcDateAfOff(Time procDateAfOff) {
		this.procDateAfOff = procDateAfOff;
	}

	public int getQtrNo() {
		return this.qtrNo;
	}

	public void setQtrNo(int qtrNo) {
		this.qtrNo = qtrNo;
	}

	public String getQtrYear() {
		return this.qtrYear;
	}

	public void setQtrYear(String qtrYear) {
		this.qtrYear = qtrYear;
	}

	public Timestamp getRepairOrderDate() {
		return this.repairOrderDate;
	}

	public void setRepairOrderDate(Timestamp repairOrderDate) {
		this.repairOrderDate = repairOrderDate;
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

	public int getReplacedQty() {
		return this.replacedQty;
	}

	public void setReplacedQty(int replacedQty) {
		this.replacedQty = replacedQty;
	}

	public Time getRespAssignDate() {
		return this.respAssignDate;
	}

	public void setRespAssignDate(Time respAssignDate) {
		this.respAssignDate = respAssignDate;
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

	public String getTransmis() {
		return this.transmis;
	}

	public void setTransmis(String transmis) {
		this.transmis = transmis;
	}

	public String getVehgrade() {
		return this.vehgrade;
	}

	public void setVehgrade(String vehgrade) {
		this.vehgrade = vehgrade;
	}

	public BigDecimal getVehicleOdomQty() {
		return this.vehicleOdomQty;
	}

	public void setVehicleOdomQty(BigDecimal vehicleOdomQty) {
		this.vehicleOdomQty = vehicleOdomQty;
	}

	public String getVin() {
		return this.vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public int getWarClaimDate() {
		return this.warClaimDate;
	}

	public void setWarClaimDate(int warClaimDate) {
		this.warClaimDate = warClaimDate;
	}

	public String getWarDefectCode() {
		return this.warDefectCode;
	}

	public void setWarDefectCode(String warDefectCode) {
		this.warDefectCode = warDefectCode;
	}

	public BigDecimal getWarExchRateAmt() {
		return this.warExchRateAmt;
	}

	public void setWarExchRateAmt(BigDecimal warExchRateAmt) {
		this.warExchRateAmt = warExchRateAmt;
	}

	public String getWarOrigDistrCde() {
		return this.warOrigDistrCde;
	}

	public void setWarOrigDistrCde(String warOrigDistrCde) {
		this.warOrigDistrCde = warOrigDistrCde;
	}

	public String getWarProdDistrCde() {
		return this.warProdDistrCde;
	}

	public void setWarProdDistrCde(String warProdDistrCde) {
		this.warProdDistrCde = warProdDistrCde;
	}

	public String getWarRespDistrCde() {
		return this.warRespDistrCde;
	}

	public void setWarRespDistrCde(String warRespDistrCde) {
		this.warRespDistrCde = warRespDistrCde;
	}

	public String getWarVehicleDestination() {
		return this.warVehicleDestination;
	}

	public void setWarVehicleDestination(String warVehicleDestination) {
		this.warVehicleDestination = warVehicleDestination;
	}

}