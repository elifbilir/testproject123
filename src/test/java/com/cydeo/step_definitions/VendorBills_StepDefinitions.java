package com.cydeo.step_definitions;

import com.cydeo.pages.VehicleCostsPage;
import com.cydeo.pages.VehiclemodelPage;
import com.cydeo.pages.VendorBillsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hr.Kad;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class VendorBills_StepDefinitions {

    VehicleCostsPage vehicleCostsPage=new VehicleCostsPage();
    VendorBillsPage vendorBillsPage=new VendorBillsPage();
    @Given("user is logged as POS Manager")
    public void userIsLoggedAsPOSManager() {
        // Getting our login method to log in to web table app
        Driver.getDriver().get("https://qa.centrilli.com");

        //Calling our login method to log in to web table app
       vehicleCostsPage.login();
        BrowserUtils.waitFor(2);
    }

    @Given("user clicks on Purchases button")
    public void userClicksOnPurchasesButton() {
        vendorBillsPage.clickPurchaseButton();
        BrowserUtils.waitFor(2);

    }

    @Given("user clicks on Vendor Bills button")
    public void userClicksOnVendorBillsButton() {
        vendorBillsPage.clickVendorBillsButton();
        BrowserUtils.waitFor(2);

    }


    @When("user clicks on create button")
    public void userClicksOnCreateButton() {
        vendorBillsPage.createButton.click();
        BrowserUtils.waitFor(1);

    }

    @And("user selects a vendor {string}")
    public void userSelectsAVendor(String arg0) {
        vendorBillsPage.vendorDropdown.click();
        BrowserUtils.waitFor(1);
        vendorBillsPage.selectedVendor.click();
        BrowserUtils.waitFor(1);
    }

    @And("user enters a vendor reference {string}")
    public void userEntersAVendorReference(String arg0) {
        vendorBillsPage.vendorReference.sendKeys("posmanager"+ Keys.ENTER);
        BrowserUtils.waitFor(1);
    }

    @And("user selects a  bill date{string}")
    public void userSelectsABillDate(String arg0) {
        vendorBillsPage.billDate.sendKeys("11/25/2022"+Keys.ENTER);
        BrowserUtils.waitFor(1);
    }

    @And("user selects a due date {string}")
    public void userSelectsADueDate(String arg0) {
        vendorBillsPage.dueDate.sendKeys("11/27/2022"+Keys.ENTER);
        BrowserUtils.waitFor(1);
    }

    @Then("user clicks on save")
    public void userClicksOnSave() {
        vendorBillsPage.saveButton.click();
        BrowserUtils.waitFor(1);
    }

    @Then("warning message is displayed")
    public void warningMessageIsDisplayed() {
        Driver.getDriver().getWindowHandles();
        vendorBillsPage.warningMessage.isDisplayed();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(vendorBillsPage.warningMessage.isDisplayed());
    }

    @When("user clicks on kanban  button")
    public void userClicksOnKanbanButton() {
        BrowserUtils.waitFor(2);
        vendorBillsPage.kanban.click();
        BrowserUtils.waitFor(2);

        String currentUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);


    }

    @When("user clicks on list  button")
    public void userClicksOnListButton() {
        BrowserUtils.waitFor(2);
        vendorBillsPage.list.click();
        BrowserUtils.waitFor(2);

        String currentUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

    }


    @Then("vendor bills are displayed in {string} view")
    public void vendorBillsAreDisplayedInView(String arg0) {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        BrowserUtils.sleep(2);
       Assert.assertTrue(currentUrl.contains(arg0));
        BrowserUtils.sleep(2);
    }

    @And("confirmation message is displayed")
    public void confirmationMessageIsDisplayed() {
        Driver.getDriver().getWindowHandles();
        vendorBillsPage.discardConfirmationMessage.isDisplayed();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(vendorBillsPage.discardConfirmationMessage.isDisplayed());

    }

    @And("user clicks ok button")
    public void userClicksOkButton() {
        vendorBillsPage.okToDiscard.click();
        BrowserUtils.waitFor(1);
    }

    @Then("user is back to Vendor Bills page")
    public void userIsBackToVendorBillsPage() {

        String currentTitle=Driver.getDriver().getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String expectedTitle="Vendor Bills - Odoo";
        System.out.println("expectedTitle = " + expectedTitle);

        Assert.assertEquals(expectedTitle,currentTitle);
    }

    @And("vendor bill is created and displayed on vendor bill page")
    public void vendorBillIsCreatedAndDisplayedOnVendorBillPage() {
       Assert.assertTrue(vendorBillsPage.draftBill.isDisplayed());
       BrowserUtils.waitFor(1);

    }

    @And("user clicks save")
    public void userClicksSave() {
        vendorBillsPage.saveButton.click();
        BrowserUtils.waitFor(1);
    }

    @And("user clicks edit button")
    public void userClicksEditButton() {
        vendorBillsPage.editButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("user can make changes on the bill")
    public void userCanMakeChangesOnTheBill() {
        vendorBillsPage.vendorReference.clear();
        vendorBillsPage.vendorReference.sendKeys("Elif"+Keys.ENTER);
       BrowserUtils.waitFor(2);

    }

    @And("user click vendor bills button")
    public void userClickVendorBillsButton() {
        vendorBillsPage.vendorBillsButton.click();
        BrowserUtils.waitFor(1);
    }

    @And("user selects a vendor bill")
    public void userSelectsAVendorBill() {
        vendorBillsPage.checkBox.click();
        BrowserUtils.waitFor(1);


    }

    @And("action and print buttons are displayed")
    public void actionAndPrintButtonsAreDisplayed() {

        Assert.assertTrue(vendorBillsPage.printAndAction.isDisplayed());
        BrowserUtils.waitFor(1);


    }


    @And("user clicks action button")
    public void userClicksActionButton() {
        vendorBillsPage.action.click();
        BrowserUtils.waitFor(2);
    }


    @And("user clicks on delete button")
    public void userClicksOnDeleteButton() {
        vendorBillsPage.delete.click();
        BrowserUtils.waitFor(1);
    }


    @And("user clicks OK button")
    public void userClicksOKButton() {
        String vendorBillNumber1 = vendorBillsPage.billNumber.getAttribute("innerHTML");
        BrowserUtils.waitFor(2);
        System.out.println("vendorBillNumber1 = " + vendorBillNumber1);
        VendorBillsPage.billNumBeforeDelete= Integer.parseInt(vendorBillNumber1);
        System.out.println(VendorBillsPage.billNumBeforeDelete);
        vendorBillsPage.deleteOk.click();
        BrowserUtils.waitFor(1);
    }


    @Then("selected vendor bill is deleted")
    public void selectedVendorBillIsDeleted() {

        String vendorBillNumber2 = vendorBillsPage.billNumber.getAttribute("innerHTML");
        System.out.println("vendorBillNumber2 = " + vendorBillNumber2);

        VendorBillsPage.billNumAfterDelete = Integer.parseInt(vendorBillNumber2);
        System.out.println(VendorBillsPage.billNumAfterDelete);
        BrowserUtils.waitFor(2);

        Assert.assertEquals(VendorBillsPage.billNumBeforeDelete-1, VendorBillsPage.billNumAfterDelete);
        System.out.println("Number decreased 1");

    }




}
