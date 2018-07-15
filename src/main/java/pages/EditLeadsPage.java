package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class EditLeadsPage extends WebDriverServiceImpl{

	public EditLeadsPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test =test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="updateLeadForm_companyName")
	WebElement eleEditCompanyName;
	
	@FindBy(xpath="//input[@class='smallSubmit']")
	WebElement eleUpdateButton;
	
	public EditLeadsPage updateCompanyName(String cName) {
		//eleEditCompanyName.clear();
		type(eleEditCompanyName,cName);
		return this;
	}
	public EditLeadsPage clickUpdateButton() {
		
		click(eleUpdateButton);
		
		return new EditLeadsPage(driver,test);
	}
	}
