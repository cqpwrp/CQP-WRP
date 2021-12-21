package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblWR1VI1_CQ database table.
 * 
 */
@Embeddable
@Table(name="tblWR1VI1_CQ")
@NamedQuery(name="TblWR1VI1_CQ.findAll", query="SELECT t FROM TblWR1VI1_CQ t")
public class TblWR1VI1_CQ implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="MTC_SK")
	private int mtcSk;

	@Column(name="PROD_DATE_SK")
	private int prodDateSk;

	@Column(name="RETAIL_SLS_DATE_SK")
	private int retailSlsDateSk;

	@Column(name="VEH_COUNT")
	private int vehCount;

	public TblWR1VI1_CQ() {
	}

	public int getMtcSk() {
		return this.mtcSk;
	}

	public void setMtcSk(int mtcSk) {
		this.mtcSk = mtcSk;
	}

	public int getProdDateSk() {
		return this.prodDateSk;
	}

	public void setProdDateSk(int prodDateSk) {
		this.prodDateSk = prodDateSk;
	}

	public int getRetailSlsDateSk() {
		return this.retailSlsDateSk;
	}

	public void setRetailSlsDateSk(int retailSlsDateSk) {
		this.retailSlsDateSk = retailSlsDateSk;
	}

	public int getVehCount() {
		return this.vehCount;
	}

	public void setVehCount(int vehCount) {
		this.vehCount = vehCount;
	}

}