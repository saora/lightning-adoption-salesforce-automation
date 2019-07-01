package com.serenitybdd.examples.tests.base;

import com.serenitybdd.examples.steps.EmailSteps;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class VerfyOrgAccount {

    @Managed(driver="chrome")
    WebDriverFacade chromeDriver;

    @Steps
    private EmailSteps gmail_User;

    @Test
    public void openEmailToVeryfyAccount(){

        String password = "61084n7mex01";
        String userName = "glbltest.salesforce@gmail.com";
        String subjectValue = "is:unread subject:(Welcome to Salesforce: Verify your account)";
        gmail_User.openGemailUrl();
        gmail_User.signInWithTheirGmailAccount(userName, password, subjectValue);
        gmail_User.changeTheirPasswordSalesforceOrg("test1234","test1234","test");


    }



}
