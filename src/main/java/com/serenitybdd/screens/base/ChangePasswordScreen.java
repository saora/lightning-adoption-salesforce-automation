package com.serenitybdd.screens.base;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.ElementLocatorFactorySelector;

import java.util.Set;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Switch extends PageObject{
    @FindBy(id = "newpassword")
    private WebElementFacade fill_newPass;
    @FindBy(id = "confirmpassword")
    private WebElementFacade fill_ConfirmPass;
    @FindBy(id = "answer")
    private WebElementFacade fill_Answer;
    @FindBy(id = "password-button")
    private WebElementFacade clik_SubmitBtn;

    public void changePassword(){
    String parentHandle = getDriver().getWindowHandle();
            System.out.println(parentHandle);
    //Get all handles
    Set<String> handles = getDriver().getWindowHandles();
    //Switch between handles
        for (String handle : handles) {
        System.out.println(handle);
        if (!handle.equals(parentHandle)) {
            getDriver().switchTo().window(handle);
            ChangePassElement.fillNewPass(driver,fileProp = prop.propFile().getProperty("new.pass"));
            ChangePassElement.fillConPass(driver,fileProp = prop.propFile().getProperty("conf.pass"));
            ChangePassElement.fillAnswer(driver,fileProp = prop.propFile().getProperty("answ.text"));
            if (ChangePassElement.btnPass(driver).isEnabled()) {
                ChangePassElement.btnPass(driver).click();
            }
            break;
        }
    }
    }
}
