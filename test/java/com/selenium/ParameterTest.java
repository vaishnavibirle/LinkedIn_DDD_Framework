package com.selenium;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.Login;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterTest extends BaseClass {

    @Test
    @Parameters({"username","password"})
    public void LoginTest(String username, String password) throws InterruptedException {
        Login login = new Login();
        login.login(username,password);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Feed | LinkedIn";
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("Test is Passed");
    }

}

