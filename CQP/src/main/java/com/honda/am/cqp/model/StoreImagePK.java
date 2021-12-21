package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the storeImage database table.
 * 
 */
@Embeddable
public class StoreImagePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="VEH_DESTN_CODE")
	private String vehDestnCode;

	public StoreImagePK() {
	}
	public String getSuppNo() {
		return this.suppNo;
	}
	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}
	public String getVehDestnCode() {
		return this.vehDestnCode;
	}
	public void setVehDestnCode(String vehDestnCode) {
		this.vehDestnCode = vehDestnCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof StoreImagePK)) {
			return false;
		}
		StoreImagePK castOther = (StoreImagePK)other;
		return 
			this.suppNo.equals(castOther.suppNo)
			&& this.vehDestnCode.equals(castOther.vehDestnCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.suppNo.hashCode();
		hash = hash * prime + this.vehDestnCode.hashCode();
		
		return hash;
	}
}