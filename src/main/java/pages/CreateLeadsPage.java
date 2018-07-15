package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class CreateLeadsPage extends WebDriverServiceImpl{

	public CreateLeadsPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test =test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCompName;
	
	@FindBy(id="createLeadForm_firstName")
	WebElement eleFirstName;

	@FindBy(id="createLeadForm_lastName")
	WebElement eleLastName;

	@FindBy(className="smallSubmit")
	WebElement eleCreateLeadButton;

	public CreateLeadsPage typeCompanyName(String cName) {		
		type(eleCompName,cName);
		return this;
	}
	public CreateLeadsPage typeFirstName(String fName) {
		type(eleFirstName,fName);
		return this;
	}
	public CreateLeadsPage typeLastName(String lName) {
		
		type(eleLastName,lName);
		return this;
	}
	public CreateLeadsPage clickCreateLead() {
		
		click(eleCreateLeadButton);
		return new CreateLeadsPage(driver,test);
	}
	}
	

