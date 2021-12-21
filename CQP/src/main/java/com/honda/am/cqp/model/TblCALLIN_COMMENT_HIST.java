package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblCALLIN_COMMENT_HIST database table.
 * 
 */
@Entity
@Table(name="tblCALLIN_COMMENT_HIST")
@NamedQuery(name="TblCALLIN_COMMENT_HIST.findAll", query="SELECT t FROM TblCALLIN_COMMENT_HIST t")
public class TblCALLIN_COMMENT_HIST implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CALLIN_COMMENT_SK")
	private int callinCommentSk;

	@Column(name="CALLIN_PART_SK")
	private int callinPartSk;

	@Column(name="[COMMENT]")
	private String comment;

	@Column(name="CREATED_DATE")
	private Timestamp createdDate;

	@Column(name="USER_FIRST_NAME")
	private String userFirstName;

	@Column(name="USER_LAST_NAME")
	private String userLastName;

	@Column(name="USER_LOGIN")
	private String userLogin;

	@Column(name="VISIBILITY_FLAG")
	private String visibilityFlag;

	public TblCALLIN_COMMENT_HIST() {
	}

	public int getCallinCommentSk() {
		return this.callinCommentSk;
	}

	public void setCallinCommentSk(int callinCommentSk) {
		this.callinCommentSk = callinCommentSk;
	}

	public int getCallinPartSk() {
		return this.callinPartSk;
	}

	public void setCallinPartSk(int callinPartSk) {
		this.callinPartSk = callinPartSk;
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