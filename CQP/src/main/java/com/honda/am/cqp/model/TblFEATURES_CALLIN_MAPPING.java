package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblFEATURES_CALLIN_MAPPING database table.
 * 
 */
@Entity
@Table(name="tblFEATURES_CALLIN_MAPPING")
@NamedQuery(name="TblFEATURES_CALLIN_MAPPING.findAll", query="SELECT t FROM TblFEATURES_CALLIN_MAPPING t")
public class TblFEATURES_CALLIN_MAPPING implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TblFEATURES_CALLIN_MAPPINGPK id;

	public TblFEATURES_CALLIN_MAPPING() {
	}

	public TblFEATURES_CALLIN_MAPPINGPK getId() {
		return this.id;
	}

	public void setId(TblFEATURES_CALLIN_MAPPINGPK id) {
		this.id = id;
	}

}