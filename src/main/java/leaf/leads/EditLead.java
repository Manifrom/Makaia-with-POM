package leaf.leads;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.Reader.ReadExcel;
import lib.selenium.PreAndPost;

public class EditLead extends PreAndPost {
	
	@BeforeTest
	public void setValue() {
		testCaseName="EditLead";
		testDesc="Edit the existing Lead";
		nodeName="Lead";
		author="AbiDharan";
		excelFileName="EditLead";
		}
	
	@Test(dataProvider="UAT")
	public void editLead(String cName,String fName) throws InterruptedException {
		
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Find Leads"));				
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), fName);
		click(locateElement("xpath", "//button[text()='Find Leads']"));		
		String leadID = getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("link", "Edit"));		
		type(locateElement("id", "updateLeadForm_companyName"), cName);
		click(locateElement("class", "smallSubmit"));
		click(locateElement("link", "Find Leads"));
		type(locateElement("xpath", "//input[@name='id']"), leadID);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		verifyPartialText(locateElement("id", "viewLead_companyName_sp"), cName);
			
	}
	/*@DataProvider(name="UAT")
	public String[][] getData() throws IOException {
		ReadExcel excel=new ReadExcel();
		String[][] data = excel.readExcel();
		return data;
	}*/
}

