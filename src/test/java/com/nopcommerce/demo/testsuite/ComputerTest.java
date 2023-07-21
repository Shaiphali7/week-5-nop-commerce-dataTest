package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerTest extends BaseTest {
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    @BeforeMethod
    public void inIt()
    {
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
    }
    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully() throws InterruptedException{
//        Click on Computer tab

        computerPage.clickOnComputer();
        Thread.sleep(5000);
        Assert.assertEquals(computerPage.getComputerText(), "Computers");
//        Verify "Computer" text
    }
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {

        computerPage.clickOnComputer();
        desktopsPage.clickOnDesktop();

        Assert.assertEquals(desktopsPage.getDesktopText(),"Desktops");
    }
    @Test(dataProvider =  "credentials",dataProviderClass = TestData.class)
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) {

        computerPage.clickOnComputer();
        desktopsPage.clickOnDesktop();
        desktopsPage.clickOnProductName();
        desktopsPage.selectProcessorFromDropDown(processor, ram);
        desktopsPage.clickOnHDD(hdd);
        System.out.println(processor);
        desktopsPage.clickOnOS(os);
        desktopsPage.clickOnSoftware(software);
        desktopsPage.clickOnAddToCart();
        String successMessage=desktopsPage.getProductAddedMessage();
        Assert.assertEquals(successMessage,"The product has been added to your shopping cart");


    }


}
