package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SalesPage {


    public SalesPage(){ PageFactory.initElements(Driver.getDriver(),this);
        }

    @FindBy(xpath = "//*[@id='oe_main_menu_navbar']/div[2]/ul[1]/li[6]/a")
    public WebElement salesButton;

    @FindBy(xpath ="//div[1]/div[6]/ul[1]/li[3]/a/span[@class='oe_menu_text']")
    public WebElement customersButton;

    @FindBy(xpath= "(//div[@class='o_cp_left']//button)[1]")
    public WebElement customerCreateBtn;

    @FindBy(xpath="//input[@placeholder=\"Name\"]" )
    public WebElement nameField;

    @FindBy(css= "div[class='o_form_buttons_edit']>button.btn-primary")
    public WebElement saveButton;

    @FindBy(xpath="//div[@class='o_form_buttons_edit']/button[2]")
    public WebElement discardButton;

    @FindBy(css="div[class=\"o_notification_manager\"]")
    public WebElement warningMessage;

    @FindBy(xpath="//p[.='Contact created']")
    public WebElement contactCreatedMsg;

    @FindBy(xpath="//div/input[@class=\"o_searchview_input\"]")
    public WebElement searchField;

    @FindBy(xpath = "//div[.='The record has been modified, your changes will be discarded. Do you want to proceed?']")
    public WebElement discardWarningMessage;

    @FindBy(xpath = "//div/strong/span")
    public WebElement newCreatedCustomerNameField;

    @FindBy(css="button[data-original-title='List']")
    public WebElement listfield;

    @FindBy(xpath = "//tr/th[@class='o_column_sortable']")
    public WebElement listNameField;

    @FindBy(xpath = "//span[@class='o_pager_limit']")
    public WebElement customerNumberField;

    public static int numBforeCreation;
    public static int numAfterCreation;








}
