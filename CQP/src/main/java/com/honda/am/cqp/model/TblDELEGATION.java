package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblDELEGATION database table.
 * 
 */
@Entity
@Table(name="tblDELEGATION")
@NamedQuery(name="TblDELEGATION.findAll", query="SELECT t FROM TblDELEGATION t")
public class TblDELEGATION implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_LOGIN")
	private String userLogin;

	@Column(name="DELEGATED_TO_NAME")
	private String delegatedToName;

	@Column(name="INSERT_DATE")
	private Timestamp insertDate;

	public TblDELEGATION() {
	}

	public String getUserLogin() {
		return this.userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getDelegatedToName() {
		return this.delegatedToName;
	}

	public void setDelegatedToName(String delegatedToName) {
		this.delegatedToName = delegatedToName;
	}

	public Timestamp getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(Timestamp insertDate) {
		this.insertDate = insertDate;
	}

}