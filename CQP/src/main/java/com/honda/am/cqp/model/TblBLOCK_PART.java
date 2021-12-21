package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblBLOCK_PARTS database table.
 * 
 */
@Entity
@Table(name="tblBLOCK_PARTS")
@NamedQuery(name="TblBLOCK_PART.findAll", query="SELECT t FROM TblBLOCK_PART t")
public class TblBLOCK_PART implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TblBLOCK_PARTPK id;

	@Column(name="[COMMENT]")
	private String comment;

	@Column(name="CREATED_BY_NAME")
	private String createdByName;

	@Column(name="CREATED_DATE")
	private Timestamp createdDate;

	public TblBLOCK_PART() {
	}

	public TblBLOCK_PARTPK getId() {
		return this.id;
	}

	public void setId(TblBLOCK_PARTPK id) {
		this.id = id;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCreatedByName() {
		return this.createdByName;
	}

	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

}