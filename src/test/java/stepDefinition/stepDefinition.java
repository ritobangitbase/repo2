package stepDefinition;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.runner.RunWith;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class) //This is optional
public class stepDefinition {

	// Codes for BACKGROUND
	
	/*
	 * @Given("^validate the browser$") public void validate_the_browser() throws
	 * Throwable { System.out.println("validate the browser Background"); }
	 * 
	 * @When("^browser is launched$") public void browser_is_launched() throws
	 * Throwable { System.out.println("browser is launched Background"); }
	 * 
	 * @Then("^hit the url$") public void hit_the_url() throws Throwable {
	 * System.out.println("hit the url Background"); }
	 */
	 
	
	 	@Given("^User is on Home Page$")
	    public void user_is_on_home_page() throws Throwable {
	        System.out.println("Home");
	    }

		/*
		 * @When("^User provides search text$") public void user_provides_search_text()
		 * throws Throwable { System.out.println("Search"); }
		 */
	    
	    @When("^User provides search text \"([^\"]*)\"$")
	    public void user_provides_search_text_something(String strArg1) throws Throwable {
	    	System.out.println(strArg1);
	    }
	    
	    @When("^User provides the details$")
	    public void user_provides_the_details(DataTable data) throws Throwable {
	      List<List<String>> obj=  data.asLists();
	      System.out.println(obj.get(0).get(0));
	      System.out.println(obj.get(0).get(1));
	      System.out.println(obj.get(0).get(2));
	      /*obj.get(0).get(0);
	      obj.get(0).get(1);
	      obj.get(0).get(2);*/
	    }
	    
	    @When("^User provides the (.+) and (.+)$")
	    public void user_provides_the_and(String search1, String search2) throws Throwable {
	    	System.out.println(search1);
	    	System.out.println(search2);
	    	//Assert.assertNotEquals(true, false);
	    	assertEquals("expectedResult", "result");
	    }

	    @Then("^Search result is displayed$")
	    public void search_result_is_displayed() throws Throwable {
	    	System.out.println("Search result");
	    }

	    @And("^Clicks on Enter$")
	    public void clicks_on_enter() throws Throwable {
	    	System.out.println("Enter click");
	    }
}
