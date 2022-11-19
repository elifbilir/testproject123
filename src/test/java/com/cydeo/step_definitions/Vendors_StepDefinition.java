package com.cydeo.step_definitions;

import com.cydeo.pages.VendorsPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.w3c.dom.ls.LSOutput;

public class Vendors_StepDefinition {


    VendorsPage vendorsPage=new VendorsPage();
    @Given("user click Purchases module")
    public void user_click_purchases_module() {
        BrowserUtils.sleep(3);
        vendorsPage.PurchasesBtnn.click();
        BrowserUtils.sleep(3);
    }

    @Given("user click Vendors button")
    public void user_click_vendors_button() {
        BrowserUtils.sleep(2);
        vendorsPage.vendorsBtn.click();
        BrowserUtils.sleep(2);}

    // test 1
    @When("user click Vendors create button")
    public void user_click_vendors_create_button() {
        BrowserUtils.sleep(2);
        vendorsPage.vendorCreateBtn.click();
        BrowserUtils.sleep(2);
    }

    @When("user fill  name field")
    public void user_fill_name_field() {
        vendorsPage.vendorName.sendKeys("Vendor1234");
        BrowserUtils.sleep(2);

    }
    @When("user click Vendors save button")
    public void user_click_vendors_save_button() {
        BrowserUtils.sleep(2);
        vendorsPage.vendorSaveBtn.click();
        BrowserUtils.sleep(2);

    }

    // test 2
    @And("user should see name title on page")
    public void userShouldSeeNameTitleOnPage() {
        BrowserUtils.sleep(3);
        vendorsPage.VendorID.isDisplayed();
        BrowserUtils.sleep(2);

        Assert.assertTrue(vendorsPage.VendorID.isDisplayed());

    }

    @When("user click Edit button")
    public void user_click_edit_button() {
        BrowserUtils.sleep(3);
        vendorsPage.VendorEditBtn.click();
        BrowserUtils.sleep(3);
        vendorsPage.vendorName.sendKeys("Vendor123456");
        BrowserUtils.sleep(3);
        vendorsPage.vendorSaveBtn.click();
        BrowserUtils.sleep(3);

    }

    @Then("user sees change title on page")
    public void user_sees_change_title_on_page() {
        BrowserUtils.sleep(3);
        vendorsPage.VendorID.isDisplayed();
        BrowserUtils.sleep(2);

        Assert.assertTrue(vendorsPage.VendorID.isDisplayed());

    }

    //test 3
    @When("user click Action dropdown")
    public void user_click_action_dropdown() {
        BrowserUtils.sleep(3);
        vendorsPage.vendorActionBtn.click();
        BrowserUtils.sleep(2);

    }

    @When("user select Delete button")
    public void user_select_delete_button() {
        BrowserUtils.sleep(2);
        vendorsPage.vendorDeleteBtn.click();
        BrowserUtils.sleep(2);
    }

    @When("user should see Confirmation massage")
    public void user_should_see_confirmation_massage() {
        BrowserUtils.sleep(3);
        vendorsPage.ConfirmationMessage.isDisplayed();
        Assert.assertTrue(vendorsPage.ConfirmationMessage.isDisplayed());


    }

    @Then("user click ok button")
    public void user_click_ok_button() {
        BrowserUtils.sleep(3);
        vendorsPage.ConfirmationOkBttn.click();
        BrowserUtils.sleep(3);

    }

    // test 4
    @When("user click Kanban button.")
    public void user_click_kanban_button() {
        BrowserUtils.sleep(3);
        vendorsPage.vendorKanbanBtn.click();
        BrowserUtils.sleep(3);

    }

    @When("user click List button on page")
    public void user_click_list_button_on_page() {
        BrowserUtils.sleep(2);
        vendorsPage.vendorListBtn.click();
        BrowserUtils.sleep(3);

    }

    @Then("user should display Kanban List view")
    public void user_should_display_kanban_list_view() {
        BrowserUtils.sleep(3);
        vendorsPage.kanbanlistwiev.isDisplayed();
        System.out.println("display kanban list view ");

        Assert.assertTrue(vendorsPage.kanbanlistwiev.isDisplayed());

    }

    // test 5
    @When("user click on Discard button")
    public void user_click_on_discard_button() {
        BrowserUtils.sleep(3);
        vendorsPage.vendorDiscardBtn.click();
        BrowserUtils.sleep(3);

    }

    @When("user should see the warning message")
    public void user_should_see_the_warning_message() {
        BrowserUtils.sleep(3);
        vendorsPage.WarningMesage.isDisplayed();
        BrowserUtils.sleep(2);
        Assert.assertTrue(vendorsPage.WarningMesage.isDisplayed());

    }

    @When("user click on Ok button")
    public void user_click_on_ok_button() {
        BrowserUtils.sleep(3);
        vendorsPage.WarningOKBtn.click();
        BrowserUtils.sleep(3);

    }

    @Then("user sees discard changes message")
    public void user_sees_discard_changes_message() {
        BrowserUtils.sleep(3);
        vendorsPage.DiscardMessage.isDisplayed();
        BrowserUtils.sleep(3);
    }

    //test 6

    @When("user click on the right")
    public void user_click_on_the_right() {
        BrowserUtils.sleep(3);
        vendorsPage.RightButton.click();
        BrowserUtils.sleep(2);
    }
    @When("user click on the left button")
    public void user_click_on_the_left_button() {
        BrowserUtils.sleep(3);
        vendorsPage.LeftButton.click();
        BrowserUtils.sleep(3);

    }
    @Then("user able to move to the next page by button")
    public void user_able_to_move_to_the_next_page_by_button() {
        vendorsPage.RightBuutonPage.isDisplayed();
        System.out.println("Next page by button");
        vendorsPage.LeftbuttonPAge.isDisplayed();
        System.out.println("next page by button");

    }


}
