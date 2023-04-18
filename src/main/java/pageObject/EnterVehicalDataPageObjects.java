package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class EnterVehicalDataPageObjects extends TestBase{

	@FindBy(id = "make")
	WebElement dd_make;
	
	@FindBy(id = "model")
	WebElement dd_model;
	
	@FindBy(xpath = "//input[@id='cylindercapacity']")
	public WebElement txt_cylindercapacity;
	
	@FindBy(xpath = "//input[@id='cylindercapacity']/following-sibling::span[@class='error']")
	WebElement error_cylinderCapacity;
	
	@FindBy(id = "engineperformanece")
	WebElement txt_engineperformanece;
	
	@FindBy(id = "dateofmanufacture")
	WebElement date_dateofmanufacture;
	
	@FindBy(id = "numberofseats")
	WebElement dd_numbrtofseats;
	
	@FindBy(id = "listprice")
	WebElement txt_listprice;
	
	@FindBy(id = "annualmileage")
	WebElement txt_annualmileage;
	
	@FindBy(id = "nextenterinsurantdata")
	WebElement btn_Next;
	
	
	public EnterVehicalDataPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterCylinderCapacity(String cylinderCap) {
		txt_cylindercapacity.sendKeys(cylinderCap );
	}
	
	public String getErrorMessageOnCylinderCapacity() {
		return error_cylinderCapacity.getText();
		
	}
}
