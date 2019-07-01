package com.serenitybdd.screens.base;

import net.serenitybdd.core.pages.PageObject;
import org.apache.tools.ant.taskdefs.email.Message;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Set;

public class TestValidationPage extends PageObject {

    public void checkTitle(){
        Assert.assertEquals("Lightning Experience",getTitle());
    }

    public void checkSignUp(){
        String parentHandle = getDriver().getWindowHandle();
        System.out.println(parentHandle);
        //Get all handles
        Set<String> handles = getDriver().getWindowHandles();
        //ChangePasswordScreen between handles
        try {
            for (String handle : handles) {
                System.out.println(handle);
                System.out.println("Element... " + find(By.xpath("/html/body/div[2]/h1[1]")).getText());
                Assert.assertEquals("Almost there...", find(By.xpath("/html/body/div[2]/h1[1]")).getText());

                if (!handle.equals(parentHandle)) {
                    getDriver().switchTo().window(handle);

                    System.out.println(parentHandle);
                    System.out.println("Element... " + find(By.xpath("/html/body/div[2]/h1[1]")));
                }
            }
        }catch (Exception e){
            Assert.assertTrue(find(By.xpath("/html/body/div[2]/h1[1]")).isCurrentlyEnabled());
            System.out.println(e.getMessage());
        }

}
}

