package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblPAYER database table.
 * 
 */
@Entity
@Table(name="tblPAYER")
@NamedQuery(name="TblPAYER.findAll", query="SELECT t FROM TblPAYER t")
public class TblPAYER implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PAYER_CODE")
	private String payerCode;

	@Column(name="PAYER_NAME")
	private String payerName;

	public TblPAYER() {
	}

	public String getPayerCode() {
		return this.payerCode;
	}

	public void setPayerCode(String payerCode) {
		this.payerCode = payerCode;
	}

	public String getPayerName() {
		return this.payerName;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

}