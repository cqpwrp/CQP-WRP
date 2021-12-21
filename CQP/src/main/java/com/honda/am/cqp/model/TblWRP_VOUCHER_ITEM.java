package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblWRP_VOUCHER_ITEMS database table.
 * 
 */
@Entity
@Table(name="tblWRP_VOUCHER_ITEMS")
@NamedQuery(name="TblWRP_VOUCHER_ITEM.findAll", query="SELECT t FROM TblWRP_VOUCHER_ITEM t")
public class TblWRP_VOUCHER_ITEM implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="WRP_NO")
	private String wrpNo;

	@Column(name="INSERT_TSTP")
	private Timestamp insertTstp;

	@Column(name="PART_NO")
	private String partNo;

	@Column(name="SUPPLIER_N0")
	private String supplierN0;

	@Column(name="VIN_END")
	private String vinEnd;

	@Column(name="VIN_START")
	private String vinStart;

	@Column(name="WRP_DATE")
	private Timestamp wrpDate;

	public TblWRP_VOUCHER_ITEM() {
	}

	public String getWrpNo() {
		return this.wrpNo;
	}

	public void setWrpNo(String wrpNo) {
		this.wrpNo = wrpNo;
	}

	public Timestamp getInsertTstp() {
		return this.insertTstp;
	}

	public void setInsertTstp(Timestamp insertTstp) {
		this.insertTstp = insertTstp;
	}

	public String getPartNo() {
		return this.partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getSupplierN0() {
		return this.supplierN0;
	}

	public void setSupplierN0(String supplierN0) {
		this.supplierN0 = supplierN0;
	}

	public String getVinEnd() {
		return this.vinEnd;
	}

	public void setVinEnd(String vinEnd) {
		this.vinEnd = vinEnd;
	}

	public String getVinStart() {
		return this.vinStart;
	}

	public void setVinStart(String vinStart) {
		this.vinStart = vinStart;
	}

	public Timestamp getWrpDate() {
		return this.wrpDate;
	}

	public void setWrpDate(Timestamp wrpDate) {
		this.wrpDate = wrpDate;
	}

}