package com.parasoft.parabank.testsuite;


import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.pages.OverviewPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    OverviewPage overviewPage = new OverviewPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        homePage.enterUsername("John12345");
        homePage.enterPassword("John12344");
        homePage.clickOnLoginButton();
        String actualMessage = overviewPage.getAccountCreatedSuccessDisplayText();
        Assert.assertEquals(actualMessage,"Accounts Overview","error");
    }
    @Test
    //There is bug in this site, its let you login with any credentials, so this case is fail
    public void verifyTheErrorMessage(){

        homePage.enterUsername("John12345=");
        homePage.enterPassword("John12344+");
        homePage.clickOnLoginButton();
        String actualMessage = homePage.getErrorMessageText();
        Assert.assertEquals(actualMessage,"The username and password could not be verified.","error");

    }
    @Test
    public void userShouldLogOutSuccessfully(){

        homePage.enterUsername("John12345");
        homePage.enterPassword("John12344");
        homePage.clickOnLoginButton();
        overviewPage.clickOnLogOUtLink();
       String actualMessage =  homePage.getcustomerLoginDisplayText();
       Assert.assertEquals(actualMessage,"Customer Login","error");

    }


}
