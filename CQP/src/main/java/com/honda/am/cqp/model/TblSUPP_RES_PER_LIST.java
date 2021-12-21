package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblSUPP_RES_PER_LIST database table.
 * 
 */
@Embeddable
@Table(name="tblSUPP_RES_PER_LIST")
@NamedQuery(name="TblSUPP_RES_PER_LIST.findAll", query="SELECT t FROM TblSUPP_RES_PER_LIST t")
public class TblSUPP_RES_PER_LIST implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="SUPP_NO")
	private Object suppNo;

	public TblSUPP_RES_PER_LIST() {
	}

	public Object getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(Object suppNo) {
		this.suppNo = suppNo;
	}

}