package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the tblHANDOFF_VOUCHER database table.
 * 
 */
@Entity
@Table(name="tblHANDOFF_VOUCHER")
@NamedQuery(name="TblHANDOFF_VOUCHER.findAll", query="SELECT t FROM TblHANDOFF_VOUCHER t")
public class TblHANDOFF_VOUCHER implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	@Column(name="DEPARTMENT_NO")
	private String departmentNo;

	@Column(name="INVOICE_DATE")
	private Timestamp invoiceDate;

	@Column(name="INVOICE_NO")
	private String invoiceNo;

	@Column(name="PAYER_CODE")
	private String payerCode;

	@Column(name="PO_NO")
	private String poNo;

	@Column(name="PROJECT_NO")
	private String projectNo;

	@Column(name="TOTAL_DEBIT_AMOUNT")
	private BigDecimal totalDebitAmount;

	public TblHANDOFF_VOUCHER() {
	}

	public String getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getDepartmentNo() {
		return this.departmentNo;
	}

	public void setDepartmentNo(String departmentNo) {
		this.departmentNo = departmentNo;
	}

	public Timestamp getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceDate(Timestamp invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getPayerCode() {
		return this.payerCode;
	}

	public void setPayerCode(String payerCode) {
		this.payerCode = payerCode;
	}

	public String getPoNo() {
		return this.poNo;
	}

	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}

	public String getProjectNo() {
		return this.projectNo;
	}

	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public BigDecimal getTotalDebitAmount() {
		return this.totalDebitAmount;
	}

	public void setTotalDebitAmount(BigDecimal totalDebitAmount) {
		this.totalDebitAmount = totalDebitAmount;
	}

}