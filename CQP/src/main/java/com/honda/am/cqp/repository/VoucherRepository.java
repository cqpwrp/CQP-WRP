package com.honda.am.cqp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.Repository;

import com.honda.am.cqp.model.TblVOUCHER_SUMMARY;

@Repository
public interface VoucherRepository extends JpaRepository<TblVOUCHER_SUMMARY, Long> {

	/*
	 * @Query(value = "SELECT " + "T1.VOUCHER_NO," +
	 * "T1.SUPP_NO,T1.QTR_NO,T1.QTR_YEAR,T1.SUPP_NAME,T1.STATUS_ID,T1.VOUCHER_DESC,"
	 * +
	 * "T1.ISSUE_DATE,T1.DUE_DATE,T1.SUB_TOTAL_AMT,T1.TOTAL_ADDL_SHIPPING_CHARGES_AMT,"
	 * +
	 * "T1.TOTAL_SUPPLIER_RESPONSIBILITY_PCT,T1.SUPPLIER_RESP_ADDL_SHIPPING_CHARGES_AMT,"
	 * + "T1.OVERALL_ADJUSTMENT_AMT,T1.DIAGNOSTIC_ADJUSTMENT_AMT,T1.TOTAL_AMT," +
	 * "T1.TOTAL_MARKET_CLAIM,T1.SUB_TOTAL_AMT,T1.CALC_SHIPPING_RESP_PCT," +
	 * "SUPPLIER_RESP_ADDL_SHIPPING_CHARGES_AMT ,T1.TOTAL_SUPPLIER_CHARGE_AMT," +
	 * "T2.STATUS_NAME,T1.TOTAL_SUPPLIER_RESP_SUB_TOTAL_AMT" +
	 * ", T1.PLANT_OVERALL_ADJ_FLAG " + " FROM " + " dbo " +
	 * ".tblVOUCHER_SUMMARY T1 (NOLOCK) ," + " dbo " + ".tblSTATUS T2 (NOLOCK)" +
	 * " WHERE " + " T1.SUPP_NO= 140290 AND " + "T1.STATUS_ID = T2.STATUS_ID",
	 * nativeQuery = true) public List<TblVOUCHER_SUMMARY> getVoucherAlerts();
	 */

	@Query("Select v.voucherNo, v.id.suppNo, v.id.qtrNo, v.id.qtrYear, v.suppName, v.statusId, v.voucherDesc,"
			+ "v.issueDate, v.dueDate, v.subTotalAmt, v.totalAddlShippingChargesAmt, v.totalSupplierResponsibilityPct,"
			+ "v.supplierRespAddlShippingChargesAmt, v.overallAdjustmentAmt, v.diagnosticAdjustmentAmt, v.totalAmt, "
			+ "v.totalMarketClaim, v.calcShippingRespPct, v.totalSupplierChargeAmt, s.statusName, "
			+ "v.totalSupplierRespSubTotalAmt, v.plantOverallAdjFlag from TblVOUCHER_SUMMARY v, "
			+ "TblSTATUS s where v.id.suppNo = 140290 and v.statusId = s.statusId")
	public List<Object[]> getVoucherAlerts();
}