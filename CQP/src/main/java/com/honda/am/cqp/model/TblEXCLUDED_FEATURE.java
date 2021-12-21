package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblEXCLUDED_FEATURES database table.
 * 
 */
@Embeddable
@Table(name="tblEXCLUDED_FEATURES")
@NamedQuery(name="TblEXCLUDED_FEATURE.findAll", query="SELECT t FROM TblEXCLUDED_FEATURE t")
public class TblEXCLUDED_FEATURE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="FEATURE_NAME")
	private String featureName;

	public TblEXCLUDED_FEATURE() {
	}

	public String getFeatureName() {
		return this.featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

}