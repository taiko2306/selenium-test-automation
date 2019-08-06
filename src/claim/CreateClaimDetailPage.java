package claim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateClaimDetailPage {
	private static WebElement element = null;
	
	//search box
	public static WebElement SearchBox(WebDriver driver) {
		element = driver.findElement(By.id("invoice_number"));
		
		return element;
	}
	
	//search button
	public static WebElement Arrow(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"search_row\"]/th[2]/i"));
		
		return element;
	}
	
	//claim number
	public static WebElement ClaimNo(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/table/tbody/tr[3]/td[1]/a"));
		
		return element;
	}
	
	//create claim detail button
	public static WebElement CreateClaim(WebDriver driver) {
		element = driver.findElement(By.linkText("Create Detail"));
		
		return element;
	}
	
	//collector
	public static WebElement Collector(WebDriver driver) {
		element = driver.findElement(By.id("id_registrant"));
		
		return element;
	}
	
	//received date
	public static WebElement ReceivedDate(WebDriver driver) {
		element = driver.findElement(By.id("id_date"));
		
		return element;
	}
	
	//zone
	public static WebElement Zone(WebDriver driver) {
		element = driver.findElement(By.id("id_zone"));
		
		return element;
	}
	
	//container type
	public static WebElement ContainerType(WebDriver driver) {
		element = driver.findElement(By.id("id_container_type"));
		
		return element;
	}
	
	//quantity
	public static WebElement Quantity(WebDriver driver) {
		element = driver.findElement(By.id("id_quantity"));
		
		return element;
	}
	
	//initial measure
	public static WebElement InitialMeasure(WebDriver driver) {
		element = driver.findElement(By.id("id_initial_measure"));
		
		return element;
	}
	
	//test percentage
	public static WebElement TestPercentage(WebDriver driver) {
		element = driver.findElement(By.id("id_test_percentage"));
		
		return element;
	}
	
	//final measure
	public static WebElement FinalMeasure(WebDriver driver) {
		element = driver.findElement(By.id("id_final_measure"));
		
		return element;
	}
	
	//material check
	public static WebElement MaterialCheck(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div/table/tbody/tr[3]/td/span"));
		
		return element;
	}
}