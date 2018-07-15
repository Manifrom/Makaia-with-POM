package leaf.leads;

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
	public void duplicateLead(String email) throws InterruptedException {
		
		
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Find Leads"));		
		click(locateElement("xpath", "//span[text()='Email']"));
		type(locateElement("name", "emailAddress"), email);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		String leadName = getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));		
		click(locateElement("link", "Duplicate Lead"));
		type(locateElement("id", "createLeadForm_firstName"), leadName);
		click(locateElement("class", "smallSubmit"));		
		String leadID = getText(locateElement("id", "viewLead_companyName_sp")).replaceAll("\\D", "");
		click(locateElement("link", "Find Leads"));
		type(locateElement("xpath", "//input[@name='id']"), leadID);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);
		verifyExactText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"), "Gopi");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
