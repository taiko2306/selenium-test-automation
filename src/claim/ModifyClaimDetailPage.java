package claim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModifyClaimDetailPage {
	private static WebElement element = null;
	
	//Collector
	public static WebElement Collector(WebDriver driver) {
		element = driver.findElement(By.id("id_registrant"));
		
		return element;
	}
	
	//Received date
	public static WebElement Date(WebDriver driver) {
		element = driver.findElement(By.id("id_date"));
		
		return element;
	}
	
	//Zone
	public static WebElement Zone(WebDriver driver) {
		element = driver.findElement(By.id("id_zone"));
		
		return element;
	}
	
	//Container type
	public static WebElement ContainerType(WebDriver driver) {
		element = driver.findElement(By.id("id_container_type"));
		
		return element;
	}
	
	//Quantity
	public static WebElement Quantity(WebDriver driver) {
		element = driver.findElement(By.id("id_quantity"));
		
		return element;
	}
	
	//Initial measure
	public static WebElement InitialMeasure(WebDriver driver) {
		element = driver.findElement(By.id("id_initial_measure"));
		
		return element;
	}
	
	//Test percentage
	public static WebElement TestPercentage(WebDriver driver) {
		element = driver.findElement(By.id("id_test_percentage"));
		
		return element;
	}
	
	//Final measure
	public static WebElement FinalMeasure(WebDriver driver) {
		element = driver.findElement(By.id("id_final_measure"));
		
		return element;
	}
}
