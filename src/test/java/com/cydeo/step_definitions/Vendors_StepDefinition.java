package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.VendorsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Vendors_StepDefinition {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the centrilli login")
    public void userIsOnTheCentrilliLogin() {
        String url = ConfigurationReader.getProperty("cent-url");
        Driver.getDriver().get(url);

    }

    @Given("user logins as Posmanager")
    public void userLoginsAsPosmanager() {
        String username = ConfigurationReader.getProperty("posmanagerusername");
        String password = ConfigurationReader.getProperty("posmanagerpassword");
        loginPage.login(username,password);

        BrowserUtils.sleep(2);
    }



    VendorsPage vendorsPage = new VendorsPage();


    @Given("user click Purchases module")
    public void userClickPurchasesModule() {
        BrowserUtils.sleep(3);
        vendorsPage.PurchasesBtn.click();
        BrowserUtils.sleep(3);

    }

    @Given("user click Vendors button")
    public void userClickVendorsButton() {
        BrowserUtils.sleep(3);

    }



    //Test 815
    @When("user click create button")
    public void userClickCreateButton() {
    }

    @And("user fill  name field")
    public void userFillNameField() {
    }

    @And("user clicks save button")
    public void userClicksSaveButton() {
    }



    // Test 816
    @And("user click Edit button")
    public void userClickEditButton() {
    }

    @Then("user sees change title on page")
    public void userSeesChangeTitleOnPage() {
    }




    // test 817
    @And("user click Action dropdown")
    public void userClickActionDropdown() {
    }

    @And("user select Delete button")
    public void userSelectDeleteButton() {
    }

    @And("user should see Confirmation massage")
    public void userShouldSeeConfirmationMassage() {
    }



    // test 818
    @Then("user click ok button")
    public void userClickOkButton() {
    }

    @When("user click Kanban button")
    public void userClickKanbanButton() {
    }

    @And("user clicks List button on page")
    public void userClicksListButtonOnPage() {
    }

    @Then("Verify user can change Kanban List view")
    public void verifyUserCanChangeKanbanListView() {
    }



    // test 819
    @And("user click on Discard button")
    public void userClickOnDiscardButton() {
    }

    @And("user should see the warning message")
    public void userShouldSeeTheWarningMessage() {
    }

    @And("user click on Ok button")
    public void userClickOnOkButton() {
    }

    @Then("Verify  user can discard changes")
    public void verifyUserCanDiscardChanges() {
    }



    // test 820
    @When("user click on the right and left buttons")
    public void userClickOnTheRightAndLeftButtons() {
    }

    @Then("Verify user can move to the next records page")
    public void verifyUserCanMoveToTheNextRecordsPage() {
    }
}
