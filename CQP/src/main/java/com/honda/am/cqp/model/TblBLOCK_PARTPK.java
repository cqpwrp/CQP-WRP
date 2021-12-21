package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tblBLOCK_PARTS database table.
 * 
 */
@Embeddable
public class TblBLOCK_PARTPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PART_NO")
	private String partNo;

	@Column(name="MODEL_NAME")
	private String modelName;

	@Column(name="MODEL_YEAR")
	private String modelYear;

	@Column(name="SUPP_NO")
	private String suppNo;

	public TblBLOCK_PARTPK() {
	}
	public String getPartNo() {
		return this.partNo;
	}
	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}
	public String getModelName() {
		return this.modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModelYear() {
		return this.modelYear;
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
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
		if (!(other instanceof TblBLOCK_PARTPK)) {
			return false;
		}
		TblBLOCK_PARTPK castOther = (TblBLOCK_PARTPK)other;
		return 
			this.partNo.equals(castOther.partNo)
			&& this.modelName.equals(castOther.modelName)
			&& this.modelYear.equals(castOther.modelYear)
			&& this.suppNo.equals(castOther.suppNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.partNo.hashCode();
		hash = hash * prime + this.modelName.hashCode();
		hash = hash * prime + this.modelYear.hashCode();
		hash = hash * prime + this.suppNo.hashCode();
		
		return hash;
	}
}