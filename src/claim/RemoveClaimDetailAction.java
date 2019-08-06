package claim;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Utility;

import utility.Constant;
import test.HomePage;

public class RemoveClaimDetailAction {
	private static int sheet_num = 14;
	private static int row = 1;
	private static int col_invoice = 1;
	private static int col_result = 2;
	
	public static void execute(WebDriver driver) throws Exception {
		Utility.setExcelFile(Constant.PATH, sheet_num);

		HomePage.Claims(driver).sendKeys(Keys.ENTER);
		
		Constant.SearchIcon(driver).click();
		
		//input invoice number
		String invoice_number = Utility.getStringCellData(row, col_invoice);
		CreateClaimDetailPage.SearchBox(driver).sendKeys(invoice_number);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		
		//search
		CreateClaimDetailPage.Arrow(driver).click();
		
		try {
			WebElement condition = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/table/tbody/tr[3]/td[8]/span"));
			
			if(condition.getText().equals("Received")) {	
				//enter claim
				CreateClaimDetailPage.ClaimNo(driver).sendKeys(Keys.ENTER);
			}
			//check next row
			else if(!Utility.isBlank(row+1)) {
				++row;
				execute(driver);
			}
		}catch(Exception e) {
			//output result
			Utility.setCellData("Claim detail not exist!", row, col_result);
			
			//check next row
			if(!Utility.isBlank(row+1)) {
				++row;
				execute(driver);
			}
			return;
		}
		
		try {
			WebElement material = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/table[1]/tbody/tr[7]/td/span"));			                                                   
			
			if(!material.getText().equals("C - Containers")) {
				while(RemoveClaimDetailPage.FirstRow(driver) != null) {
					//remove and modify option
					RemoveClaimDetailPage.Option(driver).sendKeys(Keys.ENTER);
					if(Constant.demo.equals("on")) {
						Thread.sleep(Constant.waitTime);
					}
					
					//choose remove
					RemoveClaimDetailPage.Remove(driver).sendKeys(Keys.ENTER);
					if(Constant.demo.equals("on")) {
						Thread.sleep(Constant.waitTime);
					}
					
					//confirm remove
					Constant.Save(driver).submit();
					if(Constant.demo.equals("on")) {
						Thread.sleep(Constant.waitTime);
					}
					
					//refresh browser
					driver.navigate().refresh();
				}
			}
			else if(material.getText().equals("C - Containers")) {
				while(RemoveClaimDetailPage.FirstRow(driver) != null) {
					//remove and modify option
					RemoveClaimDetailPage.ContainerOption(driver).sendKeys(Keys.ENTER);
					if(Constant.demo.equals("on")) {
						Thread.sleep(Constant.waitTime);
					}
					
					//choose remove
					RemoveClaimDetailPage.ContainerRemove(driver).sendKeys(Keys.ENTER);
					if(Constant.demo.equals("on")) {
						Thread.sleep(Constant.waitTime);
					}
					
					//confirm remove
					Constant.Save(driver).submit();
					if(Constant.demo.equals("on")) {
						Thread.sleep(Constant.waitTime);
					}
					
					//refresh browser
					driver.navigate().refresh();
				}
			}
		}catch(Exception e) {
			//get full message
			String error = e.getMessage();
			
			//get the first 15 characters
			String error_message = error.substring(0, 15);
			
			if(error_message.equals("no such element")) {
				//output result
				Utility.setCellData("Pass!", row, col_result);
				
				if(!Utility.isBlank(row+1)) {
					++row;
					execute(driver);
				}
			}
			else {
				//output result
				Utility.setCellData("Claim cannot be removed", row, col_result);
				
				if(!Utility.isBlank(row+1)) {
					++row;
					execute(driver);
				}
			}
		}
	}
}