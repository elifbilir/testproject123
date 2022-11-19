package com.cydeo.step_definitions;

import com.cydeo.pages.ContactsPage;
import com.cydeo.pages.VehiclesServicesLogsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Contacts_StepDefinition {
    ContactsPage contactsPage = new ContactsPage();
    VehiclesServicesLogsPage vehiclesServicesLogsPage = new VehiclesServicesLogsPage();

    @Given("user clicks Contacts button")
    public void user_clicks_contacts_button() {
        contactsPage.contactsButton.click();
        BrowserUtils.sleep(5);
    }
    @Given("user is on the Contacts page")
    public void user_is_on_the_contacts_page() {
        String title = Driver.getDriver().getTitle();
        System.out.println("title = " + title);
        BrowserUtils.sleep(3);
        Assert.assertTrue(title.contains("Contacts"));
    }

    @Then("user types {string} name input box")
    public void user_types_name_input_box(String string) {
        BrowserUtils.sleep(2);
        contactsPage.nameInputBox.sendKeys(string);

    }
    @Then("user types {string} company input box")
    public void user_types_company_input_box(String string) {
        BrowserUtils.sleep(2);
        contactsPage.companyInputBox.sendKeys(string);
        BrowserUtils.sleep(2);
        contactsPage.companyCybertek.click();

    }
    @Then("user types {string} email input box")
    public void user_types_email_input_box(String string) {
        BrowserUtils.sleep(2);
        contactsPage.emailInputBox.sendKeys(string);

    }
    @Then("user should see the title {string} Odoo")
    public void user_should_see_the_title_odoo(String string) {
        String title = Driver.getDriver().getTitle();
        System.out.println("title = " + title);
        BrowserUtils.sleep(3);
        Assert.assertTrue(title.contains(string));

    }
    @When("user displays Contacts page in {string} mode")
    public void user_displays_contacts_page_in_mode(String string) {
        String contactsPageUrl = Driver.getDriver().getCurrentUrl();
        BrowserUtils.sleep(2);
        System.out.println(Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(contactsPageUrl.contains(string));
        BrowserUtils.sleep(2);

    }
    @Then("user should be able to display Contacts page in {string} mode")
    public void user_should_be_able_to_display_contacts_page_in_mode(String string) {
        String contactsPageUrl = Driver.getDriver().getCurrentUrl();
        BrowserUtils.sleep(2);
        System.out.println(Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(contactsPageUrl.contains(string));
        BrowserUtils.sleep(2);
    }
    @Then("user should see the warning popup window")
    public void user_should_see_the_warning_popup_window() {
        BrowserUtils.sleep(2);
        contactsPage.warningPopup.isDisplayed();

    }
    @Then("user should be on the Contacts page")
    public void user_should_be_on_the_contacts_page() {
        BrowserUtils.sleep(2);
        String title = Driver.getDriver().getTitle();
        System.out.println("title = " + title);
        BrowserUtils.sleep(3);
        Assert.assertTrue(title.contains("Contacts"));

    }
    @Then("user should see the contact that named {string} and click on it")
    public void user_should_see_the_contact_that_named_and_click_on_it(String string) {
       String contactName = contactsPage.contact.getText();
       BrowserUtils.sleep(2);
       Assert.assertTrue(contactName.contains(string));
        contactsPage.contact.click();
        BrowserUtils.sleep(2);

    }
    @Then("user clicks on Edit button")
    public void user_clicks_on_edit_button() {
        contactsPage.editButton.click();
        BrowserUtils.sleep(2);

    }
    @Then("user cleans the company input box")
    public void user_cleans_the_company_input_box() {
        contactsPage.companyInputBox.clear();
        BrowserUtils.sleep(2);

    }
    @Then("user types {string} company input box and hits the enter key")
    public void user_types_company_input_box_and_hits_the_enter_key(String string) {
        contactsPage.companyInputBox.sendKeys(string);
        BrowserUtils.sleep(2);
        contactsPage.companyInputBox.sendKeys(Keys.ENTER);

    }
    @Then("user sees the {string} popup window")
    public void user_sees_the_popup_window(String string) {
        contactsPage.popup.isDisplayed();
        BrowserUtils.sleep(2);
        String popupTitle = contactsPage.popup.getText();
        BrowserUtils.sleep(3);
        System.out.println("popupTitle = " + popupTitle);
        BrowserUtils.sleep(2);
        Assert.assertTrue(popupTitle.contains(string));

    }
    @Then("user clicks on Action button")
    public void user_clicks_on_action_button() {
        vehiclesServicesLogsPage.actionButton.click();
        BrowserUtils.sleep(2);

    }
    @Then("user clicks Delete on dropdown menu")
    public void user_clicks_delete_on_dropdown_menu() {
        contactsPage.deleteButton.click();
        BrowserUtils.sleep(2);

    }
    @Then("user should NOT see  the contact {string} on the contact page")
    public void user_should_not_see_the_contact_on_the_contact_page(String string) {
        String searchBoxInput = Driver.getDriver().findElement(By.xpath("//div[@class='o_facet_values']/span")).getText();
        BrowserUtils.sleep(2);
        Assert.assertEquals(searchBoxInput, string);
        BrowserUtils.sleep(2);
        contactsPage.noContent.isDisplayed();
    }

}
