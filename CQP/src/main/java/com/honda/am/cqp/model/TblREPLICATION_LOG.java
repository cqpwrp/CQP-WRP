package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblREPLICATION_LOG database table.
 * 
 */
@Embeddable
@Table(name="tblREPLICATION_LOG")
@NamedQuery(name="TblREPLICATION_LOG.findAll", query="SELECT t FROM TblREPLICATION_LOG t")
public class TblREPLICATION_LOG implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ReplCommand")
	private String replCommand;

	@Column(name="ReplDate")
	private Timestamp replDate;

	@Column(name="ReplMessage")
	private String replMessage;

	@Column(name="ReplStatus")
	private int replStatus;

	@Column(name="ReplTable")
	private String replTable;

	public TblREPLICATION_LOG() {
	}

	public String getReplCommand() {
		return this.replCommand;
	}

	public void setReplCommand(String replCommand) {
		this.replCommand = replCommand;
	}

	public Timestamp getReplDate() {
		return this.replDate;
	}

	public void setReplDate(Timestamp replDate) {
		this.replDate = replDate;
	}

	public String getReplMessage() {
		return this.replMessage;
	}

	public void setReplMessage(String replMessage) {
		this.replMessage = replMessage;
	}

	public int getReplStatus() {
		return this.replStatus;
	}

	public void setReplStatus(int replStatus) {
		this.replStatus = replStatus;
	}

	public String getReplTable() {
		return this.replTable;
	}

	public void setReplTable(String replTable) {
		this.replTable = replTable;
	}

}