package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblTRANSFER_PART_LIST_ITEM_DETAIL database table.
 * 
 */
@Entity
@Table(name="tblTRANSFER_PART_LIST_ITEM_DETAIL")
@NamedQuery(name="TbltransferPartListItemDetail.findAll", query="SELECT t FROM TbltransferPartListItemDetail t")
public class TbltransferPartListItemDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TRANSFER_PART_LIST_ITEM_DETAIL_SK")
	private int transferPartListItemDetailSk;

	@Column(name="CATEGORY_ID")
	private int categoryId;

	@Column(name="CM_REPORT_NO")
	private String cmReportNo;

	@Column(name="CONCLUSION_ID")
	private int conclusionId;

	@Column(name="CUSTOMER_CONTENTION_TXT")
	private String customerContentionTxt;

	@Column(name="DUE_DATE")
	private Timestamp dueDate;

	@Column(name="EXTENSION_FLAG")
	private String extensionFlag;

	@Column(name="FIP")
	private String fip;

	@Column(name="FUNCTIONAL_INSPECTION_DETAIL_TXT")
	private String functionalInspectionDetailTxt;

	@Column(name="FUNCTIONAL_INSPECTION_REANALYSIS_DETAIL_TXT")
	private String functionalInspectionReanalysisDetailTxt;

	@Column(name="LAST_UPDATED_BY_NAME")
	private String lastUpdatedByName;

	@Column(name="LAST_UPDATED_DATE")
	private Timestamp lastUpdatedDate;

	@Column(name="LOT_NO")
	private String lotNo;

	@Column(name="PWG_REVIEW_FLAG")
	private String pwgReviewFlag;

	@Column(name="REJECT_FLAG")
	private String rejectFlag;

	@Column(name="REOPENED_ACCEPTED_DATE")
	private Timestamp reopenedAcceptedDate;

	@Column(name="REOPENED_DATE")
	private Timestamp reopenedDate;

	@Column(name="REOPENED_DUE_DATE")
	private Timestamp reopenedDueDate;

	@Column(name="REOPENED_SUBMITTED_DATE")
	private Timestamp reopenedSubmittedDate;

	@Column(name="RETURN_FLAG")
	private String returnFlag;

	@Column(name="RETURNED_DATE")
	private Timestamp returnedDate;

	@Column(name="SEQUENCE_NO")
	private String sequenceNo;

	@Column(name="STATUS_ID")
	private short statusId;

	@Column(name="SUBMITTED_DATE")
	private Timestamp submittedDate;

	@Column(name="SUPPLIER_ANALYSIS_SUMMARY_TXT")
	private String supplierAnalysisSummaryTxt;

	@Column(name="SUPPLIER_RESPONSIBILITY_PCT")
	private int supplierResponsibilityPct;

	@Column(name="TRANSFER_PART_LIST_DETAIL_SK")
	private int transferPartListDetailSk;

	@Column(name="[VERSION]")
	private int version;

	@Column(name="VIP")
	private String vip;

	@Column(name="VISUAL_INSPECTION_DETAIL_TXT")
	private String visualInspectionDetailTxt;

	@Column(name="VISUAL_INSPECTION_REANALYSIS_DETAIL_TXT")
	private String visualInspectionReanalysisDetailTxt;

	public TbltransferPartListItemDetail() {
	}

	public int getTransferPartListItemDetailSk() {
		return this.transferPartListItemDetailSk;
	}

	public void setTransferPartListItemDetailSk(int transferPartListItemDetailSk) {
		this.transferPartListItemDetailSk = transferPartListItemDetailSk;
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCmReportNo() {
		return this.cmReportNo;
	}

	public void setCmReportNo(String cmReportNo) {
		this.cmReportNo = cmReportNo;
	}

	public int getConclusionId() {
		return this.conclusionId;
	}

	public void setConclusionId(int conclusionId) {
		this.conclusionId = conclusionId;
	}

	public String getCustomerContentionTxt() {
		return this.customerContentionTxt;
	}

	public void setCustomerContentionTxt(String customerContentionTxt) {
		this.customerContentionTxt = customerContentionTxt;
	}

	public Timestamp getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Timestamp dueDate) {
		this.dueDate = dueDate;
	}

	public String getExtensionFlag() {
		return this.extensionFlag;
	}

	public void setExtensionFlag(String extensionFlag) {
		this.extensionFlag = extensionFlag;
	}

	public String getFip() {
		return this.fip;
	}

	public void setFip(String fip) {
		this.fip = fip;
	}

	public String getFunctionalInspectionDetailTxt() {
		return this.functionalInspectionDetailTxt;
	}

	public void setFunctionalInspectionDetailTxt(String functionalInspectionDetailTxt) {
		this.functionalInspectionDetailTxt = functionalInspectionDetailTxt;
	}

	public String getFunctionalInspectionReanalysisDetailTxt() {
		return this.functionalInspectionReanalysisDetailTxt;
	}

	public void setFunctionalInspectionReanalysisDetailTxt(String functionalInspectionReanalysisDetailTxt) {
		this.functionalInspectionReanalysisDetailTxt = functionalInspectionReanalysisDetailTxt;
	}

	public String getLastUpdatedByName() {
		return this.lastUpdatedByName;
	}

	public void setLastUpdatedByName(String lastUpdatedByName) {
		this.lastUpdatedByName = lastUpdatedByName;
	}

	public Timestamp getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getLotNo() {
		return this.lotNo;
	}

	public void setLotNo(String lotNo) {
		this.lotNo = lotNo;
	}

	public String getPwgReviewFlag() {
		return this.pwgReviewFlag;
	}

	public void setPwgReviewFlag(String pwgReviewFlag) {
		this.pwgReviewFlag = pwgReviewFlag;
	}

	public String getRejectFlag() {
		return this.rejectFlag;
	}

	public void setRejectFlag(String rejectFlag) {
		this.rejectFlag = rejectFlag;
	}

	public Timestamp getReopenedAcceptedDate() {
		return this.reopenedAcceptedDate;
	}

	public void setReopenedAcceptedDate(Timestamp reopenedAcceptedDate) {
		this.reopenedAcceptedDate = reopenedAcceptedDate;
	}

	public Timestamp getReopenedDate() {
		return this.reopenedDate;
	}

	public void setReopenedDate(Timestamp reopenedDate) {
		this.reopenedDate = reopenedDate;
	}

	public Timestamp getReopenedDueDate() {
		return this.reopenedDueDate;
	}

	public void setReopenedDueDate(Timestamp reopenedDueDate) {
		this.reopenedDueDate = reopenedDueDate;
	}

	public Timestamp getReopenedSubmittedDate() {
		return this.reopenedSubmittedDate;
	}

	public void setReopenedSubmittedDate(Timestamp reopenedSubmittedDate) {
		this.reopenedSubmittedDate = reopenedSubmittedDate;
	}

	public String getReturnFlag() {
		return this.returnFlag;
	}

	public void setReturnFlag(String returnFlag) {
		this.returnFlag = returnFlag;
	}

	public Timestamp getReturnedDate() {
		return this.returnedDate;
	}

	public void setReturnedDate(Timestamp returnedDate) {
		this.returnedDate = returnedDate;
	}

	public String getSequenceNo() {
		return this.sequenceNo;
	}

	public void setSequenceNo(String sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public short getStatusId() {
		return this.statusId;
	}

	public void setStatusId(short statusId) {
		this.statusId = statusId;
	}

	public Timestamp getSubmittedDate() {
		return this.submittedDate;
	}

	public void setSubmittedDate(Timestamp submittedDate) {
		this.submittedDate = submittedDate;
	}

	public String getSupplierAnalysisSummaryTxt() {
		return this.supplierAnalysisSummaryTxt;
	}

	public void setSupplierAnalysisSummaryTxt(String supplierAnalysisSummaryTxt) {
		this.supplierAnalysisSummaryTxt = supplierAnalysisSummaryTxt;
	}

	public int getSupplierResponsibilityPct() {
		return this.supplierResponsibilityPct;
	}

	public void setSupplierResponsibilityPct(int supplierResponsibilityPct) {
		this.supplierResponsibilityPct = supplierResponsibilityPct;
	}

	public int getTransferPartListDetailSk() {
		return this.transferPartListDetailSk;
	}

	public void setTransferPartListDetailSk(int transferPartListDetailSk) {
		this.transferPartListDetailSk = transferPartListDetailSk;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getVip() {
		return this.vip;
	}

	public void setVip(String vip) {
		this.vip = vip;
	}

	public String getVisualInspectionDetailTxt() {
		return this.visualInspectionDetailTxt;
	}

	public void setVisualInspectionDetailTxt(String visualInspectionDetailTxt) {
		this.visualInspectionDetailTxt = visualInspectionDetailTxt;
	}

	public String getVisualInspectionReanalysisDetailTxt() {
		return this.visualInspectionReanalysisDetailTxt;
	}

	public void setVisualInspectionReanalysisDetailTxt(String visualInspectionReanalysisDetailTxt) {
		this.visualInspectionReanalysisDetailTxt = visualInspectionReanalysisDetailTxt;
	}

}