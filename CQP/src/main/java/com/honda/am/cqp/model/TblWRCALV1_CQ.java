package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the tblWRCALV1_CQ database table.
 * 
 */
@Embeddable
@Table(name="tblWRCALV1_CQ")
@NamedQuery(name="TblWRCALV1_CQ.findAll", query="SELECT t FROM TblWRCALV1_CQ t")
public class TblWRCALV1_CQ implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CALENDAR_KEY")
	private int calendarKey;

	@Column(name="DATE_DESC_TEXT")
	private String dateDescText;

	@Column(name="DAY_NAME")
	private String dayName;

	@Column(name="FISC_MO_NO")
	private BigDecimal fiscMoNo;

	@Column(name="FISCAL_QTR_NAME")
	private String fiscalQtrName;

	@Column(name="FISCAL_QTR_NO")
	private BigDecimal fiscalQtrNo;

	@Column(name="GREG_DATE")
	private Timestamp gregDate;

	@Column(name="GREG_DEC_DATE")
	private BigDecimal gregDecDate;

	@Column(name="JULIAN_DATE")
	private String julianDate;

	@Column(name="MAINT_DATE")
	private Timestamp maintDate;

	@Column(name="MO_DAY_NO")
	private BigDecimal moDayNo;

	@Column(name="MO_END_FLAG")
	private String moEndFlag;

	@Column(name="MO_NAME")
	private String moName;

	@Column(name="MO_NAME_YEAR_DATE")
	private String moNameYearDate;

	@Column(name="MO_NO")
	private BigDecimal moNo;

	@Column(name="MO_WEEK_NO")
	private BigDecimal moWeekNo;

	@Column(name="QTR_NAME")
	private String qtrName;

	@Column(name="QTR_NO")
	private BigDecimal qtrNo;

	@Column(name="QTR_NO_YR_DATE")
	private String qtrNoYrDate;

	@Column(name="SERIAL_MO_NO")
	private int serialMoNo;

	@Column(name="WEEK_DAY_NO")
	private BigDecimal weekDayNo;

	@Column(name="WEEK_NO")
	private BigDecimal weekNo;

	@Column(name="YEAR_DATE")
	private BigDecimal yearDate;

	@Column(name="YEAR_MO_NO_DATE")
	private String yearMoNoDate;

	public TblWRCALV1_CQ() {
	}

	public int getCalendarKey() {
		return this.calendarKey;
	}

	public void setCalendarKey(int calendarKey) {
		this.calendarKey = calendarKey;
	}

	public String getDateDescText() {
		return this.dateDescText;
	}

	public void setDateDescText(String dateDescText) {
		this.dateDescText = dateDescText;
	}

	public String getDayName() {
		return this.dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	public BigDecimal getFiscMoNo() {
		return this.fiscMoNo;
	}

	public void setFiscMoNo(BigDecimal fiscMoNo) {
		this.fiscMoNo = fiscMoNo;
	}

	public String getFiscalQtrName() {
		return this.fiscalQtrName;
	}

	public void setFiscalQtrName(String fiscalQtrName) {
		this.fiscalQtrName = fiscalQtrName;
	}

	public BigDecimal getFiscalQtrNo() {
		return this.fiscalQtrNo;
	}

	public void setFiscalQtrNo(BigDecimal fiscalQtrNo) {
		this.fiscalQtrNo = fiscalQtrNo;
	}

	public Timestamp getGregDate() {
		return this.gregDate;
	}

	public void setGregDate(Timestamp gregDate) {
		this.gregDate = gregDate;
	}

	public BigDecimal getGregDecDate() {
		return this.gregDecDate;
	}

	public void setGregDecDate(BigDecimal gregDecDate) {
		this.gregDecDate = gregDecDate;
	}

	public String getJulianDate() {
		return this.julianDate;
	}

	public void setJulianDate(String julianDate) {
		this.julianDate = julianDate;
	}

	public Timestamp getMaintDate() {
		return this.maintDate;
	}

	public void setMaintDate(Timestamp maintDate) {
		this.maintDate = maintDate;
	}

	public BigDecimal getMoDayNo() {
		return this.moDayNo;
	}

	public void setMoDayNo(BigDecimal moDayNo) {
		this.moDayNo = moDayNo;
	}

	public String getMoEndFlag() {
		return this.moEndFlag;
	}

	public void setMoEndFlag(String moEndFlag) {
		this.moEndFlag = moEndFlag;
	}

	public String getMoName() {
		return this.moName;
	}

	public void setMoName(String moName) {
		this.moName = moName;
	}

	public String getMoNameYearDate() {
		return this.moNameYearDate;
	}

	public void setMoNameYearDate(String moNameYearDate) {
		this.moNameYearDate = moNameYearDate;
	}

	public BigDecimal getMoNo() {
		return this.moNo;
	}

	public void setMoNo(BigDecimal moNo) {
		this.moNo = moNo;
	}

	public BigDecimal getMoWeekNo() {
		return this.moWeekNo;
	}

	public void setMoWeekNo(BigDecimal moWeekNo) {
		this.moWeekNo = moWeekNo;
	}

	public String getQtrName() {
		return this.qtrName;
	}

	public void setQtrName(String qtrName) {
		this.qtrName = qtrName;
	}

	public BigDecimal getQtrNo() {
		return this.qtrNo;
	}

	public void setQtrNo(BigDecimal qtrNo) {
		this.qtrNo = qtrNo;
	}

	public String getQtrNoYrDate() {
		return this.qtrNoYrDate;
	}

	public void setQtrNoYrDate(String qtrNoYrDate) {
		this.qtrNoYrDate = qtrNoYrDate;
	}

	public int getSerialMoNo() {
		return this.serialMoNo;
	}

	public void setSerialMoNo(int serialMoNo) {
		this.serialMoNo = serialMoNo;
	}

	public BigDecimal getWeekDayNo() {
		return this.weekDayNo;
	}

	public void setWeekDayNo(BigDecimal weekDayNo) {
		this.weekDayNo = weekDayNo;
	}

	public BigDecimal getWeekNo() {
		return this.weekNo;
	}

	public void setWeekNo(BigDecimal weekNo) {
		this.weekNo = weekNo;
	}

	public BigDecimal getYearDate() {
		return this.yearDate;
	}

	public void setYearDate(BigDecimal yearDate) {
		this.yearDate = yearDate;
	}

	public String getYearMoNoDate() {
		return this.yearMoNoDate;
	}

	public void setYearMoNoDate(String yearMoNoDate) {
		this.yearMoNoDate = yearMoNoDate;
	}

}