package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblWRP_APPROVED_CQ_CLAIMS database table.
 * 
 */
@Embeddable
@Table(name="tblWRP_APPROVED_CQ_CLAIMS")
@NamedQuery(name="TblWRP_APPROVED_CQ_CLAIM.findAll", query="SELECT t FROM TblWRP_APPROVED_CQ_CLAIM t")
public class TblWRP_APPROVED_CQ_CLAIM implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CLAIM_NO")
	private String claimNo;

	@Column(name="DEALER_NO")
	private String dealerNo;

	@Column(name="ROYR")
	private String royr;

	@Column(name="SHORT_PART_NO")
	private String shortPartNo;

	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="WRP_FLAG")
	private String wrpFlag;

	public TblWRP_APPROVED_CQ_CLAIM() {
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

	public String getRoyr() {
		return this.royr;
	}

	public void setRoyr(String royr) {
		this.royr = royr;
	}

	public String getShortPartNo() {
		return this.shortPartNo;
	}

	public void setShortPartNo(String shortPartNo) {
		this.shortPartNo = shortPartNo;
	}

	public String getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

	public String getWrpFlag() {
		return this.wrpFlag;
	}

	public void setWrpFlag(String wrpFlag) {
		this.wrpFlag = wrpFlag;
	}

}