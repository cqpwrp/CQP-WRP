package com.honda.am.cqp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class TplRepository {

	@PersistenceContext
	EntityManager em;

	public List<Object[]> getTPLAlerts() {
		@SuppressWarnings("unchecked")
		List<Object[]> q = em.createNativeQuery("SELECT TPL_ITM_DTL.TRANSFER_PART_LIST_ITEM_DETAIL_SK, \r\n"
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

		return q;
	}
}