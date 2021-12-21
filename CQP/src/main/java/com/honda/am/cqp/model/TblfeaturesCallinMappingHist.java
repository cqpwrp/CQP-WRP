package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TBLFEATURES_CALLIN_MAPPING_HIST database table.
 * 
 */
@Entity
@Table(name="TBLFEATURES_CALLIN_MAPPING_HIST")
@NamedQuery(name="TblfeaturesCallinMappingHist.findAll", query="SELECT t FROM TblfeaturesCallinMappingHist t")
public class TblfeaturesCallinMappingHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CALLIN_PART_SK")
	private int callinPartSk;

	@Column(name="FEATURE_NAME")
	private String featureName;

	@Column(name="FEATURE_VALUE")
	private String featureValue;

	public TblfeaturesCallinMappingHist() {
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

}