package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblOdom_by_OdomByRange database table.
 * 
 */
@Embeddable
@Table(name="tblOdom_by_OdomByRange")
@NamedQuery(name="TblOdom_by_OdomByRange.findAll", query="SELECT t FROM TblOdom_by_OdomByRange t")
public class TblOdom_by_OdomByRange implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="MTC_SK")
	private int mtcSk;

	@Column(name="Odom_Range")
	private String odom_Range;

	@Column(name="ODOM_START")
	private int odomStart;

	@Column(name="Rpl_Qty")
	private int rpl_Qty;

	@Column(name="SHORT_PART_NO")
	private String shortPartNo;

	@Column(name="SUPP_NO")
	private String suppNo;

	public TblOdom_by_OdomByRange() {
	}

	public int getMtcSk() {
		return this.mtcSk;
	}

	public void setMtcSk(int mtcSk) {
		this.mtcSk = mtcSk;
	}

	public String getOdom_Range() {
		return this.odom_Range;
	}

	public void setOdom_Range(String odom_Range) {
		this.odom_Range = odom_Range;
	}

	public int getOdomStart() {
		return this.odomStart;
	}

	public void setOdomStart(int odomStart) {
		this.odomStart = odomStart;
	}

	public int getRpl_Qty() {
		return this.rpl_Qty;
	}

	public void setRpl_Qty(int rpl_Qty) {
		this.rpl_Qty = rpl_Qty;
	}

	public String getShortPartNo() {
		return this.shortPartNo;
	}

	public void setShortPartNo(String shortPartNo) {
		this.shortPartNo = shortPartNo;
	}

	public String getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

}