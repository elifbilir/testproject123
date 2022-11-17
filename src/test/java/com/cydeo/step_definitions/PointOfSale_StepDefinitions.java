package com.cydeo.step_definitions;

import com.cydeo.pages.PointOfSale;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PointOfSale_StepDefinitions {

    PointOfSale pointOfSale = new PointOfSale();

    @Given("user is logged in the application")
    public void user_is_logged_in_the_application() {

        Driver.getDriver().get(ConfigurationReader.getProperty("cent-url"));
        pointOfSale.login();
        BrowserUtils.sleep(2);

    }
    @When("user clicks the Point of Sale module")
    public void user_clicks_the_point_of_sale_module() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks the List button")
    public void user_clicks_the_list_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks the Create button")
    public void user_clicks_the_create_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters the {string} in the name box")
    public void user_enters_the_in_the_name_box(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user chooses the Operation Type")
    public void user_chooses_the_operation_type() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user clicks the Save button")
    public void user_clicks_the_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("user clicks the Kanban button")
    public void userClicksTheKanbanButton() {

    }


    @And("user clicks OK to the Warning popup message")
    public void userClicksOKToTheWarningPopupMessage() {


    }


    @And("user clicks the Discard button")
    public void userClicksTheDiscardButton() {

    }

    @Then("user is on the Point of Sale module")
    public void userIsOnThePointOfSaleModule() {


    }

    @And("user searches for {string} in the search box")
    public void userSearchesForInTheSearchBox(String arg0) {


    }

    @And("user clicks the {string}")
    public void userClicksThe(String arg0) {


    }

    @And("user clicks the Edit button")
    public void userClicksTheEditButton() {


    }

    @And("user re-enters the {string} name")
    public void userReEntersTheName(String arg0) {


    }

    @Then("user sees the The following fields are invalid error message")
    public void userSeesTheTheFollowingFieldsAreInvalidErrorMessage() {


    }
}
