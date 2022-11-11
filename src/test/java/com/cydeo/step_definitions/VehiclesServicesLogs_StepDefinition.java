package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.VehiclesServicesLogsPage;
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

import java.util.List;

public class VehiclesServicesLogs_StepDefinition {

    LoginPage loginPage = new LoginPage();


    @Given("user logins as posmanager")
    public void user_logins_as_posmanager() {

        String username = ConfigurationReader.getProperty("posmanagerusername");
        String password = ConfigurationReader.getProperty("posmanagerpassword");
        loginPage.login(username,password);

        BrowserUtils.sleep(2);
        }

    VehiclesServicesLogsPage vehiclesServicesLogsPage = new VehiclesServicesLogsPage();

    @Given("user clicks Fleet button")
    public void user_clicks_fleet_button() {
        BrowserUtils.sleep(2);
        if (!vehiclesServicesLogsPage.fleetButton.isDisplayed()) {
            vehiclesServicesLogsPage.moreButton.click();
        }
        BrowserUtils.sleep(2);
        vehiclesServicesLogsPage.fleetButton.click();
        BrowserUtils.sleep(2);
    }

    @Given("user clicks Vehicle Service Logs button")
    public void user_clicks_vehicle_service_logs_button() {
        vehiclesServicesLogsPage.vehiclesServicesLogsButton.click();

        BrowserUtils.sleep(3);

    }

    @Given("user is on the Vehicle Service Logs page")
    public void user_is_on_the_vehicle_service_logs_page() {

        String title = Driver.getDriver().getTitle();
        System.out.println("title = " + title);
        BrowserUtils.sleep(3);
        Assert.assertTrue(title.contains("Vehicles"));

    }

    @When("user clicks on Create button")
    public void user_clicks_on_create_button() {
        vehiclesServicesLogsPage.createButton.click();
        BrowserUtils.sleep(2);

    }
    @When("user selects a vehicle")
    public void user_selects_a_vehicle() throws InterruptedException {

        BrowserUtils.sleep(2);
        vehiclesServicesLogsPage.vehicleInputBox.click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("/html/body/ul[1]/li[2]/a")).click();

        BrowserUtils.sleep(2);


    }
    @When("user selects a service type")
    public void user_selects_a_service_type() {
        BrowserUtils.sleep(2);
        vehiclesServicesLogsPage.serviceTypeInputBox.click();
        BrowserUtils.sleep(2);
        Driver.getDriver().findElement(By.xpath("/html/body/ul[2]/li[5]")).click();
        BrowserUtils.sleep(2);

    }
    @And("user types {string} invoice reference input box")
    public void userTypesInvoiceReferenceInputBox(String string) {
        vehiclesServicesLogsPage.invReference.sendKeys(string);
    }

    @When("user clicks on Save button")
    public void user_clicks_on_save_button() {
        BrowserUtils.sleep(2);
        vehiclesServicesLogsPage.saveButton.click();
        BrowserUtils.sleep(2);

    }
    @Then("user sees Edit button on the page")
    public void user_sees_edit_button_on_the_page() {
        BrowserUtils.sleep(2);
        vehiclesServicesLogsPage.editButton.isDisplayed();
        BrowserUtils.sleep(2);

        Assert.assertTrue(vehiclesServicesLogsPage.editButton.isDisplayed());

    }

    @Then("user sees The following fields are invalid message")
    public void user_sees_the_following_fields_are_invalid_message() {
        BrowserUtils.sleep(2);
        vehiclesServicesLogsPage.warningMessage.isDisplayed();
        BrowserUtils.sleep(2);
        Assert.assertTrue(vehiclesServicesLogsPage.warningMessage.isDisplayed());

    }

    @When("user clicks on Discard button")
    public void user_clicks_on_discard_button() {
        BrowserUtils.sleep(2);
        vehiclesServicesLogsPage.discardButton.click();
        BrowserUtils.sleep(2);
    }

    @Then("user sees {string} in page title")
    public void userSeesInPageTitle(String string) {
        BrowserUtils.sleep(2);
        String title = Driver.getDriver().getTitle();
        System.out.println("title = " + title);

        BrowserUtils.sleep(2);
        Assert.assertTrue(title.contains(string));
        BrowserUtils.sleep(2);
    }

    @Then("user sees Attachment button at the top of the page")
    public void user_sees_attachment_button_at_the_top_of_the_page() {
        BrowserUtils.sleep(2);
        vehiclesServicesLogsPage.attachmentButton.isDisplayed();
        BrowserUtils.sleep(2);
        Assert.assertTrue(vehiclesServicesLogsPage.attachmentButton.isDisplayed());

    }
    @Then("user sees Action button at the top of the page")
    public void user_sees_action_button_at_the_top_of_the_page() {
        BrowserUtils.sleep(2);
        vehiclesServicesLogsPage.actionButton.isDisplayed();
        BrowserUtils.sleep(2);
        Assert.assertTrue(vehiclesServicesLogsPage.actionButton.isDisplayed());

    }
    @When("user types {string} to the search box and hits the enter key")
    public void user_types_to_the_search_box_and_hits_the_enter_key(String string) {
        BrowserUtils.sleep(2);
        vehiclesServicesLogsPage.searchBox.sendKeys(string + Keys.ENTER);
        BrowserUtils.sleep(2);

    }
    @Then("user sees the new created Service Logs value {string} at the end of the Service Logs list")
    public void user_sees_the_new_created_service_logs_value_at_the_end_of_the_service_logs_list(String string) {
        List<WebElement> lastRowOfTable = Driver.getDriver().findElements(By.xpath("//tbody[@class='ui-sortable']/tr/td[7][@class='o_data_cell']"));
        System.out.println("lastRowOfTable.size() = " + lastRowOfTable.size());

        System.out.println("last row: " + lastRowOfTable.get(lastRowOfTable.size()-1).getText());
        //String invRef = lastRowOfTable.get(lastRowOfTable.size()-1).getText();
        String invRef = lastRowOfTable.get(lastRowOfTable.size()-1).getText();
        BrowserUtils.sleep(2);

        Assert.assertEquals(invRef, string);


    }
    @When("user clicks on Kanban button")
    public void user_clicks_on_kanban_button() {
        BrowserUtils.sleep(2);
        vehiclesServicesLogsPage.kanbanButton.click();
        BrowserUtils.sleep(2);

    }
    @Then("user displays Vehicles Services Logs page on {string} mode")
    public void userDisplaysVehiclesServicesLogsPageOnMode(String string) {
        BrowserUtils.sleep(2);
        String currentUrl = Driver.getDriver().getCurrentUrl();
        BrowserUtils.sleep(2);
        System.out.println(Driver.getDriver().getCurrentUrl());
        BrowserUtils.sleep(2);
        Assert.assertTrue(currentUrl.contains(string));
        BrowserUtils.sleep(2);

    }
    @When("user clicks on Graph button")
    public void user_clicks_on_graph_button() {
        BrowserUtils.sleep(2);
        vehiclesServicesLogsPage.graphButton.click();
        BrowserUtils.sleep(2);
    }

    @When("user clicks on List button")
    public void user_clicks_on_list_button() {
        BrowserUtils.sleep(2);
        vehiclesServicesLogsPage.listButton.click();
        BrowserUtils.sleep(2);
    }


}
