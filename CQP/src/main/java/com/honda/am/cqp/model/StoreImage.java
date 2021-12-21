package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the storeImage database table.
 * 
 */
@Entity
@Table(name="storeImage")
@NamedQuery(name="StoreImage.findAll", query="SELECT s FROM StoreImage s")
public class StoreImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private StoreImagePK id;

	@Column(name="DATE_SUBMITTED")
	private Timestamp dateSubmitted;

	@Lob
	@Column(name="IMAGE")
	private byte[] image;

	@Column(name="TIME_SUBMITTED")
	private Timestamp timeSubmitted;

	public StoreImage() {
	}

	public StoreImagePK getId() {
		return this.id;
	}

	public void setId(StoreImagePK id) {
		this.id = id;
	}

	public Timestamp getDateSubmitted() {
		return this.dateSubmitted;
	}

	public void setDateSubmitted(Timestamp dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}

	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Timestamp getTimeSubmitted() {
		return this.timeSubmitted;
	}

	public void setTimeSubmitted(Timestamp timeSubmitted) {
		this.timeSubmitted = timeSubmitted;
	}

}