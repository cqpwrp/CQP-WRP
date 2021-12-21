package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblFACTORY_NAME database table.
 * 
 */
@Embeddable
@Table(name="tblFACTORY_NAME")
@NamedQuery(name="TblFACTORY_NAME.findAll", query="SELECT t FROM TblFACTORY_NAME t")
public class TblFACTORY_NAME implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="FAC_NAME")
	private String facName;

	public TblFACTORY_NAME() {
	}

	public String getFacName() {
		return this.facName;
	}

	public void setFacName(String facName) {
		this.facName = facName;
	}

}