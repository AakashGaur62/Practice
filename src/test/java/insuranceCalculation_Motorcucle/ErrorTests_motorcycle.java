package insuranceCalculation_Motorcucle;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import testbase.TestBase;

public class ErrorTests_motorcycle extends TestBase{
	
	 
	
	@Test
	public void errorMessage_PayLoadField() throws Exception {
		homepage.clickOnMotorCycleLink();
		//entering cylinder capacity
		vehData.enterCylinderCapacity("33333");
		test.log(Status.PASS, "Cylinder capacity is filled with data : ");
		String actualErrorMsg = vehData.getErrorMessageOnCylinderCapacity();
		String expectederrorMsg = "Must be a number between 1 and 2000";
		
		Assert.assertEquals(actualErrorMsg, expectederrorMsg, "Error Message is not expected on cylinder capacity field");
	}
	
	
	@Test
	public void errorMessage_PayLoadField1() throws Exception {
		homepage.clickOnMotorCycleLink();
		//entering cylinder capacity
		vehData.enterCylinderCapacity("33333");
		test.log(Status.PASS, "Cylinder capacity is filled with data : ");
		String actualErrorMsg = vehData.getErrorMessageOnCylinderCapacity();
		String expectederrorMsg = "Must be a number between 1 and 3000";
		
		Assert.assertEquals(actualErrorMsg, expectederrorMsg, "Error Message is not expected on cylinder capacity field");
	}
}
