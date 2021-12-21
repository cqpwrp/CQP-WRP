package com.honda.am.cqp.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;


/**
 * The persistent class for the dbo_tbluser_profile database table.
 * 
 */
@Entity
@Table(name="dbo_tbluser_profile")
@NamedQuery(name="DboTbluserProfile.findAll", query="SELECT d FROM DboTbluserProfile d")
public class DboTbluserProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_login")
	private String userLogin;

	@Column(name="email_id")
	private String emailId;

	@Column(name="exist_in_security")
	private String existInSecurity;

	@Column(name="fax_no")
	private String faxNo;

	@Column(name="security_received_dt")
	private String securityReceivedDt;

	@Column(name="ser_last_login")
	private Timestamp serLastLogin;

	@Column(name="supp_no")
	private String suppNo;

	@Column(name="upp_no")
	private String uppNo;

	@Column(name="user_first_name")
	private String userFirstName;

	@Column(name="user_last_login")
	private Timestamp userLastLogin;

	@Column(name="user_last_name")
	private String userLastName;

	@Column(name="user_type")
	private String userType;

	public DboTbluserProfile() {
	}

	public String getUserLogin() {
		return this.userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getExistInSecurity() {
		return this.existInSecurity;
	}

	public void setExistInSecurity(String existInSecurity) {
		this.existInSecurity = existInSecurity;
	}

	public String getFaxNo() {
		return this.faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	public Object getSecurityReceivedDt() {
		return this.securityReceivedDt;
	}

	public void setSecurityReceivedDt(String securityReceivedDt) {
		this.securityReceivedDt = securityReceivedDt;
	}

	public Object getSerLastLogin() {
		return this.serLastLogin;
	}

	public void setSerLastLogin(Timestamp serLastLogin) {
		this.serLastLogin = serLastLogin;
	}

	public String getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

	public String getUppNo() {
		return this.uppNo;
	}

	public void setUppNo(String uppNo) {
		this.uppNo = uppNo;
	}

	public String getUserFirstName() {
		return this.userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public Object getUserLastLogin() {
		return this.userLastLogin;
	}

	public void setUserLastLogin(Timestamp userLastLogin) {
		this.userLastLogin = userLastLogin;
	}

	public String getUserLastName() {
		return this.userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}