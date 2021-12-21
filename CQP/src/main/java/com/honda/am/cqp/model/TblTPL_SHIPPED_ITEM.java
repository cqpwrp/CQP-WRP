package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tblTPL_SHIPPED_ITEMS database table.
 * 
 */
@Embeddable
@Table(name="tblTPL_SHIPPED_ITEMS")
@NamedQuery(name="TblTPL_SHIPPED_ITEM.findAll", query="SELECT t FROM TblTPL_SHIPPED_ITEM t")
public class TblTPL_SHIPPED_ITEM implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CALL_IN_REF")
	private int callInRef;

	@Column(name="RESP_PCT")
	private BigDecimal respPct;

	@Column(name="SHIPPED_QTY")
	private int shippedQty;

	public TblTPL_SHIPPED_ITEM() {
	}

	public int getCallInRef() {
		return this.callInRef;
	}

	public void setCallInRef(int callInRef) {
		this.callInRef = callInRef;
	}

	public BigDecimal getRespPct() {
		return this.respPct;
	}

	public void setRespPct(BigDecimal respPct) {
		this.respPct = respPct;
	}

	public int getShippedQty() {
		return this.shippedQty;
	}

	public void setShippedQty(int shippedQty) {
		this.shippedQty = shippedQty;
	}

}