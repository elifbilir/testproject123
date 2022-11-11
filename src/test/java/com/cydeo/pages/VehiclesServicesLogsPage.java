package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesServicesLogsPage {

    public VehiclesServicesLogsPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement moreButton;

    @FindBy(xpath = "//a[@data-menu-xmlid='fleet.menu_root']")
    public WebElement fleetButton;

    @FindBy(xpath = "//a[@data-menu-xmlid='fleet.fleet_vehicle_log_services_menu']")
    public WebElement vehiclesServicesLogsButton;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//tr[2]//div/div/input")
    public WebElement vehicleInputBox;

    @FindBy(xpath = "//div[1]/table[1]/tbody/tr[3]/td[2]/div/div/input")
    public WebElement serviceTypeInputBox;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editButton;

    @FindBy(xpath = "//div[@name='vehicle_id']")
    public WebElement warningMessage;

    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement discardButton;

    @FindBy(xpath = "//*[contains(text(),'Attachment')]")
    public WebElement attachmentButton;

    @FindBy(xpath = "//*[contains(text(),'Action')]")
    public WebElement actionButton;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@name='inv_ref']")
    public WebElement invReference;

    @FindBy(xpath = "//button[@accesskey='k']")
    public WebElement kanbanButton;

    @FindBy(xpath = "//button[@accesskey='l']")
    public WebElement listButton;

    @FindBy(xpath = "//button[@aria-label='graph']")
    public WebElement graphButton;




}
