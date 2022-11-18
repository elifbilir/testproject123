package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.VehicleCostsPage;
import com.cydeo.pages.VendorBillsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class VendorBills_StepDefinition {

    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();
    VendorBillsPage vendorBillsPage = new VendorBillsPage();

    LoginPage loginPage=new LoginPage();


    @When("user is logged as POS Manager")
   public void  userIsLoggedAsPOSManager() {
        // Getting our login method to log in to web table app
        Driver.getDriver().get(ConfigurationReader.getProperty("cent-url"));

        //Calling our login method to log in to web table app
        vehicleCostsPage.login();
        BrowserUtils.waitFor(2);


    }

    @Given("user clicks on Purchases button")
    public void userClicksOnPurchasesButton(){
        vendorBillsPage.clickPurchaseButton();
        BrowserUtils.waitFor(2);
    }

    @Given("user clicks on Vendor Bills button")
    public void userClicksOnVendorBillsButton() {
        vendorBillsPage.clickVendorBillsButton();
        BrowserUtils.waitFor(1);
    }


    @When("user clicks on create button")
    public void userClicksOnCreateButton() {
        vendorBillsPage.createButton.click();
        BrowserUtils.waitFor(1);
    }

    @And("user selects a vendor {string}")
    public void userSelectsA(String arg0) {
        vendorBillsPage.vendorDropdown.click();
        BrowserUtils.waitFor(1);
        vendorBillsPage.selectedVendor.click();
        BrowserUtils.waitFor(1);

    }

    @And("user enters a vendor reference {string}")
    public void userEnters(String arg0) {
        vendorBillsPage.vendorReference.sendKeys("POSManager"+ Keys.ENTER);
        BrowserUtils.waitFor(1);
    }


    @And("user selects a  bill date{string}")
    public void userSelectsABillDate(String arg0) {
        vendorBillsPage.billDate.sendKeys("11/20/2022"+Keys.ENTER);
        BrowserUtils.waitFor(1);
    }

    @And("user selects a due date {string}")
    public void userSelectsADueDate(String arg0) {
        vendorBillsPage.dueDate.sendKeys("11/25/2022"+Keys.ENTER);
        BrowserUtils.waitFor(1);
    }


    @Then("user clicks on save")
    public void userClicksOnSave() {

        vendorBillsPage.saveButton.click();
        BrowserUtils.waitFor(1);
    }


}