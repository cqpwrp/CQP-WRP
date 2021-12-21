package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblDAYS_BIN database table.
 * 
 */
@Embeddable
@Table(name="tblDAYS_BIN")
@NamedQuery(name="TblDAYS_BIN.findAll", query="SELECT t FROM TblDAYS_BIN t")
public class TblDAYS_BIN implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DAYS_END")
	private int daysEnd;

	@Column(name="DAYS_RANGE")
	private String daysRange;

	@Column(name="DAYS_START")
	private int daysStart;

	public TblDAYS_BIN() {
	}

	public int getDaysEnd() {
		return this.daysEnd;
	}

	public void setDaysEnd(int daysEnd) {
		this.daysEnd = daysEnd;
	}

	public String getDaysRange() {
		return this.daysRange;
	}

	public void setDaysRange(String daysRange) {
		this.daysRange = daysRange;
	}

	public int getDaysStart() {
		return this.daysStart;
	}

	public void setDaysStart(int daysStart) {
		this.daysStart = daysStart;
	}

}