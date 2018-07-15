package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class FindLeadsPage extends WebDriverServiceImpl{

	String leadID;
	public FindLeadsPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test =test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//div[@class='x-form-element']/input)[14]")
	WebElement eleFindFirstName;
	
	@FindBy(xpath=" (//button[@class='x-btn-text'])[7]")
	WebElement eleFirstLeadsButton;
	
	@FindBy(xpath="(//div[@class='x-form-element']/input)[13]")
	WebElement eleFindLeadID;
	
	public FindLeadsPage typeFindFirstName(String fName) {
		
		type(eleFindFirstName,fName);
		return this;
	}
	public FindLeadsPage clickFindLeadsButton() {
		
		click(eleFirstLeadsButton);
		
		return this;
	}
	public ViewLeadsPage clickFoundLead() {
		
		leadID = getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		WebElement locatedElement = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(locatedElement);			
		return new ViewLeadsPage(driver,test);
	}
	public FindLeadsPage typeLeadID() {
		
		type(eleFindLeadID,leadID);
		return this;
	}
}
