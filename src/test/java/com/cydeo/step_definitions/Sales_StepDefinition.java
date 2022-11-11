package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.SalesPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sales_StepDefinition {

    LoginPage loginPage = new LoginPage();
    SalesPage salesPage = new SalesPage();



    WebDriverWait webDriverWait=new WebDriverWait(Driver.getDriver(), 20);

    @Given("As a SalesManager user login with valid email and password")
    public void as_a_sales_manager_user_login_with_valid_email_and_password() {
        String url = ConfigurationReader.getProperty("cent-url");
        Driver.getDriver().get(url);
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(username, password);

        BrowserUtils.sleep(2);
    }


    @Given("user clicks on Sales button")
    public void user_clicks_on_sales_button() {
        webDriverWait.until(ExpectedConditions.visibilityOf(salesPage.salesButton));
        salesPage.salesButton.click();
        System.out.println("sales button clicked");
    }

    @Given("user clicks on Customers button")
    public void user_clicks_on_customers_button() {
        salesPage.customersButton.click();
        BrowserUtils.sleep(3);
        System.out.println("customers button clicked");
    }

    @Given("user clicks on Create button")
    public void user_clicks_on_create_button()  {
        BrowserUtils.sleep(2);
        salesPage.customerCreateBtn.click();
        BrowserUtils.sleep(3);
        System.out.println("create button clicked");
    }

    @Given("user is on the Customers New page")
    public void user_is_on_the_customers_new_page() {
        String pageTitle = Driver.getDriver().getTitle();
        System.out.println("pageTitle = " + pageTitle);
        BrowserUtils.sleep(3);
        Assert.assertTrue(pageTitle.contains("New"));

    }

    @When("user types a {string}")
    public void user_types_a(String string) {
        BrowserUtils.sleep(3);
        salesPage.nameField.sendKeys(string);
        BrowserUtils.sleep(3);
        System.out.println("name types");
    }

    @Then("user clicks on the save button")
    public void user_clicks_on_the_save_button() {
        salesPage.saveButton.click();
        BrowserUtils.sleep(3);
        System.out.println("saved");
    }

    @Then("user should be able to create a new customer with the {string}")
    public void user_should_be_able_to_create_a_new_customer_with_the(String string) {
        String pageTitle = Driver.getDriver().getTitle();
        System.out.println("pageTitle = " + pageTitle);
        BrowserUtils.sleep(3);
        Assert.assertTrue(pageTitle.contains(string));
        System.out.println("verified");
    }





    @When("user click on save button to create a new customer without typing name")
    public void user_click_on_save_button_to_create_a_new_customer_without_typing_name() {
        BrowserUtils.sleep(3);
        salesPage.saveButton.click();
    }

    @Then("user should see the warning message written The following fields are invalid")
    public void user_should_see_the_warning_message_written_the_following_fields_are_invalid() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(salesPage.warningMessage.isDisplayed());
        System.out.println("warning message displayed");
    }


    @Then("user should cancel creating by clicking Discard button")
    public void user_should_cancel_creating_by_clicking_discard_button() {
     BrowserUtils.sleep(3);
     salesPage.discardButton.click();
     BrowserUtils.sleep(3);
     Assert.assertTrue(salesPage.discardWarningMessage.isDisplayed());
     System.out.println("discard warning message displayed");

    }

    @Then("user should see that the page title should be changed as new customer's {string}")
    public void user_should_see_that_the_page_title_should_be_changed_as_new_customer_s(String string) {
        BrowserUtils.sleep(3);
        String pageTitle= Driver.getDriver().getTitle();
        Assert.assertTrue(pageTitle.contains(string));
        System.out.println("Title is new customer's name");
    }




    @Then("user should see that Contact created message is displayed at the bottom of the page")
    public void user_should_see_that_contact_created_message_is_displayed_at_the_bottom_of_the_page() {
    BrowserUtils.sleep(3);
    salesPage.contactCreatedMsg.isDisplayed();
    System.out.println("Contact created message is displayed");
    }



    @When("user types the {string} into the search box")
    public void user_types_the_into_the_search_box(String string) {
        BrowserUtils.sleep(3);
        salesPage.searchField.sendKeys(string+ Keys.ENTER);
    }


    @Then("user should see the new created Customer {string} under Customers list")
    public void user_should_see_the_new_created_customer_under_customers_list(String string) {
    BrowserUtils.sleep(2);
    Assert.assertEquals(salesPage.newCreatedCustomerNameField.getText(), string);
    System.out.println("New created customer is under the list");

    }

    @When("user clicks List button")
    public void user_clicks_list_button() {
        BrowserUtils.sleep(2);
        salesPage.listfield.click();
    }


    @Then("verify that user can change Customers display from kanban to list")
    public void verify_that_user_can_change_customers_display_from_kanban_to_list() {
    BrowserUtils.sleep(2);
    salesPage.listNameField.isDisplayed();
    System.out.println("Name field is displayed under the List");
    }

    @When("user creates a customer")
    public void user_creates_a_customer() {
        salesPage.customersButton.click();
        BrowserUtils.sleep(2);
        String customerNumber=salesPage.customerNumberField.getAttribute("innerHTML");
        BrowserUtils.sleep(2);
        System.out.println("customerNumber = " + customerNumber);
        SalesPage.numBforeCreation= Integer.parseInt(customerNumber);
        System.out.println(SalesPage.numBforeCreation);
        salesPage.customerCreateBtn.click();
        BrowserUtils.sleep(2);
        salesPage.nameField.sendKeys("Ali"+Keys.ENTER);
        BrowserUtils.sleep(2);
        salesPage.saveButton.click();
    }


    @Then("user should see all Customers number increases one")
    public void user_should_see_all_customers_number_increases_one() {

        salesPage.customersButton.click();
        BrowserUtils.sleep(3);
        String increasedNumber=salesPage.customerNumberField.getAttribute("innerHTML");
        SalesPage.numAfterCreation=Integer.parseInt(increasedNumber);
        System.out.println(SalesPage.numAfterCreation);
        BrowserUtils.sleep(2);
        Assert.assertEquals(SalesPage.numAfterCreation, SalesPage.numBforeCreation + 1);

        System.out.println("Number increased 1" );
    }



}
