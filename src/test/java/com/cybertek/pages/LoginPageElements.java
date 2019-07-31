package com.cybertek.pages;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {


    @FindBy(
            name = "_username"
    )
    public WebElement email;
    @FindBy(
            name = "_password"
    )
    public WebElement password;
    @FindBy(
            name = "_submit"
    )
    public WebElement loginbutton;

    public LoginPageElements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void login(String userName, String password) {
        this.email.sendKeys(new CharSequence[]{userName});
        this.password.sendKeys(new CharSequence[]{password});
        this.loginbutton.click();
    }
}

