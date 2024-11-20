package jenkinparametertest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsParameterTest {
@Test
public void receiveparameter() {
	String value = System.getProperty("browsere");
	Reporter.log(value,true);
	
}
}
