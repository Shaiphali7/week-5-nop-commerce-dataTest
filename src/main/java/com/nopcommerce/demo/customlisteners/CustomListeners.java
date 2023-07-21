package com.nopcommerce.demo.customlisteners;

import com.nopcommerce.demo.utilities.Utility;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
//This step take screenshot and store it in to test-output/html filder
       String screenShotName= Utility.takeScreenShot(iTestResult.getName());
       //This line required for reportNg reports
        System.setProperty("org.uncommons.reportng.escape-output", "false");
        Reporter.log("Click to see screenshot");
        Reporter.log("<a target = \"_blank\" href="+screenShotName+">Screenshot</a>");
        Reporter.log("<br>");
        Reporter.log("<br>");
        Reporter.log("<a target = \"_blank\" href="+screenShotName+"><img src="+screenShotName+" height=200 width=200></img></a>");


    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

   

    @Override
    public void onStart(ITestContext iTestContext) {
    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

}
