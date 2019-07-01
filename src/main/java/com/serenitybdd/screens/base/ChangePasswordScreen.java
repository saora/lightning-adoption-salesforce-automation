package com.serenitybdd.screens.base;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.Set;


public class ChangePasswordScreen extends PageObject{
    @FindBy(id = "newpassword")
    private WebElementFacade fill_newPass;
    @FindBy(id = "confirmpassword")
    private WebElementFacade fill_ConfirmPass;
    @FindBy(id = "answer")
    private WebElementFacade fill_Answer;
    @FindBy(id = "password-button")
    private WebElementFacade clik_SubmitBtn;

    private void setFill_newPass(String fill_newPass) {
        this.fill_newPass.sendKeys(fill_newPass);

    }
    private void setFill_ConfirmPass(String fill_ConfirmPass){
        this.fill_ConfirmPass.sendKeys(fill_ConfirmPass);
    }

    private void setFill_Answer(String fill_Answer){
        this.fill_Answer.sendKeys(fill_Answer);
    }

    public void ChangePasswordScreen(String fill_newPass, String fill_ConfirmPass, String fill_Answer){

    String parentHandle = getDriver().getWindowHandle();
            System.out.println(parentHandle);
    //Get all handles
    Set<String> handles = getDriver().getWindowHandles();
    //ChangePasswordScreen between handles
        for (String handle : handles) {
        System.out.println(handle);
        if (!handle.equals(parentHandle)) {
            getDriver().switchTo().window(handle);

            setFill_newPass(fill_newPass);
            setFill_ConfirmPass(fill_ConfirmPass);
            setFill_Answer(fill_Answer);

            if (clik_SubmitBtn.isEnabled()) {
                this.clik_SubmitBtn.click();
            }
            break;
        }
    }
    }
}
