package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleCostsPage {
    public VehicleCostsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement btn;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement invalidMessage;

    public void login() {
        this.usernameInput.sendKeys("posmanager10@info.com");
        this.passwordInput.sendKeys("posmanager");
        this.btn.click();
    }

    @FindBy(xpath = "//a[.='More ']")
    public WebElement moreButton;

    @FindBy(xpath = "//a[@data-menu='134']")
    public WebElement fleetButton;

    @FindBy(linkText = "Vehicle Costs")
    public WebElement vehicleCostsButton;
    @FindBy(xpath = "(//div//button[@type='button'])[6]")
    public WebElement createButton;

    @FindBy(xpath = "//div[@class='o_input_dropdown']")
    public WebElement vehicleDropdown;

    @FindBy(xpath = "//div//input[@name='date']")
    public WebElement dateInput;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[2]")
    public WebElement typeDropdown;


    @FindBy(xpath = "//div//input[@name='amount']")
    public WebElement inputTotalPrice;


    @FindBy(xpath = "//div//input[@name='description']")
    public WebElement inputCostDescription;


    @FindBy(xpath = "//div//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy(xpath = "(//div//li[@class='active'])[3]")
    public WebElement title;
    @FindBy(xpath = "(//div//span[@class='o_dropdown_button'])[1]")
    public WebElement warningMessage;

    @FindBy(xpath = "//div//button[@class='btn btn-default btn-sm o_form_button_cancel']")
    public WebElement discardButton;

    @FindBy(xpath = "//div//button//span[.='Ok']")
    public WebElement okButton;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement discardWarningMessage;


    @FindBy(xpath = "(//div[@class='btn-group o_dropdown'])[2]")
    public WebElement attachmentButton;


    @FindBy(xpath = "(//div[@class='btn-group o_dropdown'])[3]")
    public WebElement actionButton;


    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;


    @FindBy(xpath = "(//td[@class='o_data_cell o_required_modifier'])[60]")
    public WebElement lastRowOfVehicleList;

    @FindBy(xpath = "(//td[@class='o_data_cell o_required_modifier'])[1] ")
    public WebElement newAudi;


    @FindBy(xpath = "(//div//span[@class='fa fa-caret-right'])[1]")
    public WebElement audiButton;


    @FindBy(xpath = "(//div//button[@type='button'])[18]")
    public WebElement kanban;

    @FindBy(xpath = "(//div//button[@type='button'])[11]")
    public WebElement list;

    @FindBy(xpath = "(//div//button[@type='button'])[17]")
    public WebElement graph;

    @FindBy(xpath = "//div//span[.='685']")
    //@FindBy(xpath ="(//div//th[@class='o_group_name'])[1]" )
    public WebElement currentAudiNumber;

    public static int numBeforeCreatingVehicle;
    public static int numAfterCreatingVehicle;



    }





