package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblSUPPLIER_SHIPPING_INFO database table.
 * 
 */
@Entity
@Table(name="tblSUPPLIER_SHIPPING_INFO")
@NamedQuery(name="TblSUPPLIER_SHIPPING_INFO.findAll", query="SELECT t FROM TblSUPPLIER_SHIPPING_INFO t")
public class TblSUPPLIER_SHIPPING_INFO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="CONTACT_NAME")
	private String contactName;

	@Column(name="SHELF_NO")
	private String shelfNo;

	@Column(name="SHIPPING_DAY")
	private String shippingDay;

	public TblSUPPLIER_SHIPPING_INFO() {
	}

	public String getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getShelfNo() {
		return this.shelfNo;
	}

	public void setShelfNo(String shelfNo) {
		this.shelfNo = shelfNo;
	}

	public String getShippingDay() {
		return this.shippingDay;
	}

	public void setShippingDay(String shippingDay) {
		this.shippingDay = shippingDay;
	}

}