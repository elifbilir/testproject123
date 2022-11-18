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


   @FindBy(xpath = "(//div//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement vendorDropdown;


   @FindBy(linkText = "&*&*)_(, aulaya dxlekg")
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





















}
