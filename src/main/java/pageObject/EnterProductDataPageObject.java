package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class EnterProductDataPageObject extends TestBase {
	
	@FindBy(id = "insurancesum")
	WebElement dd_insurancesum;
	
	@FindBy(id = "damageinsurance")
	WebElement dd_damageinsurance;
	
	@FindBy(id = "//input[@name='Optional Products[]']/parent::label")
	List<WebElement> chk_OPtionalProducts;
	
	@FindBy(id = "nextselectpriceoption")
	WebElement btn_Next;
	
	public EnterProductDataPageObject() {
		PageFactory.initElements(driver, this);
	}
}
