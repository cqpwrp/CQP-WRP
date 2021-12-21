package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tblBAR_CODE_DETAILS database table.
 * 
 */
@Embeddable
public class TblBAR_CODE_DETAILPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="DEALER_NO")
	private String dealerNo;

	@Column(name="CLAIM_NO")
	private String claimNo;

	@Column(name="SUPP_NO")
	private String suppNo;

	public TblBAR_CODE_DETAILPK() {
	}
	public String getDealerNo() {
		return this.dealerNo;
	}
	public void setDealerNo(String dealerNo) {
		this.dealerNo = dealerNo;
	}
	public String getClaimNo() {
		return this.claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}
	public String getSuppNo() {
		return this.suppNo;
	}
	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TblBAR_CODE_DETAILPK)) {
			return false;
		}
		TblBAR_CODE_DETAILPK castOther = (TblBAR_CODE_DETAILPK)other;
		return 
			this.dealerNo.equals(castOther.dealerNo)
			&& this.claimNo.equals(castOther.claimNo)
			&& this.suppNo.equals(castOther.suppNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dealerNo.hashCode();
		hash = hash * prime + this.claimNo.hashCode();
		hash = hash * prime + this.suppNo.hashCode();
		
		return hash;
	}
}