package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class OverviewPage extends Utility {
    By accountCreatedSuccessDisplayText = By.linkText("Accounts Overview");
    By logOutLink = By.linkText("Log Out");


    public String getAccountCreatedSuccessDisplayText(){
        return getTextFromElement(accountCreatedSuccessDisplayText);
    }
    public void clickOnLogOUtLink(){
        clickOnElement(logOutLink);
    }


}
