package com.serenitybdd.examples.steps;

import com.serenitybdd.screens.base.ApplicationHomePage;
import com.serenitybdd.screens.base.LoginScreen;
import com.serenitybdd.screens.base.TestValidationPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    private String actor;
    private ApplicationHomePage applicationHomePage;
    private LoginScreen loginScreen;
    private TestValidationPage testValidationPage;


    @Step("#actor is a registered member")
    public void IsARegisteredMember(){
        applicationHomePage.openPageUrl(0);
        // we can check credentials using api or db
    }

    @Step("#actor should be able to sign in with their account")
    public void signInWithTheirAccount(String userName, String password){
        loginScreen.login(userName, password);
    }

    @Step("#actor should be able to view their Salesforce Org")
    public void checkProfile(){
        testValidationPage.checkTitle();
    }
}

