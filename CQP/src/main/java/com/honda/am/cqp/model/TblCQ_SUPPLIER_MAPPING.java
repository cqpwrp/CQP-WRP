package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblCQ_SUPPLIER_MAPPING database table.
 * 
 */
@Entity
@Table(name="tblCQ_SUPPLIER_MAPPING")
@NamedQuery(name="TblCQ_SUPPLIER_MAPPING.findAll", query="SELECT t FROM TblCQ_SUPPLIER_MAPPING t")
public class TblCQ_SUPPLIER_MAPPING implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TblCQ_SUPPLIER_MAPPINGPK id;

	public TblCQ_SUPPLIER_MAPPING() {
	}

	public TblCQ_SUPPLIER_MAPPINGPK getId() {
		return this.id;
	}

	public void setId(TblCQ_SUPPLIER_MAPPINGPK id) {
		this.id = id;
	}

}