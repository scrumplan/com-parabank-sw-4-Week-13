package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.pages.RegisterPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyThatSigningUpPageDisplay(){

        homePage.clickOnRegisterLink();
        String actualMessage = registerPage.getSingInUpDisplayText();
        Assert.assertEquals(actualMessage,"Signing up is easy!","error");
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.enterFristName("Lalita");
        registerPage.enterLastName("Desai");
        registerPage.enterAddress("43,church street");
        registerPage.enterCity("London");
        registerPage.enterState("London");
        registerPage.enterZipCode("uy6578u");
        registerPage.enterPhoneNumber("07658467788");
        registerPage.enterssnNumber("6547");
        registerPage.enterUsername("Lalita1234");
        registerPage.enterPassword("Lalita123");
        registerPage.enterconfirmPassword("Lalita123");
        registerPage.clicOnRegisterButton();
        String actualMessage = registerPage.getAccountCreatedSuccessDisplayText();
        Assert.assertEquals(actualMessage,"Your account was created successfully. You are now logged in.","error");

    }
}
