package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class EnterInsurantDataPageObjects extends TestBase{
	@FindBy(id = "firstname")
	WebElement txt_firstname;
	
	@FindBy(id = "lastname")
	WebElement txt_lastname;
	
	@FindBy(id = "birthdate")
	WebElement date_birthdat;

	@FindBy(xpath = "//input[@name='Gender']/parent::label")
	List<WebElement> rdo_Gender;
	
	@FindBy(id = "country")
	WebElement dd_country;
	
	@FindBy(id = "zipcode")
	WebElement txt_zipcode;
	
	@FindBy(id = "city")
	WebElement txt_city;
	
	@FindBy(id = "occupation")
	WebElement dd_occupation;
	
	@FindBy(xpath = "//input[@name='Hobbies']/parent::label")
	List<WebElement> chk_hobbies;
	
	@FindBy(id = "website")
	WebElement txt_website;
	
	@FindBy(id = "open")
	WebElement btn_PictureOPenButton;
	
	@FindBy(id = "nextenterproductdata")
	WebElement btn_Next;
	
	public EnterInsurantDataPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
}
