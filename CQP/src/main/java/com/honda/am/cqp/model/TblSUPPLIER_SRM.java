package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblSUPPLIER_SRM database table.
 * 
 */
@Entity
@Table(name="tblSUPPLIER_SRM")
@NamedQuery(name="TblSUPPLIER_SRM.findAll", query="SELECT t FROM TblSUPPLIER_SRM t")
public class TblSUPPLIER_SRM implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SUPL_MAP_ID")
	private long suplMapId;

	@Column(name="BUS_ENT_SUPPLIER_NO")
	private String busEntSupplierNo;

	@Column(name="BUSINESS_ENTITY")
	private String businessEntity;

	@Column(name="SUPPLIER_NAME")
	private String supplierName;

	@Column(name="SUPPLIER_NO")
	private String supplierNo;

	public TblSUPPLIER_SRM() {
	}

	public long getSuplMapId() {
		return this.suplMapId;
	}

	public void setSuplMapId(long suplMapId) {
		this.suplMapId = suplMapId;
	}

	public String getBusEntSupplierNo() {
		return this.busEntSupplierNo;
	}

	public void setBusEntSupplierNo(String busEntSupplierNo) {
		this.busEntSupplierNo = busEntSupplierNo;
	}

	public String getBusinessEntity() {
		return this.businessEntity;
	}

	public void setBusinessEntity(String businessEntity) {
		this.businessEntity = businessEntity;
	}

	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierNo() {
		return this.supplierNo;
	}

	public void setSupplierNo(String supplierNo) {
		this.supplierNo = supplierNo;
	}

}