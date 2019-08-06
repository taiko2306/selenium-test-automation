package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Constant {
	public static final String URL = "https://dev.ri-claims.bc.smartrecycling.ca/";
	public static final String PATH = "C:\\Users\\Ly-sonLe\\eclipse\\java-2019-06\\eclipse\\workspace\\newWebTest\\src\\data\\Data_Template_v1.xlsx";
	
	private static WebElement element = null;
	public static String demo = "off";
	public static int waitTime = 1000;
	
	//Hold button
	public static WebElement Hold(WebDriver driver) {
		element = driver.findElement(By.linkText("Hold Claim"));
		
		return element;
	}
	
	//Un-hold button
	public static WebElement Unhold(WebDriver driver) {
		element = driver.findElement(By.linkText("Un-hold Claim"));
		
		return element;
	}
	
	//Approve button
	public static WebElement Approve(WebDriver driver) {
		element = driver.findElement(By.linkText("Approve Claim"));
		
		return element;
	}
	
	//Review button
	public static WebElement Review(WebDriver driver) {
		element = driver.findElement(By.linkText("Review Claim"));
		
		return element;
	}
	
	//Correct button
	public static WebElement Correct(WebDriver driver) {
		element = driver.findElement(By.linkText("Make Correction"));
		
		return element;
	}
	
	//Search icon
	public static WebElement SearchIcon(WebDriver driver) {
		element = driver.findElement(By.id("search-icon"));
		
		return element;
	}
	
	//Save button
	public static WebElement Save(WebDriver driver) {
		element = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		
		return element;
	}
	
	//Reset button
	public static WebElement Reset(WebDriver driver) {
		element = driver.findElement(By.cssSelector("button[type=\"reset\"]"));
		
		return element;
	}
	
	//Cancel button
	public static WebElement Cancel(WebDriver driver) {
		element = driver.findElement(By.linkText("Cancel"));
		
		return element;
	}
}