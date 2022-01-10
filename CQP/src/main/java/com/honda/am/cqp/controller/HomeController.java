package com.honda.am.cqp.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honda.am.cqp.dto.AlertDto;
import com.honda.am.cqp.dto.CallInDto;
import com.honda.am.cqp.dto.TPLDto;
import com.honda.am.cqp.dto.UserDto;
import com.honda.am.cqp.dto.VoucherCostDto;
import com.honda.am.cqp.dto.VoucherDto;
import com.honda.am.cqp.model.TblMESSAGE_CENTER;
import com.honda.am.cqp.service.HomeService;
import com.honda.am.cqp.util.CallInExcelExporterUtil;
import com.honda.am.cqp.util.TPLExcelExporterUtil;
import com.honda.am.cqp.util.UserExcelExporterUtil;
import com.honda.am.cqp.util.VoucherCostExcelExporterUtil;
import com.honda.am.cqp.util.VoucherExcelExporterUtil;

@RestController
@CrossOrigin
@RequestMapping("/api/alerts")
public class HomeController {

	@Autowired
	private HomeService homeService;
	
	@GetMapping("/inbox")
	public List<TblMESSAGE_CENTER> getMessage() {
		List<TblMESSAGE_CENTER> list = homeService.getMessage();
		System.out.println(list);
		return list;
	}

	@GetMapping("/data")
	public List<AlertDto> getAlerts() throws IOException, SQLException {
		System.out.println("In controller");
		return homeService.getAlerts();
	}
	
	@GetMapping("/export/excel/Voucher")
	public void exportVoucherToExcel(HttpServletResponse response) throws IOException {
		response.setContentType("application/octet-stream");

		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=Voucher_Sheet.xlsx";
		response.setHeader(headerKey, headerValue);

		List<VoucherDto> list = homeService.getVoucherDetails();
		System.out.println("Voucher ===== " + list.toString());

		VoucherExcelExporterUtil excelExporter = new VoucherExcelExporterUtil(list);
		excelExporter.export(response);
	}

	@GetMapping("/export/excel/User")
	public void exportUserToExcel(HttpServletResponse response) throws IOException {
		response.setContentType("application/octet-stream");

		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=Users_Sheet.xlsx";
		response.setHeader(headerKey, headerValue);

		List<UserDto> list = homeService.getUserDetails();

		System.out.println("UserDto ===== " + list.toString());

		UserExcelExporterUtil excelExporter = new UserExcelExporterUtil(list);
		excelExporter.export(response);
	}

	@GetMapping("/export/excel/CallIn")
	public void exportToExcel(HttpServletResponse response) throws IOException {
		response.setContentType("application/octet-stream");

		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=Call_In_Sheet.xlsx";
		response.setHeader(headerKey, headerValue);

		List<CallInDto> list = homeService.getCallInDetails();

		System.out.println("callInDto ===== " + list);

		CallInExcelExporterUtil excelExporter = new CallInExcelExporterUtil(list);

		excelExporter.export(response);
	}

	@GetMapping("/export/excel/VoucherCost")
	public void exportVoucherCostToExcel(HttpServletResponse response) throws IOException {
		response.setContentType("application/octet-stream");

		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=Voucher_Cost_Sheet.xlsx";
		response.setHeader(headerKey, headerValue);

		List<VoucherCostDto> list = homeService.getVoucherCostAlerts();

		System.out.println("VoucherCostDto ===== " + list);

		VoucherCostExcelExporterUtil excelExporter = new VoucherCostExcelExporterUtil(list);

		excelExporter.export(response);
	}

	@GetMapping("/export/excel/TPL")
	public void exportTplToExcel(HttpServletResponse response) throws IOException {
		response.setContentType("application/octet-stream");

		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=TPL_Sheet.xlsx";
		response.setHeader(headerKey, headerValue);

		List<TPLDto> list = homeService.getTPLAlerts();

		System.out.println("TplIn ===== " + list);

		TPLExcelExporterUtil excelExporter = new TPLExcelExporterUtil(list);

		excelExporter.export(response);
	}

}