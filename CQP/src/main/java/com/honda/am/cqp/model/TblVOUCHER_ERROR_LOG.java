package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblVOUCHER_ERROR_LOG database table.
 * 
 */
@Embeddable
@Table(name="tblVOUCHER_ERROR_LOG")
@NamedQuery(name="TblVOUCHER_ERROR_LOG.findAll", query="SELECT t FROM TblVOUCHER_ERROR_LOG t")
public class TblVOUCHER_ERROR_LOG implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="NEXT_STEP")
	private String nextStep;

	@Column(name="PROCESS_DESC")
	private String processDesc;

	@Column(name="PROCESS_NAME")
	private String processName;

	@Column(name="PROCESS_STEP")
	private String processStep;

	@Column(name="RECORDS_PROCESSED")
	private int recordsProcessed;

	@Column(name="RUN_DATE")
	private Timestamp runDate;

	@Column(name="START_TIME")
	private Timestamp startTime;

	public TblVOUCHER_ERROR_LOG() {
	}

	public String getNextStep() {
		return this.nextStep;
	}

	public void setNextStep(String nextStep) {
		this.nextStep = nextStep;
	}

	public String getProcessDesc() {
		return this.processDesc;
	}

	public void setProcessDesc(String processDesc) {
		this.processDesc = processDesc;
	}

	public String getProcessName() {
		return this.processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getProcessStep() {
		return this.processStep;
	}

	public void setProcessStep(String processStep) {
		this.processStep = processStep;
	}

	public int getRecordsProcessed() {
		return this.recordsProcessed;
	}

	public void setRecordsProcessed(int recordsProcessed) {
		this.recordsProcessed = recordsProcessed;
	}

	public Timestamp getRunDate() {
		return this.runDate;
	}

	public void setRunDate(Timestamp runDate) {
		this.runDate = runDate;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

}