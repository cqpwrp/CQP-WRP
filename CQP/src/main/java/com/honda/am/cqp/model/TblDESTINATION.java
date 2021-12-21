package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblDESTINATION database table.
 * 
 */
@Entity
@Table(name="tblDESTINATION")
@NamedQuery(name="TblDESTINATION.findAll", query="SELECT t FROM TblDESTINATION t")
public class TblDESTINATION implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DESTINATION_ID")
	private int destinationId;

	@Column(name="DESTINATION_NAME")
	private String destinationName;

	public TblDESTINATION() {
	}

	public int getDestinationId() {
		return this.destinationId;
	}

	public void setDestinationId(int destinationId) {
		this.destinationId = destinationId;
	}

	public String getDestinationName() {
		return this.destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

}