package runners;

import org.basePackage.baseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/AutmateTest.feature", 
				 glue = "stepDefinitions",
				 publish = true,
				 plugin = { "pretty","junit:target/cucumber-reports.xml"},
				monochrome = true
				 
			
				 
				)

public class TestRunner extends baseClass {
	
	@BeforeClass
	public static void start() {
		Browserlaunch();
		
		maximise();
	}
	
	@AfterClass
	public static void end() {
		quit();
	}
}
