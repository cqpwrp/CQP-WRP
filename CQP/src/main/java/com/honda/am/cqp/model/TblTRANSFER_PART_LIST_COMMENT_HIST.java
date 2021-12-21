package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblTRANSFER_PART_LIST_COMMENT_HIST database table.
 * 
 */
@Entity
@Table(name="tblTRANSFER_PART_LIST_COMMENT_HIST")
@NamedQuery(name="TblTRANSFER_PART_LIST_COMMENT_HIST.findAll", query="SELECT t FROM TblTRANSFER_PART_LIST_COMMENT_HIST t")
public class TblTRANSFER_PART_LIST_COMMENT_HIST implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TRANSFER_PART_LIST_COMMENT_SK")
	private int transferPartListCommentSk;

	@Column(name="[COMMENT]")
	private String comment;

	@Column(name="CREATED_DATE")
	private Timestamp createdDate;

	@Column(name="TRANSFER_PART_LIST_ITEM_DETAIL_SK")
	private int transferPartListItemDetailSk;

	@Column(name="USER_FIRST_NAME")
	private String userFirstName;

	@Column(name="USER_LAST_NAME")
	private String userLastName;

	@Column(name="USER_LOGIN")
	private String userLogin;

	@Column(name="VISIBILITY_FLAG")
	private String visibilityFlag;

	public TblTRANSFER_PART_LIST_COMMENT_HIST() {
	}

	public int getTransferPartListCommentSk() {
		return this.transferPartListCommentSk;
	}

	public void setTransferPartListCommentSk(int transferPartListCommentSk) {
		this.transferPartListCommentSk = transferPartListCommentSk;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public int getTransferPartListItemDetailSk() {
		return this.transferPartListItemDetailSk;
	}

	public void setTransferPartListItemDetailSk(int transferPartListItemDetailSk) {
		this.transferPartListItemDetailSk = transferPartListItemDetailSk;
	}

	public String getUserFirstName() {
		return this.userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return this.userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserLogin() {
		return this.userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getVisibilityFlag() {
		return this.visibilityFlag;
	}

	public void setVisibilityFlag(String visibilityFlag) {
		this.visibilityFlag = visibilityFlag;
	}

}