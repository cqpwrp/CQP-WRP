package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblBAR_CODE_DETAILS database table.
 * 
 */
@Entity
@Table(name="tblBAR_CODE_DETAILS")
@NamedQuery(name="TblBAR_CODE_DETAIL.findAll", query="SELECT t FROM TblBAR_CODE_DETAIL t")
public class TblBAR_CODE_DETAIL implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TblBAR_CODE_DETAILPK id;

	@Column(name="COMMENTS")
	private String comments;

	@Column(name="INSERT_DT")
	private Timestamp insertDt;

	@Column(name="SKIP_FLAG")
	private String skipFlag;

	@Column(name="USERID")
	private String userid;

	public TblBAR_CODE_DETAIL() {
	}

	public TblBAR_CODE_DETAILPK getId() {
		return this.id;
	}

	public void setId(TblBAR_CODE_DETAILPK id) {
		this.id = id;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Timestamp getInsertDt() {
		return this.insertDt;
	}

	public void setInsertDt(Timestamp insertDt) {
		this.insertDt = insertDt;
	}

	public String getSkipFlag() {
		return this.skipFlag;
	}

	public void setSkipFlag(String skipFlag) {
		this.skipFlag = skipFlag;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}