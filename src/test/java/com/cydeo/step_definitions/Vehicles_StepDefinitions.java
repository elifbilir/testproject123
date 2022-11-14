package com.cydeo.step_definitions;

import com.cydeo.pages.VehicleCostsPage;
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

public class Vehicles_StepDefinitions {

    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();


    @Given(": user is already logged in and on main page")
    public void userIsAlreadyLoggedInAndOnMainPage() {

        // Getting our login method to log in to web table app
        Driver.getDriver().get(ConfigurationReader.getProperty("cent-url"));

        //Calling our login method to log in to web table app
        vehicleCostsPage.login();
        BrowserUtils.waitFor(2);
    }

    @When("user clicks on more button")
    public void userClicksOnMoreButton() {
        vehicleCostsPage.moreButton.click();
        BrowserUtils.waitFor(2);

    }

    @And("user clicks fleet button")
    public void userClicksFleetButton() {

        if (vehicleCostsPage.fleetButton.isDisplayed()) {
            vehicleCostsPage.fleetButton.click();
        } else {
            vehicleCostsPage.moreButton.click();
            vehicleCostsPage.fleetButton.click();
        }

        BrowserUtils.waitFor(2);
    }

    @And("user clicks Vehicle Costs button")
    public void userClicksVehicleCostsButton() {
        vehicleCostsPage.vehicleCostsButton.click();
        BrowserUtils.waitFor(2);
    }

    @And("user clicks create button")
    public void userClicksCreateButton() {
        vehicleCostsPage.createButton.click();
        BrowserUtils.waitFor(2);

    }

    @When("user sees the title New Odoo")
    public void user_sees_the_title_new_odoo() {

        String expectedTitle = "New - Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @And("user chooses a vehicle")
    public void userSelectsAVehicle() {
        vehicleCostsPage.vehicleDropdown.click();
        BrowserUtils.waitFor(2);
        WebElement audi = Driver.getDriver().findElement(By.linkText("Audi/A1/"));
        audi.click();

    }


    @And("user selects a type")
    public void userSelectsAType() {
        vehicleCostsPage.typeDropdown.click();
        BrowserUtils.waitFor(1);
        WebElement snowTires = Driver.getDriver().findElement(By.linkText("Snow tires"));
        snowTires.click();
        BrowserUtils.waitFor(1);
    }

    @And("user selects a date")
    public void userSelectsADate() {
        vehicleCostsPage.dateInput.sendKeys("11/02/2022");

    }

    @And("user enters total price")
    public void userEntersTotalPrice() {

        vehicleCostsPage.inputTotalPrice.clear();
        vehicleCostsPage.inputTotalPrice.sendKeys("100.00");
        BrowserUtils.waitFor(1);
    }

    @And("user enters cost description")
    public void userEntersCostDescription() {
        vehicleCostsPage.inputCostDescription.sendKeys("snow tires");
        BrowserUtils.waitFor(1);
    }


    @And("user clicks on save button")
    public void userClicksOnSaveButton() {
        vehicleCostsPage.saveButton.click();
        BrowserUtils.waitFor(2);
    }


    @Then("title is changed to {string} and new table is created")
    public void titleIsChangedToFrom(String vehicle) {

        Assert.assertTrue(vehicleCostsPage.title.isDisplayed());
        BrowserUtils.waitFor(2);

    }

    @Then("user sees These fields are invalid error message")
    public void userSeesTheseFieldsAreInvalidErrorMessage() {
        Driver.getDriver().getWindowHandles();
        vehicleCostsPage.warningMessage.isDisplayed();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(vehicleCostsPage.warningMessage.isDisplayed());

    }


    @And("user clicks on discard button")
    public void userClicksOnDiscardButton() {
        vehicleCostsPage.discardButton.click();
        BrowserUtils.waitFor(2);


    }

    @And("user sees warning message")
    public void userSeesWarningMessage() {
        vehicleCostsPage.warningMessage.isDisplayed();
        Assert.assertTrue(vehicleCostsPage.warningMessage.isDisplayed());
        BrowserUtils.waitFor(2);


    }

    @And("user clicks on ok button")
    public void userClicksOnOkButton() {
        vehicleCostsPage.okButton.click();
        BrowserUtils.waitFor(2);

    }

    @Then("user is back to vehicle costs page")
    public void userIsBackToVehicleCostsPage() {
        vehicleCostsPage.title.isDisplayed();
        BrowserUtils.waitFor(2);

    }

    @Then("user sees the title is vehicle costs")
    public void userSeesTheTitleIsVehicleCosts() {
        Assert.assertTrue(vehicleCostsPage.title.isDisplayed());
        BrowserUtils.waitFor(2);

    }

    @Then("title is changed to {string} - Odoo")
    public void titleIsChangedToOdoo(String string) {
        String title = Driver.getDriver().getTitle();
        System.out.println("title = " + title);

        BrowserUtils.sleep(2);
        Assert.assertTrue(title.contains(string));
        BrowserUtils.sleep(2);

    }


    @Then("user sees Attachments and Action buttons")
    public void userSeesAttachmentSAndActionButtons() {
        vehicleCostsPage.attachmentButton.isDisplayed();
        vehicleCostsPage.actionButton.isDisplayed();
        Assert.assertTrue(vehicleCostsPage.attachmentButton.isDisplayed());
        Assert.assertTrue(vehicleCostsPage.actionButton.isDisplayed());
    }

    @And("user writes the created vehicle type in the search box and search")
    public void userWritesTheCreatedVehicleTypeInTheSearchBoxAndSearch() {
        BrowserUtils.waitFor(2);
        vehicleCostsPage.vehicleCostsButton.click();
        BrowserUtils.waitFor(2);
        vehicleCostsPage.searchBox.sendKeys("Audi/A1" + Keys.ENTER);
        BrowserUtils.waitFor(2);

    }

    @Then("user sees the new created vehicle on the list")
    public void userSeesTheNewCreatedVehicleOnTheList() {

        vehicleCostsPage.audiButton.click();
        BrowserUtils.waitFor(2);

        String actualName = vehicleCostsPage.newAudi.getText();
        String expectedName="Audi/A1/";
        Assert.assertEquals(expectedName,actualName);


      /*  List<WebElement> lastRowOfTable = Driver.getDriver().findElements(By.xpath("//div//tr[@class='o_group_header o_group_has_content']"));
            System.out.println("lastRowOfTable.size() = " + lastRowOfTable.size());

            System.out.println("last row: " + lastRowOfTable.get(lastRowOfTable.size()-1).getText());
            //String invRef = lastRowOfTable.get(lastRowOfTable.size()-1).getText();

*/


    }


    @When("user clicks on list button")
    public void userClicksOnListButton() {

        BrowserUtils.waitFor(2);
        vehicleCostsPage.list.click();
        BrowserUtils.waitFor(2);
        String currentUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
    }

    @When("user clicks on kanban button")
    public void userClicksOnKanbanButton() {
        vehicleCostsPage.vehicleCostsButton.click();
        BrowserUtils.waitFor(2);
        vehicleCostsPage.kanban.click();
        BrowserUtils.waitFor(2);
        String currentUrl = Driver.getDriver().getCurrentUrl();
        BrowserUtils.sleep(2);
        System.out.println("currentUrl = " + currentUrl);

    }

    @When("user clicks on graph button")
    public void userClicksOnGraphButton() {
       BrowserUtils.waitFor(2);
        vehicleCostsPage.graph.click();
        BrowserUtils.waitFor(2);
        String currentUrl = Driver.getDriver().getCurrentUrl();
        BrowserUtils.sleep(2);
        System.out.println("currentUrl = " + currentUrl);


    }

    @Then("user sees the vehicles costs as {string}")
    public void userSeesTheVehiclesCostsAs(String mode) {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        BrowserUtils.sleep(2);
        Assert.assertTrue(currentUrl.contains(mode));
        BrowserUtils.sleep(2);

    }

    @And("user clicks audi button")
    public void userClicksAudiButton() {
        vehicleCostsPage.audiButton.click();
    }

    @And("user sees the current number of audi")
    public void userSeesTheCurrentNumberOfAudi() {
        BrowserUtils.waitFor(2);
        vehicleCostsPage.currentAudiNumber.click();

        BrowserUtils.sleep(2);
        String currentNumber=vehicleCostsPage.currentAudiNumber.getAttribute("innerHTML");
        BrowserUtils.sleep(2);
        System.out.println("currentNumber = " + currentNumber);
        VehicleCostsPage.numBeforeCreatingVehicle= Integer.parseInt(currentNumber);
        System.out.println(VehicleCostsPage.numBeforeCreatingVehicle);

    }

    @And("user creates new vehicle")
    public void userCreatesNewVehicle() {

        vehicleCostsPage.createButton.click();
        BrowserUtils.sleep(2);
        vehicleCostsPage.vehicleDropdown.click();
        BrowserUtils.sleep(2);
        WebElement audi = Driver.getDriver().findElement(By.linkText("Audi/A1/"));
        audi.click();


    }

    @And("user goes back vehicle costs page")
    public void userGoesBackVehicleCostsPage() {
        vehicleCostsPage.vehicleCostsButton.click();
        BrowserUtils.waitFor(2);
    }

    @And("user clicks audi button again")
    public void userClicksAudiButtonAgain() {
        vehicleCostsPage.audiButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the number of vehicles increases one")
    public void theNumberOfVehiclesIncreasesOne() {
        Assert.assertEquals(VehicleCostsPage.numAfterCreatingVehicle, VehicleCostsPage.numBeforeCreatingVehicle + 1);

        System.out.println("Number increased 1" );
    }
}













