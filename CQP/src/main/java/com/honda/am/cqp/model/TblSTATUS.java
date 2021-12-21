package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblSTATUS database table.
 * 
 */
@Entity
@Table(name="tblSTATUS")
@NamedQuery(name="TblSTATUS.findAll", query="SELECT t FROM TblSTATUS t")
public class TblSTATUS implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STATUS_ID")
	private int statusId;

	@Column(name="STATUS_NAME")
	private String statusName;

	@Column(name="STATUS_TYPE")
	private String statusType;

	public TblSTATUS() {
	}

	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return this.statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getStatusType() {
		return this.statusType;
	}

	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}

}