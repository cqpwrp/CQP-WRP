package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tblREPORT_RUN_STATUS database table.
 * 
 */
@Embeddable
public class TblREPORT_RUN_STATUSPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="USER_LOGIN")
	private String userLogin;

	@Column(name="REPORT_TYPE")
	private String reportType;

	public TblREPORT_RUN_STATUSPK() {
	}
	public String getUserLogin() {
		return this.userLogin;
	}
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	public String getReportType() {
		return this.reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TblREPORT_RUN_STATUSPK)) {
			return false;
		}
		TblREPORT_RUN_STATUSPK castOther = (TblREPORT_RUN_STATUSPK)other;
		return 
			this.userLogin.equals(castOther.userLogin)
			&& this.reportType.equals(castOther.reportType);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userLogin.hashCode();
		hash = hash * prime + this.reportType.hashCode();
		
		return hash;
	}
}