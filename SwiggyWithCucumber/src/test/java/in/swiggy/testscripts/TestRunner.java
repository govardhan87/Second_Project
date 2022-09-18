package in.swiggy.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "Features"
				, glue = "in.swiggy.testscripts"
				, tags = "@TC_101"
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
