package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

import utility.Constant;
import utility.Utility;

public class SmokeTest {
	private static int row = 1;
	private static int col_result = 2;
	private static int sheet_num = 15;
	
	public static void execute(WebDriver driver) throws Exception {	
		Utility.setExcelFile(Constant.PATH, sheet_num);
		
		//Home page
		HomePage.Home(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		String homeURL = driver.getCurrentUrl();
		String correct_homeURL = "https://dev.ri-claims.bc.smartrecycling.ca/";
		if(homeURL.equals(correct_homeURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Registrants
		HomePage.Registrants(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String registrantURL = driver.getCurrentUrl();
		String correct_registrantURL = "https://dev.ri-claims.bc.smartrecycling.ca/registrant/list/";
		if(registrantURL.equals(correct_registrantURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Claims
		HomePage.Claims(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String claimURL = driver.getCurrentUrl();
		String correct_claimURL = "https://dev.ri-claims.bc.smartrecycling.ca/claim/list/";
		if(claimURL.equals(correct_claimURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Reports
		HomePage.Reports(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		
		//Addresses
		HomePage.Addresses(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String addressURL = driver.getCurrentUrl();
		String correct_addressURL = "https://dev.ri-claims.bc.smartrecycling.ca/address/list/";
		if(addressURL.equals(correct_addressURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Brokers
		HomePage.Brokers(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String brokerURL = driver.getCurrentUrl();
		String correct_brokerURL = "https://dev.ri-claims.bc.smartrecycling.ca/broker/list";
		if(brokerURL.equals(correct_brokerURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Claim Detail Approved
		HomePage.ClaimDetailsApproved(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String claimDetailApprovedURL = driver.getCurrentUrl();
		String correct_claimDetailApprovedURL = "https://dev.ri-claims.bc.smartrecycling.ca/claim/detail/report/approved";
		if(claimDetailApprovedURL.equals(correct_claimDetailApprovedURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Claim Details
		HomePage.ClaimDetails(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String claimDetailURL = driver.getCurrentUrl();
		String correct_claimDetailURL = "https://dev.ri-claims.bc.smartrecycling.ca/claim/detail/report";
		if(claimDetailURL.equals(correct_claimDetailURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Claims Approved
		HomePage.ClaimsApproved(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String claimApprovedURL = driver.getCurrentUrl();
		String correct_claimApprovedURL = "https://dev.ri-claims.bc.smartrecycling.ca/claim/list/status/3";
		if(claimApprovedURL.equals(correct_claimApprovedURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Claims By Registrant
		HomePage.ClaimsByRegistrant(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String claimByRegistrantURL = driver.getCurrentUrl();
		String correct_claimByRegistrantURL = "https://dev.ri-claims.bc.smartrecycling.ca/claim/list/registrant";
		if(claimByRegistrantURL.equals(correct_claimByRegistrantURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Claims On Hold
		HomePage.ClaimsOnHold(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String claimOnHoldURL = driver.getCurrentUrl();
		String correct_claimOnHoldURL = "https://dev.ri-claims.bc.smartrecycling.ca/claim/list/status/5";
		if(claimOnHoldURL.equals(correct_claimOnHoldURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Claims Received
		HomePage.ClaimsReceived(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String claimReceivedURL = driver.getCurrentUrl();
		String correct_claimReceivedURL = "https://dev.ri-claims.bc.smartrecycling.ca/claim/list/status/1";
		if(claimReceivedURL.equals(correct_claimReceivedURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Claims Reviewed
		HomePage.ClaimsReviewed(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String claimReviewedURL = driver.getCurrentUrl();
		String correct_claimReviewedURL = "https://dev.ri-claims.bc.smartrecycling.ca/claim/list/status/2";
		if(claimReviewedURL.equals(correct_claimReviewedURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Claims Deleted
		HomePage.ClaimsDeleted(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String claimDeleteURL = driver.getCurrentUrl();
		String correct_claimDeleteURL = "https://dev.ri-claims.bc.smartrecycling.ca/claim/list/deleted";
		if(claimDeleteURL.equals(correct_claimDeleteURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Collectors
		HomePage.Collectors(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String collectorURL = driver.getCurrentUrl();
		String correct_collectorURL = "https://dev.ri-claims.bc.smartrecycling.ca/registrant/list/type/1";
		if(collectorURL.equals(correct_collectorURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Contacts
		HomePage.Contacts(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String contactURL = driver.getCurrentUrl();
		String correct_contactURL = "https://dev.ri-claims.bc.smartrecycling.ca/contact/list/";
		if(contactURL.equals(correct_contactURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Incentives
		HomePage.Incentives(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String incentiveURL = driver.getCurrentUrl();
		String correct_incentiveURL = "https://dev.ri-claims.bc.smartrecycling.ca/incentive/list";
		if(incentiveURL.equals(correct_incentiveURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Notes
		HomePage.Notes(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String noteURL = driver.getCurrentUrl();
		String correct_noteURL = "https://dev.ri-claims.bc.smartrecycling.ca/note/list/";
		if(noteURL.equals(correct_noteURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Payment Schedules
		HomePage.PaymentSchedules(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String paymentScheduleURL = driver.getCurrentUrl();
		String correct_paymentScheduleURL = "https://dev.ri-claims.bc.smartrecycling.ca/payment/schedule/list";
		if(paymentScheduleURL.equals(correct_paymentScheduleURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Processors
		HomePage.Processors(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String processorURL = driver.getCurrentUrl();
		String correct_processorURL = "https://dev.ri-claims.bc.smartrecycling.ca/registrant/list/type/2";
		if(processorURL.equals(correct_processorURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Registrants By Letter
		HomePage.RegistrantsByLetter(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String registrantByLetterURL = driver.getCurrentUrl();
		String correct_registrantByLetterURL = "https://dev.ri-claims.bc.smartrecycling.ca/registrant/list/renewal-letter/";
		if(registrantByLetterURL.equals(correct_registrantByLetterURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Registrants By Material
		HomePage.RegistrantsByMaterial(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String registrantByMaterialURL = driver.getCurrentUrl();
		String correct_registrantByMaterualURL = "https://dev.ri-claims.bc.smartrecycling.ca/registrant/list/material-type/";
		if(registrantByMaterialURL.equals(correct_registrantByMaterualURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Registrants By Zone
		HomePage.RegistrantsByZone(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String registrantByZoneURL = driver.getCurrentUrl();
		String correct_registrantByZoneURL = "https://dev.ri-claims.bc.smartrecycling.ca/registrant/list/zone/";
		if(registrantByZoneURL.equals(correct_registrantByZoneURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		//Tickets
		HomePage.Tickets(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		row++;
		String ticketURL = driver.getCurrentUrl();
		String correct_ticketURL = "https://dev.ri-claims.bc.smartrecycling.ca/ticket/list/";
		if(ticketURL.equals(correct_ticketURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
		
		HomePage.Reports(driver).sendKeys(Keys.RETURN);
		
		//Ad-hoc Reports
		HomePage.Ad_hoc(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		
		//Amount Claimed
		HomePage.AmountClaimed(driver).sendKeys(Keys.RETURN);
		if(Constant.demo.equals("on")) {
			Thread.sleep(Constant.waitTime);
		}
		String amountClaimedURL = driver.getCurrentUrl();
		String correct_amountClaimedURL = "https://dev.ri-claims.bc.smartrecycling.ca/user/permission";
		if(amountClaimedURL.equals(correct_amountClaimedURL)) {
			//Output result
			Utility.setCellData("Pass!", row, col_result);
		}
		else {
			//Output result
			Utility.setCellData("Wrong URL!", row, col_result);
		}
	}
}
