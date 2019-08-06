package claim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RemoveClaimPage {
	private static WebElement element = null;
	
	//remove option
	public static WebElement Remove(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div[1]/a[2]"));
		
		return element;
	}
}