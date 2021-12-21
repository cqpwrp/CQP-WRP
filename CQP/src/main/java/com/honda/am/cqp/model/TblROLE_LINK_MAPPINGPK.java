package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tblROLE_LINK_MAPPING database table.
 * 
 */
@Embeddable
public class TblROLE_LINK_MAPPINGPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ROLE_ID")
	private int roleId;

	@Column(name="HDRLINK")
	private String hdrlink;

	public TblROLE_LINK_MAPPINGPK() {
	}
	public int getRoleId() {
		return this.roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getHdrlink() {
		return this.hdrlink;
	}
	public void setHdrlink(String hdrlink) {
		this.hdrlink = hdrlink;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TblROLE_LINK_MAPPINGPK)) {
			return false;
		}
		TblROLE_LINK_MAPPINGPK castOther = (TblROLE_LINK_MAPPINGPK)other;
		return 
			(this.roleId == castOther.roleId)
			&& this.hdrlink.equals(castOther.hdrlink);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.roleId;
		hash = hash * prime + this.hdrlink.hashCode();
		
		return hash;
	}
}