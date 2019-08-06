package test;

import java.util.concurrent.TimeUnit;

import utility.Constant;
import login.LoginAction;
import registrant.CreateRegistrantAction;
import registrant.ModifyRegistrantAction;
import claim.ApproveClaimAction;
import claim.CorrectAction;
import claim.CreateClaimAction;
import claim.CreateClaimDetailAction;
import claim.ModifyClaimAction;
import claim.ModifyClaimDetailAction;
import claim.RemoveClaimDetailAction;
import claim.ReviewClaimAction;
import claim.RemoveClaimAction;
import claim.HoldClaimAction;
import claim.UnholdClaimAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunTest {
	private static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ly-sonLe\\eclipse\\java-2019-06\\eclipse\\Selenium\\WebDriver\\chromedriver_win32(75)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(Constant.URL);
		
		//login
		LoginAction.execute(driver);
		
		//Smoke Test
//		SmokeTest.execute(driver);
		
		//Create Registrant
//		CreateRegistrantAction.execute(driver);
		
		//Modify Registrant
//		ModifyRegistrantAction.execute(driver);
		
//		Create Claim
//		CreateClaimAction.execute(driver);
		
		//Create Claim Detail
//		CreateClaimDetailAction.execute(driver);
		
		//Modify Claim Detail
//		ModifyClaimDetailAction.execute(driver);
		
		//Modify Claim
//		ModifyClaimAction.execute(driver);
		
		//Review Claim
//		ReviewClaimAction.execute(driver);
		
		//Hold Claim
//		HoldClaimAction.execute(driver);
		
		//Unhold Claim
//		UnholdClaimAction.execute(driver);
		
		//Review Claim again
//		ReviewClaimAction.execute(driver);
		
		//Approve Claim
//		ApproveClaimAction.execute(driver);
		
		//Make Correction
//		CorrectAction.execute(driver);
		
		//Remove Claim Detail
//		RemoveClaimDetailAction.execute(driver);
		
		//Remove Claim
//		RemoveClaimAction.execute(driver);

//		driver.close();
	}
}