package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
    public ContactsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@data-menu-xmlid='contacts.menu_contacts']")
    public WebElement contactsButton;

    @FindBy(name = "name")
    public WebElement nameInputBox;

    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    public WebElement companyInputBox;

    @FindBy(xpath = "/html/body/ul[1]/li[4]/a")
    public WebElement companyCybertek;

    @FindBy(name = "email")
    public WebElement emailInputBox;

    @FindBy(xpath = "//div[5]/div/div/div[1]/h4")
    public WebElement warningPopup;

}
