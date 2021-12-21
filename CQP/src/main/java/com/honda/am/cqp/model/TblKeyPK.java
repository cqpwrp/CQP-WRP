package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tblKeys database table.
 * 
 */
@Embeddable
public class TblKeyPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="KeyName")
	private String keyName;

	@Column(name="KeyValue")
	private String keyValue;

	public TblKeyPK() {
	}
	public String getKeyName() {
		return this.keyName;
	}
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}
	public String getKeyValue() {
		return this.keyValue;
	}
	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TblKeyPK)) {
			return false;
		}
		TblKeyPK castOther = (TblKeyPK)other;
		return 
			this.keyName.equals(castOther.keyName)
			&& this.keyValue.equals(castOther.keyValue);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.keyName.hashCode();
		hash = hash * prime + this.keyValue.hashCode();
		
		return hash;
	}
}