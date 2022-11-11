package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "login")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement btn;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement invalidMessage;

    public  void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        btn.click();
    }

}
