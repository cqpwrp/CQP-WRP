/**
 * 
 */
package com.honda.am.cqp.serviceImpl;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honda.am.cqp.dao.AlertRepository;
import com.honda.am.cqp.dao.MessageCenterRepository;
import com.honda.am.cqp.dto.AlertDto;
import com.honda.am.cqp.dto.CallInDto;
import com.honda.am.cqp.dto.TPLDto;
import com.honda.am.cqp.dto.UserDto;
import com.honda.am.cqp.dto.VoucherCostDto;
import com.honda.am.cqp.dto.VoucherDto;
import com.honda.am.cqp.model.TblMESSAGE_CENTER;
import com.honda.am.cqp.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	private MessageCenterRepository messageRepository;

	@Autowired
	AlertRepository alertRepository;

	@Override
	public List<TblMESSAGE_CENTER> getMessage() {
		List<TblMESSAGE_CENTER> inbox = messageRepository.getMessage();
		return inbox;
	}

	@Override
	public List<AlertDto> getAlerts() {
		List<Object[]> alerts = alertRepository.getAlerts();
		List<AlertDto> list = new ArrayList<>();
		for (Object[] dto : alerts) {
			AlertDto alertDto = new AlertDto();
			alertDto.setItemType((String) dto[0]);
			alertDto.setSuppNo((String) dto[1]);
			alertDto.setStatus((String) dto[2]);
			alertDto.setItemText((String) dto[3]);
			list.add(alertDto);
		}
		return list;
	}

	@Override
	public List<UserDto> getUserDetails() {
		List<Object[]> user = alertRepository.getUserAlerts();

		List<UserDto> list = new ArrayList<>();

		for (Object[] dto : user) {

			UserDto userDto = new UserDto();
			userDto.setUserLogin((String) dto[0]);
			userDto.setUserType((String) dto[1]);
			userDto.setUserFirstName((String) dto[2]);
			userDto.setUserLastName((String) dto[3]);
			userDto.setSuppNo((String) dto[4]);
			userDto.setUserLastLogin((String) dto[5]);

			list.add(userDto);

		}

		return list;
	}

	@Override
	public List<VoucherDto> getVoucherDetails() {
		List<Object[]> voucher = alertRepository.getVoucherAlerts();

		List<VoucherDto> list = new ArrayList<>();

		for (Object[] dto : voucher) {
			VoucherDto voucherDto = new VoucherDto();
			voucherDto.setVoucherNo((String) dto[0]);
			voucherDto.setSuppNo((String) dto[1]);
			voucherDto.setQtrNo((String) dto[2]);
			voucherDto.setQtrYear((String) dto[3]);
			voucherDto.setSuppName((String) dto[4]);
			voucherDto.setStatusId((int) dto[5]);
			voucherDto.setVoucherDesc((String) dto[6]);
			voucherDto.setIssueDate((Timestamp) dto[7]);
			voucherDto.setDueDate((Timestamp) dto[8]);
			voucherDto.setSubTotalAmt((BigDecimal) dto[9]);
			voucherDto.setTotalAddlShippingChargesAmt((BigDecimal) dto[10]);
			voucherDto.setTotalSupplierResponsibilityPct((BigDecimal) dto[11]);
			voucherDto.setSupplierRespAddlShippingChargesAmt((BigDecimal) dto[12]);
			voucherDto.setOverallAdjustmentAmt((BigDecimal) dto[13]);
			voucherDto.setDiagnosticAdjustmentAmt((BigDecimal) dto[14]);
			voucherDto.setTotalAmt((BigDecimal) dto[15]);
			voucherDto.setTotalMarketClaim((BigDecimal) dto[16]);
			voucherDto.setCalcShippingRespPct((BigDecimal) dto[17]);
			voucherDto.setTotalSupplierChargeAmt((BigDecimal) dto[18]);
			voucherDto.setStatusName((String) dto[19]);
			voucherDto.setTotalSupplierRespSubTotalAmt((BigDecimal) dto[20]);
			voucherDto.setPlantOverallAdjFlag((String) dto[21]);

			list.add(voucherDto);
		}
		return list;

	}

	@Override
	public List<CallInDto> getCallInDetails() {
		List<Object[]> user = alertRepository.getCallInAlerts();

		List<CallInDto> list = new ArrayList<>();

		for (Object[] dto : user) {

			CallInDto callInDto = new CallInDto();
			callInDto.setCallinPartSk((int) dto[0]);
			callInDto.setSuppNo((String) dto[1]);
			callInDto.setSuppName((String) dto[2]);
			callInDto.setStatusName((String) dto[3]);
			list.add(callInDto);
		}
		return list;
	}

	@Override
	public List<VoucherCostDto> getVoucherCostAlerts() {

		List<Object[]> voucher = alertRepository.getVoucherCostAlerts();

		List<VoucherCostDto> list = new ArrayList<>();

		for (Object[] dto : voucher) {
			VoucherCostDto voucherDto = new VoucherCostDto();
			voucherDto.setSuppNo((String) dto[0]);
			voucherDto.setSuppName((String) dto[1]);
			voucherDto.setShortPartNo((String) dto[2]);
			voucherDto.setPartNo((String) dto[3]);
			voucherDto.setModelNames((String) dto[4]);
			voucherDto.setModelYears((String) dto[5]);
			voucherDto.setFobAmt((BigDecimal) dto[6]);
			voucherDto.setDealerNetAmt((BigDecimal) dto[7]);
			voucherDto.setFlatRateAmt((BigDecimal) dto[8]);

			list.add(voucherDto);
		}

		return list;

	}

	@Override
	public List<TPLDto> getTPLAlerts() {
		List<Object[]> tpl = alertRepository.getTPLAlerts();

		List<TPLDto> list = new ArrayList<>();

		for (Object[] dto : tpl) {
			TPLDto tplDto = new TPLDto();
			tplDto.setStatusName((String) dto[3]);
			tplDto.setSuppName((String) dto[2]);
			tplDto.setSuppNo((String) dto[1]);
			tplDto.setTplRefID((int) dto[0]);

			list.add(tplDto);
		}
		return list;
	}

}
