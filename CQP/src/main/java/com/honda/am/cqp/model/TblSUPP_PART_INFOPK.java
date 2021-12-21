package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tblSUPP_PART_INFO database table.
 * 
 */
@Embeddable
public class TblSUPP_PART_INFOPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="SHORT_PART_NO")
	private String shortPartNo;

	public TblSUPP_PART_INFOPK() {
	}
	public String getSuppNo() {
		return this.suppNo;
	}
	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}
	public String getShortPartNo() {
		return this.shortPartNo;
	}
	public void setShortPartNo(String shortPartNo) {
		this.shortPartNo = shortPartNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TblSUPP_PART_INFOPK)) {
			return false;
		}
		TblSUPP_PART_INFOPK castOther = (TblSUPP_PART_INFOPK)other;
		return 
			this.suppNo.equals(castOther.suppNo)
			&& this.shortPartNo.equals(castOther.shortPartNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.suppNo.hashCode();
		hash = hash * prime + this.shortPartNo.hashCode();
		
		return hash;
	}
}