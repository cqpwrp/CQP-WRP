package com.honda.am.cqp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class VoucherCostRepository {

	@PersistenceContext
	EntityManager em;

	public List<Object[]> getVoucherCostAlerts() {
		@SuppressWarnings("unchecked")
		List<Object[]> q = em.createNativeQuery(
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
		return q;
	}
}
