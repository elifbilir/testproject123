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
    public WebElement PurchasesBtnn;

    @FindBy(xpath = "//div[9]/ul[1]/li[3]/a/span")
    public WebElement vendorsBtn;

    @FindBy(xpath = "//button[@accesskey=\"c\"]")
    public WebElement vendorCreateBtn;

    @FindBy(xpath = "//input[@class=\"o_field_char o_field_widget o_input o_required_modifier\"]")
    public WebElement vendorName;

    @FindBy(xpath = "//button[@accesskey=\"s\"]")
    public WebElement vendorSaveBtn;

    @FindBy(xpath = "//div/div[1]/div/div[3]/h1/span")
    public WebElement VendorID;

    @FindBy(xpath = "//button[@accesskey=\"a\"]")
    public WebElement VendorEditBtn;

    @FindBy(xpath = "//div[2]/div/div[3]/button")
    public WebElement vendorActionBtn;

    @FindBy(xpath = "//div[2]/div/div[3]/ul/li[1]/a")
    public WebElement vendorDeleteBtn;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/h4")
    public WebElement ConfirmationMessage;

    @FindBy(xpath = "//div[5]/div/div/div[3]/button[1]")
    public WebElement ConfirmationOkBttn;

    @FindBy(xpath = "//div[2]/div[1]/div[3]/div[3]/button[1]")
    public WebElement vendorKanbanBtn;

    @FindBy(xpath = "//button[@class=\"btn btn-icon fa fa-lg fa-list-ul o_cp_switch_list\"]")
    public WebElement vendorListBtn;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]")
    public WebElement kanbanlistwiev;

    @FindBy(xpath = "//button[@class=\"btn btn-default btn-sm o_form_button_cancel\"]")
    public WebElement vendorDiscardBtn;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/h4")
    public WebElement WarningMesage;

    @FindBy(xpath = "//button[@class=\"btn btn-sm btn-primary\"]")
    public WebElement WarningOKBtn;

    @FindBy(xpath = "//div[@class=\"oe_tooltip_string\"]")
    public WebElement DiscardMessage;


    @FindBy(xpath = "//button[@class=\"fa fa-chevron-left btn btn-icon o_pager_previous\"]")
    public WebElement LeftButton;

    @FindBy(xpath = "//button[@class=\"fa fa-chevron-right btn btn-icon o_pager_next\"]")
    public WebElement RightButton;

   @FindBy(xpath = "//span[@class=\"o_pager_value\"]")
    public WebElement RightBuutonPage;

   @FindBy(xpath = "//div[3]/div[2]/div/span[1]/span[1]")
    public WebElement LeftbuttonPAge;






}

