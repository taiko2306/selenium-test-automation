package claim;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import test.HomePage;
import utility.Constant;
import utility.Utility;

public class ModifyClaimDetailAction {
	private static int sheet_num = 7;
	private static int row = 1;
	private static int col_invoice = 1;
	private static int col_collector = 2;
	private static int col_date = 3;
	private static int col_zone = 4;
	private static int col_container = 5;
	private static int col_quantity = 6;
	private static int col_initial_measure = 7;
	private static int col_final_measure = 8;
	private static int col_result = 9;
	
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
			}
			else if(!Utility.isBlank(row+1)) {
				++row;
				execute(driver);
			}
		} catch(Exception e) {
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
			
			if(material.getText().equals("C - Containers")) {
				//remove and modify option
				RemoveClaimDetailPage.ContainerOption(driver).sendKeys(Keys.ENTER);
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
				
				//choose modify
				RemoveClaimDetailPage.ContainerModify(driver).sendKeys(Keys.ENTER);
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
			}
			else {
				//remove and modify option
				RemoveClaimDetailPage.Option(driver).sendKeys(Keys.ENTER);
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
				
				//chosse modify
				RemoveClaimDetailPage.Modify(driver).sendKeys(Keys.ENTER);
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
			}
			
			//Collector
			String collector_input = Utility.getStringCellData(row, col_collector);
			if(!collector_input.equals("")) {
				Select collector = new Select(ModifyClaimDetailPage.Collector(driver));
				collector.selectByVisibleText(collector_input);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Date
			String date = Utility.getRawCellData(row, col_date);
			if(!date.equals("")) {
				ModifyClaimDetailPage.Date(driver).clear();
				ModifyClaimDetailPage.Date(driver).sendKeys(date);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Zone
			String zone_input = Utility.getStringCellData(row, col_zone);
			if(!zone_input.equals("")) {
				Select zone = new Select(ModifyClaimDetailPage.Zone(driver));
				zone.selectByVisibleText(zone_input);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Container type
			WebElement type = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div/table/tbody/tr[3]/td/span"));
			if(type.getText().equals("C - Containers")) {
				String container_input = Utility.getStringCellData(row, col_container);
				if(!container_input.equals("")) {
					Select container = new Select(ModifyClaimDetailPage.ContainerType(driver));
					container.selectByVisibleText(container_input);
				}
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			if(type.getText().equals("C - Containers") || type.getText().equals("F - Used Filters")) {
				//Quantity
				double quantity_input = Utility.getNumericCellData(row, col_quantity);
				String quantity = Double.toString(quantity_input);
				if(!quantity.equals("0.0")) {
					ModifyClaimDetailPage.Quantity(driver).clear();
					ModifyClaimDetailPage.Quantity(driver).sendKeys(quantity);
				}
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
				
				//Initial measure
				double initial_input = Utility.getNumericCellData(row, col_initial_measure);
				String initial = Double.toString(initial_input);
				if(!initial.equals("0.0")) {
					ModifyClaimDetailPage.InitialMeasure(driver).clear();
					ModifyClaimDetailPage.InitialMeasure(driver).sendKeys(initial);
				}
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
			}
			else {
				//Initial_measure
				double initial_input = Utility.getNumericCellData(row, col_quantity);
				String initial = Double.toString(initial_input);
				if(!initial.equals("0.0")) {
					ModifyClaimDetailPage.InitialMeasure(driver).clear();
					ModifyClaimDetailPage.InitialMeasure(driver).sendKeys(initial);
				}
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
				
				//Test percentage
				double percentage_input = Utility.getNumericCellData(row, col_initial_measure);
				String percentage = Double.toString(percentage_input);
				if(!percentage.equals("0.0")) {
					ModifyClaimDetailPage.TestPercentage(driver).clear();
					ModifyClaimDetailPage.TestPercentage(driver).sendKeys(percentage);
				}
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
			}
			
			//Final measure
			double final_input = Utility.getNumericCellData(row, col_final_measure);
			String final_measure = Double.toString(final_input);
			if(!final_measure.equals("0.0")) {
				ModifyClaimDetailPage.FinalMeasure(driver).clear();
				ModifyClaimDetailPage.FinalMeasure(driver).sendKeys(final_measure);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			Constant.Save(driver).submit();
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//output result
			Utility.setCellData("Pass!", row, col_result);
			
			//check next row
			if(!Utility.isBlank(row+1)) {
				++row;
				execute(driver);
			}
		} catch(Exception e) {
			//output result
			Utility.setCellData("Claim Detail cannot be modified", row, col_result);
			
			if(!Utility.isBlank(row+1)) {
				++row;
				execute(driver);
			}
		}
	}
}