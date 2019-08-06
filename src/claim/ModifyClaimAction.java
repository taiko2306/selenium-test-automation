package claim;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import test.HomePage;
import utility.Constant;
import utility.Utility;

public class ModifyClaimAction {
	private static int sheet_num = 6;
	private static int row = 1;
	private static int col_old_invoice = 1;
	private static int col_processor = 2;
	private static int col_date = 3;
	private static int col_new_invoice = 4;
	private static int col_subtotal = 5;
	private static int col_material = 6;
	private static int col_comment = 7;
	private static int col_memo = 8;
	private static int col_result = 9;
	
	public static void execute(WebDriver driver) throws Exception {
		Utility.setExcelFile(Constant.PATH, sheet_num);
		HomePage.Claims(driver).sendKeys(Keys.RETURN);
		
		Constant.SearchIcon(driver).click();
		
		try {
			//input invoice number
			String invoice_number = Utility.getStringCellData(row, col_old_invoice);
			CreateClaimDetailPage.SearchBox(driver).sendKeys(invoice_number);
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//search
			CreateClaimDetailPage.Arrow(driver).click();
			
			WebElement condition = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/table/tbody/tr[3]/td[8]/span"));
			
			if(condition.getText().equals("Received")) {
				//enter claim
				CreateClaimDetailPage.ClaimNo(driver).click();
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
				
				//modify
				ModifyClaimPage.Modify(driver).sendKeys(Keys.RETURN);
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
				
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
				String date = Utility.getRawCellData(row, col_date);
				if(!date.equals("")) {
					CreateClaimPage.ReceivedDate(driver).clear();
					CreateClaimPage.ReceivedDate(driver).sendKeys(date);
				}
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
				
				//input invoice number
				String invoice = Utility.getStringCellData(row, col_new_invoice);
				
				if(!invoice.equals("")) {
					CreateClaimPage.InvoiceNumber(driver).clear();
					CreateClaimPage.InvoiceNumber(driver).sendKeys(invoice);
				}
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
				
				//input subtotal
				double subtotal = Utility.getNumericCellData(row, col_subtotal);
				String string_subtotal = Double.toString(subtotal);

				if(!string_subtotal.equals("0.0")) {
					CreateClaimPage.SubmittedSubtotal(driver).clear();
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
					CreateClaimPage.Comments(driver).clear();
					CreateClaimPage.Comments(driver).sendKeys(comment);
				}
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
				
				//input memo
				String memo = Utility.getStringCellData(row, col_memo);
				if(!memo.equals("")) {
					CreateClaimPage.Memo(driver).clear();
					CreateClaimPage.Memo(driver).sendKeys(memo);
				}
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
				
				//save
				Constant.Save(driver).submit();
				
				try {
					driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/form/div[1]/div/div[1]"));
					
					//output result
					Utility.setCellData("Claim cannot be modifed", row, col_result);
				} catch(Exception e) {
					//output result
					Utility.setCellData("Pass!", row, col_result);
				}
			}
			
			//check next row
			if(!Utility.isBlank(row+1)) {
				++row;
				execute(driver);
			}
		} catch(Exception e) {
			//output result
			Utility.setCellData("Claim cannot be modified", row, col_result);
			
			//check next row
			if(!Utility.isBlank(row+1)) {
				++row;
				execute(driver);
			}
		}
	}
}