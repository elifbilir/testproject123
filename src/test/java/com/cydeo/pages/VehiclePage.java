package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclePage {
    public VehiclePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.=\"More \"]")
    public WebElement Morebtn;

    @FindBy(xpath = "//a[@data-menu=\"134\"]")
    public  WebElement FleetButton;

    @FindBy(xpath = "//a[@data-menu=\"136\"]")
    public WebElement VehicleModelBtn;

    @FindBy(xpath = "//button[@accesskey=\"c\"]")
    public WebElement CreateButton;

    @FindBy(xpath = "//input[@class=\"o_field_char o_field_widget o_input o_required_modifier\"]")
    public WebElement modelname;

    @FindBy(xpath = "//input[@class=\"o_input ui-autocomplete-input\"]")
    public WebElement selectMake;

    @FindBy(xpath = "//button[@accesskey=\"s\"]")
    public WebElement Savebutton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement errorMessage;

    @FindBy(xpath = "(//div[@class=\"btn-group o_dropdown\"])[2]")
    public WebElement attachmentBtn;

    @FindBy(xpath = "//*[contains(text(),'Action')]")
    public WebElement actionBtn;

    @FindBy(xpath = "//input[@placeholder=\"Search...\"]")
    public WebElement searchbox;

    @FindBy(xpath = "//div[@class=\"fa fa-sm fa-remove o_facet_remove\"]")
    public WebElement MakeButton;

    @FindBy(xpath = "//button[@aria-label=\"Next\"]")
    public WebElement RightArrow;

    @FindBy(xpath = "//button[@aria-label=\"Previous\"]")
    public WebElement LeftArrow;

    @FindBy(xpath = "//span[@class=\"o_pager_counter\"]")
    public WebElement pageNumber;

    @FindBy(xpath = "//th[@class='o_group_name']/span")
    public WebElement ABCDbutton;


    ////

}
