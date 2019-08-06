package claim;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utility.Constant;
import utility.Utility;
import test.HomePage;

public class CreateClaimAction {
	private static int sheet_num = 4;
	private static int row = 1;
	private static int col_processor = 1;
	private static int col_date = 2;
	private static int col_invoice = 3;
	private static int col_subtotal = 4;
	private static int col_material = 5;
	private static int col_comment = 6;
	private static int col_memo = 7;
	private static int col_result = 8;
	
	public static void execute(WebDriver driver) throws Exception {
		Utility.setExcelFile(Constant.PATH, sheet_num);
		HomePage.Claims(driver).sendKeys(Keys.RETURN);
		CreateClaimPage.CreateClaim(driver).sendKeys(Keys.RETURN);
		
		try {
			//select processor
			String processor_input = Utility.getStringCellData(row, col_processor);
			if(!processor_input.equals("")) {
				Select processor = new Select(CreateClaimPage.Processor(driver));
				processor.selectByVisibleText(processor_input);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//input date
			String date = Utility.getStringCellData(row, col_date);
			if(!date.equals("")) {
				CreateClaimPage.ReceivedDate(driver).clear();
				CreateClaimPage.ReceivedDate(driver).sendKeys(date);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//input invoice number
			String invoice = Utility.getStringCellData(row, col_invoice);
			if(!invoice.equals("")) {
				CreateClaimPage.InvoiceNumber(driver).sendKeys(invoice);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//input subtotal
			double subtotal = Utility.getNumericCellData(row, col_subtotal);
			String string_subtotal = Double.toString(subtotal);
			if(!string_subtotal.equals("0.0")) {
				CreateClaimPage.SubmittedSubtotal(driver).sendKeys(string_subtotal);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//select material
			String material_input = Utility.getStringCellData(row, col_material);
			if(!material_input.equals("")) {
				Select material = new Select(CreateClaimPage.MaterialType(driver));
				material.selectByVisibleText(material_input);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//input comments
			String comment = Utility.getStringCellData(row, col_comment);
			if(!comment.equals("")) {
				CreateClaimPage.Comments(driver).sendKeys(comment);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//input memo
			String memo = Utility.getStringCellData(row, col_memo);
			if(!memo.equals("")) {
				CreateClaimPage.Memo(driver).sendKeys(memo);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//save
			Constant.Save(driver).submit();
			
			try {
				driver.findElement(By.id("id_registrant"));
				
				//output result
				Utility.setCellData("Cannot create Claim", row, col_result);
			}catch(Exception e) {
				//output result
				Utility.setCellData("Pass!", row, col_result);
			}
			
			//check next row
			if(!Utility.isBlank(row+1)) {
				++row;
				execute(driver);
			}
		} catch(Exception e) {
			Constant.Cancel(driver).sendKeys(Keys.RETURN);
			
			Utility.setCellData("Cannot create Claim", row, col_result);
		}
	}
}