package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class LoginPage {
	private static WebElement element = null;
	
	//look for username
	public static WebElement username(WebDriver driver) {
		element = driver.findElement(By.id("id_login"));
		
		return element;
	}
	
	//look for password
	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.id("id_password"));
		
		return element;
	}
	
	//submit
	public static WebElement submit(WebDriver driver) {
		element = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		
		return element;
	}
}