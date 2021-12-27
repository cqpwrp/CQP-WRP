package com.honda.am.cqp.service;

import java.util.List;

import com.honda.am.cqp.dto.CallInDto;
import com.honda.am.cqp.dto.TPLDto;
import com.honda.am.cqp.dto.UserDto;
import com.honda.am.cqp.dto.VoucherCostDto;
import com.honda.am.cqp.dto.VoucherDto;

public interface AlertsExportsService {
	public List<UserDto> getUserDetails();
	
	public List<VoucherDto> getVoucherDetails();
	
	public List<CallInDto> getCallInDetails();
	
	public List<VoucherCostDto> getVoucherCostAlerts();
	
	public List<TPLDto> getTPLAlerts();
}
