package reusableComponents;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testbase.ObjectRepo;

public class ExtentSetup extends ObjectRepo{
	public static ExtentReports setupExtentReport() {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date date = new Date();
		String actualDate = format.format(date);
		
		String reportPath = System.getProperty("user.dir")+
				"/Reports/ExecutionReport_"+actualDate+".html";
		
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(reportPath);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReport);
		
		sparkReport.config().setDocumentTitle("Entent Report");
		sparkReport.config().setTheme(Theme.DARK);
		sparkReport.config().setReportName("Aakash Gaur");
		 
		return extent;
	}
}
