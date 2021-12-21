package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblTPL_Updates database table.
 * 
 */
@Embeddable
@Table(name="tblTPL_Updates")
@NamedQuery(name="TblTPL_Update.findAll", query="SELECT t FROM TblTPL_Update t")
public class TblTPL_Update implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="SUPP_ANALYSIS")
	private Object suppAnalysis;

	@Column(name="TPL_NO")
	private int tplNo;

	public TblTPL_Update() {
	}

	public Object getSuppAnalysis() {
		return this.suppAnalysis;
	}

	public void setSuppAnalysis(Object suppAnalysis) {
		this.suppAnalysis = suppAnalysis;
	}

	public int getTplNo() {
		return this.tplNo;
	}

	public void setTplNo(int tplNo) {
		this.tplNo = tplNo;
	}

}