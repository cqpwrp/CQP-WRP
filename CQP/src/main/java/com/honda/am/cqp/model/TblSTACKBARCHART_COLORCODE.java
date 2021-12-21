package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblSTACKBARCHART_COLORCODE database table.
 * 
 */
@Embeddable
@Table(name="tblSTACKBARCHART_COLORCODE")
@NamedQuery(name="TblSTACKBARCHART_COLORCODE.findAll", query="SELECT t FROM TblSTACKBARCHART_COLORCODE t")
public class TblSTACKBARCHART_COLORCODE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="COLOR_CODE")
	private String colorCode;

	public TblSTACKBARCHART_COLORCODE() {
	}

	public String getColorCode() {
		return this.colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

}