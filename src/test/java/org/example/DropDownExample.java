package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DropDownExample {


    ChromeDriver driver;

    @BeforeClass
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().window().maximize();
    }
    //@Test
//   void dropdownMethod(){
//    Select select = new Select(driver.findElement(By.id("dropdown")));
//    //select.selectByValue("2");
//        select.selectByVisibleText("Option 1");
//        List<WebElement> l =select.getOptions();
//        for(WebElement a: l){
//            System.out.println(a.getText());
//        }
//    }
    @Test
    void JavascriptAlerts() throws InterruptedException {
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        driver.findElement(By.xpath(" //button[normalize-space()='Click for JS Confirm']")).click();
        Alert alert1 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert1.accept();

        driver.findElement(By.xpath("  //button[normalize-space()='Click for JS Prompt']")).click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert2.sendKeys("dharani dhar");
        Thread.sleep(3000);
        alert2.accept();

    }
//    @AfterClass
//    void closeDriver(){
//        driver.close();
//    }
}