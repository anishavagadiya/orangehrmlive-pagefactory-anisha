package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.ForgotPasswordPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ForgotPasswordTest extends BaseTest {

    LoginPage loginPage;
    ForgotPasswordPage forgotPasswordPage;

    @BeforeMethod
    public void inIt() {
        loginPage = new LoginPage();
        forgotPasswordPage = new ForgotPasswordPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        loginPage.clickOnForgotPasswordLink();

        String expectedErrorMessage = "Reset Password";
        Assert.assertEquals(forgotPasswordPage.getErrorMessage(), expectedErrorMessage, "Reset password text is not displayed");
    }
}
