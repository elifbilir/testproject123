package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.VehiclemodelPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Vehiclemodel_StepDefinition {
    LoginPage loginPage = new LoginPage();
    VehiclemodelPage vehiclemodelPage = new VehiclemodelPage();

//
    @Given("user clicks Vehicle Model button")
    public void user_clicks_vehicle_model_button() {
        BrowserUtils.sleep(3);
        vehiclemodelPage.VehicleModelBtn.click();
        BrowserUtils.sleep(3);
    }

    @When("user click on create button")
    public void user_click_on_create_button() {
        vehiclemodelPage.CreateButton.click();
        BrowserUtils.sleep(3);

    }
    @And("user fill a model name field")
    public void userFillAModelNameField() {
        vehiclemodelPage.modelname.sendKeys("Tesla");
        BrowserUtils.sleep(3);
    }

    @When("user select a make")
    public void user_select_a_make() throws InterruptedException {
        BrowserUtils.sleep(3);
        vehiclemodelPage.selectMake.click();
        Thread.sleep(2000);
    }

    @Then("click on the save")
    public void click_on_the_save() {
        vehiclemodelPage.Savebutton.click();
        BrowserUtils.sleep(3);
    }

    @When("user clicks Vehicle Model button button")
    public void userClicksVehicleModelButtonButton() {
        BrowserUtils.sleep(3);
        vehiclemodelPage.VehicleModelBtn.click();
        BrowserUtils.sleep(3);
    }

    @And("user click on the create button")
    public void userClickOnTheCreateButton() {
        vehiclemodelPage.CreateButton.click();
        BrowserUtils.sleep(3);
    }

    @And("user click save button")
    public void userClickSaveButton() {
        vehiclemodelPage.Savebutton.click();
        BrowserUtils.sleep(3);
    }

    @Then("user should see error message")
    public void userShouldSeeErrorMessage() {
        BrowserUtils.sleep(3);
        vehiclemodelPage.errorMessage.isDisplayed();
        vehiclemodelPage.errorMessage.isDisplayed();
        Assert.assertTrue(vehiclemodelPage.errorMessage.isDisplayed());
    }

    @And("user fill in a model name field")
    public void userFillInAModelNameField() {
        vehiclemodelPage.modelname.sendKeys("ABCD");
        BrowserUtils.sleep(3);
    }

    @And("user fill in a make field")
    public void userFillInAMakeField() throws InterruptedException {
        vehiclemodelPage.selectMake.click();
        BrowserUtils.sleep(3);
        WebElement Tesla= Driver.getDriver().findElement(By.linkText("ABCD"));
        Tesla.click();

    }
    @And("user click on the save button")
    public void userClickOnTheSaveButton() {
        vehiclemodelPage.Savebutton.click();
        BrowserUtils.sleep(3);
    }

    @Then("user should see Attachment button at the top of the page")
    public void userShouldSeeAttachmentButtonAtTheTopOfThePage() {
        BrowserUtils.sleep(3);
        vehiclemodelPage.attachmentBtn.isDisplayed();
        BrowserUtils.sleep(3);
        Assert.assertTrue(vehiclemodelPage.attachmentBtn.isDisplayed());
    }

    @Then("user should see Action button at the top of the page")
    public void userShouldSeeActionButtonAtTheTopOfThePage() {
        BrowserUtils.sleep(3);
        vehiclemodelPage.actionBtn.isDisplayed();
        BrowserUtils.sleep(3);
        Assert.assertTrue(vehiclemodelPage.actionBtn.isDisplayed());
    }

    @And("user fill {string} to the search box and hit the enter key")
    public void userFillToTheSearchBoxAndHitTheEnterKey(String string ) {
        BrowserUtils.sleep(3);
        vehiclemodelPage.searchbox.sendKeys(string + Keys.ENTER);
        BrowserUtils.sleep(3);
    }

    @Then("user should see the new created Vehicle Model value")
    public void userShouldSeeTheNewCreatedVehicleModelValue() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(vehiclemodelPage.ABCDbutton.isDisplayed());
    }

    @When("user click Make button")
    public void userClickMakeButton() {
        BrowserUtils.sleep(3);
        vehiclemodelPage.MakeButton.click();
        BrowserUtils.sleep(3);
    }

    @And("user click on the right and left arrow")
    public void userClickOnTheRightAndLeftArrow() {
        vehiclemodelPage.RightArrow.click();
        BrowserUtils.sleep(3);
        vehiclemodelPage.LeftArrow.click();
        BrowserUtils.sleep(3);
    }

    @Then("user should see changed page number")
    public void userShouldSeeChangedPageNumber() {
        BrowserUtils.sleep(3);
        //vehiclemodelPage.pageNumber.isDisplayed();
        BrowserUtils.sleep(3);
        // Assert.assertTrue(vehiclemodelPage.pageNumber.isDisplayed());
    }

    @When("user create Vehicle Model number")
    public void userCreateVehicleModelNumber() {
        BrowserUtils.sleep(3);
        vehiclemodelPage.modelMakeVehbtn.click();
        BrowserUtils.sleep(3);
        String customernum=vehiclemodelPage.customerNumber.getAttribute("innerHTLM");
        BrowserUtils.sleep(3);
        System.out.println("customernum = " + customernum);
        vehiclemodelPage.numberBefore= Integer.parseInt(customernum);
        System.out.println(vehiclemodelPage.numberBefore);
        vehiclemodelPage.modelMakeCreatebtn.click();
        BrowserUtils.sleep(2);
        vehiclemodelPage.modelMakeSearch.sendKeys("Tesla"+Keys.ENTER);
        BrowserUtils.sleep(2);
        vehiclemodelPage.modelMakeSavebtn.click();

    }

    @Then("user should see number of Vehicle Models increased one")
    public void userShouldSeeNumberOfVehicleModelsIncreasedOne() {
        BrowserUtils.sleep(3);
        vehiclemodelPage.modelMakeVehbtn.click();
        BrowserUtils.sleep(3);
        String increasedNumber = vehiclemodelPage.customerNumber.getAttribute("innerHTML");
        vehiclemodelPage.numberAfter = Integer.parseInt(increasedNumber);
        System.out.println(vehiclemodelPage.numberAfter);
        BrowserUtils.sleep(2);
        Assert.assertEquals(vehiclemodelPage.numberAfter, vehiclemodelPage.numberBefore + 1);
        System.out.println("Number increased 1 ");
    }

    @When("user enter Make button")
    public void userEnterMakeButton() {
    }
}


