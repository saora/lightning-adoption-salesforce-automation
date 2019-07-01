package com.serenitybdd.screens.base;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OrgSignUp extends PageObject {
    @FindBy(id = "first_name")
    private static WebElementFacade fill_FirtName;

    @FindBy(id = "last_name")
    private static WebElementFacade fill_LastName;
    @FindBy(id = "email")
    private static WebElementFacade fill_userEmail;

    @FindBy(id = "job_role")
    private static WebElementFacade sel_JobRole;

    @FindBy(id = "company")
    private static WebElementFacade fill_Company;

    @FindBy(id = "country")
    private static WebElementFacade sel_Country;

    @FindBy(id = "postal_code")
    private static WebElementFacade fill_PostalCode;

    @FindBy(id = "username")
    private static WebElementFacade fill_UserName;

    @FindBy(css = "#eula")
    private  WebElementFacade confirm_Agree;

    @FindBy(id = "submit_btn")
    private static WebElementFacade submit_info;

    private Object WebDriverFacade;

    public OrgSignUp(WebDriver driver) {
        super(driver);
    }

    private void setFill_FirtName(String userFName){
        fill_FirtName.clear();
        fill_FirtName.sendKeys(userFName);
    }

    private void setFill_LastName(String userLName){
        fill_LastName.clear();
        fill_LastName.sendKeys(userLName);
    }

    private void setFill_userEmail(String userEmail){
        fill_userEmail.clear();
        fill_userEmail.sendKeys(userEmail);
    }

    private void setSel_JobRole(String sjobRole){
        sel_JobRole.selectByVisibleText(String.valueOf(sjobRole));
    }

    private void setFill_Company(String companyName){
        fill_Company.clear();
        fill_Company.sendKeys(companyName);
    }

    private void setSel_Country(String sCountry){
        sel_Country.selectByVisibleText(String.valueOf(sCountry));
    }

    private void setFill_PostalCode(String postalCode){
        fill_PostalCode.clear();
        fill_PostalCode.sendKeys(postalCode);
    }

    private void setFill_UserName(String userName){
        fill_UserName.clear();
        fill_UserName.sendKeys(userName);
    }

    public void setConfirm_Agree() {
        try {
            element(By.id("eula")).click();
        }catch (Exception e){
            System.out.println("ERROR...."+e);
        }

    }

    public void setSubmit(){
        submit_info.click();
    }

    public void fillOrgInformation(String userFName, String userLName, String userEmail, String sjobRole, String companyName, String sCountry, String postalCode, String userName) {
        setFill_FirtName(userFName);
        setFill_LastName(userLName);
        setFill_userEmail(userEmail);
        setSel_JobRole(sjobRole);
        setFill_Company(companyName);
        setSel_Country(sCountry);
        setFill_PostalCode(postalCode);
        setFill_UserName(userName);
    }


}
