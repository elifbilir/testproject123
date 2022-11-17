package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PointOfSale {
    public PointOfSale(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='login']")
    public WebElement inputEmail;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement inputPassword;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginButton;






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
