package pages;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.Reader.ReadExcel;
import lib.selenium.PreAndPost;

public class CreateLead extends PreAndPost{

	@BeforeTest
	public void setValue() {
		testCaseName="CreateLead";
		testDesc="Create a New Lead";
		nodeName="Lead";
		author="AbiDharan";
		excelFileName="CreateLead";
		
	}
	@Test(dataProvider="UAT")
	public void createLead (String cName,String fName,String lName){		
		
		new MyLeads(driver, test).clickCreateLeads().typeCompanyName(cName).typeFirstName(fName).typeLastName(lName).clickCreateLead();
		
		
	}
		
	
	
}




