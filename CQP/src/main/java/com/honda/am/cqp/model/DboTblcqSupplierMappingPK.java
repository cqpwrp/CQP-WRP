package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the dbo_tblcq_supplier_mapping database table.
 * 
 */
@Embeddable
public class DboTblcqSupplierMappingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="supp_no")
	private String suppNo;

	@Column(name="cq_user_login")
	private String cqUserLogin;

	public DboTblcqSupplierMappingPK() {
	}
	public String getSuppNo() {
		return this.suppNo;
	}
	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}
	public String getCqUserLogin() {
		return this.cqUserLogin;
	}
	public void setCqUserLogin(String cqUserLogin) {
		this.cqUserLogin = cqUserLogin;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DboTblcqSupplierMappingPK)) {
			return false;
		}
		DboTblcqSupplierMappingPK castOther = (DboTblcqSupplierMappingPK)other;
		return 
			this.suppNo.equals(castOther.suppNo)
			&& this.cqUserLogin.equals(castOther.cqUserLogin);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.suppNo.hashCode();
		hash = hash * prime + this.cqUserLogin.hashCode();
		
		return hash;
	}
}