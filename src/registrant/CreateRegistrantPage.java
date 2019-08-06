package registrant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateRegistrantPage {
	private static WebElement element = null;
	
	//create registrant button
	public static WebElement CreateRegistrant(WebDriver driver) {
		element = driver.findElement(By.linkText("Create Registrant"));
		
		return element;
	}
	
	//registration number
	public static WebElement RegistrationNumber(WebDriver driver) {
		element = driver.findElement(By.id("id_registration_number"));
		
		return element;
	}
	
	//organization name
	public static WebElement OrganizationName(WebDriver driver) {
		element = driver.findElement(By.id("id_name"));
		
		return element;
	}
	
	//Operating as
	public static WebElement OperatingAs(WebDriver driver) {
		element = driver.findElement(By.id("id_operating_as"));
		
		return element;
	}
	
	//Franchise name
	public static WebElement FranchiseName(WebDriver driver) {
		element = driver.findElement(By.id("id_franchise_name"));
		
		return element;
	}
	
	//Registered date
	public static WebElement RegisteredDate(WebDriver driver) {
		element = driver.findElement(By.id("id_registered_date"));
		
		return element;
	}
	
	//Website
	public static WebElement Website(WebDriver driver) {
		element = driver.findElement(By.id("id_website"));
		
		return element;
	}
	
	//Registrant type
	public static WebElement RegistrantType(WebDriver driver) {
		element = driver.findElement(By.id("id_registrant_type"));
		
		return element;
	}
	
	//Address line 1
	public static WebElement Address1(WebDriver driver) {
		element = driver.findElement(By.id("id_line_1"));
		
		return element;
	}
	
	//Address line 2
	public static WebElement Address2(WebDriver driver) {
		element = driver.findElement(By.id("id_line_2"));
		
		return element;
	}
	
	//City
	public static WebElement City(WebDriver driver) {
		element = driver.findElement(By.id("id_city"));
		
		return element;
	}
	
	//Province/State
	public static WebElement Province(WebDriver driver) {
		element = driver.findElement(By.id("id_state_prov"));
		
		return element;
	}
	
	//Postal code
	public static WebElement PostalCode(WebDriver driver) {
		element = driver.findElement(By.id("id_postal_code"));
		
		return element;
	}
	
	//Country
	public static WebElement Country(WebDriver driver) {
		element = driver.findElement(By.id("id_country"));
		
		return element;
	}
	
	//Letter effective date
	public static WebElement EffectiveDate(WebDriver driver) {
		element = driver.findElement(By.id("id_letter_effective_date"));
		
		return element;
	}
	
	//Next letter due date
	public static WebElement NextDueDate(WebDriver driver) {
		element = driver.findElement(By.id("id_next_letter_due_date"));
		
		return element;
	}
}