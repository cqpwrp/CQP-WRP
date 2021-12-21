package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblVOUCHER_ACCT_VALUES database table.
 * 
 */
@Embeddable
@Table(name="tblVOUCHER_ACCT_VALUES")
@NamedQuery(name="TblVOUCHER_ACCT_VALUE.findAll", query="SELECT t FROM TblVOUCHER_ACCT_VALUE t")
public class TblVOUCHER_ACCT_VALUE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	@Column(name="DEPT_NO")
	private String deptNo;

	@Column(name="DESTINATION_NAME")
	private String destinationName;

	@Column(name="PROJECT_NO")
	private String projectNo;

	@Column(name="PURCHASE_ORDER_NO")
	private String purchaseOrderNo;

	public TblVOUCHER_ACCT_VALUE() {
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getDeptNo() {
		return this.deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getDestinationName() {
		return this.destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public String getProjectNo() {
		return this.projectNo;
	}

	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public String getPurchaseOrderNo() {
		return this.purchaseOrderNo;
	}

	public void setPurchaseOrderNo(String purchaseOrderNo) {
		this.purchaseOrderNo = purchaseOrderNo;
	}

}