package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the dtproperties database table.
 * 
 */
@Entity
@Table(name = "dtproperties")
@NamedQuery(name = "Dtproperty.findAll", query = "SELECT d FROM Dtproperty d")
public class Dtproperty implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DtpropertyPK id;

	@Lob
	private byte[] lvalue;

	private int objectid;

	private String uvalue;

	private String value;

	private int version;

	public Dtproperty() {
	}

	public DtpropertyPK getId() {
		return this.id;
	}

	public void setId(DtpropertyPK id) {
		this.id = id;
	}

	public byte[] getLvalue() {
		return this.lvalue;
	}

	public void setLvalue(byte[] lvalue) {
		this.lvalue = lvalue;
	}

	public int getObjectid() {
		return this.objectid;
	}

	public void setObjectid(int objectid) {
		this.objectid = objectid;
	}

	public Object getUvalue() {
		return this.uvalue;
	}

	public void setUvalue(String uvalue) {
		this.uvalue = uvalue;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}