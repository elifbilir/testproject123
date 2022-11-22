package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLInputElement;

public class StockOperationsPage {




    public StockOperationsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='oe_main_menu_navbar']/div[2]/ul[1]/li[10]/a")
    public WebElement ınventoryButton;

    @FindBy(xpath = "(//ul/li/a/span[@class='oe_menu_text'])[53]")
    public WebElement transfersButton;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//tr/td/div/div/input[@id='o_field_input_4353']")
    public WebElement partnerfillbar;

    @FindBy(xpath = "//li[@class='ui-menu-item']/a")
    public WebElement dropdownbutton;

    @FindBy(xpath = "//div[@class='o_input_dropdown']/input")
    public WebElement createPartner;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editbutton;

    @FindBy(xpath = "//div[@name='partner_id']/div/input")
    public WebElement namefield;

    @FindBy(xpath = "//li[@class='ui-menu-item']/a")
    public WebElement editedname;

    @FindBy(xpath = "//button[@accesskey=\"j\"]")
    public WebElement discardbutton;

    @FindBy(xpath = "//a[.='Additional Info']")
    public WebElement additionalinfobutton;

    @FindBy(xpath = "//div[@name='picking_type_id']/div/input")
    public WebElement operationtype;

    @FindBy(xpath = "//ul[5]/li[1]/a")
    public WebElement  firstoption;

    @FindBy(xpath = "/html/body/div[1]")
    public WebElement transferspage;

    @FindBy(xpath = "//th[.='Reference']")
    public WebElement referenceField;

    @FindBy(xpath = "//option[.='Not urgent']")
    public WebElement notUrgent;

    @FindBy(xpath = "//span[.='Not urgent']")
    public WebElement writtenNotUrgent;

    @FindBy(xpath = "//select[@name='priority']")
    public WebElement priorityField;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[3]/button[3]")
    public WebElement calendarbutton;

    @FindBy(xpath = "//*[@id=\"dp1669050866488\"]/div/table/tbody/tr[5]/td[3]/a")
    public WebElement changedate;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]")
    public WebElement createdcustomerpage;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[3]/button")
    public WebElement actionbutton;

    @FindBy(xpath = "(//td[@class='o_data_cell'])[11]")
    public WebElement yatutarsa;

    @FindBy(xpath = "(//a[@data-section='other'])[1]")
    public WebElement deletebutton;

    @FindBy(xpath = "//*[@id=\"modal_5464\"]/div/div")
    public WebElement confirmationmessage;

    @FindBy(xpath = "//span[.='Ok']")
    public WebElement okbutton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[3]")
    public WebElement firstnameonthelist;
}