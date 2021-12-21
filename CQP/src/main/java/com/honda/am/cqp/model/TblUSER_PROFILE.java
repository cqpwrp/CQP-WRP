package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblUSER_PROFILE database table.
 * 
 */
@Entity
@Table(name="tblUSER_PROFILE")
/*@NamedQuery(name="TblUSER_PROFILE.findAll", query="SELECT t FROM TblUSER_PROFILE t")*/
public class TblUSER_PROFILE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_LOGIN")
	private String userLogin;

	@Column(name="EMAIL_ID")
	private String emailId;

	@Column(name="EXIST_IN_SECURITY")
	private String existInSecurity;

	@Column(name="FAX_NO")
	private String faxNo;

	@Column(name="PHONE_NO")
	private String phoneNo;

	@Column(name="SECURITY_RECEIVED_DT")
	private Timestamp securityReceivedDt;

	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="USER_FIRST_NAME")
	private String userFirstName;

	@Column(name="USER_LAST_LOGIN")
	private Timestamp userLastLogin;

	@Column(name="USER_LAST_NAME")
	private String userLastName;

	@Column(name="USER_TYPE")
	private String userType;

	public TblUSER_PROFILE() {
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

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Timestamp getSecurityReceivedDt() {
		return this.securityReceivedDt;
	}

	public void setSecurityReceivedDt(Timestamp securityReceivedDt) {
		this.securityReceivedDt = securityReceivedDt;
	}

	public String getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

	public String getUserFirstName() {
		return this.userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public Timestamp getUserLastLogin() {
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