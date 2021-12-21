package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblKeys database table.
 * 
 */
@Entity
@Table(name="tblKeys")
@NamedQuery(name="TblKey.findAll", query="SELECT t FROM TblKey t")
public class TblKey implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TblKeyPK id;

	@Column(name="KeyDesc")
	private String keyDesc;

	@Column(name="KeyInfo")
	private String keyInfo;

	public TblKey() {
	}

	public TblKeyPK getId() {
		return this.id;
	}

	public void setId(TblKeyPK id) {
		this.id = id;
	}

	public String getKeyDesc() {
		return this.keyDesc;
	}

	public void setKeyDesc(String keyDesc) {
		this.keyDesc = keyDesc;
	}

	public String getKeyInfo() {
		return this.keyInfo;
	}

	public void setKeyInfo(String keyInfo) {
		this.keyInfo = keyInfo;
	}

}