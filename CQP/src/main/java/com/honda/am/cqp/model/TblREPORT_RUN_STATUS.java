package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblREPORT_RUN_STATUS database table.
 * 
 */
@Entity
@Table(name="tblREPORT_RUN_STATUS")
@NamedQuery(name="TblREPORT_RUN_STATUS.findAll", query="SELECT t FROM TblREPORT_RUN_STATUS t")
public class TblREPORT_RUN_STATUS implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TblREPORT_RUN_STATUSPK id;

	@Column(name="ERROR_FLAG")
	private String errorFlag;

	@Column(name="FILE_NAME")
	private String fileName;

	@Column(name="RUN_FLAG")
	private String runFlag;

	@Column(name="UPDATED_TIMESTAMP")
	private Timestamp updatedTimestamp;

	public TblREPORT_RUN_STATUS() {
	}

	public TblREPORT_RUN_STATUSPK getId() {
		return this.id;
	}

	public void setId(TblREPORT_RUN_STATUSPK id) {
		this.id = id;
	}

	public String getErrorFlag() {
		return this.errorFlag;
	}

	public void setErrorFlag(String errorFlag) {
		this.errorFlag = errorFlag;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getRunFlag() {
		return this.runFlag;
	}

	public void setRunFlag(String runFlag) {
		this.runFlag = runFlag;
	}

	public Timestamp getUpdatedTimestamp() {
		return this.updatedTimestamp;
	}

	public void setUpdatedTimestamp(Timestamp updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}

}