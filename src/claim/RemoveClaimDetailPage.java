package claim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RemoveClaimDetailPage {
	private static WebElement element = null;
	
	//search icon, search box, search button, claim number are the same with CreateClaimDetailPage.java
	
	//option remove or modify
	public static WebElement Option(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/table[2]/tbody/tr[2]/td[9]/div/a"));
		
		return element;
	}
	
	//remove
	public static WebElement Remove(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/table[2]/tbody/tr[2]/td[9]/div/ul/li[2]/a"));
		
		return element;
	}
	
	//modify
	public static WebElement Modify(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/table[2]/tbody/tr[2]/td[9]/div/ul/li[1]/a"));
		
		return element;
	}
	
	//remove or modify option for container
	public static WebElement ContainerOption(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/table[2]/tbody/tr[2]/td[10]/div/a"));
		
		return element;
	}
	
	//remove for container
	public static WebElement ContainerRemove(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/table[2]/tbody/tr[2]/td[10]/div/ul/li[2]/a"));
		
		return element;
	}
	
	//modify for container
	public static WebElement ContainerModify(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/table[2]/tbody/tr[2]/td[10]/div/ul/li[1]/a"));
		
		return element;
	}
	
	//the first row in table
	public static WebElement FirstRow(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/table[2]/tbody/tr[2]"));
		
		return element;
	}
}