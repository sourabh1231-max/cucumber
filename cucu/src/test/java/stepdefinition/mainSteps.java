package stepdefinition;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSteps {

	
@Given("User goes to site")
public void user_goes_to_site() {
System.out.print("going to site**********************");
}
@When("User enters the URL")
public void user_enters_the_url() {
System.out.print("first thing to run*************************");
}	


@Given("User is on netbanking landing page")
public void user_is_on_netbanking_landing_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("User is on  Landing Page testing ");
	
}
@When("^User login into application with User \"(.*)\" and password \"(.*)\"$")
public void user_login_into_application_with_User_and_password(String Username, String password) {
    System.out.println(Username + " and password is " + password);
}


@Then("Homepage is displayed")
public void homepage_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
	System.out.print("User is on Home Page testing");
	
}
@Then("Cards are displayed")
public void cards_are_displayed() {
    // Write code here that turns the phrase above into concrete actions
	System.out.print("Cards are displayed testing");

}
	
@When("User sign up on application")
	public void user_sign_up_on_application(List<String> data) {
	    System.out.println(data.get(0));
	    System.out.println(data.get(1));
	    System.out.println(data.get(2));
	    
}
}