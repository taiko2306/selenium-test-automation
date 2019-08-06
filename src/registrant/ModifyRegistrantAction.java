package registrant;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import test.HomePage;
import utility.Constant;
import utility.Utility;

public class ModifyRegistrantAction {
	private static int sheet_num = 3;
	private static int row = 1;
	private static int col_organization_name = 1;
	private static int col_type = 2;
	private static int col_operating_as = 3;
	private static int col_franchise_name = 4;
	private static int col_registered_date = 5;
	private static int col_effective_date = 6;
	private static int col_next_due_date = 7;
	private static int col_website = 8;
	private static int col_old_zone = 9;
	private static int col_new_zone = 10;
	private static int col_old_process_material = 11;
	private static int col_new_process_material = 12;
	private static int col_old_collect_material = 13;
	private static int col_new_collect_material = 14;
	private static int col_result = 15;
	
	public static void execute(WebDriver driver) throws Exception {
		Utility.setExcelFile(Constant.PATH, sheet_num);
		HomePage.Registrants(driver).click();
		
		try {
			ModifyRegistrantPage.Option(driver).sendKeys(Keys.ENTER);
			ModifyRegistrantPage.Modify(driver).sendKeys(Keys.ENTER);
			
			//Organization name
			String organization_name = Utility.getStringCellData(row, col_organization_name);
			if(!organization_name.equals("")) {
				ModifyRegistrantPage.Organization(driver).clear();
				ModifyRegistrantPage.Organization(driver).sendKeys(organization_name);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Type
			String type_input = Utility.getStringCellData(row, col_type);
			if(!type_input.equals("")) {
				Select type = new Select(ModifyRegistrantPage.Type(driver));
				type.selectByVisibleText(type_input);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Operating as
			String operating = Utility.getStringCellData(row, col_operating_as);
			if(!operating.equals("")) {
				ModifyRegistrantPage.Operating(driver).clear();
				ModifyRegistrantPage.Operating(driver).sendKeys(operating);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Franchise name
			String franchise = Utility.getStringCellData(row, col_franchise_name);
			if(!franchise.equals("")) {
				ModifyRegistrantPage.Franchise(driver).clear();
				ModifyRegistrantPage.Franchise(driver).sendKeys(franchise);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Registered date
			String registered_date = Utility.getRawCellData(row, col_registered_date);
			if(!registered_date.equals("")) {
				ModifyRegistrantPage.RegisteredDate(driver).clear();
				ModifyRegistrantPage.RegisteredDate(driver).sendKeys(registered_date);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Effective date
			String effective_date = Utility.getRawCellData(row, col_effective_date);
			if(!effective_date.equals("")) {
				ModifyRegistrantPage.EffectiveDate(driver).clear();
				ModifyRegistrantPage.EffectiveDate(driver).sendKeys(effective_date);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Next due date
			String next_due_date = Utility.getRawCellData(row, col_next_due_date);
			if(!next_due_date.equals("")) {
				ModifyRegistrantPage.NextDueDate(driver).clear();
				ModifyRegistrantPage.NextDueDate(driver).sendKeys(next_due_date);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Website
			String website = Utility.getStringCellData(row, col_website);
			if(!website.equals("")) {
				ModifyRegistrantPage.Website(driver).clear();
				ModifyRegistrantPage.Website(driver).sendKeys(website);
			}
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			else {
				Thread.sleep(Constant.waitTime);
			}
			
			//OLD ZONE
			String old_zones_input = Utility.getStringCellData(row, col_old_zone);
			if(!old_zones_input.equals("")) {
				String[] old_zone_array = old_zones_input.split(",");
				int[] old_zones = new int[old_zone_array.length];
				
				//collect zones
				for(int i=0; i<old_zone_array.length; i++) {
					old_zones[i] = Integer.parseInt(old_zone_array[i]);
					Thread.sleep(500);
				}
				
				//check boxes
				for(int j=0;j<old_zones.length;j++) {
					driver.findElement(By.id("id_zones_" + (old_zones[j]-1))).click();
				}
			}
			
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//NEW ZONE
			String new_zones_input = Utility.getStringCellData(row, col_new_zone);
			if(!new_zones_input.equals("")) {
				String[] new_zone_array = new_zones_input.split(",");
				int[] new_zones = new int[new_zone_array.length];
				
				//collect zones
				for(int i=0; i<new_zone_array.length; i++) {
					new_zones[i] = Integer.parseInt(new_zone_array[i]);
					Thread.sleep(500);
				}
				
				//check boxes
				for(int j=0;j<new_zones.length;j++) {
					driver.findElement(By.id("id_zones_" + (new_zones[j]-1))).click();
				}
			}
			
			//OLD PROCESS MATERIAL TYPE
			String old_process_material = Utility.getStringCellData(row, col_old_process_material);
			if(!old_process_material.equals("")) {
				String[] old_process_material_array = old_process_material.split(","); 
				int[] old_process_material_type = new int[old_process_material_array.length];
				
				//collect data
				for(int i=0; i<old_process_material_array.length;i++) {
					switch(old_process_material_array[i]) {
						case "O":
							old_process_material_type[i] = 0;
							break;
						case "A":
							old_process_material_type[i] = 1;
							break;
						case "F":
							old_process_material_type[i] = 2;
							break;
						case "C":
							old_process_material_type[i] = 3;
							break;
					}
				}
				
				//check boxes
				for(int j=0;j<old_process_material_type.length;j++) {
					driver.findElement(By.id("id_material_types_" + old_process_material_type[j])).click();
				}
			}
			
			//NEW PROCESS MATERIAL TYPE
			String new_process_material = Utility.getStringCellData(row, col_new_process_material);
			if(!new_process_material.equals("")) {
				String[] new_process_material_array = new_process_material.split(","); 
				int[] new_process_material_type = new int[new_process_material_array.length];
				
				//collect data
				for(int i=0; i<new_process_material_array.length;i++) {
					switch(new_process_material_array[i]) {
						case "O":
							new_process_material_type[i] = 0;
							break;
						case "A":
							new_process_material_type[i] = 1;
							break;
						case "F":
							new_process_material_type[i] = 2;
							break;
						case "C":
							new_process_material_type[i] = 3;
							break;
					}
				}
				
				//check boxes
				for(int j=0;j<new_process_material_type.length;j++) {
					driver.findElement(By.id("id_material_types_" + new_process_material_type[j])).click();
				}
			}

			
			// OLD COLLECT MATERIAL TYPE
			String old_collect_material = Utility.getStringCellData(row, col_old_collect_material);
			if(!old_collect_material.equals("")) {
				String[] old_collect_material_array = old_collect_material.split(","); 
				int[] old_collect_material_type = new int[old_collect_material_array.length];
				
				//collect data
				for(int i=0; i<old_collect_material_array.length;i++) {
					switch(old_collect_material_array[i]) {
						case "O":
							old_collect_material_type[i] = 0;
							break;
						case "A":
							old_collect_material_type[i] = 1;
							break;
						case "F":
							old_collect_material_type[i] = 2;
							break;
						case "C":
							old_collect_material_type[i] = 3;
							break;
					}
				}
				
				//check boxes
				for(int j=0;j<old_collect_material_type.length;j++) {
					driver.findElement(By.id("id_material_types_for_collector_" + old_collect_material_type[j])).click();
				}
			}
			
			//NEW COLLECT MATERIAL
			String new_collect_material = Utility.getStringCellData(row, col_new_collect_material);
			if(!new_collect_material.equals("")) {
				String[] new_collect_material_array = new_collect_material.split(","); 
				int[] new_collect_material_type = new int[new_collect_material_array.length];
				
				//collect data
				for(int i=0; i<new_collect_material_array.length;i++) {
					switch(new_collect_material_array[i]) {
						case "O":
							new_collect_material_type[i] = 0;
							break;
						case "A":
							new_collect_material_type[i] = 1;
							break;
						case "F":
							new_collect_material_type[i] = 2;
							break;
						case "C":
							new_collect_material_type[i] = 3;
							break;
					}
				}
				
				//check boxes
				for(int j=0;j<new_collect_material_type.length;j++) {
					driver.findElement(By.id("id_material_types_for_collector_" + new_collect_material_type[j])).click();
				}
			}
			
			//Save
			Constant.Save(driver).submit();
			if(Constant.demo.equals("on")) {
				Thread.sleep(Constant.waitTime);
			}
			
			//Output result
			Utility.setCellData("Pass!", row, col_result);
			
			//check next row
			if(!Utility.isBlank(row+1)) {
				++row;
				execute(driver);
			}
		} catch(Exception e) {
			//Cancel
			Constant.Cancel(driver).click();
			
			//Output result
			Utility.setCellData("Registrant cannot be modified", row, col_result);
			
			//check next row
			if(!Utility.isBlank(row+1)) {
				++row;
				execute(driver);
			}
		}
	}
}
