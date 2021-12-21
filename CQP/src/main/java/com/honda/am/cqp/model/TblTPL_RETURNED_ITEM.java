package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblTPL_RETURNED_ITEMS database table.
 * 
 */
@Embeddable
@Table(name="tblTPL_RETURNED_ITEMS")
@NamedQuery(name="TblTPL_RETURNED_ITEM.findAll", query="SELECT t FROM TblTPL_RETURNED_ITEM t")
public class TblTPL_RETURNED_ITEM implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="RETURNED_DATE")
	private Timestamp returnedDate;

	@Column(name="TRANSFER_PART_LIST_ITEM_DETAIL_SK")
	private int transferPartListItemDetailSk;

	public TblTPL_RETURNED_ITEM() {
	}

	public Timestamp getReturnedDate() {
		return this.returnedDate;
	}

	public void setReturnedDate(Timestamp returnedDate) {
		this.returnedDate = returnedDate;
	}

	public int getTransferPartListItemDetailSk() {
		return this.transferPartListItemDetailSk;
	}

	public void setTransferPartListItemDetailSk(int transferPartListItemDetailSk) {
		this.transferPartListItemDetailSk = transferPartListItemDetailSk;
	}

}