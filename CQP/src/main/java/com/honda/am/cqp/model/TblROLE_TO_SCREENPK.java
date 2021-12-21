package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tblROLE_TO_SCREEN database table.
 * 
 */
@Embeddable
public class TblROLE_TO_SCREENPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ROLE_ID")
	private int roleId;

	@Column(name="SCREENID")
	private String screenid;

	public TblROLE_TO_SCREENPK() {
	}
	public int getRoleId() {
		return this.roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getScreenid() {
		return this.screenid;
	}
	public void setScreenid(String screenid) {
		this.screenid = screenid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TblROLE_TO_SCREENPK)) {
			return false;
		}
		TblROLE_TO_SCREENPK castOther = (TblROLE_TO_SCREENPK)other;
		return 
			(this.roleId == castOther.roleId)
			&& this.screenid.equals(castOther.screenid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.roleId;
		hash = hash * prime + this.screenid.hashCode();
		
		return hash;
	}
}