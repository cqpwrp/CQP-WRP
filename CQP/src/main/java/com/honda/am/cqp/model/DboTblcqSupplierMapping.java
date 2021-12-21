package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dbo_tblcq_supplier_mapping database table.
 * 
 */
@Entity
@Table(name="dbo_tblcq_supplier_mapping")
@NamedQuery(name="DboTblcqSupplierMapping.findAll", query="SELECT d FROM DboTblcqSupplierMapping d")
public class DboTblcqSupplierMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DboTblcqSupplierMappingPK id;

	public DboTblcqSupplierMapping() {
	}

	public DboTblcqSupplierMappingPK getId() {
		return this.id;
	}

	public void setId(DboTblcqSupplierMappingPK id) {
		this.id = id;
	}

}