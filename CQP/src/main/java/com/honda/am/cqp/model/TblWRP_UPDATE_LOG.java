package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblWRP_UPDATE_LOG database table.
 * 
 */
@Embeddable
@Table(name="tblWRP_UPDATE_LOG")
@NamedQuery(name="TblWRP_UPDATE_LOG.findAll", query="SELECT t FROM TblWRP_UPDATE_LOG t")
public class TblWRP_UPDATE_LOG implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="RUN_DATE")
	private Timestamp runDate;

	@Column(name="SUCCESS_FLAG_CODE")
	private String successFlagCode;

	@Column(name="UPDATE_DESC_TEXT")
	private String updateDescText;

	public TblWRP_UPDATE_LOG() {
	}

	public Timestamp getRunDate() {
		return this.runDate;
	}

	public void setRunDate(Timestamp runDate) {
		this.runDate = runDate;
	}

	public String getSuccessFlagCode() {
		return this.successFlagCode;
	}

	public void setSuccessFlagCode(String successFlagCode) {
		this.successFlagCode = successFlagCode;
	}

	public String getUpdateDescText() {
		return this.updateDescText;
	}

	public void setUpdateDescText(String updateDescText) {
		this.updateDescText = updateDescText;
	}

}