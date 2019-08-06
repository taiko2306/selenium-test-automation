package claim;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import test.HomePage;
import utility.Constant;
import utility.Utility;

public class ReviewClaimAction {
	private static int sheet_num = 8;
	private static int row = 1;
	private static int col_invoice = 1;
	private static int col_result = 2;
	
	public static void execute(WebDriver driver) throws Exception {
		Utility.setExcelFile(Constant.PATH, sheet_num);
		HomePage.Claims(driver).sendKeys(Keys.RETURN);
		
		Constant.SearchIcon(driver).click();
		
		try {
			//input invoice number
			String invoice_number = Utility.getStringCellData(row, col_invoice);
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
				
				//review
				Constant.Review(driver).click();
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
				
				//confirm
				Constant.Save(driver).submit();
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
				
				//output result
				Utility.setCellData("Pass!", row, col_result);
			}
			else {
				//output result
				Utility.setCellData("Claim cannot be reviewed!", row, col_result);
			}
			
			//check next row
			if(!Utility.isBlank(row+1)) {
				++row;
				execute(driver);
			}
		} catch(Exception e) {
			//output result
			Utility.setCellData("Claim cannot be reviewed!", row, col_result);
			
			//check next row
			if(!Utility.isBlank(row+1)) {
				++row;
				execute(driver);
			}
		}
	}
}
