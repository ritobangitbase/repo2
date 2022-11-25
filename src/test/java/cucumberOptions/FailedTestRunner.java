package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
				features="@target/failed_scenarios.txt",  //for executing only the failed scenarios
				glue="stepDefinition", //path of package containing stepdefinition file 
				dryRun=true, // this will check whether all the test cases in feature file has its corresponding mapped step definition				
				plugin= {"pretty","html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cukes.xml",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} // Reporting in html, json, junit, extent report format & storing the failed test sceanrios in a text file
				)

public class FailedTestRunner extends AbstractTestNGCucumberTests{
		// This section enables parallel execution
		@Override
		@DataProvider(parallel= true)
		public Object[][] scenarios()  
		{
			return super.scenarios();
		}
}
