package reusableComponents;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;   

import com.aventstack.extentreports.Status;

import testbase.ObjectRepo;

public class ListnerImplementation extends ObjectRepo implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		//before each test case
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Case: "+result.getMethod().getMethodName()+ "is Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test Case: "+result.getMethod().getMethodName()+ "is Failed");
		test.log(Status.FAIL, result.getThrowable());
		
		
		String screenshotPath = CommonUtils.getCaptureFailedTestCaseScreenShot(driver);
		
		test.addScreenCaptureFromPath(screenshotPath, "Test case failure screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		//setup method call
		extent = ExtentSetup.setupExtentReport();
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
}
