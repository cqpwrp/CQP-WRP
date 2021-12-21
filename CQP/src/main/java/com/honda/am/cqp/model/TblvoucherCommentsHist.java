package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the TBLVOUCHER_COMMENTS_HIST database table.
 * 
 */
@Entity
@Table(name="TBLVOUCHER_COMMENTS_HIST")
@NamedQuery(name="TblvoucherCommentsHist.findAll", query="SELECT t FROM TblvoucherCommentsHist t")
public class TblvoucherCommentsHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="VOUCHER_COMMENT_SK")
	private int voucherCommentSk;

	@Column(name="[COMMENT]")
	private String comment;

	@Column(name="CREATED_DATE")
	private Timestamp createdDate;

	@Column(name="QTR_NO")
	private String qtrNo;

	@Column(name="QTR_YEAR")
	private String qtrYear;

	@Column(name="SUPP_NO")
	private String suppNo;

	@Column(name="USER_FIRST_NAME")
	private String userFirstName;

	@Column(name="USER_LAST_NAME")
	private String userLastName;

	@Column(name="USER_LOGIN")
	private String userLogin;

	@Column(name="VISIBILITY_FLAG")
	private String visibilityFlag;

	public TblvoucherCommentsHist() {
	}

	public int getVoucherCommentSk() {
		return this.voucherCommentSk;
	}

	public void setVoucherCommentSk(int voucherCommentSk) {
		this.voucherCommentSk = voucherCommentSk;
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

	public String getQtrNo() {
		return this.qtrNo;
	}

	public void setQtrNo(String qtrNo) {
		this.qtrNo = qtrNo;
	}

	public String getQtrYear() {
		return this.qtrYear;
	}

	public void setQtrYear(String qtrYear) {
		this.qtrYear = qtrYear;
	}

	public String getSuppNo() {
		return this.suppNo;
	}

	public void setSuppNo(String suppNo) {
		this.suppNo = suppNo;
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