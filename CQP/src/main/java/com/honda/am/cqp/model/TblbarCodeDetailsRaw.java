package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblbar_code_details_raw database table.
 * 
 */
@Entity
@Table(name="tblbar_code_details_raw")
@NamedQuery(name="TblbarCodeDetailsRaw.findAll", query="SELECT t FROM TblbarCodeDetailsRaw t")
public class TblbarCodeDetailsRaw implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TblbarCodeDetailsRawPK id;

	@Column(name="COMMENTS")
	private String comments;

	@Column(name="INSERT_DT")
	private Timestamp insertDt;

	@Column(name="QTY")
	private int qty;

	@Column(name="SKIP_FLAG")
	private String skipFlag;

	@Column(name="USERID")
	private String userid;

	public TblbarCodeDetailsRaw() {
	}

	public TblbarCodeDetailsRawPK getId() {
		return this.id;
	}

	public void setId(TblbarCodeDetailsRawPK id) {
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

	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
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