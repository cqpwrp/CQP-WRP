package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblTRANSFER_PART_LIST_CONCLUSION database table.
 * 
 */
@Entity
@Table(name="tblTRANSFER_PART_LIST_CONCLUSION")
@NamedQuery(name="TblTRANSFER_PART_LIST_CONCLUSION.findAll", query="SELECT t FROM TblTRANSFER_PART_LIST_CONCLUSION t")
public class TblTRANSFER_PART_LIST_CONCLUSION implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CONCLUSION_ID")
	private int conclusionId;

	@Column(name="CONCLUSION_DESC_TXT")
	private String conclusionDescTxt;

	@Column(name="EDIT_FLAG")
	private String editFlag;

	@Column(name="RESPONSIBILITY_PCT")
	private String responsibilityPct;

	@Column(name="SHORT_CONCLUSION")
	private String shortConclusion;

	public TblTRANSFER_PART_LIST_CONCLUSION() {
	}

	public int getConclusionId() {
		return this.conclusionId;
	}

	public void setConclusionId(int conclusionId) {
		this.conclusionId = conclusionId;
	}

	public String getConclusionDescTxt() {
		return this.conclusionDescTxt;
	}

	public void setConclusionDescTxt(String conclusionDescTxt) {
		this.conclusionDescTxt = conclusionDescTxt;
	}

	public String getEditFlag() {
		return this.editFlag;
	}

	public void setEditFlag(String editFlag) {
		this.editFlag = editFlag;
	}

	public String getResponsibilityPct() {
		return this.responsibilityPct;
	}

	public void setResponsibilityPct(String responsibilityPct) {
		this.responsibilityPct = responsibilityPct;
	}

	public String getShortConclusion() {
		return this.shortConclusion;
	}

	public void setShortConclusion(String shortConclusion) {
		this.shortConclusion = shortConclusion;
	}

}