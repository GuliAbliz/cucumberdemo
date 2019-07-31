package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements {

    public HomePageElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }





    @FindBy(
            xpath = "//*[@id=\"main-menu\"]/ul/li[1]/a/span"
    )
    public WebElement fleet;
    @FindBy(
            xpath = "//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span"
    )
    public WebElement vehicles;
    @FindBy(
            xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span"
    )
    public WebElement customer;
    @FindBy(
            xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span"
    )
    public WebElement Accounts;
    @FindBy(
            xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[4]/a/span"
    )
    public WebElement contact;
    @FindBy(
            xpath = "//*[@id=\"main-menu\"]/ul/li[3]/a/span"
    )
    public WebElement activities;

    @FindBy (xpath = "//*[@id=\"user-menu\"]/a")
    public WebElement forlogout;

    @FindBy (xpath = "//*[@id=\"user-menu\"]/ul/li[5]/a")
    public WebElement logoutButton;


}
