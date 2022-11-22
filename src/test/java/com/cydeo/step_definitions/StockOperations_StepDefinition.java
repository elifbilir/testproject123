package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.SalesPage;
import com.cydeo.pages.StockOperationsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;

public class StockOperations_StepDefinition {


    LoginPage loginPage = new LoginPage();
    StockOperationsPage stockOperationsPage = new StockOperationsPage();
    WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(),2);



    @Given("user login to centrilli page")
    public void user_login_to_centrilli_page() {
        String url = ConfigurationReader.getProperty("cent-url");
        Driver.getDriver().get(url);
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(username, password);

        BrowserUtils.sleep(2);
    }
    @Given("user clicks on Inventory button")
    public void user_clicks_on_inventory_button(){
        webDriverWait.until(ExpectedConditions.visibilityOf(stockOperationsPage.ınventoryButton));
        stockOperationsPage.ınventoryButton.click();
        System.out.println("user click to ınventory button");
    }
    @Given("user have to click transfers button")
    public void user_have_to_click_transfers_button() {
        BrowserUtils.sleep(3);
        stockOperationsPage.transfersButton.click();
        System.out.println("user clicks to Transfers button");
    }
//=======================================================================  Background

    @When("user clicks on the Create button")
    public void user_clicks_on_the_create_button(){

        BrowserUtils.sleep(3);
        stockOperationsPage.createButton.click();
        System.out.println("Stock Operation create button is clicked");
    }

    @When("user types a new {string}")
    public void user_types_a_new(String string) {
        BrowserUtils.sleep(3);
        stockOperationsPage.createPartner.sendKeys(string);
        BrowserUtils.sleep(3);
        System.out.println("name types");
    }
    @When("user clicks on {string} on dropdown menu")
    public void user_clicks_on_on_dropdown_menu(String string) {
      BrowserUtils.sleep(4);
      stockOperationsPage.dropdownbutton.click();
        System.out.println("Dropdown button clicked");
    }
    @When("user clicks to operation type button")
    public void user_clicks_to_operation_type_button() {
        BrowserUtils.sleep(3);
        stockOperationsPage.operationtype.click();

    }
    @Then("user chooses first option")
    public void user_chooses_first_option() {
        BrowserUtils.sleep(3);
        stockOperationsPage.firstoption.click();

    }

    @When("user clicks on Additional information button")
    public void user_clicks_on_additional_information_button() {
        BrowserUtils.sleep(2);
     stockOperationsPage.additionalinfobutton.click();
        System.out.println("Additional info button clicked");
    }

    @Then("user clicks to edit button")
    public void user_clicks_to_edit_button() {
        BrowserUtils.sleep(4);
        stockOperationsPage.editbutton.click();
        System.out.println("edit button clicked");

    }



    @Then("user clicks to the Discard button")
    public void user_clicks_to_the_discard_button() {
        BrowserUtils.sleep(4);
       stockOperationsPage.discardbutton.click();
        System.out.println("Discard button clicked");
    }
    @Then("user clicks to Ok button")
    public void user_clicks_to_ok_button() {
        BrowserUtils.sleep(3);
        stockOperationsPage.okbutton.click();
        System.out.println("Ok button clicked");

    }
    @Then("user should land on Stock operation page")
    public void user_should_land_on_stock_operation_page() {
        String pageTitle = Driver.getDriver().getTitle();
        System.out.println("pageTitle = " + pageTitle);
        BrowserUtils.sleep(3);
        Assert.assertTrue(pageTitle.contains("Stock"));
        System.out.println("Stock Operation title is displayed");
    }

    @When("user is on the Transfers page")
    public void user_is_on_the_transfers_page() {
        BrowserUtils.sleep(2);
        stockOperationsPage.transferspage.isDisplayed();
        System.out.println("transfers page is displayed");

    }
    @When("user clicks to reference field")
    public void user_clicks_to_reference_field() {
      BrowserUtils.sleep(3);
      stockOperationsPage.referenceField.click();
        System.out.println("Reference clicked");
    }
    @When("user chooses first name on the list")
    public void user_chooses_first_name_on_the_list() {
        BrowserUtils.sleep(3);
        stockOperationsPage.firstnameonthelist.click();
        System.out.println("first name selected");
    }
    @When("user clicks to Priority field")
    public void user_clicks_to_priority_field() {
     BrowserUtils.sleep(3);
     stockOperationsPage.priorityField.click();
        System.out.println("Priority clicked");
    }
    @When("user chooses the Not Urgent option")
    public void user_chooses_the_not_urgent_option() {
    BrowserUtils.sleep(3);
    stockOperationsPage.notUrgent.click();
        System.out.println("Not Urgent has been chosen");
        BrowserUtils.sleep(3);
    }
    @Then("user verified that stock operations has been edited")
    public void user_verified_that_stock_operations_has_been_edited() {
       BrowserUtils.sleep(3);
       stockOperationsPage.writtenNotUrgent.isDisplayed();
        System.out.println("Edition has been completed");
    }

    @When("user is on the created customer page")
    public void user_is_on_the_created_customer_page() {
        BrowserUtils.sleep(2);
        stockOperationsPage.createdcustomerpage.isDisplayed();
        System.out.println("Created customer page is displayed");

    }
    @When("user clicks to Action button")
    public void user_clicks_to_action_button() {
    BrowserUtils.sleep(2);
    stockOperationsPage.actionbutton.click();
        System.out.println("Action button is clicked");

    }
    @Then("user clicks on Delete button")
    public void user_clicks_on_delete_button(){
        BrowserUtils.sleep(4);
        stockOperationsPage.deletebutton.click();
        System.out.println("Delete button clicked");

    }
    @Then("user should see the confirmation message")
    public void user_should_see_the_confirmation_message() {
    BrowserUtils.sleep(2);
     stockOperationsPage.confirmationmessage.isDisplayed();
        System.out.println("Confirmation message is displayed");
    }


    @And("user chooses a draft Stock Operation")
    public void userChoosesADraftStockOperation() {
        BrowserUtils.sleep(3);
        stockOperationsPage.yatutarsa.click();
        System.out.println("Tuttu");
    }

    @Then("user should see Stock Operation has been deleted")
    public void userShouldSeeStockOperationHasBeenDeleted() {
        System.out.println("Stock Operation has been deleted");
    }
}

