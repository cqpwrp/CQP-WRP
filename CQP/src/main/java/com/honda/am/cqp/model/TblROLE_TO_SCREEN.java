package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblROLE_TO_SCREEN database table.
 * 
 */
@Entity
@Table(name="tblROLE_TO_SCREEN")
@NamedQuery(name="TblROLE_TO_SCREEN.findAll", query="SELECT t FROM TblROLE_TO_SCREEN t")
public class TblROLE_TO_SCREEN implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TblROLE_TO_SCREENPK id;

	@Column(name="ACTION_BUTTONS")
	private String actionButtons;

	@Column(name="EDIT_FIELDS")
	private String editFields;

	public TblROLE_TO_SCREEN() {
	}

	public TblROLE_TO_SCREENPK getId() {
		return this.id;
	}

	public void setId(TblROLE_TO_SCREENPK id) {
		this.id = id;
	}

	public String getActionButtons() {
		return this.actionButtons;
	}

	public void setActionButtons(String actionButtons) {
		this.actionButtons = actionButtons;
	}

	public String getEditFields() {
		return this.editFields;
	}

	public void setEditFields(String editFields) {
		this.editFields = editFields;
	}

}