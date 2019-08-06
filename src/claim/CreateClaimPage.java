package claim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CreateClaimPage {
private static WebElement element = null;
	
	//create claim
	public static WebElement CreateClaim(WebDriver driver) {
		element = driver.findElement(By.linkText("Create Claim"));
		
		return element;
	}
	
	//processor
	public static WebElement Processor(WebDriver driver) {
		element = driver.findElement(By.id("id_registrant"));
		
		return element;
	}
	
	//date received
	public static WebElement ReceivedDate(WebDriver driver) {
		element = driver.findElement(By.id("id_received_date"));
		
		return element;
	}
	
	//invoice number
	public static WebElement InvoiceNumber(WebDriver driver) {
		element = driver.findElement(By.id("id_invoice_number"));
		
		return element;
	}
	
	//submitted subtotal
	public static WebElement SubmittedSubtotal(WebDriver driver) {
		element = driver.findElement(By.id("id_submitted_subtotal"));
		
		return element;
	}
	
	//material type
	public static WebElement MaterialType(WebDriver driver) {
		element = driver.findElement(By.id("id_material_type"));
		
		return element;
	}
	
	//claim comments
	public static WebElement Comments(WebDriver driver) {
		element = driver.findElement(By.id("id_comments"));
		
		return element;
	}
	
	//claim memo
	public static WebElement Memo(WebDriver driver) {
		element = driver.findElement(By.id("id_memo"));
		
		return element;
	}
}