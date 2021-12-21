package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblWRP_UPDATE_TRIGGER database table.
 * 
 */
@Embeddable
@Table(name="tblWRP_UPDATE_TRIGGER")
@NamedQuery(name="TblWRP_UPDATE_TRIGGER.findAll", query="SELECT t FROM TblWRP_UPDATE_TRIGGER t")
public class TblWRP_UPDATE_TRIGGER implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="TRIGGER_DATE")
	private Timestamp triggerDate;

	@Column(name="UPDATE_TRIGGER_CODE")
	private String updateTriggerCode;

	@Column(name="USER_NAME")
	private String userName;

	public TblWRP_UPDATE_TRIGGER() {
	}

	public Timestamp getTriggerDate() {
		return this.triggerDate;
	}

	public void setTriggerDate(Timestamp triggerDate) {
		this.triggerDate = triggerDate;
	}

	public String getUpdateTriggerCode() {
		return this.updateTriggerCode;
	}

	public void setUpdateTriggerCode(String updateTriggerCode) {
		this.updateTriggerCode = updateTriggerCode;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}