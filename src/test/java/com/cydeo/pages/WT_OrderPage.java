package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WT_OrderPage extends WT_BasePage{


    public WT_OrderPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "product")
    public WebElement productDropdown;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement visaRadioButton;

    @FindBy(xpath = "//input[@value='MasterCard']")
    public WebElement masterCardRadioButton;

    @FindBy(xpath = "//input[@value='American Express']")
    public WebElement AMEXRadioButton;

    @FindBy(name ="card")
    public List<WebElement> cardTypes;

    @FindBy(name = "name")
    public WebElement name;

    @FindBy(name = "street")
    public WebElement streetBox;

    @FindBy(name = "city")
    public WebElement cityBox;

    @FindBy(name = "state")
    public WebElement stateBox;

    @FindBy(name = "zip")
    public WebElement zipBox;

    @FindBy(name = "cardNo")
    public WebElement cardNoBox;

    @FindBy(name = "cardExp")
    public WebElement cardExpBox;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;

    @FindBy(name = "quantity")
    public WebElement inputQuantity;

    @FindBy(xpath = "//button[.='Calculate']")
    public WebElement calculateButton;

}
