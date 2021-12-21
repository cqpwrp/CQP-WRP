package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblSUPP_PART_INFO database table.
 * 
 */
@Entity
@Table(name="tblSUPP_PART_INFO")
@NamedQuery(name="TblSUPP_PART_INFO.findAll", query="SELECT t FROM TblSUPP_PART_INFO t")
public class TblSUPP_PART_INFO implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TblSUPP_PART_INFOPK id;

	@Column(name="SHORT_PART_NAME")
	private String shortPartName;

	@Column(name="SUPP_SK")
	private int suppSk;

	public TblSUPP_PART_INFO() {
	}

	public TblSUPP_PART_INFOPK getId() {
		return this.id;
	}

	public void setId(TblSUPP_PART_INFOPK id) {
		this.id = id;
	}

	public String getShortPartName() {
		return this.shortPartName;
	}

	public void setShortPartName(String shortPartName) {
		this.shortPartName = shortPartName;
	}

	public int getSuppSk() {
		return this.suppSk;
	}

	public void setSuppSk(int suppSk) {
		this.suppSk = suppSk;
	}

}