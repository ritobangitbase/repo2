package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		//features="src/test/java/features/Login.feature",  //for specific feature file
				features="src/test/java/features",  //for all the feature files in a given package/folder. ideally this is used
				glue="stepDefinition", //path of package containing stepdefinition file 
				tags="@SanityTest", // for selective execution of specific tags
				monochrome= true,
				dryRun=true, // this will check whether all the test cases in feature file has its corresponding mapped step definition				
				plugin= {"pretty","html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cukes.xml",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"rerun:target/failed_scenarios.txt"} // Reporting in html, json, junit, extent report format & storing the failed test sceanrios in a text file
				)

public class TestRunnerTestNg extends AbstractTestNGCucumberTests{
		// This section enables parallel execution
		/*
		 * @Override
		 * 
		 * @DataProvider(parallel= true) public Object[][] scenarios() { return
		 * super.scenarios(); }
		 */
}
