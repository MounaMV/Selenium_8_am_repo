package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavanParameterTest {
@Test
public void demo() {
	String url = System.getProperty("url");
	String email = System.getProperty("email");
	String password = System.getProperty("password");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get(url);
	System.out.println(email);
	System.out.println(password);
}
}
