package com.cydeo.step_definitions;

import com.cydeo.pages.ContactsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

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

    }
    @Then("user types {string} company input box")
    public void user_types_company_input_box(String string) {

    }
    @Then("user types {string} email input box")
    public void user_types_email_input_box(String string) {

    }
    @Then("user should see the title {string} Odoo")
    public void user_should_see_the_title_odoo(String string) {

    }

}
