package com.cydeo.step_definitions;

import com.cydeo.pages.CrmCustomersPage;
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

public class crmCustomers_StepDefinition {

    CrmCustomersPage crmCustomersPage=new CrmCustomersPage();
    SalesPage salesPage= new SalesPage();

    LoginPage loginPage=new LoginPage();



    @Given("user logins as Posmanager")
    public void user_logins_as_posmanager() {
        String url = ConfigurationReader.getProperty("cent-url");
        Driver.getDriver().get(url);
        String username = ConfigurationReader.getProperty("posmanagerusername");
        String password = ConfigurationReader.getProperty("posmanagerpassword");
        loginPage.login(username, password);

        BrowserUtils.sleep(2);
    }


    @Given("user clicks on CRM button")
    public void user_clicks_on_crm_button() {
        BrowserUtils.sleep(2);
        crmCustomersPage.crmButton.click();
        BrowserUtils.sleep(3);
        System.out.println("CRM button is clicked");

    }

    @Given("user clicks on CRM Customers button")
    public void user_clicks_on_crm_customers_button() {
        crmCustomersPage.crmCustomersBtn.click();
        BrowserUtils.sleep(3);
        System.out.println("CRM/Customers button is clicked");

    }

    @When("user should discard changes by clicking Discard button")
    public void user_should_discard_changes_by_clicking_discard_button() {
        BrowserUtils.sleep(3);
        salesPage.discardButton.click();
        BrowserUtils.sleep(3);
        System.out.println("Discard button is clicked");

    }

    @Then("user should see the warning message written changes will be discarded")
    public void user_should_see_the_warning_message_written_changes_will_be_discarded() {
        BrowserUtils.sleep(2);
        crmCustomersPage.discardWarningMsg.isDisplayed();
        System.out.println("Discard warning message is displayed");

    }

    @When("user clicks on the edit button")
    public void user_clicks_on_the_edit_button() {
      BrowserUtils.sleep(2);
      crmCustomersPage.editButton.click();
      System.out.println("Edit button is clicked");
    }

    @When("user types an {string}")
    public void user_types_an(String string) {
       BrowserUtils.sleep(2);
      crmCustomersPage.customerEmailField.sendKeys("ali@gmail.com"+ Keys.ENTER);
      BrowserUtils.sleep(2);
        System.out.println("Email was typed");


    }


    @Then("user should see the changes")
    public void user_should_see_the_changes() {
       BrowserUtils.sleep(2);
       CrmCustomersPage.customerEmail=crmCustomersPage.savedEmail.getText();
       Assert.assertTrue(CrmCustomersPage.customerEmail.contains("ali@gmail.com"));
        System.out.println("Customer profile was edited");
    }

    @When("user creates a new {string}")
    public void user_creates_a_new(String string) {
        crmCustomersPage.crmCustomersBtn.click();
        BrowserUtils.sleep(2);
        String customerNumber=salesPage.customerNumberField.getAttribute("innerHTML");
        BrowserUtils.sleep(2);
        System.out.println("customerNumber = " + customerNumber);
        SalesPage.numBforeCreation= Integer.parseInt(customerNumber);
        System.out.println(SalesPage.numBforeCreation);
        salesPage.customerCreateBtn.click();
        BrowserUtils.sleep(2);
        salesPage.nameField.sendKeys(string+Keys.ENTER);
        BrowserUtils.sleep(2);
        salesPage.saveButton.click();
    }



    @When("user sees Customer number increases one")
    public void user_sees_customer_number_increases_one() {
        crmCustomersPage.crmCustomersBtn.click();
        BrowserUtils.sleep(3);
        String increasedNumber=salesPage.customerNumberField.getAttribute("innerHTML");
        SalesPage.numAfterCreation=Integer.parseInt(increasedNumber);
        System.out.println(SalesPage.numAfterCreation);
        BrowserUtils.sleep(2);
        Assert.assertEquals(SalesPage.numAfterCreation, SalesPage.numBforeCreation + 1);

        System.out.println("Number increased 1" );
    }



    @When("user deletes the {string}")
    public void user_deletes_the(String string) {
        salesPage.searchField.sendKeys(string+Keys.ENTER);
        BrowserUtils.sleep(2);
        crmCustomersPage.custProfileField.click();
        BrowserUtils.sleep(2);
        crmCustomersPage.actionButton.click();
        BrowserUtils.sleep(2);
        crmCustomersPage.deleteButton.click();
        BrowserUtils.sleep(2);
        crmCustomersPage.okButton.click();
        System.out.println("Customer is deleted");

    }





    @Then("Customers number decreases one after the {string} is deleted")
    public void customers_number_decreases_one_after_the_is_deleted(String string) {
        BrowserUtils.sleep(2);
        crmCustomersPage.crmCustomersBtn.click();
        BrowserUtils.sleep(2);
        String customerNumber=salesPage.customerNumberField.getAttribute("innerHTML");
        BrowserUtils.sleep(2);
        System.out.println("customerNumber = " + customerNumber);
        SalesPage.numBforeCreation= Integer.parseInt(customerNumber);
        System.out.println("Customer number decreased to "+SalesPage.numBforeCreation);


    }


}
