package com.serenitybdd.screens.gmail;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.bcel.generic.Select;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailScreen extends PageObject {
    @FindBy(id = "identifierId")
    private WebElementFacade fill_UserGmail;

    @FindBy(id = "identifierNext")
    private WebElementFacade click_FirsNext;

    @FindBy(name = "password")
    private WebElementFacade fill_UserPassword;

    @FindBy(id = "passwordNext")
    private WebElementFacade click_SecondNext;

    @FindBy(linkText = "Show search options")
    private WebElementFacade click_SearchOpt;

    @FindBy(name = "as_subj")
    private WebElementFacade fill_Subject;

    @FindBy(name = "as_subset")
    private WebElementFacade search_By;

    @FindBy(name = "nvp_bu_sm")
    private WebElementFacade search_Email;

//Open first element in the list (inbox email)
    @FindBy(xpath = "/html/body/table[3]/tbody/tr/td[2]/table[1]/tbody/tr/td[2]/form/table[2]/tbody/tr[1]/td[3]/a/span/b")
    private WebElementFacade open_Email;

    @FindBy(linkText = "Verify Account")
    private WebElementFacade verfy_Account;

//When the option of classic mode is displayed
    @FindBy(xpath = "//*[@id=\"maia-main\"]/form/p/input")
    private WebElementFacade open_ClassicMode;

    @FindBy(id = "sbq")
    private WebElementFacade findEmail;
    @FindBy(name = "nvp_site_mail")
    private WebElementFacade searchMail;


    public GmailScreen(WebDriver driver) {
        super(driver);
    }

    private void setfillGmailUser(String userGmail){
        fill_UserGmail.clear();
        fill_UserGmail.sendKeys(userGmail);
    }

    private void setfillGmailPass(String passGmail){
        fill_UserPassword.clear();
        fill_UserPassword.sendKeys(passGmail);
    }

    private void setClick_SearchOpt(){
        click_SearchOpt.click();
    }

    private void setfillSubject(String subjectEmail){
        fill_Subject.sendKeys(subjectEmail);
    }
    private void setselSearchBy(String selSearch){
        search_By.selectByVisibleText(selSearch);
    }

    private void setClick_FirsNext(){
        click_FirsNext.click();
    }

    private void setClick_SecondNext(){
        click_SecondNext.click();
    }

    private void switchToClassic(){
        open_ClassicMode.click();
    }

    private void setClick_SearchEmail(){
        search_Email.click();
    }

    private void setClick_OpenEmail(){
        System.out.println("Elemento"+open_Email.getText());
        open_Email.click();
    }

    private void setClick_Verify(){
        verfy_Account.click();
    }

    public void verfyAcctByemail(String userGmail, String passGmail){
//Search email
        setfillGmailUser(userGmail);
        setClick_FirsNext();
        setfillGmailPass(passGmail);
        setClick_SecondNext();
        try{
            switchToClassic();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        /*setClick_SearchOpt();
        setfillSubject(subjectEmail);
        setselSearchBy(selSearch);
        setClick_SearchEmail();*/
    }

    //Find email
    public void findEmailToVerifyAccount(String subjectEmail){
        findEmail.sendKeys(subjectEmail);
        searchMail.click();

    }
    //Open email
    public void openEmailToVerifyAccount(){
        try {
            setClick_OpenEmail();
            setClick_Verify();
        }catch (Exception e){
            System.out.println("Email not found!!! ... "+e.getMessage());
        }


    }











}
