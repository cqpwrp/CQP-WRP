package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tblVOUCHER_PLANT_SUMMARY database table.
 * 
 */
@Embeddable
public class TblVOUCHER_PLANT_SUMMARYPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="QTR_NO")
	private String qtrNo;

	@Column(name="QTR_YEAR")
	private String qtrYear;

	@Column(name="DESTINATION_NAME")
	private String destinationName;

	public TblVOUCHER_PLANT_SUMMARYPK() {
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
	public String getDestinationName() {
		return this.destinationName;
	}
	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TblVOUCHER_PLANT_SUMMARYPK)) {
			return false;
		}
		TblVOUCHER_PLANT_SUMMARYPK castOther = (TblVOUCHER_PLANT_SUMMARYPK)other;
		return 
			this.suppNo.equals(castOther.suppNo)
			&& this.qtrNo.equals(castOther.qtrNo)
			&& this.qtrYear.equals(castOther.qtrYear)
			&& this.destinationName.equals(castOther.destinationName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.suppNo.hashCode();
		hash = hash * prime + this.qtrNo.hashCode();
		hash = hash * prime + this.qtrYear.hashCode();
		hash = hash * prime + this.destinationName.hashCode();
		
		return hash;
	}
}