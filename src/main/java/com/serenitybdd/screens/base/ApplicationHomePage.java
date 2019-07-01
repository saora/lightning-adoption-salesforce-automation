package com.serenitybdd.screens.base;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.webdriver.servicepools.ChromeServicePool;
import net.serenitybdd.core.webdriver.servicepools.CurrentOS;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

public class ApplicationHomePage extends PageObject {

    @FindBy(css="#_desktop_user_info > div > a")
    private static WebElementFacade GET_LOGIN_SCREEN;

    @FindBy(css="#_mobile_user_info > div > a")
    private static WebElementFacade GET_MOBILE_LOGIN_SCREEN;
   // private Object WebDriverFacade;

    public void openPageUrl(int url){
        switch (url){
            case 0:
                this.openAt("https://login.salesforce.com");
                break;
            case 1:
                this.openAt("https://developer.salesforce.com/signup");
                break;
            case 2:
                this.openAt("https://mail.google.com/mail/?ui=html&zy=h");
                break;
        }
    }
    public void goToLoginScreen(){
        if(CurrentOS.getType() == CurrentOS.OSType.other)
            GET_MOBILE_LOGIN_SCREEN.click();
        else GET_LOGIN_SCREEN.click();
    }

}
