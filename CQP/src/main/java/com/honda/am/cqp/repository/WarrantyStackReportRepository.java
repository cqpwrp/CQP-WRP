package com.honda.am.cqp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class WarrantyStackReportRepository {

	@PersistenceContext
	EntityManager em;

	public List<Object[]> getSupplierNameNo() {
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Object[]> getReportValuesBySupplier(String supplierNo) {
		Query query = em
				.createNativeQuery(" SELECT DISTINCT BT.RowID, BT.PART, BT.SHORT_PART_NAME, BT.FACTORY, BT.MOD_NAME, "
						+ "  SUM(BT.Replaced)  AS Rpl_Qty, MAX(NQTY) AS Score, LTRIM(RTRIM(BT.FACTORY)) + space(1) + LTRIM(RTRIM(BT.MOD_NAME))  as Model_factory "
						+ "  FROM (SELECT CASE WHEN fea.veh_destn_code IN ('KA', 'KL') "
						+ "  THEN CAST(BS.SHORT_PART_NO AS VARCHAR(5))+'_KA'  WHEN fea.veh_destn_code IN ('KC') THEN CAST(BS.SHORT_PART_NO AS VARCHAR(5)) +'_KC'  END AS PART	,"
						+ "  BS.RowID, RPLS.SHORT_PART_NAME, RPLS.Replaced, fea.FACTORY, fea.MOD_NAME, "
						+ "  (SELECT SUM(Replaced)  FROM tblOVERALL_REPL_SUMMARY AS RPLS  INNER JOIN dbo.tblwrfea1_cq fea1 "
						+ "  ON RPLS.mtc_sk = fea1.mtc_sk    WHERE SHORT_PART_NO = BS.SHORT_PART_NO    AND CAST(fea1.MOD_YEAR AS INT)  "
						+ "  between Year(GETDATE())-05 and Year(GETDATE())  AND SUPP_NO = BS.SUPP_NO    AND CASE WHEN veh_destn_code IN ('KA', 'KL') THEN 'KA' "
						+ "  WHEN veh_destn_code IN ('KC') THEN 'KC' END = CASE WHEN fea.veh_destn_code IN  ('KA', 'KL') THEN 'KA'  WHEN fea.veh_destn_code IN ('KC') THEN 'KC' END )  AS NQTY  FROM "
						+ "  ( SELECT TOP 11 ROW_NUMBER() OVER(ORDER BY ODRBY DESC) AS RowID, "
						+ "  BT.SHORT_PART_NO, BT.SUPP_NO  FROM (  SELECT DISTINCT SHORT_PART_NO, SUPP_NO , COALESCE((SELECT TOP 1 SUM(RPLSCORE)  FROM "
						+ "  (  SELECT Replaced AS RPLSCORE,  CASE WHEN fea1.veh_destn_code IN ('KA', 'KL') THEN 'KA' ELSE 'KC' END AS DSTN,  SHORT_PART_NO , SUPP_NO	"
						+ "  FROM tblOVERALL_REPL_SUMMARY AS RPLS  INNER JOIN dbo.tblwrfea1_cq fea1 ON RPLS.mtc_sk = fea1.mtc_sk  WHERE CAST(fea1.MOD_YEAR AS INT)  "
						+ "  between Year(GETDATE())-05 and  Year(GETDATE())   AND veh_destn_code IN ( 'KA', 'KL', 'KC' )  AND fea1.MOD_NAME IS NOT NULL  "
						+ "  AND fea1.MOD_NAME <> ''    AND fea1.FACTORY IS NOT NULL  AND fea1.FACTORY <> ''    ) "
						+ "  AS VT  WHERE VT.SHORT_PART_NO = BS.SHORT_PART_NO  AND VT.SUPP_NO = BS.SUPP_NO  GROUP BY DSTN	  ORDER BY SUM(RPLSCORE) DESC  ),0) AS ODRBY "
						+ "  FROM tbloverall_repl_summary AS BS  WHERE SUPP_NO = :supplierNo) AS BT  ) AS BS  LEFT JOIN tblOVERALL_REPL_SUMMARY AS "
						+ "  RPLS ON BS.SUPP_NO = RPLS.SUPP_NO  AND BS.SHORT_PART_NO = RPLS.SHORT_PART_NO  LEFT JOIN tblwrfea1_cq fea ON RPLS.mtc_sk = fea.mtc_sk  WHERE "
						+ "  CAST( fea.MOD_YEAR AS INT ) between Year( GETDATE())-05 and Year( GETDATE()) AND fea.veh_destn_code IN ('KA','KC','KL') )AS BT GROUP BY BT.RowID, BT.PART, BT.SHORT_PART_NAME, BT.FACTORY, "
						+ "  BT.MOD_NAME  ORDER BY RowID, PART ");
		query.setParameter("supplierNo", supplierNo);

		return query.getResultList();
	}

}
