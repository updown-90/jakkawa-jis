package com.jakkawa.uploader.common.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelUtils {

    private ExcelUtils() {
        // private 생성자로 인스턴스 생성 방지
    }

    public static void validateExcelFile(MultipartFile file) {
        if (file.isEmpty()) {
            throw new RuntimeException("엑셀 파일을 선택해주세요.");
        }

        String contentType = file.getContentType();
        if (contentType != null) {
            if (!contentType.equals("application/vnd.ms-excel") && !contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                throw new RuntimeException("지원되지 않는 파일 형식입니다.");
            }
        }
    }

    public static List<List<String>> readExcelRows(MultipartFile excelFile, int startRow, int startCol, int endCol)
            throws IOException {
        Workbook workbook = org.apache.poi.ss.usermodel.WorkbookFactory.create(excelFile.getInputStream());
        Sheet sheet = workbook.getSheetAt(0);

        List<List<String>> rows = new ArrayList<>();
        int rowIndex = 0;

        Iterator<Row> rowIterator = sheet.iterator();
        while (rowIterator.hasNext() && rowIndex < startRow) {
            rowIterator.next();
            rowIndex++;
        }

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            List<String> cells = readRowCells(row, startCol, endCol);
            rows.add(cells);
        }

        return rows;
    }

    private static List<String> readRowCells(Row row, int startCol, int endCol) {
        List<String> cells = new ArrayList<>();
        for (int colIndex = startCol; colIndex <= endCol; colIndex++) {
            Cell cell = row.getCell(colIndex, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
            cells.add(cellToString(cell));
        }
        return cells;
    }

    public static String cellToString(Cell cell) {
        if (cell == null) {
            return "";
        }
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString();
                } else {
                    double numericValue = cell.getNumericCellValue();
                    long longValue = (long) numericValue;
                    if (numericValue == longValue) {
                        return String.valueOf(longValue);
                    } else {
                        return BigDecimal.valueOf(cell.getNumericCellValue()).toPlainString();
                    }
                }
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            default:
                return "";
        }
    }
}
