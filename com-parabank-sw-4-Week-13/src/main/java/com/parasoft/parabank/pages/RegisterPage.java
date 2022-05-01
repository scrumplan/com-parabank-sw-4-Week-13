package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By singInUpDisplayText = By.xpath("//div[@id = 'mainPanel']/descendant::div[9]/child::h1");
    By firstNameTextbox = By.name("customer.firstName");
    By lastNameTextbox = By.name("customer.lastName");
    By addressTextbox = By.id("customer.address.street");
    By cityTextbox = By.name("customer.address.city");
    By stateTextbox = By.name("customer.address.state");
    By zipCodeTextbox = By.name("customer.address.zipCode");
    By phoneNumberTextbox = By.name("customer.phoneNumber");
    By ssnNumberTextbox = By.name("customer.ssn");
    By usernameTextbox = By.name("customer.username");
    By passwordTextbox = By.name("customer.password");
    By confirmPasswordTextbox = By.name("repeatedPassword");
    By registerButton = By.xpath("//tbody/tr[13]/td[2]/input[1]");
    By accountCreatedSuccessDisplayText = By.xpath("//div[@id='bodyPanel']/child::div[2]/child::p");


    public String getSingInUpDisplayText(){
        return getTextFromElement(singInUpDisplayText);
    }
    public void enterFristName(String firstname){
        sendTextToElement(firstNameTextbox,firstname);
    }
    public void enterLastName(String Lastname){
        sendTextToElement(lastNameTextbox,Lastname);
    }
    public void enterAddress(String Address){
        sendTextToElement(addressTextbox,Address);
    }
    public void enterCity(String city){
        sendTextToElement(cityTextbox,city);
    }
    public void enterState(String state){
        sendTextToElement(stateTextbox,state);
    }
    public void enterZipCode(String zipCode){
        sendTextToElement(zipCodeTextbox,zipCode);
    }
    public void enterPhoneNumber(String phoneNumber){
        sendTextToElement(phoneNumberTextbox,phoneNumber);
    }
    public void enterssnNumber(String ssnNumber){
        sendTextToElement(ssnNumberTextbox,ssnNumber);
    }
    public void enterUsername(String username){
        sendTextToElement(usernameTextbox,username);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordTextbox,password);
    }
    public void enterconfirmPassword(String confirmpassword){
        sendTextToElement(confirmPasswordTextbox,confirmpassword);
    }
    public void clicOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String getAccountCreatedSuccessDisplayText(){
        return getTextFromElement(accountCreatedSuccessDisplayText);
    }




}
