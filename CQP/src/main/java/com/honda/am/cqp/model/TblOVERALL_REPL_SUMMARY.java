package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tblOVERALL_REPL_SUMMARY database table.
 * 
 */
@Embeddable
@Table(name="tblOVERALL_REPL_SUMMARY")
@NamedQuery(name="TblOVERALL_REPL_SUMMARY.findAll", query="SELECT t FROM TblOVERALL_REPL_SUMMARY t")
public class TblOVERALL_REPL_SUMMARY implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="[>90 DTF]")
	private int _90_dtf;

	@Column(name="[0 DTF (PDI)]")
	private int __dtf__pdi_;

	@Column(name="[1-90 DTF]")
	private int __90_dtf;

	@Column(name="[Avg DTF]")
	private int avg_DTF;

	@Column(name="[Avg Odom]")
	private int avg_Odom;

	@Column(name="[Avg Part$]")
	private BigDecimal avg_Part$;

	@Column(name="[Avg Sublet$]")
	private BigDecimal avg_Sublet$;

	@Column(name="[Avg Total$]")
	private BigDecimal avg_Total$;

	@Column(name="MTC_SK")
	private int mtcSk;

	@Column(name="Repl_Last_30Days")
	private int repl_Last_30Days;

	@Column(name="Replaced")
	private int replaced;

	@Column(name="SHORT_PART_NAME")
	private String shortPartName;

	@Column(name="SHORT_PART_NO")
	private String shortPartNo;

	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="[Total Cost]")
	private BigDecimal total_Cost;

	@Column(name="[Total Part$]")
	private BigDecimal total_Part$;

	@Column(name="[Total Sublet$]")
	private BigDecimal total_Sublet$;

	public TblOVERALL_REPL_SUMMARY() {
	}

	public int get_90_dtf() {
		return this._90_dtf;
	}

	public void set_90_dtf(int _90_dtf) {
		this._90_dtf = _90_dtf;
	}

	public int get__dtf__pdi_() {
		return this.__dtf__pdi_;
	}

	public void set__dtf__pdi_(int __dtf__pdi_) {
		this.__dtf__pdi_ = __dtf__pdi_;
	}

	public int get__90_dtf() {
		return this.__90_dtf;
	}

	public void set__90_dtf(int __90_dtf) {
		this.__90_dtf = __90_dtf;
	}

	public int getAvg_DTF() {
		return this.avg_DTF;
	}

	public void setAvg_DTF(int avg_DTF) {
		this.avg_DTF = avg_DTF;
	}

	public int getAvg_Odom() {
		return this.avg_Odom;
	}

	public void setAvg_Odom(int avg_Odom) {
		this.avg_Odom = avg_Odom;
	}

	public BigDecimal getAvg_Part$() {
		return this.avg_Part$;
	}

	public void setAvg_Part$(BigDecimal avg_Part$) {
		this.avg_Part$ = avg_Part$;
	}

	public BigDecimal getAvg_Sublet$() {
		return this.avg_Sublet$;
	}

	public void setAvg_Sublet$(BigDecimal avg_Sublet$) {
		this.avg_Sublet$ = avg_Sublet$;
	}

	public BigDecimal getAvg_Total$() {
		return this.avg_Total$;
	}

	public void setAvg_Total$(BigDecimal avg_Total$) {
		this.avg_Total$ = avg_Total$;
	}

	public int getMtcSk() {
		return this.mtcSk;
	}

	public void setMtcSk(int mtcSk) {
		this.mtcSk = mtcSk;
	}

	public int getRepl_Last_30Days() {
		return this.repl_Last_30Days;
	}

	public void setRepl_Last_30Days(int repl_Last_30Days) {
		this.repl_Last_30Days = repl_Last_30Days;
	}

	public int getReplaced() {
		return this.replaced;
	}

	public void setReplaced(int replaced) {
		this.replaced = replaced;
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

	public String getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

	public BigDecimal getTotal_Cost() {
		return this.total_Cost;
	}

	public void setTotal_Cost(BigDecimal total_Cost) {
		this.total_Cost = total_Cost;
	}

	public BigDecimal getTotal_Part$() {
		return this.total_Part$;
	}

	public void setTotal_Part$(BigDecimal total_Part$) {
		this.total_Part$ = total_Part$;
	}

	public BigDecimal getTotal_Sublet$() {
		return this.total_Sublet$;
	}

	public void setTotal_Sublet$(BigDecimal total_Sublet$) {
		this.total_Sublet$ = total_Sublet$;
	}

}