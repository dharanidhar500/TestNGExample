package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumExample {
    ChromeDriver driver;
    @BeforeClass
    void SetupDriver(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

    }
    @Test
    void getTitlefrompage() throws  InterruptedException{
        driver.findElement(By.name("q")).sendKeys("Mobile");
        Thread.sleep(1000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getTitle(), "Mobile - Google Search");
    }
    @AfterClass
    void closeDriver(){
        driver.close();
    }

}