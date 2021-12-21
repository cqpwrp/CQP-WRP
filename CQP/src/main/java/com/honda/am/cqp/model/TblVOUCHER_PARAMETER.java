package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblVOUCHER_PARAMETERS database table.
 * 
 */
@Embeddable
@Table(name="tblVOUCHER_PARAMETERS")
@NamedQuery(name="TblVOUCHER_PARAMETER.findAll", query="SELECT t FROM TblVOUCHER_PARAMETER t")
public class TblVOUCHER_PARAMETER implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="Back_of_days")
	private int back_of_days;

	private String QTR_end_day;

	private String QTR_end_month;

	@Column(name="Qtr_no")
	private int qtr_no;

	private String QTR_start_day;

	private String QTR_start_month;

	public TblVOUCHER_PARAMETER() {
	}

	public int getBack_of_days() {
		return this.back_of_days;
	}

	public void setBack_of_days(int back_of_days) {
		this.back_of_days = back_of_days;
	}

	public String getQTR_end_day() {
		return this.QTR_end_day;
	}

	public void setQTR_end_day(String QTR_end_day) {
		this.QTR_end_day = QTR_end_day;
	}

	public String getQTR_end_month() {
		return this.QTR_end_month;
	}

	public void setQTR_end_month(String QTR_end_month) {
		this.QTR_end_month = QTR_end_month;
	}

	public int getQtr_no() {
		return this.qtr_no;
	}

	public void setQtr_no(int qtr_no) {
		this.qtr_no = qtr_no;
	}

	public String getQTR_start_day() {
		return this.QTR_start_day;
	}

	public void setQTR_start_day(String QTR_start_day) {
		this.QTR_start_day = QTR_start_day;
	}

	public String getQTR_start_month() {
		return this.QTR_start_month;
	}

	public void setQTR_start_month(String QTR_start_month) {
		this.QTR_start_month = QTR_start_month;
	}

}