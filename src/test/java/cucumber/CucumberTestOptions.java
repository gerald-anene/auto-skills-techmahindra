package cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		glue = {"cucumber.stepdefs"},
		features = {"src/test/java/cucumber/features"})

public class CucumberTestOptions {

	@BeforeClass
	public static void setUp(){
		
	}

	@AfterClass
	public static void tearDown(){
		
	}
	
}

