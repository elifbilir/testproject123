package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorsPage {

    public VendorsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[2]/ul[1]/li[9]/a/span")
    public WebElement PurchasesBtn;

    @FindBy(xpath = "//div[9]/ul[1]/li[3]/a/span")
    public WebElement vendorsBtn;

    @FindBy(xpath = "//button[@accesskey=\"c\"]")
    public WebElement vendorCreateBtn;

    @FindBy(xpath = "//input[@class=\"o_field_char o_field_widget o_input o_required_modifier\"]")
    public WebElement VendorNameField;

    @FindBy(xpath = "//button[@accesskey=\"s\"]")
    public WebElement vendorSaveBtn;

    @FindBy(xpath = "//button[@accesskey=\"a\"]")
    public WebElement VendorEditBtn;

    @FindBy(xpath = "//div[2]/div/div[3]/button")
    public WebElement vendorActionBtn;

    @FindBy(xpath = "//div[2]/div/div[3]/ul/li[1]/a")
    public WebElement vendorDeleteBtn;

    @FindBy(xpath = "//h4[@class=\"modal-title\"]")
    public WebElement ConfirmationMessage;

    @FindBy(xpath = "//div[5]/div/div/div[3]/button[1]")
    public WebElement ConfirmationOkBtn;

    @FindBy(xpath = "//div[2]/div[1]/div[3]/div[3]/button[1]")
    public WebElement vendorKanbanBtn;

    @FindBy(xpath = "//button[@class=\"btn btn-icon fa fa-lg fa-list-ul o_cp_switch_list\"]")
    public WebElement vendorListBtn;

    @FindBy(xpath = "//button[@class=\"btn btn-default btn-sm o_form_button_cancel\"]")
    public WebElement vendorDiscardBtn;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/h4")
    public WebElement WarningMesage;

    @FindBy(xpath = "//button[@class=\"btn btn-sm btn-primary\"]")
    public WebElement WarningOKBtn;

    @FindBy(xpath = "//button[@aria-label=\"Previous\"]")
    public WebElement LeftButton;

    @FindBy(xpath = "//button[@aria-label=\"Next\"]")
    public WebElement RightButton;















}

