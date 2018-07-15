package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class DuplicateLeadsPage extends WebDriverServiceImpl{

	public DuplicateLeadsPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test =test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="createLeadForm_firstName")
	WebElement eleDuplicateName;
	
	@FindBy(xpath="//input[@class='smallSubmit']")
	WebElement eleDuplicateCreateLeadButton;
	
	public DuplicateLeadsPage typeDuplicateName(String duplicateName) {
		
		type(eleDuplicateName,duplicateName);
		return this;
	}
	public DuplicateLeadsPage clickDuplicateCreateLeadButton() {
		
		click(eleDuplicateCreateLeadButton);
		
		return new DuplicateLeadsPage(driver,test);
	}
	}
