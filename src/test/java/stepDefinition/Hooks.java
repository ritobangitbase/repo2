package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before("@SanityTest")
	public void BeforeSanity() {
		System.out.println("Before Sanity");
	}
	
	@After("@SanityTest")
	public void AfterSanity() {
		System.out.println("After Sanity");
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario)
	{
		if(scenario.isFailed())
			System.out.println("Failed Screenshot");
			
	}
}
