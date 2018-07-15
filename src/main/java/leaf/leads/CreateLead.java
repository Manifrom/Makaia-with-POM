package leaf.leads;

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
	public void createLead (String cName,String fName,String lName,
			String email,String phone){		
		click(locateElement("link", "Leads"));		
		click(locateElement("link", "Create Lead"));		
		type(locateElement("id", "createLeadForm_companyName"), cName);		
		type(locateElement("id", "createLeadForm_firstName"), fName);		
		type(locateElement("id", "createLeadForm_lastName"), lName);
		type(locateElement("id", "createLeadForm_primaryEmail"), email);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "");
		click(locateElement("class", "smallSubmit"));	
		
	}
	/*@DataProvider(name="UAT")
	public String[][] getData() throws IOException {
	ReadExcel excel=new ReadExcel();
	String[][] data = excel.readExcel();
	return data;
	}*/
	
	/*@DataProvider(name="TST",indices= {1})
	public String[][] getData() {
		String[][] data = new String[2][5];
		data[0][0] = "TestLeaf";
		data[0][1] = "sarath";
		data[0][2] = "M";
		data[0][3] = "Sarath@testLeaf.com";
		data[0][4] = "1234567890";
		
		data[1][0] = "TCS";
		data[1][1] = "govarathan";
		data[1][2] = "s";
		data[1][3] = "govarathan@TCS.com";
		data[1][4] = "9009000122";
		return data;
	}*/

}




