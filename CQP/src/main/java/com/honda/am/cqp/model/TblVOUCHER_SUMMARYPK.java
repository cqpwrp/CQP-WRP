package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tblVOUCHER_SUMMARY database table.
 * 
 */
@Embeddable
public class TblVOUCHER_SUMMARYPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="QTR_NO")
	private String qtrNo;

	@Column(name="QTR_YEAR")
	private String qtrYear;

	public TblVOUCHER_SUMMARYPK() {
	}
	public String getSuppNo() {
		return this.suppNo;
	}
	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}
	public String getQtrNo() {
		return this.qtrNo;
	}
	public void setQtrNo(String qtrNo) {
		this.qtrNo = qtrNo;
	}
	public String getQtrYear() {
		return this.qtrYear;
	}
	public void setQtrYear(String qtrYear) {
		this.qtrYear = qtrYear;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TblVOUCHER_SUMMARYPK)) {
			return false;
		}
		TblVOUCHER_SUMMARYPK castOther = (TblVOUCHER_SUMMARYPK)other;
		return 
			this.suppNo.equals(castOther.suppNo)
			&& this.qtrNo.equals(castOther.qtrNo)
			&& this.qtrYear.equals(castOther.qtrYear);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.suppNo.hashCode();
		hash = hash * prime + this.qtrNo.hashCode();
		hash = hash * prime + this.qtrYear.hashCode();
		
		return hash;
	}
}