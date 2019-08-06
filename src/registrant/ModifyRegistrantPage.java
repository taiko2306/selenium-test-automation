package registrant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModifyRegistrantPage {
	private static WebElement element = null;
	
	//Option
	public static WebElement Option(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/table/tbody/tr[2]/td[5]/div/a"));
		
		return element;
	}
	
	//Modify
	public static WebElement Modify(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/table/tbody/tr[2]/td[5]/div/ul/li[1]/a"));
		
		return element;
	}
	
	//Remove
	public static WebElement Remove(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/table/tbody/tr[2]/td[5]/div/ul/li[2]/a"));
		
		return element;
	}
	
	//Organization name
	public static WebElement Organization(WebDriver driver) {
		element = driver.findElement(By.id("id_name"));
		
		return element;
	}
	
	//Type
	public static WebElement Type(WebDriver driver) {
		element = driver.findElement(By.id("id_type"));
		
		return element;
	}
	
	//Operating as
	public static WebElement Operating(WebDriver driver) {
		element = driver.findElement(By.id("id_operating_as"));
		
		return element;
	}
	
	//Franchise name
	public static WebElement Franchise(WebDriver driver) {
		element = driver.findElement(By.id("id_franchise_name"));
		
		return element;
	}
	
	//Registered date
	public static WebElement RegisteredDate(WebDriver driver) {
		element = driver.findElement(By.id("id_registered_date"));
		
		return element;
	}
	
	//Effective date
	public static WebElement EffectiveDate(WebDriver driver) {
		element = driver.findElement(By.id("id_letter_effective_date"));
		
		return element;
	}
	
	//Next due date
	public static WebElement NextDueDate(WebDriver driver) {
		element = driver.findElement(By.id("id_next_letter_due_date"));
		
		return element;
	}
	
	//Website
	public static WebElement Website(WebDriver driver) {
		element = driver.findElement(By.id("id_website"));
		
		return element;
	}
}
