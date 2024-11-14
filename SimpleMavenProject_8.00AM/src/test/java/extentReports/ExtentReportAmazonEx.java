package extentReports;

import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportAmazonEx {
	@Test
	public void screenshot() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		TakesScreenshot ts=(TakesScreenshot) driver;
		String photo = ts.getScreenshotAs(OutputType.BASE64);
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_Report/extentReport_"+timestamp+".html");
		ExtentReports extReport=new ExtentReports();
		extReport.attachReporter(spark);
		ExtentTest test=extReport.createTest("screenshot");
		test.log(Status.PASS, "Adding screenshot into Report");
		test.addScreenCaptureFromBase64String(photo);
		extReport.flush();
	}
	}


