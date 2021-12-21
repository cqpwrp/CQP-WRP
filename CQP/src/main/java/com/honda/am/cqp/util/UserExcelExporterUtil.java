package com.honda.am.cqp.util;

import java.io.IOException;
import java.sql.Timestamp;
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

import com.honda.am.cqp.dto.UserDto;

public class UserExcelExporterUtil {
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private List<UserDto> listAlerts;

	public UserExcelExporterUtil(List<UserDto> userList) {
		this.listAlerts = userList;
		workbook = new XSSFWorkbook();
	}

	private void writeHeaderLine() {
		sheet = workbook.createSheet("User-Sheet");

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

		createCell(row, 0, "User Login", style);
		createCell(row, 1, "User Type", style);
		createCell(row, 2, "First Name", style);
		createCell(row, 3, "Last Name", style);
		createCell(row, 4, "Supplier Number", style);
		// createCell(row, 5, "User Last Login", style);

	}

	private void createCell(Row row, int columnCount, Object value, CellStyle style) {
		sheet.autoSizeColumn(columnCount);
		Cell cell = row.createCell(columnCount);
		if (value instanceof Integer) {
			cell.setCellValue((Integer) value);
		} else if (value instanceof Boolean) {
			cell.setCellValue((Boolean) value);
		} else if (value instanceof Timestamp) {
			cell.setCellValue((String) value);
		} else {
			cell.setCellValue((String) value);
		}
		cell.setCellStyle(style);
	}

	private void writeDataLines() {
		int rowCount = 1;

		CellStyle style = workbook.createCellStyle();
		XSSFFont font = workbook.createFont();
		font.setFontHeight(14);
		style.setFont(font);
		style.setBorderBottom(BorderStyle.MEDIUM);
		style.setBorderLeft(BorderStyle.MEDIUM);
		style.setBorderRight(BorderStyle.MEDIUM);
		style.setBorderTop(BorderStyle.MEDIUM);
		style.setWrapText(true);
		style.setAlignment(HorizontalAlignment.CENTER);
		for (UserDto user : listAlerts) {
			Row row = sheet.createRow(rowCount++);
			int columnCount = 0;

			// TODO : 2671 rows - export to excel taking so much time
			if (rowCount > 200) {
				break;
			}
			createCell(row, columnCount++, user.getUserLogin(), style);
			createCell(row, columnCount++, user.getUserType(), style);
			createCell(row, columnCount++, user.getUserFirstName(), style);
			createCell(row, columnCount++, user.getUserLastName(), style);
			createCell(row, columnCount++, user.getSuppNo(), style);
			// createCell(row, columnCount++, user.getUserLastLogin(), style);
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
