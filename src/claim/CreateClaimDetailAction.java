package claim;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utility.Constant;
import utility.Utility;
import test.HomePage;

public class CreateClaimDetailAction {
	private static int sheet_num = 5;
	private static int row = 1;
	private static int col_invoice = 1;
	private static int col_collector = 2;
	private static int col_date = 3;
	private static int col_zone = 4;
	private static int col_container = 5;
	private static int col_quantity = 6;
	private static int col_initial = 7;
	private static int col_final = 8;
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
			
			try {
				//enter claim
				CreateClaimDetailPage.ClaimNo(driver).click();
			}catch(Exception e) {
				//check next row
				if(!Utility.isBlank(row+1)) {
					++row;
					execute(driver);
				}
				System.exit(0);
			}
		}catch(Exception e) {
			System.out.println(e);
			System.exit(0);
		}
		
		//create new claim detail
		CreateClaimDetailPage.CreateClaim(driver).sendKeys(Keys.RETURN);
			
		try {
			//collector
			String collector_input = Utility.getStringCellData(row, col_collector);
			if(!collector_input.equals("")) {
				Select collector = new Select(CreateClaimDetailPage.Collector(driver));
				collector.selectByVisibleText(collector_input);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//received date
			String date = Utility.getRawCellData(row, col_date);
			if(!date.equals("")) {
				CreateClaimDetailPage.ReceivedDate(driver).clear();
				CreateClaimDetailPage.ReceivedDate(driver).sendKeys(date);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//zone
			String zone_input = Utility.getStringCellData(row, col_zone);
			if(!zone_input.equals("")) {
				Select zone = new Select(CreateClaimDetailPage.Zone(driver));
				zone.selectByVisibleText(zone_input);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//check material_type
			String type = CreateClaimDetailPage.MaterialCheck(driver).getText();
			
			if(type.equals("C - Containers")) {
				//select material type
				String material_type = Utility.getStringCellData(row, col_container);
				if(!material_type.equals("")) {
					Select material = new Select(CreateClaimDetailPage.ContainerType(driver));
					material.selectByVisibleText(material_type);
				}
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
				
				//quantity
				double quantity = Utility.getNumericCellData(row, col_quantity);
				String string_quantity = Double.toString(quantity);
				if(!string_quantity.equals("0.0")) {
					CreateClaimDetailPage.Quantity(driver).sendKeys(string_quantity);
				}
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
				
				//initial measure
				double initial_measure = Utility.getNumericCellData(row, col_initial);
				String string_initial_measure = Double.toString(initial_measure);
				if(!string_initial_measure.equals("0.0")) {
					CreateClaimDetailPage.InitialMeasure(driver).sendKeys(string_initial_measure);
				}
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
				
			}
			else if(type.equals("F - Used Filters")) {
				//quantity
				double quantity = Utility.getNumericCellData(row, col_quantity);
				String string_quantity = Double.toString(quantity);
				if(!string_quantity.equals("0.0")) {
					CreateClaimDetailPage.Quantity(driver).sendKeys(string_quantity);
				}
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
				
				//initial measure
				double initial_measure = Utility.getNumericCellData(row, col_initial);
				String string_initial_measure = Double.toString(initial_measure);
				if(!string_initial_measure.equals("0.0")) {
					CreateClaimDetailPage.InitialMeasure(driver).sendKeys(string_initial_measure);
				}
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
			}
			else {
				//initial measure
				double initial_measure = Utility.getNumericCellData(row, col_quantity);
				String string_initial_measure = Double.toString(initial_measure);
				if(!string_initial_measure.equals("0.0")) {
					CreateClaimDetailPage.InitialMeasure(driver).sendKeys(string_initial_measure);
				}
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
				
				//test percentage
				double test_percentage = Utility.getNumericCellData(row, col_initial);
				String string_test_percentage = Double.toString(test_percentage);
				if(!string_test_percentage.equals("0.0")) {
					CreateClaimDetailPage.TestPercentage(driver).sendKeys(string_test_percentage);
				}
				if(Constant.demo.equals("on")) {
					Thread.sleep(Constant.waitTime);
				}
			}
			
			//final measure
			double final_measure = Utility.getNumericCellData(row, col_final);
			String string_final_measure = Double.toString(final_measure);
			if(!string_final_measure.equals("0.0")) {
				CreateClaimDetailPage.FinalMeasure(driver).sendKeys(string_final_measure);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//save
			Constant.Save(driver).submit();
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			try {
				driver.findElement(By.id("id_registrant"));
				
				//output result
				Utility.setCellData("Cannot create Claim Detail", row, col_result);
			} catch(Exception e) {	
				//output result
				Utility.setCellData("Pass!", row, col_result);
			}
			
			//check next row
			if(!Utility.isBlank(row+1)) {
				++row;
				execute(driver);
			}
		}catch (Exception e) {
			Constant.Cancel(driver).sendKeys(Keys.RETURN);
			
			Utility.setCellData("Cannot create Claim Detail", row, col_result);
			
			//check next row
			if(!Utility.isBlank(row+1)) {
				++row;
				execute(driver);
			}
		}
	}
}