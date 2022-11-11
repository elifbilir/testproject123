package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinition {

    LoginPage loginPage = new LoginPage();
    @Given("user is on the centrilli login page")
    public void user_is_on_the_centrilli_login_page() {
        String url = ConfigurationReader.getProperty("cent-url");
        Driver.getDriver().get(url);
    }
    @When("user enter valid email and password")
    public void user_enters_username() {
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(username,password);
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        String title = Driver.getDriver().getTitle();
        System.out.println("title = " + title);

        Assert.assertTrue(title.equals("Odoo"));

    }
    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() {

        String username ="invalidusername";
        String password = "invalidpassword";
        loginPage.login(username,password);

    }
    @Then("user should see wrong login\\/password message displayed")
    public void user_should_see_wrong_login_password_message_displayed() {
        String message = loginPage.invalidMessage.getText();
        Assert.assertTrue(message.contains("Wrong login"));


    }


}
