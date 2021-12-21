package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblSEQUENCE database table.
 * 
 */
@Entity
@Table(name="tblSEQUENCE")
@NamedQuery(name="TblSEQUENCE.findAll", query="SELECT t FROM TblSEQUENCE t")
public class TblSEQUENCE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TABLE_NAME")
	private String tableName;

	@Column(name="COLUMN_NAME")
	private String columnName;

	@Column(name="NEXT_SEQ_NO")
	private int nextSeqNo;

	public TblSEQUENCE() {
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public int getNextSeqNo() {
		return this.nextSeqNo;
	}

	public void setNextSeqNo(int nextSeqNo) {
		this.nextSeqNo = nextSeqNo;
	}

}