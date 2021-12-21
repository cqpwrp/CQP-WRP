package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblUSER_ROLE_MAPPING database table.
 * 
 */
@Entity
@Table(name="tblUSER_ROLE_MAPPING")
@NamedQuery(name="TblUSER_ROLE_MAPPING.findAll", query="SELECT t FROM TblUSER_ROLE_MAPPING t")
public class TblUSER_ROLE_MAPPING implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TblUSER_ROLE_MAPPINGPK id;

	@Column(name="APPROVER_ROLE_ID")
	private short approverRoleId;

	public TblUSER_ROLE_MAPPING() {
	}

	public TblUSER_ROLE_MAPPINGPK getId() {
		return this.id;
	}

	public void setId(TblUSER_ROLE_MAPPINGPK id) {
		this.id = id;
	}

	public short getApproverRoleId() {
		return this.approverRoleId;
	}

	public void setApproverRoleId(short approverRoleId) {
		this.approverRoleId = approverRoleId;
	}

}