package com.cydeo.step_definitions;

import com.cydeo.pages.PointOfSalePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;


public class PointOfSale_StepDefinitions {

    PointOfSalePage pointOfSalePage = new PointOfSalePage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("user is logged in the application")
    public void user_is_logged_in_the_application() {

        Driver.getDriver().get(ConfigurationReader.getProperty("cent-url"));
        pointOfSalePage.login();
        BrowserUtils.sleep(3);

    }
    @When("user clicks the Point of Sale module")
    public void user_clicks_the_point_of_sale_module() {
        pointOfSalePage.pointOfSaleButton.click();
        BrowserUtils.sleep(1);
    }
    @When("user clicks the List button")
    public void user_clicks_the_list_button() {
        pointOfSalePage.listButton.click();
        BrowserUtils.sleep(1);
    }
    @When("user clicks the Create button")
    public void user_clicks_the_create_button() {
        pointOfSalePage.createButton.click();
        BrowserUtils.sleep(1);
    }
    @When("user enters the {string} in the name box")
    public void user_enters_the_in_the_name_box(String name) {
        pointOfSalePage.inputName.sendKeys(name);
        BrowserUtils.sleep(2);
        actions.moveToElement(pointOfSalePage.operationMessage).perform();
    }
    @When("user chooses the Operation Type")
    public void user_chooses_the_operation_type() {
       pointOfSalePage.operationType.click();
        BrowserUtils.sleep(1);

        pointOfSalePage.returnOperations.click();
        //BrowserUtils.sleep(2);
    }
    @Then("user clicks the Save button")
    public void user_clicks_the_save_button() {
        pointOfSalePage.saveButton.click();
    }

    @Then("user should see name as a title")
    public void userShouldSeeNameAsATitle() {
        System.out.println("title changed from NEW to = " + pointOfSalePage.titleNameChanged);
        Assert.assertTrue(pointOfSalePage.titleNameChanged.isDisplayed());
    }

    @Then("user clicks the Kanban button")
    public void userClicksTheKanbanButton() {
    pointOfSalePage.kanbanButton.click();
    Assert.assertTrue(pointOfSalePage.kanbanView.isDisplayed());
    }

    @And("user enters the random name in the box")
    public void userEntersTheRandomNameInTheBox() {
        pointOfSalePage.inputName.sendKeys("Random name" + Keys.ENTER);
        BrowserUtils.sleep(1);
    }

    @And("user clicks the Discard button")
    public void userClicksTheDiscardButton() {
        pointOfSalePage.discardButton.click();
        BrowserUtils.sleep(1);
    }

    @And("user clicks OK to the Warning popup message")
    public void userClicksOKToTheWarningPopupMessage() {
        pointOfSalePage.okWarningPopUp.click();
        BrowserUtils.sleep(1);
    }



    @Then("user is on the Point of Sale module")
    public void userIsOnThePointOfSaleModule() {
        Assert.assertTrue(pointOfSalePage.createButton.isDisplayed());
    }

    @And("user searches for {string} in the search box")
    public void userSearchesForInTheSearchBox(String searchName) {
        pointOfSalePage.searchBox.sendKeys(searchName + Keys.ENTER);
        BrowserUtils.sleep(1);
    }

    @And("user clicks the {string}")
    public void userClicksThe(String expectedName) {
        pointOfSalePage.expectedName.click();
        BrowserUtils.sleep(1);
    }

    @And("user clicks the Edit button")
    public void userClicksTheEditButton() {
        pointOfSalePage.editButton.click();
    }

    @And("user re-enters the {string} name")
    public void userReEntersTheName(String newName) {
        pointOfSalePage.editInputName.clear();
        BrowserUtils.sleep(1);
        pointOfSalePage.editInputName.sendKeys(newName);

    }
    @Then("user clicks the save button")
    public void userClicksTheSaveButton() {
        pointOfSalePage.saveAfterEditing.click();
    }


    @Then("user sees the The following fields are invalid error message")
    public void userSeesTheTheFollowingFieldsAreInvalidErrorMessage() {
        Assert.assertTrue(pointOfSalePage.invalidErrorMessage.isDisplayed());
    }

}