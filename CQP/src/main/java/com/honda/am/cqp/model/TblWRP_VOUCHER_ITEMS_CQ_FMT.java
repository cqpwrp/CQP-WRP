package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblWRP_VOUCHER_ITEMS_CQ_FMT database table.
 * 
 */
@Embeddable
@Table(name="tblWRP_VOUCHER_ITEMS_CQ_FMT")
@NamedQuery(name="TblWRP_VOUCHER_ITEMS_CQ_FMT.findAll", query="SELECT t FROM TblWRP_VOUCHER_ITEMS_CQ_FMT t")
public class TblWRP_VOUCHER_ITEMS_CQ_FMT implements Serializable {
	private static final long serialVersionUID = 1L;

	private Timestamp AF_Off_date_End;

	private Timestamp AF_Off_date_Start;

	@Column(name="FACTORY")
	private String factory;

	@Column(name="MOD_NAME")
	private String modName;

	@Column(name="MOD_YEAR")
	private String modYear;

	@Column(name="MTC_MODEL")
	private String mtcModel;

	@Column(name="MTC_OPTION")
	private String mtcOption;

	@Column(name="MTC_SK")
	private int mtcSk;

	@Column(name="MTC_TYPE")
	private String mtcType;

	@Column(name="Prod_End_Date_sk")
	private int prod_End_Date_sk;

	@Column(name="Prod_Start_Date_sk")
	private int prod_Start_Date_sk;

	@Column(name="Serial_No_End")
	private String serial_No_End;

	@Column(name="Serial_No_Start")
	private String serial_No_Start;

	@Column(name="Service_Part_No")
	private String service_Part_No;

	@Column(name="Supp_no")
	private String supp_no;

	@Column(name="Title_desc")
	private String title_desc;

	@Column(name="VINSTRUCTURE")
	private String vinstructure;

	private String WRP_No;

	public TblWRP_VOUCHER_ITEMS_CQ_FMT() {
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

	public String getFactory() {
		return this.factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getModName() {
		return this.modName;
	}

	public void setModName(String modName) {
		this.modName = modName;
	}

	public String getModYear() {
		return this.modYear;
	}

	public void setModYear(String modYear) {
		this.modYear = modYear;
	}

	public String getMtcModel() {
		return this.mtcModel;
	}

	public void setMtcModel(String mtcModel) {
		this.mtcModel = mtcModel;
	}

	public String getMtcOption() {
		return this.mtcOption;
	}

	public void setMtcOption(String mtcOption) {
		this.mtcOption = mtcOption;
	}

	public int getMtcSk() {
		return this.mtcSk;
	}

	public void setMtcSk(int mtcSk) {
		this.mtcSk = mtcSk;
	}

	public String getMtcType() {
		return this.mtcType;
	}

	public void setMtcType(String mtcType) {
		this.mtcType = mtcType;
	}

	public int getProd_End_Date_sk() {
		return this.prod_End_Date_sk;
	}

	public void setProd_End_Date_sk(int prod_End_Date_sk) {
		this.prod_End_Date_sk = prod_End_Date_sk;
	}

	public int getProd_Start_Date_sk() {
		return this.prod_Start_Date_sk;
	}

	public void setProd_Start_Date_sk(int prod_Start_Date_sk) {
		this.prod_Start_Date_sk = prod_Start_Date_sk;
	}

	public String getSerial_No_End() {
		return this.serial_No_End;
	}

	public void setSerial_No_End(String serial_No_End) {
		this.serial_No_End = serial_No_End;
	}

	public String getSerial_No_Start() {
		return this.serial_No_Start;
	}

	public void setSerial_No_Start(String serial_No_Start) {
		this.serial_No_Start = serial_No_Start;
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

	public String getVinstructure() {
		return this.vinstructure;
	}

	public void setVinstructure(String vinstructure) {
		this.vinstructure = vinstructure;
	}

	public String getWRP_No() {
		return this.WRP_No;
	}

	public void setWRP_No(String WRP_No) {
		this.WRP_No = WRP_No;
	}

}