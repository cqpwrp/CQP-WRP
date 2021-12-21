package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblMQ_CLAIMS_NOT_FOUND database table.
 * 
 */
@Embeddable
@Table(name="tblMQ_CLAIMS_NOT_FOUND")
@NamedQuery(name="TblMQ_CLAIMS_NOT_FOUND.findAll", query="SELECT t FROM TblMQ_CLAIMS_NOT_FOUND t")
public class TblMQ_CLAIMS_NOT_FOUND implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CLAIM_NO")
	private String claimNo;

	@Column(name="DEALER_NO")
	private String dealerNo;

	@Column(name="Part_no")
	private String part_no;

	@Column(name="ROYR")
	private String royr;

	@Column(name="SUPP_NO")
	private String suppNo;

	public TblMQ_CLAIMS_NOT_FOUND() {
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

	public String getPart_no() {
		return this.part_no;
	}

	public void setPart_no(String part_no) {
		this.part_no = part_no;
	}

	public String getRoyr() {
		return this.royr;
	}

	public void setRoyr(String royr) {
		this.royr = royr;
	}

	public String getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

}