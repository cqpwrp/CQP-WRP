package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tblFEATURES_CALLIN_MAPPING database table.
 * 
 */
@Embeddable
public class TblFEATURES_CALLIN_MAPPINGPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CALLIN_PART_SK")
	private int callinPartSk;

	@Column(name="FEATURE_NAME")
	private String featureName;

	@Column(name="FEATURE_VALUE")
	private String featureValue;

	public TblFEATURES_CALLIN_MAPPINGPK() {
	}
	public int getCallinPartSk() {
		return this.callinPartSk;
	}
	public void setCallinPartSk(int callinPartSk) {
		this.callinPartSk = callinPartSk;
	}
	public String getFeatureName() {
		return this.featureName;
	}
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	public String getFeatureValue() {
		return this.featureValue;
	}
	public void setFeatureValue(String featureValue) {
		this.featureValue = featureValue;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TblFEATURES_CALLIN_MAPPINGPK)) {
			return false;
		}
		TblFEATURES_CALLIN_MAPPINGPK castOther = (TblFEATURES_CALLIN_MAPPINGPK)other;
		return 
			(this.callinPartSk == castOther.callinPartSk)
			&& this.featureName.equals(castOther.featureName)
			&& this.featureValue.equals(castOther.featureValue);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.callinPartSk;
		hash = hash * prime + this.featureName.hashCode();
		hash = hash * prime + this.featureValue.hashCode();
		
		return hash;
	}
}