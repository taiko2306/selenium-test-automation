package login;

import org.openqa.selenium.WebDriver;

import utility.Utility;
import utility.Constant;

public class LoginAction {
	private static int sheet_num = 1;
	
	public static void execute(WebDriver driver) throws Exception {
		try {	
			Utility.setExcelFile(Constant.PATH, sheet_num);
			String username = Utility.getStringCellData(1, 0);
			String password = Utility.getStringCellData(1, 1);
			
			LoginPage.username(driver).sendKeys(username);
			
			LoginPage.password(driver).sendKeys(password);
			
			LoginPage.submit(driver).submit();
			
			Utility.setCellData("Pass!", 1, 2);
		} catch(Exception e) {
			Utility.setCellData("Cannot log in", 1, 2);
		}
	}
}