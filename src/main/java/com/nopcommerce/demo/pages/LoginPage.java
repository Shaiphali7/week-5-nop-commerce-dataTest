package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    //@CacheLookup
    @FindBy(xpath= "//a[contains(text(),'Log in')]")
    WebElement loginLink;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;


    public void clickOnLoginButton() {

        clickOnElement(loginButton);

    }


    public void enterEmailId(String email) {

        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {

        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginLink() {

        clickOnElement(loginLink);

    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement getErrorMessage;

    public String getGetErrorMessage() {
        return getTextFromElement(getErrorMessage);
    }


    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement loginOutLink;

    public void clickOnLogoutLink(){

        clickOnElement(loginOutLink);

    }
    public String getLogOutMessage()
    {
        return getTextFromElement(loginOutLink);
    }



}
