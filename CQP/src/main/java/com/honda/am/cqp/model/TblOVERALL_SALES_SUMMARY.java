package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblOVERALL_SALES_SUMMARY database table.
 * 
 */
@Embeddable
@Table(name="tblOVERALL_SALES_SUMMARY")
@NamedQuery(name="TblOVERALL_SALES_SUMMARY.findAll", query="SELECT t FROM TblOVERALL_SALES_SUMMARY t")
public class TblOVERALL_SALES_SUMMARY implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="MTC_SK")
	private int mtcSk;

	@Column(name="Sold")
	private int sold;

	public TblOVERALL_SALES_SUMMARY() {
	}

	public int getMtcSk() {
		return this.mtcSk;
	}

	public void setMtcSk(int mtcSk) {
		this.mtcSk = mtcSk;
	}

	public int getSold() {
		return this.sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

}