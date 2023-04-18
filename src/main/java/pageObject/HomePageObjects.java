package pageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;
public class HomePageObjects  extends TestBase{
	
	
	@FindBy(id = "nav_automobile")
	WebElement link_automobile;
	
	@FindBy(id = "nav_truck")
	WebElement link_truck;
	
	@FindBy(id = "nav_motorcycle")
	WebElement link_motorcycle;
	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	//for click on motorcycle link on homepage
	public void clickOnMotorCycleLink() {
		link_motorcycle.click();
	}
}
