package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computer;



    @CacheLookup
    @FindBy(xpath = " //h1[contains(text(),'Computers')]")
    WebElement computertext;



    public void clickOnComputer() {
        clickOnElement(computer);

    }

    public String getComputerText() {
        return getTextFromElement(computertext);
    }

}
