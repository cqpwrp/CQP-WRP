package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;


/**
 * The persistent class for the tblConstants database table.
 * 
 */
@Embeddable
@Table(name="tblConstants")
@NamedQuery(name="TblConstant.findAll", query="SELECT t FROM TblConstant t")
public class TblConstant implements Serializable {
	private static final long serialVersionUID = 1L;

	private Time AF_End_Date;

	private int AF_End_Date_sk;

	private Time AF_Start_Date;

	private int AF_Start_Date_sk;

	public TblConstant() {
	}

	public Time getAF_End_Date() {
		return this.AF_End_Date;
	}

	public void setAF_End_Date(Time AF_End_Date) {
		this.AF_End_Date = AF_End_Date;
	}

	public int getAF_End_Date_sk() {
		return this.AF_End_Date_sk;
	}

	public void setAF_End_Date_sk(int AF_End_Date_sk) {
		this.AF_End_Date_sk = AF_End_Date_sk;
	}

	public Time getAF_Start_Date() {
		return this.AF_Start_Date;
	}

	public void setAF_Start_Date(Time AF_Start_Date) {
		this.AF_Start_Date = AF_Start_Date;
	}

	public int getAF_Start_Date_sk() {
		return this.AF_Start_Date_sk;
	}

	public void setAF_Start_Date_sk(int AF_Start_Date_sk) {
		this.AF_Start_Date_sk = AF_Start_Date_sk;
	}

}