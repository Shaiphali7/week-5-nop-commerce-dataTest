package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {
    RegisterPage registerPage;


    @BeforeMethod
    public void inIT() {
        registerPage = new RegisterPage();
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {

        registerPage.clickOnRegisterLink();
        String actualRegisterText=registerPage.getRegisterText();
        Assert.assertEquals(actualRegisterText,"Register");

    }

    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() throws InterruptedException{
        Thread.sleep(1000);

        registerPage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();
        String actualNameError=registerPage.getFirstNameError();
        Assert.assertEquals(actualNameError,"First name is required.");
        String actualLastNameError=registerPage.getLastNameError();
        Assert.assertEquals(actualLastNameError,"Last name is required.");
        String actualEmailError=registerPage.getEmailError();
        Assert.assertEquals(actualEmailError,"Email is required.");
        String actualPasswordError=registerPage.getPasswordError();
        Assert.assertEquals(actualPasswordError,"Password is required.");
        String actualConfirmPasswordError=registerPage.getConfirmPasswordError();
        Assert.assertEquals(actualConfirmPasswordError,"Password is required.");



    }

    @Test
    public void VerifyThatUserShouldCreateAccountSuccessfully() {

        registerPage.clickOnRegisterLink();
        registerPage.clickOnGender();
        registerPage.setFirstName("Shaif");
        registerPage.setLastName("Coco");
        registerPage.selectFromDropDownDay("28");
        registerPage.selectFromDropDownMonth("September");
        registerPage.selectFromDropDownYear("1983");
        registerPage.setEmail("Coco.jojo@gmail.com");
        registerPage.setPassword("Prime12345");
        registerPage.setConfirmPasswordPassword1("Prime12345");
        registerPage.clickOnregister();



    }


}
