package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dbo_tbluser_role_mapping database table.
 * 
 */
@Entity
@Table(name="dbo_tbluser_role_mapping")
@NamedQuery(name="DboTbluserRoleMapping.findAll", query="SELECT d FROM DboTbluserRoleMapping d")
public class DboTbluserRoleMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DboTbluserRoleMappingPK id;

	@Column(name="approver_role_id")
	private int approverRoleId;

	public DboTbluserRoleMapping() {
	}

	public DboTbluserRoleMappingPK getId() {
		return this.id;
	}

	public void setId(DboTbluserRoleMappingPK id) {
		this.id = id;
	}

	public int getApproverRoleId() {
		return this.approverRoleId;
	}

	public void setApproverRoleId(int approverRoleId) {
		this.approverRoleId = approverRoleId;
	}

}