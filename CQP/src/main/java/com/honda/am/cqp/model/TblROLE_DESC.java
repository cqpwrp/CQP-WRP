package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblROLE_DESC database table.
 * 
 */
@Entity
@Table(name="tblROLE_DESC")
@NamedQuery(name="TblROLE_DESC.findAll", query="SELECT t FROM TblROLE_DESC t")
public class TblROLE_DESC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ROLE_ID")
	private int roleId;

	@Column(name="ROLE_NAME")
	private String roleName;

	@Column(name="ROLE_TYPE")
	private String roleType;

	public TblROLE_DESC() {
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleType() {
		return this.roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

}