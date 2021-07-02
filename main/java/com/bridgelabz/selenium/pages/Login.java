package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;

/*@Description - created login class and method
* provided elements using locators
* extended base class for getting connected with chrome driver*/

public class Login extends BaseClass {

    public void login(String username,String password) throws InterruptedException {

        driver.findElement(By.className("nav__button-secondary")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.className("login__form_action_container")).click();
        Thread.sleep(2000);
    }
}
