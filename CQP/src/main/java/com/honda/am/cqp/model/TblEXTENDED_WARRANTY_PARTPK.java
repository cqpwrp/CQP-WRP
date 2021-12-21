package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tblEXTENDED_WARRANTY_PARTS database table.
 * 
 */
@Embeddable
public class TblEXTENDED_WARRANTY_PARTPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="SHORT_PART_NO")
	private String shortPartNo;

	@Column(name="DESTINATION")
	private String destination;

	@Column(name="NAMEPLATE")
	private String nameplate;

	@Column(name="MODEL_YEAR")
	private String modelYear;

	public TblEXTENDED_WARRANTY_PARTPK() {
	}
	public String getShortPartNo() {
		return this.shortPartNo;
	}
	public void setShortPartNo(String shortPartNo) {
		this.shortPartNo = shortPartNo;
	}
	public String getDestination() {
		return this.destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getNameplate() {
		return this.nameplate;
	}
	public void setNameplate(String nameplate) {
		this.nameplate = nameplate;
	}
	public String getModelYear() {
		return this.modelYear;
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TblEXTENDED_WARRANTY_PARTPK)) {
			return false;
		}
		TblEXTENDED_WARRANTY_PARTPK castOther = (TblEXTENDED_WARRANTY_PARTPK)other;
		return 
			this.shortPartNo.equals(castOther.shortPartNo)
			&& this.destination.equals(castOther.destination)
			&& this.nameplate.equals(castOther.nameplate)
			&& this.modelYear.equals(castOther.modelYear);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.shortPartNo.hashCode();
		hash = hash * prime + this.destination.hashCode();
		hash = hash * prime + this.nameplate.hashCode();
		hash = hash * prime + this.modelYear.hashCode();
		
		return hash;
	}
}