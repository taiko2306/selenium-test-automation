package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility {
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFCell cell;
	public static XSSFRow row;
	
	//set excel file
	public static void setExcelFile(String Path, int SheetNum) throws Exception {
		try {
			//load the file
			FileInputStream ExcelFile = new FileInputStream(Path);
			
			//load the workbook
			workbook = new XSSFWorkbook(ExcelFile);
			
			//load the sheet in which data is stored
			sheet = workbook.getSheetAt(SheetNum);
		} catch(Exception e) {
			System.out.println(e);
			throw(e);
		}
	}
	
	//get String data
	public static String getStringCellData(int RowNum, int ColNum) throws Exception {
		try {
			cell = sheet.getRow(RowNum).getCell(ColNum);
			
			String cellData = cell.getStringCellValue();
			
			return cellData;
		} catch(Exception e) {
			System.out.println(e);
			return "";
		}
	}
	
	//get Raw data
	public static String getRawCellData(int RowNum, int ColNum) throws Exception {
		try {
			cell = sheet.getRow(RowNum).getCell(ColNum);
			
			String cellData = cell.getRawValue();
			
			return cellData;
		} catch(Exception e) {
			System.out.println(e);
			return "";
		}
	}
	
	//get numeric data
	public static double getNumericCellData(int RowNum, int ColNum) throws Exception {
		try {
			cell = sheet.getRow(RowNum).getCell(ColNum);
			
			double cellData = cell.getNumericCellValue();
			
			return cellData;
		} catch(Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	//write result to excel file
	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {
		try {
			row = sheet.getRow(RowNum);
			cell = row.getCell(ColNum, MissingCellPolicy.RETURN_BLANK_AS_NULL);
			
			if(cell == null) {
				cell = row.createCell(ColNum);
				cell.setCellValue(Result);
			}
			else {
				cell.setCellValue(Result);
			}
			
			FileOutputStream fileOut = new FileOutputStream(Constant.PATH);
			workbook.write(fileOut);
			
			fileOut.flush();
			
			fileOut.close();	
		} catch(Exception e) {
			throw (e);
		}
	}
	
	//check next roll
	public static boolean isBlank(int RowNum) throws NullPointerException {
		try {
			if(sheet.getRow(RowNum) == null) {
				return true;
			}
			return false;
		} catch(NullPointerException e) {
			return true;
		}
	}
}