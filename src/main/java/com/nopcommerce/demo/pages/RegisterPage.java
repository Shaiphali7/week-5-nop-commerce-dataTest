package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement RegisterLInk;


    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement RegisterButton;



    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement FirstNameError;
public String getFirstNameError()
{
    return getTextFromElement(FirstNameError);
}
    public String getLastNameError()
    {
        return getTextFromElement(LastNameError);
    }
    public String getEmailError()
    {
        return getTextFromElement(EmailError);
    }



    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement LastNameError;


    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement EmailError;


    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement genderFemale;


    public void clickOnGender(){

        clickOnElement(genderFemale);
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;


    public void setFirstName(String name)
    {
        sendTextToElement(firstName, name);

    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    public void setLastName(String name)
    {
        sendTextToElement(lastName, name);

    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement day;

    public void selectFromDropDownDay(String day1)
    {
        selectByVisibleTextFromDropDown(day,day1);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement month;


    public void selectFromDropDownMonth(String month1)
    {
        selectByVisibleTextFromDropDown(month,month1);
    }


    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement year;


    public void selectFromDropDownYear(String year1)
    {
        selectByVisibleTextFromDropDown(year,year1);
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    public void setEmail(String email)
    {

        sendTextToElement(this.email, email);

    }


    public WebElement getPasswordRequired() {
        return passwordrequired;
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;


    public void setPassword(String Password)

    {
        sendTextToElement(this.password, Password);

    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;


    public void setConfirmPasswordPassword1(String confirmPassword1)

    {
        sendTextToElement(confirmPassword, confirmPassword1);

    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;


    public void clickOnregister()

    {
        clickOnElement(registerButton);

    }

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordrequired;



    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordrequired;



    public void clickOnRegisterButton() {

        clickOnElement(RegisterButton);

    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement RegisterText;
    public String getRegisterText()
    {
        return getTextFromElement(RegisterText);
    }


    public void clickOnRegisterLink(){
        clickOnElement(RegisterLInk);

    }

    // @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyregistration;
    public String getPasswordError()
    {
        return getTextFromElement(passwordrequired);
    }
    public String getConfirmPasswordError()
    {
        return getTextFromElement(confirmPasswordrequired);
    }
}
