package com.serenitybdd.examples.tests;

import com.serenitybdd.examples.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(SerenityRunner.class)
public class LoginSalesforce {
/*
    @Managed(driver="iexplorer")
    WebDriverFacade ieDriver;

    @Managed(driver="edge")
    WebDriverFacade edgeDriver;*/

//@Managed
   //WebDriverFacade driver; // defaults to firefox geckodriver*/
    @Managed(driver="chrome")
    WebDriverFacade chromeDriver;


    @Steps
    LoginSteps SalesforceUser;


    @Test
    public void checkUserSuccessfullyLogin(){
        // Given
        SalesforceUser.IsARegisteredMember();
        // When
        SalesforceUser.signInWithTheirAccount("greenhcodedurl@de.org","test1234");
        // Then
        SalesforceUser.checkProfile();
    }
}
