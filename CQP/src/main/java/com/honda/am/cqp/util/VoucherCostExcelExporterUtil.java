package com.honda.am.cqp.util;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.honda.am.cqp.dto.VoucherCostDto;

public class VoucherCostExcelExporterUtil {
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private List<VoucherCostDto> listAlerts;

	public VoucherCostExcelExporterUtil(List<VoucherCostDto> list) {
		this.listAlerts = list;
		workbook = new XSSFWorkbook();
	}

	private void writeHeaderLine() {
		sheet = workbook.createSheet("Voucher-Cost-Sheet");

		Row row = sheet.createRow(0);

		CellStyle style = workbook.createCellStyle();
		XSSFFont font = workbook.createFont();
		font.setBold(true);
		font.setFontHeight(16);
		style.setFont(font);
		style.setFillForegroundColor(IndexedColors.LIME.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		style.setBorderBottom(BorderStyle.MEDIUM);
		style.setBorderLeft(BorderStyle.MEDIUM);
		style.setBorderRight(BorderStyle.MEDIUM);
		style.setBorderTop(BorderStyle.MEDIUM);
		style.setWrapText(true);
		style.setAlignment(HorizontalAlignment.CENTER);

		createCell(row, 0, "Supplier No", style);
		createCell(row, 1, "Supplier Name", style);
		createCell(row, 2, "Short Part No", style);
		createCell(row, 3, "Part No", style);
		createCell(row, 4, "Model Name", style);
		createCell(row, 5, "Model Years", style);
		createCell(row, 6, "FOB Amount", style);
		createCell(row, 7, "DEALER_NET_Amount", style);
		createCell(row, 8, "FLAT_RATE_Amount", style);

	}

	private void createCell(Row row, int columnCount, Object value, CellStyle style) {
		sheet.autoSizeColumn(columnCount);
		Cell cell = row.createCell(columnCount);
		if (value instanceof Integer) {
			cell.setCellValue((Integer) value);
		} else if (value instanceof Boolean) {
			cell.setCellValue((Boolean) value);
		} else {
			cell.setCellValue((String) value);
		}
		cell.setCellStyle(style);
	}

	private void writeDataLines() {
		int rowCount = 1;

		CellStyle style = workbook.createCellStyle();
		XSSFFont font = workbook.createFont();
		font.setFontHeight(12);
		style.setFont(font);
		style.setBorderBottom(BorderStyle.MEDIUM);
		style.setBorderLeft(BorderStyle.MEDIUM);
		style.setBorderRight(BorderStyle.MEDIUM);
		style.setBorderTop(BorderStyle.MEDIUM);
		style.setWrapText(true);
		style.setAlignment(HorizontalAlignment.CENTER);
		for (VoucherCostDto voucher : listAlerts) {
			Row row = sheet.createRow(rowCount++);
			int columnCount = 0;

			createCell(row, columnCount++, (String) voucher.getSuppNo(), style);
			createCell(row, columnCount++, (String) voucher.getSuppName(), style);
			createCell(row, columnCount++, (String) voucher.getShortPartNo(), style);
			createCell(row, columnCount++, (String) voucher.getPartNo(), style);
			createCell(row, columnCount++, (String) voucher.getModelNames(), style);
			createCell(row, columnCount++, (String) voucher.getModelYears(), style);
			createCell(row, columnCount++, voucher.getFobAmt().toString(), style);
			createCell(row, columnCount++, voucher.getDealerNetAmt().toString(), style);
			createCell(row, columnCount++, voucher.getFlatRateAmt().toString(), style);
		}
	}

	public void export(HttpServletResponse response) throws IOException {
		writeHeaderLine();
		writeDataLines();

		ServletOutputStream outputStream = response.getOutputStream();
		workbook.write(outputStream);
		workbook.close();

		outputStream.close();

	}
}
