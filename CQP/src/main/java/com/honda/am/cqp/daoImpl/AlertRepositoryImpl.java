package com.honda.am.cqp.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.honda.am.cqp.dao.AlertRepository;
import com.honda.am.cqp.model.Alert;
import com.honda.am.cqp.util.BaseRepo;

@Repository
public class AlertRepositoryImpl extends BaseRepo<Alert,Long> implements AlertRepository{
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public List<Object[]> getAlerts() {
		Alert alert = new Alert();
		alert.setAlertTest("test4");
		alert.setStatus("test");
		alert.setSupplier("test supplier");
		String login = "VC037857";
		String suppNo = "140290";
		StoredProcedureQuery query = em.createStoredProcedureQuery("USP_ALERTS");
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.setParameter(1, login);
		query.setParameter(2, suppNo);
		query.execute();
		@SuppressWarnings("unchecked")
		List<Object[]> result = query.getResultList();
		return result;

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> getVoucherAlerts() {
		return em.createQuery("Select v.voucherNo, v.id.suppNo, v.id.qtrNo, v.id.qtrYear, v.suppName, v.statusId, v.voucherDesc,\r\n"
				+ "v.issueDate, v.dueDate, v.subTotalAmt, v.totalAddlShippingChargesAmt, v.totalSupplierResponsibilityPct,\r\n"
				+ "v.supplierRespAddlShippingChargesAmt, v.overallAdjustmentAmt, v.diagnosticAdjustmentAmt, v.totalAmt, \r\n"
				+ "v.totalMarketClaim, v.calcShippingRespPct, v.totalSupplierChargeAmt, s.statusName, \r\n"
				+ "v.totalSupplierRespSubTotalAmt, v.plantOverallAdjFlag from TblVOUCHER_SUMMARY v, \r\n"
				+ "TblSTATUS s where v.id.suppNo = 140290 and v.statusId = s.statusId").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> getCallInAlerts(){
		return em.createQuery("Select cpl.callinPartSk, cpl.suppNo, supp.suppName, sts.statusName \r\n"
				+ "From TblCALL_IN_DETAIL cpl, TblSTATUS sts, TblCQ_SUPPLIER_INFO supp \r\n"
				+ "where cpl.statusId = sts.statusId and cpl.suppNo = supp.suppNo and \r\n"
				+ "sts.statusType = 'CALL-IN' and sts.statusName = 'NEW' and \r\n"
				+ "cpl.qtrEndDate > GETDATE() AND cpl.suppNo in(Select supl.id.suppNo from \r\n"
				+ "TblCQ_SUPPLIER_MAPPING supl) ORDER BY cpl.suppNo, supp.suppName, cpl.callinPartSk")
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> getTPLAlerts() {
		return em.createNativeQuery("SELECT TPL_ITM_DTL.TRANSFER_PART_LIST_ITEM_DETAIL_SK, \r\n"
				+ "		 TPL_DTL.SUPP_NO, SUPP.SUPP_NAME SUPPLIER, STS.STATUS_NAME \r\n"
				+ "		 FROM dbo.tblTRANSFER_PART_LIST_DETAIL as TPL_DTL \r\n"
				+ "		 INNER JOIN dbo.tblTRANSFER_PART_LIST_ITEM_DETAIL as TPL_ITM_DTL \r\n"
				+ "		 ON TPL_DTL.TRANSFER_PART_LIST_DETAIL_SK = TPL_ITM_DTL.TRANSFER_PART_LIST_DETAIL_SK 	\r\n"
				+ "		 INNER JOIN dbo.tblSTATUS as\r\n" + "		 STS ON TPL_ITM_DTL.STATUS_ID = STS.STATUS_ID \r\n"
				+ "		 INNER JOIN dbo.tblCQ_SUPPLIER_INFO as\r\n"
				+ "		 SUPP ON TPL_DTL.SUPP_NO = SUPP.SUPP_NO \r\n"
				+ "		 WHERE STS.STATUS_TYPE = 'TPL' AND  \r\n"
				+ "		 STS.STATUS_NAME IN ('NEW','ACTIVE','REOPENED_FOR_ANALYSIS') AND  \r\n"
				+ "		 TPL_DTL.SUPP_NO IN (SELECT SUPP_NO FROM \r\n"
				+ "		 dbo.tblCQ_SUPPLIER_MAPPING WHERE CQ_USER_LOGIN= 'bill_converse@tstna.com')\r\n"
				+ "		 ORDER BY TPL_DTL.SUPP_NO, SUPP.SUPP_NAME, TPL_ITM_DTL.TRANSFER_PART_LIST_ITEM_DETAIL_SK, STS.STATUS_NAME")
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> getUserAlerts() {
		return em.createNativeQuery("  SELECT USER_PROFILE.USER_LOGIN, USER_TYPE, USER_FIRST_NAME,\r\n"
				+ "	  USER_LAST_NAME, USER_PROFILE.SUPP_NO as SUPP_SUPP_NO,\r\n" + "	  \r\n"
				+ "	  CONVERT(VARCHAR,USER_LAST_LOGIN,101) AS USER_LAST_LOGIN, SUPP_MAP.SUPP_NO AS\r\n"
				+ "	  CQ_SUPP_NO FROM dbo.tblUSER_PROFILE\r\n" + "	  \r\n"
				+ "	  USER_PROFILE LEFT OUTER JOIN dbo.tblUSER_ROLE_MAPPING USER_ROLE_MAP ON\r\n"
				+ "	  USER_PROFILE.USER_LOGIN = USER_ROLE_MAP.USER_LOGIN\r\n" + "	  \r\n"
				+ "	  LEFT OUTER JOIN dbo.tblCQ_SUPPLIER_MAPPING SUPP_MAP ON\r\n"
				+ "	  USER_PROFILE.USER_LOGIN = SUPP_MAP.CQ_USER_LOGIN\r\n" + "	  \r\n"
				+ "	  WHERE USER_ROLE_MAP.ROLE_ID IS NULL").getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> getVoucherCostAlerts() {
		return em.createNativeQuery(
				"SELECT '' AS SUPP_NO, 'Missing Part Cost Info' AS SUPP_NAME, '--' AS SHORT_PART_NO\r\n"
						+ ", '--' AS PART_NO, '--' AS MODEL_NAMES, '--' AS MODEL_YEARS, 0 AS FOB_AMT, 0 AS DEALER_NET_AMT,\r\n"
						+ "COUNT(*) AS FLAT_RATE_AMT FROM dbo .tblPART_COST_INFO AS A\r\n"
						+ "WHERE (A.FOB_AMT=0 OR A.DEALER_NET_AMT=0 OR A.FLAT_RATE_AMT=0 OR A.KILOGRAMS_QTY=0 OR A.POUNDS_QTY=0)\r\n"
						+ "UNION ALL\r\n"
						+ "SELECT DISTINCT COALESCE(B.SUPP_NO,'') AS SUPP_NO, COALESCE(B.SUPP_NAME,'') AS SUPP_NAME, A.SHORT_PART_NO,\r\n"
						+ "A.PART_NO, COALESCE(B.MODEL_NAMES,'') AS MODEL_NAMES, COALESCE(B.MODEL_YEARS,'') AS MODEL_YEARS, A.FOB_AMT,A.DEALER_NET_AMT,\r\n"
						+ "A.FLAT_RATE_AMT FROM dbo .tblPART_COST_INFO AS A\r\n"
						+ "LEFT JOIN dbo .tblGAPS AS B ON A.PART_NO = B.FORMAT_LONG_PART\r\n"
						+ "WHERE A.SHORT_PART_NO IN (SELECT DISTINCT B.SHORT_PART_NO\r\n"
						+ "FROM dbo .tblCQ_SUPPLIER_MAPPING AS A\r\n"
						+ "INNER JOIN dbo .tblSUPP_PART_INFO AS B ON A.SUPP_NO = B.SUPP_NO\r\n"
						+ "WHERE A.CQ_USER_LOGIN= 'aaron.jarrett@continental-corporation.com')\r\n"
						+ "AND (A.FOB_AMT=0 OR A.DEALER_NET_AMT=0 OR A.FLAT_RATE_AMT=0 OR A.KILOGRAMS_QTY=0 OR A.POUNDS_QTY=0)")
				.getResultList();
	}
	
	
}