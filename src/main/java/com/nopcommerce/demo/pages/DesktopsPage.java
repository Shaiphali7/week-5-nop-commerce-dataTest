package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")
    WebElement desktopslink;


    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Build your own computer')]")
    WebElement productName;


    // @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processor;


    @CacheLookup
    @FindBy(id = "product_attribute_3_6")
    WebElement hdd320;

    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hdd400;


    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram;
    public void selectProcessorFromDropDown(String processor1,String ram1) {
        selectByVisibleTextFromDropDown(processor,processor1);
        selectByVisibleTextFromDropDown(ram,ram1);
    }

    public void clickOnHDD(String hdd) {
        if(hdd.equals("320 GB")){
            clickOnElement(hdd320);
        }else{
            clickOnElement(hdd400);
        }
    }

    @CacheLookup
    @FindBy(id = "product_attribute_4_8")
    WebElement vistaHome;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement vistaPremium;



    public void clickOnOS(String os) {
        if(os.equals("Vista Home [+$50.00]")){
            clickOnElement(vistaHome);
        }else{
            clickOnElement(vistaPremium);
        }
    }
    @CacheLookup
    @FindBy(id = "product_attribute_5_10")
    WebElement microsoftOffice;

    @CacheLookup
    @FindBy(id = "product_attribute_5_11")
    WebElement acrobatReader;
    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement totalCommander;


    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;


    public void clickOnAddToCart(){
        clickOnElement(addToCart);

    }


    public void clickOnSoftware(String software) {

        if(software.equals("Microsoft Office [+$50.00]")){
            clickOnElement(microsoftOffice);
        }else if(software.equals("Acrobat Reader [+$10.00]"))
        {  clickOnElement(microsoftOffice);
            clickOnElement(acrobatReader);
        }
        else{
            clickOnElement(microsoftOffice);
            clickOnElement(totalCommander);
        }
    }
    public void clickOnProductName(){
        clickOnElement(productName);
    }

    @CacheLookup
    @FindBy(xpath= "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement productAdded;
    public String getProductAddedMessage()
    {
        return getTextFromElement(productAdded);
    }


    public void clickOnDesktop() {
        clickOnElement(desktopslink);


    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktops;
    public String getDesktopText()
    {
        return getTextFromElement(desktops);
    }

}
