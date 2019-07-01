package com.serenitybdd.examples.steps;
import com.serenitybdd.screens.base.ApplicationHomePage;
import com.serenitybdd.screens.base.ChangePasswordScreen;
import com.serenitybdd.screens.gmail.GmailScreen;

import net.thucydides.core.annotations.Step;

public class EmailSteps {
    private String actor;
    private GmailScreen gmailScreen;
    private ApplicationHomePage applicationHomePage;
    private ChangePasswordScreen changePasswordScreen;

    @Step("#actor opens the Gmail Url")
    public void openGemailUrl(){
        applicationHomePage.openPageUrl(2);
        // we can check credentials using api or db
    }

    @Step("#actor should be able to sign in with their account")
    public void signInWithTheirGmailAccount(String guserName, String gpassword, String gsubjectEmail){
        gmailScreen.verfyAcctByemail(guserName, gpassword);
        gmailScreen.findEmailToVerifyAccount(gsubjectEmail);
        gmailScreen.openEmailToVerifyAccount();
    }

    @Step("#actor should be able to chenge their password of ORG account")
    public void changeTheirPasswordSalesforceOrg(String newPass, String confirmPass, String answerChgPass){
        changePasswordScreen.ChangePasswordScreen(newPass,confirmPass,answerChgPass);
    }

    @Step("#actor should be able to view their Salesforce Org")
    public void checkProfile(){

    }
}
