package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tblAdjusted_temp database table.
 * 
 */
@Embeddable
@Table(name="tblAdjusted_temp")
@NamedQuery(name="TblAdjusted_temp.findAll", query="SELECT t FROM TblAdjusted_temp t")
public class TblAdjusted_temp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CLAIM_NO")
	private String claimNo;

	@Column(name="DEALER_NO")
	private String dealerNo;

	@Column(name="OTHER_CHARGE")
	private BigDecimal otherCharge;

	@Column(name="part_count")
	private int partCount;

	@Column(name="ROYR")
	private String royr;

	@Column(name="SUBLET_CHARGE")
	private BigDecimal subletCharge;

	public TblAdjusted_temp() {
	}

	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getDealerNo() {
		return this.dealerNo;
	}

	public void setDealerNo(String dealerNo) {
		this.dealerNo = dealerNo;
	}

	public BigDecimal getOtherCharge() {
		return this.otherCharge;
	}

	public void setOtherCharge(BigDecimal otherCharge) {
		this.otherCharge = otherCharge;
	}

	public int getPartCount() {
		return this.partCount;
	}

	public void setPartCount(int partCount) {
		this.partCount = partCount;
	}

	public String getRoyr() {
		return this.royr;
	}

	public void setRoyr(String royr) {
		this.royr = royr;
	}

	public BigDecimal getSubletCharge() {
		return this.subletCharge;
	}

	public void setSubletCharge(BigDecimal subletCharge) {
		this.subletCharge = subletCharge;
	}

}