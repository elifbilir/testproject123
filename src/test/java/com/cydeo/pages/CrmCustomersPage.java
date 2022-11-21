package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrmCustomersPage {

    public CrmCustomersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[5]/a/span")
    public WebElement crmButton;

    @FindBy(xpath="//a[@data-menu-xmlid=\"crm.res_partner_menu_crm\"]/span")
    public WebElement crmCustomersBtn;

    @FindBy(css="button[data-original-title='Kanban']")
    public WebElement kanbanField;

    @FindBy(xpath = "//div[@class='modal-body']")
    public WebElement discardWarningMsg;

    @FindBy(xpath="//button[@accesskey='a']")
    public WebElement editButton;

    @FindBy(xpath="//input[@name='email']")
    public WebElement customerEmailField;

    @FindBy(xpath="//a[@name='email']")
    public WebElement savedEmail;

    @FindBy(xpath="//div[@class='oe_kanban_global_click o_res_partner_kanban o_kanban_record'][1]")
    public WebElement custProfileField;

    @FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[3]/button")
    public WebElement actionButton;

    @FindBy (xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[3]/ul/li[1]/a")
    public WebElement deleteButton;

    @FindBy(xpath ="//span[.='Ok']")
    public WebElement okButton;

    public static String customerEmail;






}
