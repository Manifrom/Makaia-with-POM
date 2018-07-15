package pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class DuplicateLead extends PreAndPost {

	@BeforeTest
	public void setValue() {
		testCaseName="DuplicateLead";
		testDesc="Duplicating the leads";
		nodeName="Lead";
		author="AbiDharan";
		excelFileName="DuplicateLead";
		}
	
	@Test(dataProvider="UAT")
	public void duplicateLead(String fName, String duplicateName) throws InterruptedException {
		
		
		new MyLeads(driver,test).clickFindLeads().typeFindFirstName(fName).clickFindLeadsButton()
		.clickFoundLead().clickDuplicateButton().typeDuplicateName(duplicateName).clickDuplicateCreateLeadButton();
		
	
	}
}
