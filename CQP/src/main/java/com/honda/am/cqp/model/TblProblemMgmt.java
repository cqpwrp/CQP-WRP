package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * The persistent class for the tblProblemMgmt database table.
 * 
 */
@Entity
@Table(name = "tblProblemMgmt")
@NamedQuery(name = "TblProblemMgmt.findAll", query = "SELECT t FROM TblProblemMgmt t")
public class TblProblemMgmt implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TblProblemMgmtPK id;

	@Column(name = "CLM_SK", insertable=false ,updatable=false)
	private int clm_sk;

	@Column(name = "USER" ,insertable=false ,updatable=false)
	private String user;

	@Column(name = "PROBLEM")
	private String problem;

	@Column(name = "UPDATE_TS")
	private Timestamp updateTs;

	@Column(name = "UPDATE_USER")
	private String updateUser;

	public TblProblemMgmt() {
	}

	public TblProblemMgmtPK getId() {
		return this.id;
	}

	public void setId(TblProblemMgmtPK id) {
		this.id = id;
	}

	public Object getProblem() {
		return this.problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public Timestamp getUpdateTs() {
		return this.updateTs;
	}

	public void setUpdateTs(Timestamp updateTs) {
		this.updateTs = updateTs;
	}

	public Object getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public int getClm_sk() {
		return clm_sk;
	}

	public void setClm_sk(int clm_sk) {
		this.clm_sk = clm_sk;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}