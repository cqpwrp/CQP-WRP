package com.honda.am.cqp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.Repository;

import com.honda.am.cqp.model.TblCALL_IN_DETAIL;

@Repository
public interface CallInRepository extends JpaRepository<TblCALL_IN_DETAIL, Long> {

	@Query("Select cpl.callinPartSk, cpl.suppNo, supp.suppName, sts.statusName "
			+ "From TblCALL_IN_DETAIL cpl, TblSTATUS sts, TblCQ_SUPPLIER_INFO supp "
			+ "where cpl.statusId = sts.statusId and cpl.suppNo = supp.suppNo and "
			+ "sts.statusType = 'CALL-IN' and sts.statusName = 'NEW' and "
			+ "cpl.qtrEndDate > GETDATE() AND cpl.suppNo in(Select supl.id.suppNo from "
			+ "TblCQ_SUPPLIER_MAPPING supl) " + "ORDER BY cpl.suppNo, supp.suppName, cpl.callinPartSk")

	/*
	 * @Query("Select cpl.callinPartSk CIPL_NO, cpl.suppNo, supp.suppName, sts.statusName "
	 * + "From tblCALL_IN_DETAIL cpl INNER JOIN tblSTATUS "+
	 * "sts on cpl.statusId =sts.statusId INNER JOIN "+
	 * " tblCQ_SUPPLIER_INFO supp on cpl.suppNo=supp.suppNo where "+
	 * "sts.statusType = 'CALL-IN' and sts.statusName = 'NEW' and "+
	 * "cpl.qtrEndDate > GETDATE() AND cpl.suppNo in(Select supl.id.suppNo from "+
	 * "tblCQ_SUPPLIER_MAPPING supl) "+
	 * "ORDER BY cpl.suppNo, supp.suppName, cpl.callinPartSk"")
	 */

	// SELECT CPL_DTL.CALLIN_PART_SK CIPL_NO, CPL_DTL.SUPP_NO, SUPP.SUPP_NAME,
	// STS.STATUS_NAME
	// FROM dbo.tblCALL_IN_DETAIL CPL_DTL INNER JOIN dbo.tblSTATUS
	// STS ON CPL_DTL.STATUS_ID = STS.STATUS_ID INNER JOIN
	// dbo.tblCQ_SUPPLIER_INFO SUPP ON CPL_DTL.SUPP_NO = SUPP.SUPP_NO WHERE
	// STS.STATUS_TYPE = 'CALL-IN' AND STS.STATUS_NAME = 'NEW' AND
	// CPL_DTL.QTR_END_DATE > GETDATE() AND CPL_DTL.SUPP_NO IN(SELECT SUPP_NO FROM
	// dbo.tblCQ_SUPPLIER_MAPPING)
	// ORDER BY CPL_DTL.SUPP_NO, SUPP.SUPP_NAME, CALLIN_PART_SK;
	public List<Object[]> getCallInAlerts();
}
