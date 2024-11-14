package extentReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReport {
@Test
public void report() {
	//Step 1:create an instance of ExtentSparkReporter
	ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_Report/extentReport.html");
	
	//Step 2:create an instance of ExtentReports
	ExtentReports extReport=new ExtentReports();
	
	//Step 3:attach an instance of ExtentSparkReporter to ExtentReports
	extReport.attachReporter(spark);
	
	//Step 4:create an instance of ExtentTest
	ExtentTest test = extReport.createTest("report");
	
	//Step 5:call log() to provide status and log message
	test.log(Status.PASS, "log message entered into extent report");
	
	//Step 6:call flush() to write message into report/destination
	extReport.flush();
	
}
}
