package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PointOfSalePage {
    public PointOfSalePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='login']")
    public WebElement inputEmail;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement inputPassword;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy (xpath = "//a[@href='/web#menu_id=484&action=']")
    public WebElement pointOfSaleButton;

    @FindBy (xpath = "//button[@data-view-type='list']")
    public WebElement listButton;

    @FindBy (xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy (xpath = "//input[@id='o_field_input_436']")
    public WebElement inputName;

    @FindBy (xpath = "//li[@id='ui-id-565']")
    public WebElement inputOperationType;

    @FindBy (xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy (xpath = "//input[@id='o_field_input_495']")
    public WebElement operationType;

    @FindBy (xpath = "//ul[@id='ui-id-18']/li[6]")
    public WebElement returnOperations;

    @FindBy (xpath = "//div[@name=\"picking_type_id\"]")
    public WebElement operationMessage;

    @FindBy (xpath = "(//li[@class=\"active\"])[2]")
    public WebElement titleNameChanged;

    @FindBy (xpath = "//button[@data-view-type='kanban']")
    public WebElement kanbanButton;

    @FindBy (xpath = "//div[@class='o_cannot_create']/div")
    public WebElement kanbanView;

    @FindBy (xpath = "//button[@accesskey='j']")
    public WebElement discardButton;

    @FindBy (xpath = "//*[contains(text(),'Ok')]")
    public WebElement okWarningPopUp;

    @FindBy (xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;

    @FindBy (xpath = "(//td[@class='o_data_cell o_required_modifier'])[1]")
    public WebElement expectedName;

    @FindBy (xpath = "//button[@accesskey='a']")
    public WebElement editButton;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement editInputName;

    @FindBy (xpath = "//button[@accesskey='s']")
    public WebElement saveAfterEditing;

    @FindBy (xpath = "(//*[contains(text(),'Operation Type')])[2]")
    public WebElement invalidErrorMessage;











    public void login(){
        this.inputEmail.sendKeys("posmanager10@info.com");
        this.inputPassword.sendKeys("posmanager");
        this.loginButton.click();
    }

    public void login(String username, String password){
        inputEmail.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }
}
