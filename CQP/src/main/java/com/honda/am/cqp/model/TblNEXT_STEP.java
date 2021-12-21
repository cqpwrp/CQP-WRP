package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblNEXT_STEP database table.
 * 
 */
@Embeddable
@Table(name="tblNEXT_STEP")
@NamedQuery(name="TblNEXT_STEP.findAll", query="SELECT t FROM TblNEXT_STEP t")
public class TblNEXT_STEP implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="NEXT_STEP_DESC")
	private String nextStepDesc;

	@Column(name="NEXT_STEP_NO")
	private int nextStepNo;

	public TblNEXT_STEP() {
	}

	public String getNextStepDesc() {
		return this.nextStepDesc;
	}

	public void setNextStepDesc(String nextStepDesc) {
		this.nextStepDesc = nextStepDesc;
	}

	public int getNextStepNo() {
		return this.nextStepNo;
	}

	public void setNextStepNo(int nextStepNo) {
		this.nextStepNo = nextStepNo;
	}

}