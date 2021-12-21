package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tblUSER_ROLE_MAPPING database table.
 * 
 */
@Embeddable
public class TblUSER_ROLE_MAPPINGPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="USER_LOGIN")
	private String userLogin;

	@Column(name="ROLE_ID")
	private short roleId;

	public TblUSER_ROLE_MAPPINGPK() {
	}
	public String getUserLogin() {
		return this.userLogin;
	}
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	public short getRoleId() {
		return this.roleId;
	}
	public void setRoleId(short roleId) {
		this.roleId = roleId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TblUSER_ROLE_MAPPINGPK)) {
			return false;
		}
		TblUSER_ROLE_MAPPINGPK castOther = (TblUSER_ROLE_MAPPINGPK)other;
		return 
			this.userLogin.equals(castOther.userLogin)
			&& (this.roleId == castOther.roleId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userLogin.hashCode();
		hash = hash * prime + ((int) this.roleId);
		
		return hash;
	}
}