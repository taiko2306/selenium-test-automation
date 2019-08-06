package claim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModifyClaimPage {
	private static WebElement element = null;
	
	//Modify
	public static WebElement Modify(WebDriver driver) {
		element = driver.findElement(By.linkText("Modify"));
		
		return element;
	}
	
	//Processor, received date, invoice number, submitted subtotal, material type, comments and memos are the same with CreateClaimPage
	
}
