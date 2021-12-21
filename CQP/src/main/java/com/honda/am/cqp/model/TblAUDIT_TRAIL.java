package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblAUDIT_TRAIL database table.
 * 
 */
@Entity
@Table(name="tblAUDIT_TRAIL")
@NamedQuery(name="TblAUDIT_TRAIL.findAll", query="SELECT t FROM TblAUDIT_TRAIL t")
public class TblAUDIT_TRAIL implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AUDIT_TRAIL_SK")
	private int auditTrailSk;

	@Column(name="[ACTION]")
	private String action;

	@Column(name="PARAM1")
	private String param1;

	@Column(name="PARAM2")
	private String param2;

	@Column(name="PARAM3")
	private String param3;

	@Column(name="PARAM4")
	private String param4;

	@Column(name="PARAM5")
	private String param5;

	@Column(name="SERVICE_NAME")
	private String serviceName;

	@Column(name="SERVICE_SK")
	private String serviceSk;

	@Column(name="UPDATE_DATE")
	private Timestamp updateDate;

	@Column(name="USR_LOGIN")
	private String usrLogin;

	public TblAUDIT_TRAIL() {
	}

	public int getAuditTrailSk() {
		return this.auditTrailSk;
	}

	public void setAuditTrailSk(int auditTrailSk) {
		this.auditTrailSk = auditTrailSk;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getParam1() {
		return this.param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	public String getParam2() {
		return this.param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}

	public String getParam3() {
		return this.param3;
	}

	public void setParam3(String param3) {
		this.param3 = param3;
	}

	public String getParam4() {
		return this.param4;
	}

	public void setParam4(String param4) {
		this.param4 = param4;
	}

	public String getParam5() {
		return this.param5;
	}

	public void setParam5(String param5) {
		this.param5 = param5;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceSk() {
		return this.serviceSk;
	}

	public void setServiceSk(String serviceSk) {
		this.serviceSk = serviceSk;
	}

	public Timestamp getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public String getUsrLogin() {
		return this.usrLogin;
	}

	public void setUsrLogin(String usrLogin) {
		this.usrLogin = usrLogin;
	}

}