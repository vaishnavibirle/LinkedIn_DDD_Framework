package com.selenium;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.Login;
import com.bridgelabz.selenium.utility.DataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

/*called dataProvider class
* created method login Test
* where we initialize username and password as string
* done validation using Title of the page
* */

public class LoginTest_DataProvider extends BaseClass {

    @Test(dataProvider="test1",dataProviderClass=DataProvider.class)
    public void LoginTest(String UserName, String PassWord) throws InterruptedException {
        Login login = new Login();
        login.login(UserName,PassWord);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Feed | LinkedIn";
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("Test is Passed");
        System.out.println(UserName+" | "+PassWord);
    }
}
