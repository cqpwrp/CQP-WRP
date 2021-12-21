package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblCQ_SUPPLIER_INFO database table.
 * 
 */
@Entity
@Table(name="tblCQ_SUPPLIER_INFO")
@NamedQuery(name="TblcqSupplierInfo.findAll", query="SELECT t FROM TblcqSupplierInfo t")
public class TblcqSupplierInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="ADDRESS_1")
	private String address1;

	@Column(name="ADDRESS_2")
	private String address2;

	@Column(name="CITY")
	private String city;

	@Column(name="COUNTRY_CD")
	private String countryCd;

	@Column(name="INVOICE_NO")
	private String invoiceNo;

	@Column(name="PARTICIPATING_FLAG")
	private String participatingFlag;

	@Column(name="POSTAL_CD")
	private String postalCd;

	@Column(name="STATE_CD")
	private String stateCd;

	@Column(name="SUPP_LOCATION")
	private String suppLocation;

	@Column(name="SUPP_NAME")
	private String suppName;

	@Column(name="SUPP_STATUS")
	private String suppStatus;

	public TblcqSupplierInfo() {
	}

	public String getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountryCd() {
		return this.countryCd;
	}

	public void setCountryCd(String countryCd) {
		this.countryCd = countryCd;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getParticipatingFlag() {
		return this.participatingFlag;
	}

	public void setParticipatingFlag(String participatingFlag) {
		this.participatingFlag = participatingFlag;
	}

	public String getPostalCd() {
		return this.postalCd;
	}

	public void setPostalCd(String postalCd) {
		this.postalCd = postalCd;
	}

	public String getStateCd() {
		return this.stateCd;
	}

	public void setStateCd(String stateCd) {
		this.stateCd = stateCd;
	}

	public String getSuppLocation() {
		return this.suppLocation;
	}

	public void setSuppLocation(String suppLocation) {
		this.suppLocation = suppLocation;
	}

	public String getSuppName() {
		return this.suppName;
	}

	public void setSuppName(String suppName) {
		this.suppName = suppName;
	}

	public String getSuppStatus() {
		return this.suppStatus;
	}

	public void setSuppStatus(String suppStatus) {
		this.suppStatus = suppStatus;
	}

}