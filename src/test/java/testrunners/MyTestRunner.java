package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {
				"src/test/resources/appfeatures/loginpage.feature",
				"src/test/resources/appfeatures/category.feature"				
		},
		glue= {"stepdefinitions","apphooks"},
		monochrome=true,
		plugin= {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
		
		
		}
		)
public class MyTestRunner {
	
	

}


