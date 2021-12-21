package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblSUPP_DUE_DAYS database table.
 * 
 */
@Embeddable
@Table(name="tblSUPP_DUE_DAYS")
@NamedQuery(name="TblSUPP_DUE_DAY.findAll", query="SELECT t FROM TblSUPP_DUE_DAY t")
public class TblSUPP_DUE_DAY implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DUE_DAYS")
	private int dueDays;

	@Column(name="SUPP_NO")
	private String suppNo;

	public TblSUPP_DUE_DAY() {
	}

	public int getDueDays() {
		return this.dueDays;
	}

	public void setDueDays(int dueDays) {
		this.dueDays = dueDays;
	}

	public String getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

}