package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tblCQ_SUPPLIER_MAPPING database table.
 * 
 */
@Embeddable
public class TblCQ_SUPPLIER_MAPPINGPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CQ_USER_LOGIN")
	private String cqUserLogin;

	@Column(name="SUPP_NO")
	private String suppNo;

	public TblCQ_SUPPLIER_MAPPINGPK() {
	}
	public String getCqUserLogin() {
		return this.cqUserLogin;
	}
	public void setCqUserLogin(String cqUserLogin) {
		this.cqUserLogin = cqUserLogin;
	}
	public String getSuppNo() {
		return this.suppNo;
	}
	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TblCQ_SUPPLIER_MAPPINGPK)) {
			return false;
		}
		TblCQ_SUPPLIER_MAPPINGPK castOther = (TblCQ_SUPPLIER_MAPPINGPK)other;
		return 
			this.cqUserLogin.equals(castOther.cqUserLogin)
			&& this.suppNo.equals(castOther.suppNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cqUserLogin.hashCode();
		hash = hash * prime + this.suppNo.hashCode();
		
		return hash;
	}
}