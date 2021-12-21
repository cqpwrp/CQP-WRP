package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblCQ_SUPPLIER_MAPPING database table.
 * 
 */
@Entity
@Table(name="tblCQ_SUPPLIER_MAPPING")
@NamedQuery(name="TblcqSupplierMapping.findAll", query="SELECT t FROM TblcqSupplierMapping t")
public class TblcqSupplierMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TblCQ_SUPPLIER_MAPPINGPK id;

	public TblcqSupplierMapping() {
	}

	public TblCQ_SUPPLIER_MAPPINGPK getId() {
		return this.id;
	}

	public void setId(TblCQ_SUPPLIER_MAPPINGPK id) {
		this.id = id;
	}

}