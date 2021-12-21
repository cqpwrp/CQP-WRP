package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tblEXTENDED_WARRANTY_PARTS database table.
 * 
 */
@Entity
@Table(name="tblEXTENDED_WARRANTY_PARTS")
@NamedQuery(name="TblEXTENDED_WARRANTY_PART.findAll", query="SELECT t FROM TblEXTENDED_WARRANTY_PART t")
public class TblEXTENDED_WARRANTY_PART implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TblEXTENDED_WARRANTY_PARTPK id;

	@Column(name="MAX_DAYS")
	private BigDecimal maxDays;

	@Column(name="MAX_ODOM")
	private BigDecimal maxOdom;

	public TblEXTENDED_WARRANTY_PART() {
	}

	public TblEXTENDED_WARRANTY_PARTPK getId() {
		return this.id;
	}

	public void setId(TblEXTENDED_WARRANTY_PARTPK id) {
		this.id = id;
	}

	public BigDecimal getMaxDays() {
		return this.maxDays;
	}

	public void setMaxDays(BigDecimal maxDays) {
		this.maxDays = maxDays;
	}

	public BigDecimal getMaxOdom() {
		return this.maxOdom;
	}

	public void setMaxOdom(BigDecimal maxOdom) {
		this.maxOdom = maxOdom;
	}

}