package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private static WebElement element = null;
	
	//Home
	public static WebElement Home(WebDriver driver) {
		element = driver.findElement(By.linkText("Home"));
		
		return element;
	}
	
	//Registrants
	public static WebElement Registrants(WebDriver driver) {
		element = driver.findElement(By.linkText("Registrants"));
		
		return element;
	}
	
	//Claims
	public static WebElement Claims(WebDriver driver) {		
		element = driver.findElement(By.linkText("Claims"));
		
		return element;
	}
	
	//Reports
	public static WebElement Reports(WebDriver driver) {
		element = driver.findElement(By.linkText("Reports"));
		
		return element;
	}
	
	public static WebElement Addresses(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Addresses"));
		
		return element;
	}
	
	public static WebElement Brokers(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Brokers"));
		
		return element;
	}
	
	public static WebElement ClaimDetailsApproved(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Claim Details Approved"));
		
		return element;
	}
	
	public static WebElement ClaimDetails(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Claim Details"));
		
		return element;
	}
	
	public static WebElement ClaimsApproved(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Claims Approved"));
		
		return element;
	}
	
	public static WebElement ClaimsByRegistrant(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Claims by Registrant"));
		
		return element;
	}
	
	public static WebElement ClaimsOnHold(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Claims On Hold"));
		
		return element;
	}
	
	public static WebElement ClaimsReceived(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Claims Received"));
		
		return element;
	}
	
	public static WebElement ClaimsReviewed(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Claims Reviewed"));
		
		return element;
	}
	
	public static WebElement ClaimsDeleted(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Claims Deleted"));
		
		return element;
	}
	
	public static WebElement Collectors(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Collectors"));
		
		return element;
	}
	
	public static WebElement Contacts(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Contacts"));
		
		return element;
	}
	
	public static WebElement Incentives(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Incentives"));
		
		return element;
	}
	
	public static WebElement Notes(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Notes"));
		
		return element;
	}
	
	public static WebElement PaymentSchedules(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Payment Schedules"));
		
		return element;
	}
	
	public static WebElement Processors(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Processors"));
		
		return element;
	}
	
	public static WebElement RegistrantsByLetter(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Registrants by Letter"));
		
		return element;
	}
	
	public static WebElement RegistrantsByMaterial(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Registrants by Material"));
		
		return element;
	}
	
	public static WebElement RegistrantsByZone(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Registrants by Zone"));
		
		return element;
	}
	
	public static WebElement Tickets(WebDriver driver) {
		element = driver.findElement(By.linkText("List all Tickets"));
		
		return element;
	}
	
	//Ad-hoc Reports
	public static WebElement Ad_hoc(WebDriver driver) {
		element = driver.findElement(By.linkText("Ad-hoc Reports"));
		
		return element;
	}
	
	public static WebElement AmountClaimed(WebDriver driver) {
		element = driver.findElement(By.linkText("Amount Claimed by Processor per Claim"));
		
		return element;
	}
}