package com.bridgelabz.selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {

    public static WebDriver driver;

    @Parameters({"url"})
    @BeforeTest
    public void setUp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
}


