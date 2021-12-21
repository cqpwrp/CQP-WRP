package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the tblWRP_VOUCHER_ITEMS_Raw_Staging database table.
 * 
 */
@Embeddable
@Table(name="tblWRP_VOUCHER_ITEMS_Raw_Staging")
@NamedQuery(name="TblWRP_VOUCHER_ITEMS_Raw_Staging.findAll", query="SELECT t FROM TblWRP_VOUCHER_ITEMS_Raw_Staging t")
public class TblWRP_VOUCHER_ITEMS_Raw_Staging implements Serializable {
	private static final long serialVersionUID = 1L;

	private Timestamp AF_Off_date_End;

	private Timestamp AF_Off_date_Start;

	@Column(name="Defect_Code")
	private String defect_Code;

	@Column(name="DTF_MAX")
	private int dtfMax;

	@Column(name="DTF_MIN")
	private int dtfMin;

	private String ECU_Code;

	@Column(name="Factory")
	private String factory;

	private String MTC_Model;

	private String MTC_Option;

	private String MTC_Type;

	@Column(name="Odom_Max")
	private int odom_Max;

	@Column(name="Odom_Min")
	private int odom_Min;

	@Column(name="Part_Chg_Max")
	private BigDecimal part_Chg_Max;

	@Column(name="Part_Chg_Min")
	private BigDecimal part_Chg_Min;

	private Timestamp RO_date_End;

	private Timestamp RO_date_Start;

	@Column(name="Service_Part_No")
	private String service_Part_No;

	@Column(name="Supp_no")
	private String supp_no;

	@Column(name="Title_desc")
	private String title_desc;

	private BigDecimal TTLChg_Max;

	private BigDecimal TTlChg_Min;

	private String WRP_No;

	public TblWRP_VOUCHER_ITEMS_Raw_Staging() {
	}

	public Timestamp getAF_Off_date_End() {
		return this.AF_Off_date_End;
	}

	public void setAF_Off_date_End(Timestamp AF_Off_date_End) {
		this.AF_Off_date_End = AF_Off_date_End;
	}

	public Timestamp getAF_Off_date_Start() {
		return this.AF_Off_date_Start;
	}

	public void setAF_Off_date_Start(Timestamp AF_Off_date_Start) {
		this.AF_Off_date_Start = AF_Off_date_Start;
	}

	public String getDefect_Code() {
		return this.defect_Code;
	}

	public void setDefect_Code(String defect_Code) {
		this.defect_Code = defect_Code;
	}

	public int getDtfMax() {
		return this.dtfMax;
	}

	public void setDtfMax(int dtfMax) {
		this.dtfMax = dtfMax;
	}

	public int getDtfMin() {
		return this.dtfMin;
	}

	public void setDtfMin(int dtfMin) {
		this.dtfMin = dtfMin;
	}

	public String getECU_Code() {
		return this.ECU_Code;
	}

	public void setECU_Code(String ECU_Code) {
		this.ECU_Code = ECU_Code;
	}

	public String getFactory() {
		return this.factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getMTC_Model() {
		return this.MTC_Model;
	}

	public void setMTC_Model(String MTC_Model) {
		this.MTC_Model = MTC_Model;
	}

	public String getMTC_Option() {
		return this.MTC_Option;
	}

	public void setMTC_Option(String MTC_Option) {
		this.MTC_Option = MTC_Option;
	}

	public String getMTC_Type() {
		return this.MTC_Type;
	}

	public void setMTC_Type(String MTC_Type) {
		this.MTC_Type = MTC_Type;
	}

	public int getOdom_Max() {
		return this.odom_Max;
	}

	public void setOdom_Max(int odom_Max) {
		this.odom_Max = odom_Max;
	}

	public int getOdom_Min() {
		return this.odom_Min;
	}

	public void setOdom_Min(int odom_Min) {
		this.odom_Min = odom_Min;
	}

	public BigDecimal getPart_Chg_Max() {
		return this.part_Chg_Max;
	}

	public void setPart_Chg_Max(BigDecimal part_Chg_Max) {
		this.part_Chg_Max = part_Chg_Max;
	}

	public BigDecimal getPart_Chg_Min() {
		return this.part_Chg_Min;
	}

	public void setPart_Chg_Min(BigDecimal part_Chg_Min) {
		this.part_Chg_Min = part_Chg_Min;
	}

	public Timestamp getRO_date_End() {
		return this.RO_date_End;
	}

	public void setRO_date_End(Timestamp RO_date_End) {
		this.RO_date_End = RO_date_End;
	}

	public Timestamp getRO_date_Start() {
		return this.RO_date_Start;
	}

	public void setRO_date_Start(Timestamp RO_date_Start) {
		this.RO_date_Start = RO_date_Start;
	}

	public String getService_Part_No() {
		return this.service_Part_No;
	}

	public void setService_Part_No(String service_Part_No) {
		this.service_Part_No = service_Part_No;
	}

	public String getSupp_no() {
		return this.supp_no;
	}

	public void setSupp_no(String supp_no) {
		this.supp_no = supp_no;
	}

	public String getTitle_desc() {
		return this.title_desc;
	}

	public void setTitle_desc(String title_desc) {
		this.title_desc = title_desc;
	}

	public BigDecimal getTTLChg_Max() {
		return this.TTLChg_Max;
	}

	public void setTTLChg_Max(BigDecimal TTLChg_Max) {
		this.TTLChg_Max = TTLChg_Max;
	}

	public BigDecimal getTTlChg_Min() {
		return this.TTlChg_Min;
	}

	public void setTTlChg_Min(BigDecimal TTlChg_Min) {
		this.TTlChg_Min = TTlChg_Min;
	}

	public String getWRP_No() {
		return this.WRP_No;
	}

	public void setWRP_No(String WRP_No) {
		this.WRP_No = WRP_No;
	}

}