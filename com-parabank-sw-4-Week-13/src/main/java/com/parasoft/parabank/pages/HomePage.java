package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By registerLink = By.linkText("Register");
    By userNameTextBox = By.name("username");
    By passwordTextBox = By.name("password");
    By loginButton = By.xpath("//input[@value='Log In']");
    By errorMessageText = By.xpath("//p[contains(text(),'The username and password could not be verified.')]");
    By customerLoginDisplayText = By.xpath("//h2[contains(text(),'Customer Login')]");

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
    public void enterUsername(String username){
        sendTextToElement(userNameTextBox,username);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordTextBox,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getErrorMessageText(){
        return getTextFromElement(errorMessageText);
    }
    public String getcustomerLoginDisplayText(){
        return getTextFromElement(customerLoginDisplayText);
    }

}
