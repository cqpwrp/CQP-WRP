package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblODOM_BIN database table.
 * 
 */
@Embeddable
@Table(name="tblODOM_BIN")
@NamedQuery(name="TblODOM_BIN.findAll", query="SELECT t FROM TblODOM_BIN t")
public class TblODOM_BIN implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ODOM_END")
	private int odomEnd;

	@Column(name="ODOM_RANGE")
	private String odomRange;

	@Column(name="ODOM_START")
	private int odomStart;

	public TblODOM_BIN() {
	}

	public int getOdomEnd() {
		return this.odomEnd;
	}

	public void setOdomEnd(int odomEnd) {
		this.odomEnd = odomEnd;
	}

	public String getOdomRange() {
		return this.odomRange;
	}

	public void setOdomRange(String odomRange) {
		this.odomRange = odomRange;
	}

	public int getOdomStart() {
		return this.odomStart;
	}

	public void setOdomStart(int odomStart) {
		this.odomStart = odomStart;
	}

}