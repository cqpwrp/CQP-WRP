package com.honda.am.cqp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.honda.am.cqp.dto.SupplierInfoDto;
import com.honda.am.cqp.dto.WarrantyReportsDto;
import com.honda.am.cqp.exception.ResourceNotFoundException;
import com.honda.am.cqp.service.WarrantyStackReportService;

@RestController
@CrossOrigin
@RequestMapping("/api/warrantyReport")
public class WarrantyStackReportController {

	@Autowired
	private WarrantyStackReportService warrantyStackReportService;

	@GetMapping("/allSupplierNameNo")
	public List<SupplierInfoDto> getSupplierNoName() {

		return warrantyStackReportService.getSupplierNoName();
	}

	@GetMapping("/valuesBySupplier")
	public List<WarrantyReportsDto> getvaluesBySuppNo(@RequestParam("supplierNo") String supplierNo)
			throws ResourceNotFoundException {
		List<WarrantyReportsDto> tblOverallReplSummary = null;
		try {
			tblOverallReplSummary = warrantyStackReportService.getvaluesBySuppNo(supplierNo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tblOverallReplSummary;
	}

	/*
	 * @GetMapping("/valuesBySupplier/{id}") public
	 * ResponseEntity<TblCQ_SUPPLIER_INFO> getvaluesBySuppNo(@PathVariable(value =
	 * "suppNo") Long suppNo) throws ResourceNotFoundException {
	 * ResponseEntity<TblCQ_SUPPLIER_INFO> tblOverallReplSummary =
	 * warrantyStackReportService.getvaluesBySuppNo(suppNo); return
	 * tblOverallReplSummary; }
	 */

}