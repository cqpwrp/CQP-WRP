package com.honda.am.cqp.service;

import java.util.List;

import com.honda.am.cqp.dto.SupplierInfoDto;
import com.honda.am.cqp.dto.WarrantyReportsDto;

public interface WarrantyStackReportService {
	
	public List<SupplierInfoDto> getSupplierNoName();
	
	public List<WarrantyReportsDto> getvaluesBySuppNo(String supplierNo);

}
