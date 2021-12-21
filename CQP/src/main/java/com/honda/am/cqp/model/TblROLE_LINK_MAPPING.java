package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblROLE_LINK_MAPPING database table.
 * 
 */
@Entity
@Table(name="tblROLE_LINK_MAPPING")
@NamedQuery(name="TblROLE_LINK_MAPPING.findAll", query="SELECT t FROM TblROLE_LINK_MAPPING t")
public class TblROLE_LINK_MAPPING implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TblROLE_LINK_MAPPINGPK id;

	@Column(name="SEQUENCE_NO")
	private int sequenceNo;

	@Column(name="SUBHDRLINK")
	private String subhdrlink;

	public TblROLE_LINK_MAPPING() {
	}

	public TblROLE_LINK_MAPPINGPK getId() {
		return this.id;
	}

	public void setId(TblROLE_LINK_MAPPINGPK id) {
		this.id = id;
	}

	public int getSequenceNo() {
		return this.sequenceNo;
	}

	public void setSequenceNo(int sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public String getSubhdrlink() {
		return this.subhdrlink;
	}

	public void setSubhdrlink(String subhdrlink) {
		this.subhdrlink = subhdrlink;
	}

}