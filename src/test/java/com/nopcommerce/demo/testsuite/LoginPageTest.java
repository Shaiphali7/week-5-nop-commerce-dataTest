package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;

    @BeforeMethod
    public void inIT() {

        loginPage = new LoginPage();

    }


    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        loginPage.clickOnLoginLink();
        String actualMessage=loginPage.getGetErrorMessage();
        Assert.assertEquals(actualMessage,"Welcome, Please Sign In!");

    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials() {

        loginPage.clickOnLoginLink();
        loginPage.enterEmailId("Shaif@gmail.com");
        loginPage.enterPassword("Shanti123");
        loginPage.clickOnLoginButton();
        String actualMessage=loginPage.getGetErrorMessage();
        Assert.assertEquals(actualMessage,"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");


    }


    @Test
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() throws InterruptedException {

        loginPage.clickOnLoginLink();
        loginPage.enterEmailId("Prime123@gmail.com");
        loginPage.enterPassword("Prime23");
        Thread.sleep(1000);
        loginPage.clickOnLoginButton();
        String logoutMessage=loginPage.getLogOutMessage();
        Assert.assertEquals(logoutMessage,"Log out" );



    }


    @Test
    public void VerifyThatUserShouldLogOutSuccessFully() {


        loginPage.clickOnLoginLink();
        loginPage.enterEmailId("Prime123@gmail.com");
        loginPage.enterPassword("Prime123");
        loginPage.clickOnLoginButton();
        loginPage.clickOnLogoutLink();
        //verifyText(loginPage.getLoginLink(),"Log in");


    }

}
