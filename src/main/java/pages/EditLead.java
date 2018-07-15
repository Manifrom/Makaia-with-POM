package pages;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.Reader.ReadExcel;
import lib.selenium.PreAndPost;
import pages.MyLeads;

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
	public void editLead(String fName, String cName) throws InterruptedException {
		
		new MyLeads(driver,test).clickFindLeads().typeFindFirstName(fName).clickFindLeadsButton().clickFoundLead()
		.clickEditButton().updateCompanyName(cName).clickUpdateButton();	
		
	}
	
}

