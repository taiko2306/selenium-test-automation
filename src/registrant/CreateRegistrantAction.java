package registrant;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import test.HomePage;
import utility.Constant;
import utility.Utility;

public class CreateRegistrantAction {
	private static int sheet_num = 2;
	private static int row = 1;
	private static int col_registrant = 1;
	private static int col_organization = 2;
	private static int col_operating = 3;
	private static int col_franchise = 4;
	private static int col_registered_date = 5;
	private static int col_website = 6;
	private static int col_type = 7;
	private static int col_zone = 8;
	private static int col_material = 9;
	private static int col_address1 = 10;
	private static int col_address2 = 11;
	private static int col_city = 12;
	private static int col_province = 13;
	private static int col_postal = 14;
	private static int col_country = 15;
	private static int col_effective_date = 16;
	private static int col_due_date = 17;
	private static int col_result = 18;
	
	public static void execute(WebDriver driver) throws Exception {
		Utility.setExcelFile(Constant.PATH, sheet_num);
		
		HomePage.Registrants(driver).click();
		CreateRegistrantPage.CreateRegistrant(driver).sendKeys(Keys.RETURN);
		
		try {
			//Registrant number
			String registrant = Utility.getStringCellData(row, col_registrant);
			if(!registrant.equals("")) {
				CreateRegistrantPage.RegistrationNumber(driver).sendKeys(registrant);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Organization name
			String organization = Utility.getStringCellData(row, col_organization);
			if(!organization.equals("")) {
				CreateRegistrantPage.OrganizationName(driver).sendKeys(organization);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Operating as
			String operating_as = Utility.getStringCellData(row, col_operating);
			if(!operating_as.equals("")) {
				CreateRegistrantPage.OperatingAs(driver).sendKeys(operating_as);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Franchise name
			String franchise_name = Utility.getStringCellData(row, col_franchise);
			if(!franchise_name.equals("")) {
				CreateRegistrantPage.FranchiseName(driver).sendKeys(franchise_name);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Registered date
			String registered_date = Utility.getStringCellData(row, col_registered_date);
			if(!registered_date.equals("")) {
				CreateRegistrantPage.RegisteredDate(driver).clear();
				CreateRegistrantPage.RegisteredDate(driver).sendKeys(registered_date);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Website
			String website = Utility.getStringCellData(row, col_website);
			if(!website.equals("")) {
				CreateRegistrantPage.Website(driver).sendKeys(website);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Registrant type
			String type = Utility.getStringCellData(row, col_type);
			if(!type.equals("")) {
				Select registrant_type = new Select(CreateRegistrantPage.RegistrantType(driver));
				registrant_type.selectByVisibleText(type);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			else {
				Thread.sleep(Constant.waitTime);
			}
			
			//Zones
			String zones_input = Utility.getStringCellData(row, col_zone);
			String[] zone_array = zones_input.split(",");
			int[] zones = new int[zone_array.length];
			
			for(int i=0; i<zone_array.length; i++) {
				zones[i] = Integer.parseInt(zone_array[i]);
				Thread.sleep(500);
			}
			
			for(int j=0;j<zones.length;j++) {
				driver.findElement(By.id("id_zones_" + (zones[j]-1))).click();
			}
			
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Materia type
			String material_input = Utility.getStringCellData(row, col_material);
			String[] material_array = material_input.split(","); 
			int[] material_type = new int[material_array.length];
			
			//Collect data
			for(int i=0; i<material_array.length;i++) {
				switch(material_array[i]) {
					case "O":
						material_type[i] = 0;
						break;
					case "A":
						material_type[i] = 1;
						break;
					case "F":
						material_type[i] = 2;
						break;
					case "C":
						material_type[i] = 3;
						break;
				}
			}
			
			for(int j=0;j<material_type.length;j++) {
				driver.findElement(By.id("id_material_types_" + material_type[j])).click();
			}
			
			//Address 1
			String address_1 = Utility.getStringCellData(row, col_address1);
			if(!address_1.equals("")) {
				CreateRegistrantPage.Address1(driver).sendKeys(address_1);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Address 2
			String address_2 = Utility.getStringCellData(row, col_address2);
			if(!address_2.equals("")) {
				CreateRegistrantPage.Address2(driver).sendKeys(address_2);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//City
			String city = Utility.getStringCellData(row, col_city);
			if(!city.equals("")) {
				CreateRegistrantPage.City(driver).sendKeys(city);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Province
			String province = Utility.getStringCellData(row, col_province);
			if(!province.equals("")) {
				CreateRegistrantPage.Province(driver).sendKeys(province);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Postal coded
			String postal_code = Utility.getStringCellData(row, col_postal);
			if(!postal_code.equals("")) {
				CreateRegistrantPage.PostalCode(driver).sendKeys(postal_code);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Country
			String country = Utility.getStringCellData(row, col_country);
			if(!country.equals("")) {
				CreateRegistrantPage.Country(driver).sendKeys(country);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Letter effective date
			String effective_date = Utility.getStringCellData(row, col_effective_date);
			if(!effective_date.equals("")) {
				CreateRegistrantPage.EffectiveDate(driver).clear();
				CreateRegistrantPage.EffectiveDate(driver).sendKeys(effective_date);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Next due date
			String next_due_date = Utility.getStringCellData(row, col_due_date);
			if(!next_due_date.equals("")) {
				CreateRegistrantPage.NextDueDate(driver).clear();
				CreateRegistrantPage.NextDueDate(driver).sendKeys(next_due_date);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			CreateRegistrantPage.Address2(driver).click();
			
			//Save
			Constant.Save(driver).submit();
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			try {
				driver.findElement(By.id("id_registration_number"));
				
				//Output result
				Utility.setCellData("Registrant cannot be added", row, col_result);
			}catch(Exception e) {
				//Output result
				Utility.setCellData("Registrant added!", row, col_result);
			}
			
			//check next row
			if(!Utility.isBlank(row+1)) {
				++row;
				execute(driver);
			}
			
		}catch(Exception e) {
			Constant.Cancel(driver).click();
			
			Utility.setCellData("Registrant cannot be added", row, col_result);
			
			//check next row
			if(!Utility.isBlank(row+1)) {
				++row;
				execute(driver);
			}
		}
	}
}