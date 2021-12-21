package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tblProblemMgmt database table.
 * 
 */
@Embeddable
public class TblProblemMgmtPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CLM_SK")
	private int clmSk;

	@Column(name="[USER]")
	private String user;

	public TblProblemMgmtPK() {
	}
	public int getClmSk() {
		return this.clmSk;
	}
	public void setClmSk(int clmSk) {
		this.clmSk = clmSk;
	}
	public String getUser() {
		return this.user;
	}
	public void setUser(String user) {
		this.user = user;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TblProblemMgmtPK)) {
			return false;
		}
		TblProblemMgmtPK castOther = (TblProblemMgmtPK)other;
		return 
			(this.clmSk == castOther.clmSk)
			&& this.user.equals(castOther.user);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.clmSk;
		hash = hash * prime + this.user.hashCode();
		
		return hash;
	}
}