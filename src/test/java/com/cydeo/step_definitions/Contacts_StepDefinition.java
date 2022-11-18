package com.cydeo.step_definitions;

import com.cydeo.pages.ContactsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Contacts_StepDefinition {
    ContactsPage contactsPage = new ContactsPage();

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
        String currentUrl = Driver.getDriver().getCurrentUrl();
        BrowserUtils.sleep(2);
        System.out.println(Driver.getDriver().getCurrentUrl());
        BrowserUtils.sleep(2);
        Assert.assertTrue(currentUrl.contains(string));
        BrowserUtils.sleep(2);

    }
    @Then("user should be able to display Contacts page in {string} mode")
    public void user_should_be_able_to_display_contacts_page_in_mode(String string) {
        BrowserUtils.sleep(2);
        String currentUrl = Driver.getDriver().getCurrentUrl();
        BrowserUtils.sleep(2);
        System.out.println(Driver.getDriver().getCurrentUrl());
        BrowserUtils.sleep(2);
        Assert.assertTrue(currentUrl.contains(string));
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

}
