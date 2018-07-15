package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class ViewLeadsPage extends WebDriverServiceImpl{

	public ViewLeadsPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test =test;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@class='subMenuButton'])[3]")
	WebElement eleEditButton;
	
	@FindBy(xpath="//a[@class='subMenuButtonDangerous']")
	WebElement eleDeleteButton;
	
	@FindBy(xpath="(//a[@class='subMenuButton'])")
	WebElement eleDuplicateButton;
	
	public EditLeadsPage clickEditButton() {
		
		click(eleEditButton);
		return new EditLeadsPage(driver,test);
	}
	public FindLeadsPage clickDeleteButton() {
		
		click(eleDeleteButton);
		return new FindLeadsPage(driver,test);
	}
	public  DuplicateLeadsPage clickDuplicateButton() {
		
		click(eleDuplicateButton);
		return new DuplicateLeadsPage (driver,test);
	}
	}
