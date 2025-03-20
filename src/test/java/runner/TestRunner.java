package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue= {"utility","stepDefinition"},
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:target/cucumber-html-report.html","json:cucumber.json"},	
		tags = "@tag1 or @tag2"
		
		
		
		
)
public class TestRunner {

}
