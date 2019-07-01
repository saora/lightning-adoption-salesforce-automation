package com.serenitybdd.examples.steps;

import com.serenitybdd.screens.base.ApplicationHomePage;
import com.serenitybdd.screens.base.SignUpScreen;
import com.serenitybdd.screens.base.TestValidationPage;
import net.thucydides.core.annotations.Step;

public class SignUpSteps {

    private String actor;
    private ApplicationHomePage applicationHomePage;
    private SignUpScreen orgSignUpScreen;
    private TestValidationPage testValidationPage;


    @Step("#actor open the SignUp page")
    public void IsAValidUrl(){
        applicationHomePage.openPageUrl(1);
        // we can check credentials using api or db
    }

    @Step("#actor should be able to create a new developer org")
    public void signUpOrg(String userFName, String userLName, String userEmail, String sjobRole, String companyName, String sCountry, String postalCode, String userName)throws Exception{
        orgSignUpScreen.fillOrgInformation(userFName,userLName,userEmail,sjobRole,companyName,sCountry,postalCode,userName);
    }

    @Step("#actor should be able to send the Org Information")
    public void sendInfo(){
        orgSignUpScreen.setConfirm_Agree();
        orgSignUpScreen.setSubmit();
    }

    @Step("#actor should be able to view the page confirmation")
    public void checkSuccess(){
        testValidationPage.checkSignUp();
    }
}
