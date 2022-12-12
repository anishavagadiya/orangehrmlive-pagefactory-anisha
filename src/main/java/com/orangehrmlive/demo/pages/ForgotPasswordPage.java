package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

public class ForgotPasswordPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//form/h6 [text()= 'Reset Password']")
    WebElement errorMessage;

    public String getErrorMessage() {
        Reporter.log("Error Message Displayed");
        return getTextFromElement(errorMessage);
    }


}
