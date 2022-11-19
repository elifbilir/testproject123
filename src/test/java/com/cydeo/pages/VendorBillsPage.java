package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorBillsPage {

    public VendorBillsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    public void clickPurchaseButton(){
        this.purchaseButton.click();
        BrowserUtils.waitFor(2);
    }


    public void clickVendorBillsButton(){
        this.vendorBillsButton.click();
        BrowserUtils.waitFor(2);
    }



    @FindBy(xpath = "//li//a[@data-menu-xmlid='purchase.menu_purchase_root']")
    public WebElement purchaseButton;

    @FindBy(xpath = "//a[@data-menu='515']")
    public WebElement vendorBillsButton;

   @FindBy(xpath = "//div//button[@accesskey='c']")
    public WebElement createButton;

   @FindBy(xpath = "//body[@class='o_web_client']")
   public WebElement warningMessage;


   @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    public WebElement vendorDropdown;


   @FindBy(linkText = "&*&*)_(, azjprm jftwid")
    public WebElement selectedVendor;


   @FindBy(xpath = "//td//input[@name='reference']")
    public WebElement vendorReference;

   @FindBy(xpath="(//div[@class='o_input_dropdown'])[2]")
    public WebElement orderButton;


   @FindBy(xpath = "//input[@name='date_invoice']")
    public WebElement billDate;


   @FindBy(xpath = "(//input[@class='o_datepicker_input o_input'])[2]")
    public WebElement dueDate;

   @FindBy(xpath = "//div//button[@accesskey='s']")
    public WebElement saveButton;

   @FindBy(xpath = "//button[@accesskey='k']")
    public WebElement kanban;

   @FindBy(xpath = "//button[@aria-label='list']")
   public WebElement list;

   @FindBy(xpath = "//div[@class='modal-body']")
    public WebElement discardConfirmationMessage;

   @FindBy(xpath = "(//div//button[@type='button'])[34]")
    public WebElement okToDiscard;


   @FindBy(xpath = "(//div//label[@class='o_form_label'])[1]")
    public WebElement draftBill;

   @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editButton;

   @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    public  WebElement checkBox;

   @FindBy(xpath = "//div[@class='btn-group']")
    public WebElement printAndAction;

   @FindBy(xpath = "(//div[@class='btn-group o_dropdown'])[2]")
    public WebElement action;

   @FindBy(xpath = "//li//a[@data-index='1']")
   public WebElement delete;

   @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public  WebElement deleteOk;


   @FindBy(xpath = "//span[@class='o_pager_limit']")
    public WebElement billNumber;

    public static int billNumBeforeDelete;
    public static int billNumAfterDelete;




























}
