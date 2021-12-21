package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblREPORT_EXPORT_LIST database table.
 * 
 */
@Embeddable
@Table(name="tblREPORT_EXPORT_LIST")
@NamedQuery(name="TblREPORT_EXPORT_LIST.findAll", query="SELECT t FROM TblREPORT_EXPORT_LIST t")
public class TblREPORT_EXPORT_LIST implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="LAST_UPDATED_BY_ID")
	private String lastUpdatedById;

	@Column(name="LAST_UPDATED_DATE")
	private Timestamp lastUpdatedDate;

	@Column(name="REFRESH_FLAG")
	private String refreshFlag;

	@Column(name="TABLE_DESC")
	private String tableDesc;

	@Column(name="TABLE_ID")
	private int tableId;

	@Column(name="TABLE_NAME")
	private String tableName;

	public TblREPORT_EXPORT_LIST() {
	}

	public String getLastUpdatedById() {
		return this.lastUpdatedById;
	}

	public void setLastUpdatedById(String lastUpdatedById) {
		this.lastUpdatedById = lastUpdatedById;
	}

	public Timestamp getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getRefreshFlag() {
		return this.refreshFlag;
	}

	public void setRefreshFlag(String refreshFlag) {
		this.refreshFlag = refreshFlag;
	}

	public String getTableDesc() {
		return this.tableDesc;
	}

	public void setTableDesc(String tableDesc) {
		this.tableDesc = tableDesc;
	}

	public int getTableId() {
		return this.tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}