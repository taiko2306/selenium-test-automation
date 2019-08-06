package claim;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Constant;
import utility.Utility;
import test.HomePage;

public class RemoveClaimAction {
	private static int sheet_num = 13;
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
				
				//remove
				RemoveClaimPage.Remove(driver).sendKeys(Keys.RETURN);
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
				
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
				//confirm remove
				Constant.Save(driver).submit();
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
				
				//output result
				Utility.setCellData("Pass!", row, col_result);
			}
			else {
				//output result
				Utility.setCellData("Claim status is not received!", row, col_result);
			}
			
			//check next row
			if(!Utility.isBlank(row+1)) {
				++row;
				execute(driver);
			}
		} catch(NoSuchElementException e) {
			//output result
			Utility.setCellData("Claim cannot be removed", row, col_result);
			
			//check next row
			if(!Utility.isBlank(row+1)) {
				++row;
				execute(driver);
			}
		}
	}
}