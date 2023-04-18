package testbase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObject.EnterVehicalDataPageObjects;
import pageObject.HomePageObjects;

public class ObjectRepo {
	public static WebDriver driver;
	
	public static HomePageObjects homepage;
	public static EnterVehicalDataPageObjects vehData;
	
	public static ExtentReports extent;
	public static ExtentTest test;
}
