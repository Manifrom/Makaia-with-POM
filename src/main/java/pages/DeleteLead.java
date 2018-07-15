package pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class DeleteLead extends PreAndPost {

	@BeforeTest
	public void setValue() {
		testCaseName="DeleteLead";
		testDesc="Deleting the existing Lead";
		nodeName="Lead";
		author="AbiDharan";
		excelFileName="DeleteLeadsPage";
		}
	
	@Test(dataProvider="UAT")
	public void deleteLead(String fName) throws InterruptedException {
		
		new MyLeads(driver,test).clickFindLeads().typeFindFirstName(fName).clickFindLeadsButton()
		.clickFoundLead().clickDeleteButton();
		
	}
}
