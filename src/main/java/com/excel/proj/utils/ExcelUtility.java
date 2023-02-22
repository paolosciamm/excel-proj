package com.excel.proj.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


import com.excel.proj.exception.ExcelException;
import com.excel.proj.service.support.ExcelRow;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExcelUtility {

	private static final String ERROR_WRITING_FILE = "Error writing file: ";
	public static final String ERROR_IN_EXCEL_CONSTRUCTION = "ERROR IN EXCEL CONSTRUCTION";

	private final String FIELD1="FIELD1";
	private final String FIELD2="FIELD2";
	private final String FIELD3="FIELD3";

	private final String[] exportPerimeterGA = {FIELD1, FIELD2, FIELD3};
	Map<Integer, Integer> colunmLenght = new HashMap<>();

	public void exportExcel(final HttpServletResponse response, List<ExcelRow> rows, String fileName) {
		try(XSSFWorkbook wb = new XSSFWorkbook()) {
			colunmLenght = new HashMap<>();
			XSSFSheet sheet = wb.createSheet("Example");
			createSheetHeader(wb, sheet, exportPerimeterGA);
			createExcelSheetContent(rows, wb, sheet);
			autoSizeColumns(sheet);
			wb.write(response.getOutputStream());
		} catch (IOException e) {
			throw new ExcelException(ERROR_IN_EXCEL_CONSTRUCTION);
		}
	}

	private void createExcelSheetContent (List<ExcelRow> rows, XSSFWorkbook wb, XSSFSheet sheet) {
		short rowCounter = 1;
		CellStyle cellStyle = createCellStyle(wb);
		for (ExcelRow excRow : rows) {
			Row row = sheet.createRow(rowCounter);
			short columnCounter = 0;
			createCellWithStringValue(row, cellStyle, excRow.getField1(), columnCounter++);
			createCellWithStringValue(row, cellStyle, excRow.getField2(), columnCounter++);
			createCellWithStringValue(row, cellStyle, excRow.getField3(), columnCounter);
			rowCounter++;
		}
	}

	/***+++++++++++++++++++++++++++++++++++++++++++++++++++++++++***/
	/**                  METODI DI SUPPORTO ALLA LIBRERIA         **/
	/***+++++++++++++++++++++++++++++++++++++++++++++++++++++++++***/
	
	private void exportZip (final HttpServletResponse response, XSSFWorkbook wb, String fileName) {
		
		try {
		File file = new File(fileName);
        FileOutputStream outputStream = new FileOutputStream(file);
		wb.write(outputStream);
        ZipOutputStream zos = new ZipOutputStream(response.getOutputStream());
        zos.putNextEntry(new ZipEntry(file.getName()));
        byte[] bytes = Files.readAllBytes(Paths.get(file.getName()));
        zos.write(bytes);
        zos.closeEntry();
        zos.close();
		} catch (IOException e) {
			throw new ExcelException(ERROR_WRITING_FILE + e.getMessage());
		}
		
	}

	
	private void createCellWithStringValue(Row row, CellStyle cellStyle, String value, short position) {
		Cell cell = row.createCell(position);
		cell.setCellValue(value == null ? "" : value);
		cell.setCellStyle(cellStyle);
		createMap(value, position);
	}
	
	private void createCellWithLocalDateTimeValue(Row row, CellStyle cellStyle, LocalDateTime value, short position) {

		Cell cell = row.createCell(position);
		if (value != null) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); //TODO change formatter
			String formattedDate = value.format(formatter);
			cell.setCellValue(formattedDate);
		}
		cell.setCellStyle(cellStyle);
	}
	
	private void createCellWithIntegerValue(Row row, CellStyle cellStyle, Integer value, short position) {
		Cell cell = row.createCell(position);
		if (value != null) {
			cell.setCellValue(value);
		}
		cell.setCellStyle(cellStyle);
	}
	
	private static CellStyle createCellStyle(XSSFWorkbook wb) {
		CellStyle cellStyle = wb.createCellStyle();
		cellStyle.setAlignment(HorizontalAlignment.LEFT);
		cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
		return cellStyle;
	}

	public void createSheetHeader(XSSFWorkbook wb, XSSFSheet sheet, String[] headers) {
		CellStyle style = wb.createCellStyle();  
        // Setting Background color  
        style.setFillBackgroundColor(IndexedColors.DARK_RED.getIndex());  
        style.setFillPattern(FillPatternType.BIG_SPOTS);  
        Font font = wb.createFont();
        font.setColor(IndexedColors.WHITE.getIndex());
        font.setBold(true);
        style.setFont(font);
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        
		Row rowHeader = sheet.createRow(0);
		for (int i = 0; i < headers.length; i++) {
			Cell cell = rowHeader.createCell(i);
			cell.setCellValue(headers[i]);
			cell.setCellStyle(style);
			createMap(headers[i], i);
		}
	}
	
	/**
	 * Patch per aggirare eccezione di jdk-alpine su metodo autoSizeColumn
	 */
	private void createMap(String value, int position) {
		if(value!=null) {
			if(colunmLenght.containsKey(position)) {
				if(colunmLenght.get(position)<value.length()) {
					colunmLenght.put(position, value.length() > 200 ? 200 : value.length());
				}
			}else {
				colunmLenght.put(position, value.length() > 200 ? 200 : value.length());
			}
		}
	}
	
	private void autoSizeColumns(XSSFSheet sheet) {
	    try {
	    	for ( Integer key : colunmLenght.keySet() ) {
	    		int width = ((int)(colunmLenght.get(key) * 1.2)) * 256;
	    		sheet.setColumnWidth(key, width);
	    	}
		} catch (Exception e) {
			throw new ExcelException(ERROR_WRITING_FILE + e.toString());
		}
	}
}
