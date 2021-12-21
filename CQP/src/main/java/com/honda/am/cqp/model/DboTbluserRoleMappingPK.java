package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the dbo_tbluser_role_mapping database table.
 * 
 */
@Embeddable
public class DboTbluserRoleMappingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_login")
	private String userLogin;

	@Column(name="role_id")
	private int roleId;

	public DboTbluserRoleMappingPK() {
	}
	public String getUserLogin() {
		return this.userLogin;
	}
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	public int getRoleId() {
		return this.roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DboTbluserRoleMappingPK)) {
			return false;
		}
		DboTbluserRoleMappingPK castOther = (DboTbluserRoleMappingPK)other;
		return 
			this.userLogin.equals(castOther.userLogin)
			&& (this.roleId == castOther.roleId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userLogin.hashCode();
		hash = hash * prime + this.roleId;
		
		return hash;
	}
}